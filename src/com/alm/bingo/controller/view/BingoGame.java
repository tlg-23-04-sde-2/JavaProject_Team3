package com.alm.bingo.controller.view;

import com.alm.bingo.controller.Board;

import java.util.Scanner;

class BingoGame {
    // static methods (if any)

    // instance variables
    private final Scanner scanner = new Scanner(System.in);
    private final Board bingoCard = (Board) Board.createCard();
    

    // accessor methods

    // business methods
    private void showCard() {
        bingoCard.show();
    }

    // compareTo (ifAny)
    // hashCode (ifAny)
    // equals (ifAny)

    // toString

}   // END OF CLASS