package com.alm.bingo.controller;

import java.util.*;
import java.util.stream.Collectors;

public class BingoBallRandomizer implements Iterable<BingoBall> {

    // instance variables
    private final Set<BingoBall> calledNumbers;
    private final List<BingoBall> balls;

    // constructors
    public BingoBallRandomizer(Random random) {
        balls = Arrays.stream(BingoBall.values())
                .collect(Collectors.toList());
        Collections.shuffle(balls, random);
        calledNumbers = new LinkedHashSet<>();
    }

    // accessor methods
    public Set<BingoBall> getCalledNumbers() {
        return calledNumbers;
    }

    @Override
    public Iterator<BingoBall> iterator() {
        return new BallIterator();
    }

    // nested class
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