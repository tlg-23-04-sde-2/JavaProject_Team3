package com.alm.bingo.controller;

import org.junit.Before;
import org.junit.Test;

public class BoardTest {

    Board board = new Board();

//    @Test
//    public void test_createRandomB() {
//        List<Integer> bIndex = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
//        List<Integer> tester = board.createRandomB(bIndex);
//        System.out.println(tester);
//    }


    @Before
    public void setUp() throws Exception {
        board.createCard();
    }

    @Test
    public void testShow() {
        System.out.println(board.show());
    }

    @Test
    public void welcomeTest() {

    }
}