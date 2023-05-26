package com.alm.bingo.controller;

import com.alm.bingo.controller.view.Board;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BoardTest {

    Board board = new Board();

    @Test
    public void test_createRandomB() {
        List<Integer> bIndex = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
        List<Integer> tester = board.createRandomB(bIndex);
        System.out.println(tester);
    }

    @Test
    public void test_getInstance() {
        System.out.println(board.getInstance());
    }
}