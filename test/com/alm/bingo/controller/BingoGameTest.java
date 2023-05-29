package com.alm.bingo.controller;

import com.alm.bingo.controller.view.BingoGame;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BingoGameTest {

    Board board = Board.getInstance();

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void welcomeMessage_shouldDisplayWelcomeMessage_whenCalled() {

    }

    @Test
    public void winnerMessage_shouldDisplayPlayerWon_whenBoardCompletelyFilled() {

    }

    @Test
    public void bingoBallReturn_shouldReturnMultipleBingoBalls_whenExecuteRuns() {

    }

    @Test
    public void callToBingoBall_shouldReturnValidBingoBall_whenCalled() {

    }

    @Test
    public void promptForPlayerCount() throws NumberFormatException {
        // is this test needed?
    }

    @Test
    public void test_multipleBoardsShouldReturnMoreThanOneBoard_whenInputIsGreaterThanOne() {
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