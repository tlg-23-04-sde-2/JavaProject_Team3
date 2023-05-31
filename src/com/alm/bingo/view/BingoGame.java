package com.alm.bingo.view;

import com.alm.bingo.controller.BingoBall;
import com.alm.bingo.controller.BingoBallRandomizer;
import com.alm.bingo.controller.Board;

import java.security.SecureRandom;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BingoGame extends Thread {
    // static methods
    private static final int MAX_PLAYER_COUNT = 3;
    private static final int MIN_PLAYER_COUNT = 1;

    // instance variables
    int players;
    int winnerPlayerNumber;
    private final Scanner scanner = new Scanner(System.in);
    private final DisplayMessages displayArt = new DisplayMessages();
    BingoBallRandomizer ballRandomizer = new BingoBallRandomizer(new SecureRandom());
    Map<Integer, Board> playerBoards = new LinkedHashMap<>();

    // constructors
    public BingoGame() {
    }

    // business methods
    public void execute() throws InterruptedException {
        displayArt.runGreeting();
        TimeUnit.SECONDS.sleep(1);
        System.out.println();
        System.out.println();
        promptForPlayerCount();
    }

    public void run() {
        // create the boards for each player collected into the linked hash map
        playerBoards = IntStream.rangeClosed(1, players)
                .boxed()
                .collect(Collectors.toMap(Function.identity(), (i) -> Board.getInstance()));

        // setting initial win condition to false
        boolean blackout = false;

        // calls the bingo ball and displays it
        for (BingoBall ball : ballRandomizer) {
            System.out.println("The next ball selected is:");
            System.out.println("******** " + ball + " ********");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // compares the ball called to the board and updates if they match then shows the board again
            for (Map.Entry<Integer, Board> entry : playerBoards.entrySet()) {
                System.out.println("Player: " + entry.getKey());
                entry.getValue().update(ball);
                entry.getValue().show();
                // if the board is all zeros then that player wins
                if (entry.getValue().win()) {
                    winnerPlayerNumber = entry.getKey();
                    blackout = true;
                }
            }
            // shows the winner art
            if (blackout) {
                try {
                    displayArt.runWinner(winnerPlayerNumber);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }

    public int promptForPlayerCount() throws NumberFormatException {
        players = 1;

        boolean validInput = false;
        // loops to ensure that user input is valid
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
}   // END OF CLASS