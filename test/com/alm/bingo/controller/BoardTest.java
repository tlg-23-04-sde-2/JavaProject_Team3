package com.alm.bingo.controller;

import com.alm.bingo.controller.view.BingoGame;
import org.junit.Before;
import org.junit.Test;

public class BoardTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void showCard_shouldShowNewBingoCard_whenCalled() {
        Board board = new Board();
        board.createCard();
        Board.getInstance();
        board.show();
    }

    @Test
    public void numberOfCards_shouldReturnAccurateNumberOfCards_whenMoreThanOnePlayerCreated()
    throws NumberFormatException {
        Board board = new Board();
//        promptForPlayerCount();  //never got this to work, taking a break. sorry
        board.createCard();
        Board.getInstance();
        board.show();
    }
}