package com.alm.bingo.controller;

import java.util.*;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Board {
    // static variables
    private static final Random random = new Random();
    private static final int NUM_OF_ELEMENTS = 5;

    /*                   BINGO    VALUES                           */
    public Map<String, List<Integer>> bingoCard = new LinkedHashMap<>();

    // streams to create value fields for each column on the board
    private final List<Integer> bColumn = IntStream.rangeClosed(1, 15)
            .boxed()
            .collect(Collectors.toList());

    private final List<Integer> iColumn = IntStream.rangeClosed(16, 30)
            .boxed()
            .collect(Collectors.toList());

    private final List<Integer> nColumn = IntStream.rangeClosed(31, 45)
            .boxed()
            .collect(Collectors.toList());

    private final List<Integer> gColumn = IntStream.rangeClosed(46, 60)
            .boxed()
            .collect(Collectors.toList());

    private final List<Integer> oColumn = IntStream.rangeClosed(61, 75)
            .boxed()
            .collect(Collectors.toList());

    // get the card column values
    public Integer getValues() {
        for (Integer value : bingoCard.get("B")) {
            System.out.println(value);
        }
        return 0;
    }


    // getInstance creates a BingoBoard with random numbers in values
    // B: 1-15; I: 16-30; N: 31-45; G: 46-60; O: 61-75
    public Map<String, List<Integer>> createCard() {
        bingoCard.put("B", createRandomSample(bColumn));
        bingoCard.put("I", createRandomSample(iColumn));
        bingoCard.put("N", createRandomSample(nColumn));
        bingoCard.put("G", createRandomSample(gColumn));
        bingoCard.put("O", createRandomSample(oColumn));
        return bingoCard;
    }

    // constructor to prevent outside instantiation
    public Board() {
    }

    //create the random number for the values field
    public List<Integer> createRandomSample(List<Integer> column) {
        Collections.shuffle(column, random);
        return new ArrayList<>(column.subList(0, NUM_OF_ELEMENTS));
    }

    public String show() {
//        List<Integer> columns = bingoCard.values();
        System.out.println("B   I   N   G   O");
        System.out.println("-----------------");

//        for( int i = 0; i < NUM_OF_ELEMENTS; i++) {
//            System.out.printf("%s  %s  %s  %s  %s",
//                    getValues(bingoCard.values("B")), iColumn, nColumn, gColumn, oColumn);
//
//        }


        for (int i = 0; i < NUM_OF_ELEMENTS; i++) {
            for (Map.Entry<String, List<Integer>> entry : bingoCard.entrySet()) {
                String key = entry.getKey();
                List<Integer> values = entry.getValue();

                if (i < values.size()) {
                    System.out.println(values.get(i));
                } else {
                    System.out.println("");
                }
            }

//            for(Integer value : values) {
//                System.out.println(value);
        }


            return String.valueOf("");
        }

//    private static void dump(List<Integer> items) {
//        for (Integer item : items) {
//            System.out.println(item);
//        }


} // end of class
