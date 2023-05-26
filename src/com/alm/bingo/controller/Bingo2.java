package com.alm.bingo.controller;

import java.util.HashMap;
import java.util.Map;

class Bingo2 {
    public static void main(String[] args) {
        Map<String, Integer[]> bingoBoard = new HashMap<>();

        String[] columnHeaders = {"B", "I", "N", "G", "O"};

        Integer[] columnB = {1, 2, 3, 4, 5};
        Integer[] columnI = {16, 17, 18, 19, 20};
        Integer[] columnN = {31, 32, 33, 34, 35};
        Integer[] columnG = {45, 46, 47, 48, 49};
        Integer[] columnO = {61, 62, 63, 64, 65};

        bingoBoard.put(columnHeaders[0], columnB);
        bingoBoard.put(columnHeaders[1], columnI);
        bingoBoard.put(columnHeaders[2], columnN);
        bingoBoard.put(columnHeaders[3], columnG);
        bingoBoard.put(columnHeaders[4], columnO);


        for(int i = 0; i < columnHeaders.length; i++) {
            System.out.println(columnHeaders[i]);
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j=0; j<columnHeaders.length; j++) {
                Integer[] columnValues = bingoBoard.get(columnHeaders[j]);
                System.out.println(columnValues[i]);
            }
            System.out.println();
        }




    }
}   // END OF CLASS