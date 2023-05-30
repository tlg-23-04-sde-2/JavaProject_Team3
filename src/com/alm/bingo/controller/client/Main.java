package com.alm.bingo.controller.client;


import com.alm.bingo.controller.Board;
import com.alm.bingo.controller.view.BingoGame;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Main {

    public static void main(String[] args) throws InterruptedException {
        BingoGame bingo = new BingoGame();
        bingo.execute();

    }

}
