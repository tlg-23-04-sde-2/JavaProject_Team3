package com.alm.bingo.controller.view;

import com.alm.bingo.controller.BingoBall;
import com.alm.bingo.controller.Board;
import com.alm.bingo.controller.MichaelScratch;
import com.alm.bingo.controller.view.Greeting;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class BingoGame {
    // static methods (if any)
    private static final int MAX_PLAYER_COUNT = 3;
    private static final int MIN_PLAYER_COUNT = 1;
    Greeting greeting = new Greeting();

    // instance variables
    int players;    // number of players
    int turns;      // number of turns it took to win
    int bingoBall;  // bingoBall number to compare to board for hit or not // have to make this a string
    private final Scanner scanner = new Scanner(System.in);
    MichaelScratch ms = new MichaelScratch();

    // constructors
    public BingoGame() {
    }

    // accessor methods

    // business methods
    public void execute() throws InterruptedException {
        greeting.runGreeting();
        TimeUnit.SECONDS.sleep(1);
        System.out.println();
        System.out.println();
        promptForPlayerCount();
        multipleBoards(players);
        callBingoBall();
        promptForPlayerCount();
        multipleBoards(players);
//        callBingoBall();
        int i = 0;
        while (i < 75) {
            ms.generateRandomNumber();
            i++;
        }
        List<Integer> list = new ArrayList(ms.calledNumbers);
        Collections.sort(list);
        System.out.println(list);
    }

    private void showCard(Board board) {
        board.show();
    }

    public void multipleBoards(int players) {
        this.players = players;
        for (int i = 1; i <= players; i++) {
            System.out.println("Player: " + i);
            Board newBoard = Board.getInstance();
            showCard(newBoard);
        }
    }

    public void callBingoBall() {
        BingoBall randomBall = BingoBall.getRandomBall();
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
                if ( MIN_PLAYER_COUNT <= players && players <= MAX_PLAYER_COUNT) {
                    validInput = true;
                }
                else {
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