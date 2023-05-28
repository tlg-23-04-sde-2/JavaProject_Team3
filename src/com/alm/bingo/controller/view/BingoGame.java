package com.alm.bingo.controller.view;

import com.alm.bingo.controller.BingoBall;
import com.alm.bingo.controller.Board;
import com.alm.bingo.controller.view.Greeting;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BingoGame {
    // static methods (if any)
    Greeting greeting = new Greeting();

    // instance variables
    int players;    // number of players
    int turns;      // number of turns it took to win
    int bingoBall;  // bingoBall number to compare to board for hit or not


    // constructors
    public BingoGame() {

    }

    private final Scanner scanner = new Scanner(System.in);
    private final Board bingoCard = Board.getInstance();


    // accessor methods

    // business methods
    public void execute() throws InterruptedException {
        greeting.runGreeting();
        TimeUnit.SECONDS.sleep(1);
        showCard();
        callBingoBall();
    }
    private void showCard() {
        bingoCard.show();
    }

    private void callBingoBall() {
        BingoBall randomBall = BingoBall.getRandomBall();
        int number = randomBall.getNumber();
        System.out.println("The next ball selected is:");
        System.out.println("******** " + randomBall + " ********");
    }




    /*
     * Start the game
     * -Create the board
     * -Show the board
     * -Run bingoBall caller
     */
    // compareTo (ifAny)
    // hashCode (ifAny)
    // equals (ifAny)

    // toString

}   // END OF CLASS