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
    private final Map<String, List<Integer>> bingoCard = new LinkedHashMap<>();

   // streams to create value fields for each column on the board
    private final List<Integer> bColumn = IntStream.rangeClosed(1,15)
            .boxed()
            .collect(Collectors.toList());

    private final List<Integer> iColumn = IntStream.rangeClosed(16,30)
            .boxed()
            .collect(Collectors.toList());

    private final List<Integer> nColumn = IntStream.rangeClosed(31,45)
            .boxed()
            .collect(Collectors.toList());

    private final List<Integer> gColumn = IntStream.rangeClosed(46,60)
            .boxed()
            .collect(Collectors.toList());

    private final List<Integer> oColumn = IntStream.rangeClosed(61,75)
            .boxed()
            .collect(Collectors.toList());

    // create a BingoBoard with random numbers in values
    // B: 1-15; I: 16-30; N: 31-45; G: 46-60; O: 61-75
   public  Map<String, List<Integer>>  createCard() {
       bingoCard.put("B", createRandomSample(bColumn));
       bingoCard.put("I", createRandomSample(iColumn));
       bingoCard.put("N", createRandomSample(nColumn));
       bingoCard.put("G", createRandomSample(gColumn));
       bingoCard.put("O", createRandomSample(oColumn));
       return bingoCard;
   }

   //creates the instance of the card
   public static Board getInstance() {
       Board board = new Board();
       board.createCard();
       return board;
   }

   // constructor to prevent outside instantiation
   Board() {  //made package-private for testing BoardTest L16
    }

    //create the random number for the values field
   public List<Integer> createRandomSample(List<Integer> column) {
       Collections.shuffle(column, random);
       return new ArrayList<>(column.subList(0,NUM_OF_ELEMENTS));
    }

    public void show() {
        System.out.println(" B   I   N   G   O");
        System.out.println("==================");
        // Iterate over the range
        for (int i = 0; i < NUM_OF_ELEMENTS; i++) {
            for (Map.Entry<String, List<Integer>> entry : bingoCard.entrySet()) {
                List<Integer> values = entry.getValue(); // gets the values in each key set

               // Stores the value at current index if its in bounds
                String value = (i < values.size()) ? String.valueOf(values.get(i)) : " ";
                // Print the value followed by a tab char
                System.out.printf("%2s", value + "\t");
            }
            System.out.println();
        }
        System.out.println("==================");
    }

    public void update() {

    }

} // end of class
