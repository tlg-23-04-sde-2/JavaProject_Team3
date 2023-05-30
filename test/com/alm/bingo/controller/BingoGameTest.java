package com.alm.bingo.controller;
import com.alm.bingo.view.BingoGame;
import com.alm.bingo.view.Greeting;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class BingoGameTest {
    BingoGame game = new BingoGame();


    Board board = Board.getInstance();

    @Before
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
        BingoBallRandomizer rand = new BingoBallRandomizer();
        for(int i = 0; i < 75; i++) {
            rand.generateRandomNumber();
        }
        System.out.println(rand.calledNumbers.size());
    }

    @Test  // Lilly note: is this made redundant by the above test? i.e '...MultipleValidBingoBalls...'
    public void callToBingoBall_shouldReturnValidBingoBall_whenCalled() {

    }
    

    @Test
    public void test_multipleBoardsShouldReturnMoreThanOneBoard_whenInputIsGreaterThanOne() throws InterruptedException {
        // created the bingo game
        BingoGame game = new BingoGame();
        // initialize player count
        int players = 2;
        //create a list to hold the game cards created
        List<BingoGame> createdBoards = new ArrayList<>();
        //loop over the players and add create new game card adding the cards to a list
        for (int i = 1; i <= players; i++) {
            game.multipleBoards(i);
            createdBoards.add(game);
        }

        //check that the number of players is the same size as the list of boards created
        assertEquals(2, createdBoards.size());
    }
}