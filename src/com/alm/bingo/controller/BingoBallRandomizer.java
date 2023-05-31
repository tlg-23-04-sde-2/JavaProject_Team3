package com.alm.bingo.controller;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class BingoBallRandomizer {
    // static methods (if any)
    // instance variables
    public Set<BingoBall> calledNumbers = new HashSet<>();
    public Random random = new Random();

    // constructors
    public BingoBallRandomizer() {
        getCalledNumbers();
    }
    // accessor methods

    public Set<BingoBall> getCalledNumbers() {
        return calledNumbers;
    }

    public void setCalledNumbers(Set<BingoBall> calledNumbers) {
        this.calledNumbers = calledNumbers;
    }

    // business methods
    public BingoBall generateRandomNumber() {
        // Generate a random number until it's a number that hasn't been called
        while (true) {
            BingoBall number = getRandomNumber();
            if (!calledNumbers.contains(number)) {
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