package com.alm.bingo.controller;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BoardTest {
    @Test
    public void testMatch_shouldReturnTrue_whenBallMatches() {
        Board board = Board.getInstance();
        board.matchAndReplace(BingoBall.B1);
        board.show();
    }

    @Test
    public void testBoardShow_shouldDisplayCreatedBoard_whenCalled() {
        Board board = Board.getInstance();
        board.show();
    }

    @Test
    public void testMultipleBoardsShouldReturnMoreThanOneBoard_whenInputIsGreaterThanOne() throws InterruptedException {
        int players = 2;
        List<Board> boardList = new ArrayList<>();
        for (int i = 1; i <= players; i++) {
            Board board = Board.getInstance();
            boardList.add(board);
        }
        assertEquals(2, boardList.size());
    }

}