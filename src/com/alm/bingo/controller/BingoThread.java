package com.alm.bingo.controller;

class BingoThread extends Thread{
    private int count = 3;
    private long interval = 500;
    Board board = new Board();
    Board board1 = new Board();


    public void run(){
        board.createCard();
        board1.createCard();

        board.show();
        board1.show();

        for (int i = 0; i < count; i++) {
            board.update();
            board1.update();

            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        board.show();
        board1.show();
    }


}   // END OF CLASS