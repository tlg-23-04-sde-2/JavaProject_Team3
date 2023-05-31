package com.alm.bingo.view;

import com.alm.bingo.controller.BingoBall;
import com.alm.bingo.controller.BingoBallRandomizer;
import com.alm.bingo.controller.Board;

import java.security.SecureRandom;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BingoGame extends Thread {
    // static methods (if any)
    private static final int MAX_PLAYER_COUNT = 3;
    private static final int MIN_PLAYER_COUNT = 1;
    Greeting greeting = new Greeting();

    // instance variables
    int players;    // number of players
    int turns;      // number of turns it took to win
    int bingoBall;  // bingoBall number to compare to board for hit or not // have to make this a string
    private final Scanner scanner = new Scanner(System.in);
    BingoBallRandomizer ms = new BingoBallRandomizer(new SecureRandom());
    Map<Integer, Board> test = new LinkedHashMap<>();


    // constructors
    public BingoGame() {
    }

    // accessor methods

    // business methods
    public void execute() throws InterruptedException {
//        greeting.runGreeting();
//        TimeUnit.SECONDS.sleep(1);
//        System.out.println();
//        System.out.println();
        promptForPlayerCount();
        run();

        System.out.println(test);
    }

    private void showCard(Board board) throws InterruptedException {
//        board.show();
//        board.update();
//        if(board.win()) {
//            greeting.runWinner();
//        }

    }

    public void run() {
        long interval = 500;
        test = IntStream.rangeClosed(1,players)
                .boxed()
                .collect(Collectors.toMap(Function.identity(),(i)-> Board.getInstance()));
        boolean blackout = false;

        for(BingoBall ball : ms) {
            System.out.println("The next ball selected is:");
            System.out.println("******** " + ball + " ********");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(Map.Entry<Integer,Board> entry : test.entrySet()) {
                entry.getValue().update(ball);
                entry.getValue().show();
                if (entry.getValue().win()) {
                    blackout = true;
                }
            }
            if (blackout) {
                break;
            }
        }
//        ExecutorService executor = Executors.newFixedThreadPool(players);
//
//
//        for (int i = 1; i <=players; i++) {
//            int playerId = i;
//            executor.execute(() ->{
//                try {
//                    System.out.println("Player: " +playerId);
//                    Board newBoard = Board.getInstance();
////                    test.put(playerId, newBoard);
//                    showCard(newBoard);
////                    multipleBoards(players);
////                    Thread.sleep(interval);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            });
//        }
//            executor.shutdown();
    }

    public void multipleBoards(int players) throws InterruptedException {
        this.players = players;
            for (int i = 1; i <= players; i++) {
                System.out.println("Player: " + i);
                Board newBoard = Board.getInstance();
                test.put(i, newBoard);
                showCard(newBoard);

            }
    }

    public void callBingoBall() {
        BingoBall randomBall = BingoBall.getRandomBall();
//        String number = randomBall.getNumber();
        int number = randomBall.getNumber();
        System.out.println("The next ball selected is:");
        System.out.println("******** " + randomBall + " ********");
    }

    public int promptForPlayerCount() throws NumberFormatException {
        players = 1;

        boolean validInput = false;
        while (!validInput) {
            System.out.println("Please enter player count");
            String input = scanner.nextLine().trim();
            try {
                players = Integer.parseInt(input);
                if (MIN_PLAYER_COUNT <= players && players <= MAX_PLAYER_COUNT) {
                    validInput = true;
                } else {
                    System.out.println
                            ("Please enter a valid number from: " + MIN_PLAYER_COUNT + " - " + MAX_PLAYER_COUNT);
                }

            } catch (NumberFormatException e) {
                System.out.println
                        ("Please enter a valid number from: " + MIN_PLAYER_COUNT + " - " + MAX_PLAYER_COUNT);
            }
        }
        return players;
    }

    /*
     * Start the game
     * prompt for player count = x
     * -Create x board(s)
     * -Show x board(s)
     * -Run bingoBall caller
     */

    // compareTo (ifAny)
    // hashCode (ifAny)
    // equals (ifAny)

    // toString

}   // END OF CLASS