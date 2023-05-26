package com.alm.bingo.controller.view;

import com.alm.bingo.controller.Board;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BingoGame {
    // static methods (if any)

    // instance variables
    private final Scanner scanner = new Scanner(System.in);
    private final Board bingoCard = Board.getInstance();

    // accessor methods

    // business methods
    public void execute() {
        showCard();
    }
    private void showCard() {
        bingoCard.show();
    }

    // compareTo (ifAny)
    // hashCode (ifAny)
    // equals (ifAny)

    // toString

}   // END OF CLASS