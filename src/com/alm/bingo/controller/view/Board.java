package com.alm.bingo.controller.view;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Random;
import java.util.stream.Collectors;

public class Board {
    private static final Random random = new Random();

    /*                   BINGO    VALUES                           */
   private final TreeMap<String, List<Integer>> bingoCard = new TreeMap<>();
//   private static final int MIN_VALUE = 1;
//   private static final int Max_Value = 75;
   private List<Integer> values = new ArrayList(Arrays.asList(
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, //B
        16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, // I
        31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, // N
        46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, // G
        61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75)); //O

    private List<Integer> bIndex = values.subList(0, 14);
    private List<Integer> iIndex = values.subList(15, 29);
    private List<Integer> nIndex = values.subList(30, 44);
    private List<Integer> gIndex = values.subList(45, 59);
    private List<Integer> oIndex = values.subList(60, 74);


    //TODO: create a get instance of the board
    /*                                                     */
   public TreeMap<String, List<Integer>>  getInstance() {
       bingoCard.put("B", createRandomB(bIndex)); // make the random number;
//       bingoCard.put("I", createRandomI(iIndex));
//       bingoCard.put("N", createRandomN(nIndex));
//       bingoCard.put("G", createRandomG(gIndex));
//       bingoCard.put("O", createRandomO(oIndex));
       return bingoCard;
   }

   // constructor to prevent outside instantiation
   public Board() {
    }



   //TODO: create the random number for the values field
    List<Integer> createRandomB(List<Integer> bIndex) {
        int numOfEl = 5;
        ArrayList<Integer> bValues = new ArrayList<>();
        for (int i = 0; i < numOfEl; i++) {
            int randomIndex = random.nextInt(bIndex.size()); // get a random index
            Integer randomValue = bIndex.get(randomIndex); // match the value to the random index created
            bIndex.remove(randomIndex); // removing that index from the array list so no duplicates
            bValues.add(randomValue);
        }
        return bValues;
    }


    private List<Integer> createRandomI(List<Integer> iIndex) {
        int numOfEl = 5;
        ArrayList<Integer> iValues = new ArrayList<>();
        for (int i = 0; i < numOfEl; i++) {
            int randomIndex = random.nextInt(iIndex.size()); // get a random index
            Integer randomValue = iIndex.get(randomIndex); // match the value to the random index created
            iIndex.remove(randomIndex); // removing that index from the array list so no duplicates
            iValues.add(randomValue);
        }
        return iValues;
    }

    private List<Integer> createRandomN(List<Integer> nIndex) {
        int numOfEl = 5;
        List<Integer> nValues = new ArrayList<>();
        for (int i = 0; i < numOfEl; i++) {
            int randomIndex = random.nextInt(nIndex.size()); // get a random index
            Integer randomValue = nIndex.get(randomIndex); // match the value to the random index created
            nIndex.remove(randomIndex); // removing that index from the array list so no duplicates
            nValues.add(randomValue);
        }
        return nValues;
    }

    private List<Integer> createRandomG(List<Integer> gIndex) {
        int numOfEl = 5;
        List<Integer> gValues = new ArrayList<>();
        for (int i = 0; i < numOfEl; i++) {
            int randomIndex = random.nextInt(gIndex.size()); // get a random index
            Integer randomValue = gIndex.get(randomIndex); // match the value to the random index created
            gIndex.remove(randomIndex); // removing that index from the array list so no duplicates
            gValues.add(randomValue);
        }
        return gValues;
    }

    private List<Integer> createRandomO(List<Integer> oIndex) {
        int numOfEl = 5;
        List<Integer> oValues = new ArrayList<>();
        for (int i = 0; i < numOfEl; i++) {
            int randomIndex = random.nextInt(oIndex.size()); // get a random index
            Integer randomValue = oIndex.get(randomIndex); // match the value to the random index created
            oIndex.remove(randomIndex); // removing that index from the array list so no duplicates
            oValues.add(randomValue);
        }
        return oValues;
    }

} // end of class
