package com.alm.bingo.controller;

import java.util.*;
import java.util.stream.Collectors;

public class BingoBallRandomizer implements Iterable<BingoBall> {

    private final List<BingoBall> balls;
    // static methods (if any)
    // instance variables
    private final Set<BingoBall> calledNumbers;
//    public final Random random;

    // constructors
    public BingoBallRandomizer(Random random) {
//        this.random = random;
        balls = Arrays.stream (BingoBall.values())
                .collect(Collectors.toList());
        Collections.shuffle(balls,random);
        calledNumbers = new LinkedHashSet<>();
//        getCalledNumbers();
    }
    // accessor methods

    public Set<BingoBall> getCalledNumbers() {
        return calledNumbers;
    }

    @Override
    public Iterator<BingoBall> iterator() {
        return new BallIterator();
    }

    // business methods
//    public BingoBall generateRandomNumber() {
//        // Generate a random number until it's a number that hasn't been called
//        while (true) {
//            BingoBall number = getRandomNumber();
//            if (!calledNumbers.contains(number)) {
//                calledNumbers.add(number);
//                return number;
//            }
//        }
//    }
//
//    private BingoBall getRandomNumber() {
//
//        // Get a random number from the BingoBall enum
//        return BingoBall.values()[random.nextInt(BingoBall.values().length)];
//    }
    private class BallIterator implements Iterator<BingoBall> {
        private final Iterator<BingoBall> iter = balls.iterator();
        @Override
        public boolean hasNext() {
            return iter.hasNext();
        }

        @Override
        public BingoBall next() {
            BingoBall ball = iter.next();
            calledNumbers.add(ball);
            return ball;
        }
    }

}   // END OF CLASS