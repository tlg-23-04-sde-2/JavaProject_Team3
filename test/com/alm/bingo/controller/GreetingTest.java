package com.alm.bingo.controller;

import com.alm.bingo.view.DisplayMessages;
import org.junit.Test;


public class GreetingTest {

    @Test
    public void welcomeMessage_shouldDisplayWelcomeMessage_whenCalled() throws InterruptedException {
        DisplayMessages greeting = new DisplayMessages();
        greeting.runGreeting();
    }

    @Test
    public void testWinnerMessage_shouldDisplayPlayerOneWon_whenPlayerOneWins() throws InterruptedException {
        DisplayMessages winner = new DisplayMessages();
        winner.runWinner(1);
    }

    @Test
    public void testWinnerMessage_shouldDisplayPlayerTwoWon_whenPlayerTwoWins() throws InterruptedException {
        DisplayMessages winner = new DisplayMessages();
        winner.runWinner(2);
    }

    @Test
    public void winnerMessage_shouldDisplayPlayerThreeWon_whenPlayerThreeWins() throws InterruptedException {
        DisplayMessages winner = new DisplayMessages();
        winner.runWinner(3);
    }


}