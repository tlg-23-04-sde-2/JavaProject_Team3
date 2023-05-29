package com.alm.bingo.controller;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MichaelScratch {
    // static methods (if any)
    // instance variables
    public Set<BingoBall> calledNumbers;
    public Random random;

    // constructors
    public MichaelScratch() {
        calledNumbers = new HashSet<>();
        random = new Random();
    }
    // accessor methods
    // business methods
    public BingoBall generateRandomNumber() {
        // Generate a random number until it's a number that hasn't been called
        while (true) {
            BingoBall number = getRandomNumber();
            if(!calledNumbers.contains(number)) {
                calledNumbers.add(number);
                return number;
            }
        }
    }

    private BingoBall getRandomNumber() {
        // Get a random number from the BingoBall enum
        return BingoBall.values()[random.nextInt(BingoBall.values().length)];
    }
    // toString

}   // END OF CLASS