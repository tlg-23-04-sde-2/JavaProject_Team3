package com.alm.bingo.controller;

import com.alm.bingo.controller.view.BingoGame;
import com.alm.bingo.controller.view.Greeting;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Set;

import static org.junit.Assert.*;

public class BingoGameTest {
    BingoGame game = new BingoGame();


    public void setUp() throws Exception {

    }

    @Test
    public void welcomeMessage_shouldDisplayWelcomeMessage_whenCalled() throws InterruptedException{
        Greeting greeting = new Greeting();
        greeting.runGreeting();
    }

    @Test  //NOTE: atm spits out Player 1, 2, 3, Won --until the connected method created
    public void winnerMessage_shouldDisplayPlayerWon_whenBoardCompletelyFilled() throws InterruptedException{
        Greeting winner = new Greeting();
        winner.runWinner();
    }

    @Test
    public void bingoBallReturn_shouldReturnMultipleBingoBalls_whenExecuteRuns() throws InterruptedException {
//        BingoGame game = new BingoGame();
//        BingoBall ball = BingoBall.getRandomBall();
//        String cardHit = "I23";
//        while (ball.equals("I23"){
//           BingoBall.getRandomBall();
//            System.out.println(BingoBall.getRandomBall());
//        }
        MichaelScratch rand = new MichaelScratch();
        for(int i = 0; i < 75; i++) {
            rand.generateRandomNumber();
        }
        System.out.println(rand.calledNumbers.size());
    }

    @Test  // Lilly note: is this made redundant by the above test? i.e '...MultipleValidBingoBalls...'
    public void callToBingoBall_shouldReturnValidBingoBall_whenCalled() {

    }

}