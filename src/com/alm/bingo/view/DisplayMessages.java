package com.alm.bingo.view;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DisplayMessages implements Runnable {

    private static Runnable greeting1 = new DisplayMessages("WELCOME TO...");
    private static Runnable greeting2 = new DisplayMessages("$$$$$$\\  $$\\       $$\\      $$\\   \n" +
            "$$  __$$\\ $$ |      $$$\\    $$$ |   \n" +
            "$$ /  $$ |$$ |      $$$$\\  $$$$ |    \n" +
            "$$$$$$$$ |$$ |      $$\\$$\\$$ $$ |   \n" +
            "$$  __$$ |$$ |      $$ \\$$$  $$ |    \n" +
            "$$ |  $$ |$$ |      $$ |\\$  /$$ |    \n" +
            "$$ |  $$ |$$$$$$$$\\ $$ | \\_/ $$ |   \n" +
            "\\__|  \\__|\\________|\\__|     \\__|\n\n");
    private static Runnable greeting3 = new DisplayMessages(
            "$$$$$$$\\  $$\\                     $$\\                             $$\\         \n" +
                    "$$  __$$\\ $$ |                    $$ |                            $$ |           \n" +
                    "$$ |  $$ |$$ | $$$$$$\\   $$$$$$$\\ $$ |  $$\\  $$$$$$\\  $$\\   $$\\ $$$$$$\\    \n" +
                    "$$$$$$$\\ |$$ | \\____$$\\ $$  _____|$$ | $$  |$$  __$$\\ $$ |  $$ |\\_$$  _|     \n" +
                    "$$  __$$\\ $$ | $$$$$$$ |$$ /      $$$$$$  / $$ /  $$ |$$ |  $$ |  $$ |           \n" +
                    "$$ |  $$ |$$ |$$  __$$ |$$ |      $$  _$$<  $$ |  $$ |$$ |  $$ |  $$ |$$\\        \n" +
                    "$$$$$$$  |$$ |\\$$$$$$$ |\\$$$$$$$\\ $$ | \\$$\\ \\$$$$$$  |\\$$$$$$  |  \\$$$$  |\n" +
                    "\\_______/ \\__| \\_______| \\_______|\\__|  \\__| \\______/  \\______/    \\____/\n\n");
    private static Runnable greeting4 = new DisplayMessages("$$$$$$$\\  $$\\  \n" +
            "$$  __$$\\ \\__| \n" +
            "$$ |  $$ |$$\\ $$$$$$$\\   $$$$$$\\   $$$$$$\\   \n" +
            "$$$$$$$\\ |$$ |$$  __$$\\ $$  __$$\\ $$  __$$\\  \n" +
            "$$  __$$\\ $$ |$$ |  $$ |$$ /  $$ |$$ /  $$ |    \n" +
            "$$ |  $$ |$$ |$$ |  $$ |$$ |  $$ |$$ |  $$ |     \n" +
            "$$$$$$$  |$$ |$$ |  $$ |\\$$$$$$$ |\\$$$$$$  |   \n" +
            "\\_______/ \\__|\\__|  \\__| \\____$$ | \\______/\n" +
            "                        $$\\   $$ |\n" +
            "                        \\$$$$$$  |\n" +
            "                         \\______/    *ALM BINGO NOT-INCORPORATED");
    private static Runnable winPlayer = new DisplayMessages(
            " $$$$$$$\\  $$\\        $$$$$$\\ $$\\     $$\\ $$$$$$$$\\ $$$$$$$\\   \n" +
                    " $$  __$$\\ $$ |      $$  __$$\\\\$$\\   $$  |$$  _____|$$  __$$\\    \n" +
                    " $$ |  $$ |$$ |      $$ /  $$ |\\$$\\ $$  / $$ |      $$ |  $$ |      \n" +
                    " $$$$$$$  |$$ |      $$$$$$$$ | \\$$$$  /  $$$$$\\    $$$$$$$  |      \n" +
                    " $$  ____/ $$ |      $$  __$$ |  \\$$  /   $$  __|   $$  __$$<        \n" +
                    " $$ |      $$ |      $$ |  $$ |   $$ |    $$ |      $$ |  $$ |        \n" +
                    " $$ |      $$$$$$$$\\ $$ |  $$ |   $$ |    $$$$$$$$\\ $$ |  $$ |      \n" +
                    " \\__|      \\________|\\__|  \\__|   \\__|    \\________|\\__|  \\__|\n" + " \n");
    private static Runnable winP1 = new DisplayMessages("                   $$\\    \n" +
            "                 $$$$ |    \n" +
            "                 \\_$$ |   \n" +
            "                   $$ |    \n" +
            "                   $$ |    \n" +
            "                   $$ |    \n" +
            "                 $$$$$$\\  \n" +
            "                 \\______| \n" + "\n");
    private static Runnable winP2 = new DisplayMessages("                 $$$$$$\\   \n" +
            "                $$  __$$\\  \n" +
            "                \\__/  $$ | \n" +
            "                 $$$$$$  |  \n" +
            "                $$  ____/   \n" +
            "                $$ |        \n" +
            "                $$$$$$$$\\  \n" +
            "                \\________| \n" + "\n");
    private static Runnable winP3 = new DisplayMessages("                 $$$$$$\\    \n" +
            "                $$  __$$\\   \n" +
            "                \\_/   $$ |  \n" +
            "                  $$$$$ /    \n" +
            "                  \\___$$\\  \n" +
            "                $$\\   $$ |  \n" +
            "                \\$$$$$$  |  \n" +
            "                 \\______/   \n" + "\n");
    private static Runnable winWon = new DisplayMessages(" $$\\      $$\\    $$$$$$\\    $$\\   $$\\   $$\\  \n" +
            " $$ | $\\  $$ |  $$  __$$\\   $$$\\  $$ |  $$ |    \n" +
            " $$ |$$$\\ $$ |  $$ /  $$ |  $$$$\\ $$ |  $$ |     \n" +
            " $$ $$ $$\\$$ |  $$ |  $$ |  $$ $$\\$$ |  $$ |     \n" +
            " $$$$  _$$$$ |  $$ |  $$ |  $$ \\$$$$ |  \\__|     \n" +
            " $$$  / \\$$$ |  $$ |  $$ |  $$ |\\$$$ |           \n" +
            " $$  /   \\$$ |   $$$$$$  |  $$ | \\$$ |  $$\\     \n" +
            " \\__/     \\__|   \\______/   \\__|  \\__|  \\__| \n");
    private static final Runnable michaelMascot1 = new DisplayMessages(
            "(\\(\\ \n" +
            "(-.-)      \n" +
            "o(\")(\")  \n");
    private static final Runnable michaelMascot2 = new DisplayMessages(
            "(\\(\\ \n" +
            "(-.o)     \n" +
            "o(\")(\") \n");
    private static final Runnable michaelMascot3 = new DisplayMessages(
            "(\\_/) -!!\n" +
            "(0.0)     \n" +
            "(m m)o    \n");
    private static final Runnable michaelMascot4 = new DisplayMessages(
            "* (\\_/) \n" +
            "(\\(O.O) \n" +
            "  (m_m)o \n");
    private static final Runnable michaelMascot5 = new DisplayMessages(
            " (\\_/) *\n" +
            " (O.O)/) \n" +
            "o(m_m)   \n");
    private static final Runnable michaelMascot6 = new DisplayMessages(
            "* (\\_/) *\n" +
            " =(^.^)=   \n" +
            " (\")_(\") \n");
    private static final Runnable fireworks = new DisplayMessages(
            "                                  .''.\n" +
            "       .''.     .        *''*    :_\\/_:     .\n" +
            "      :_\\/_:  _\\(/_  .:.*_\\/_*   : /\\ :  .'.:.'.\n" +
            "  .''.: /\\ :   /)\\   ':'* /\\ *  : '..'.  -=:o:=-\n" +
            " :_\\/_:'.:::.  | ' *''*    * '.\\'/.'_\\(/_'.':'.'\n" +
            " : /\\ : :::::  =  *_\\/_*     -= o =- /)\\    '  *\n" +
            "  '..'  ':::' === * /\\ *     .'/.\\'.  ' ._____\n" +
            "      *        |   *..*         :       |.   |' .---\"|\n" +
            "        *      |     _           .--'|  ||   | _|    |\n" +
            "        *      |  .-'|       __  |   |  |    ||      |\n" +
            "     .-----.   |  |' |  ||  |  | |   |  |    ||      |\n" +
            " ___'       ' /\"\\ |  '-.\"\".    '-'   '-.'    '`      |____\n" +
            "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    private String art;

    public DisplayMessages() {
    }
    public DisplayMessages(String art) {
        this.art = art;
    }

    public void runGreeting() throws InterruptedException {
        ExecutorService popUp = Executors.newFixedThreadPool(1);
        System.out.println();
        popUp.execute(greeting1);
        TimeUnit.SECONDS.sleep(2);
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        popUp.execute(greeting2);
        TimeUnit.SECONDS.sleep(1);
        popUp.execute(greeting3);
        TimeUnit.SECONDS.sleep(1);
        popUp.execute(greeting4);
        popUp.shutdown();
    }

    public void runWinner(int player) throws InterruptedException {
        ExecutorService popUp = Executors.newFixedThreadPool(1);
        System.out.println();
        popUp.execute(winPlayer);
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        //switch on player #
        switch (player) {
            //switch case 1:
            case 1:
                popUp.execute(winP1);
                TimeUnit.SECONDS.sleep(1);
                break;
            //switch case 2:
            case 2:
                popUp.execute(winP2);
                TimeUnit.SECONDS.sleep(1);
                break;
            //switch case 3:
            case 3:
                popUp.execute(winP3);
                TimeUnit.SECONDS.sleep(1);
        }
        popUp.execute(winWon);
        TimeUnit.SECONDS.sleep(6);
        popUp.execute(michaelMascot1);
        TimeUnit.SECONDS.sleep(2);
        popUp.execute(michaelMascot2);
        TimeUnit.SECONDS.sleep(2);
        popUp.execute(michaelMascot3);
        TimeUnit.SECONDS.sleep(2);
        popUp.execute(michaelMascot4);
        TimeUnit.SECONDS.sleep(2);
        popUp.execute(michaelMascot5);
        TimeUnit.SECONDS.sleep(2);
        popUp.execute(michaelMascot6);
        TimeUnit.SECONDS.sleep(4);
        popUp.execute(fireworks);
        TimeUnit.SECONDS.sleep(8);
        popUp.shutdown();
    }

    public void run() {
        System.out.println(art);
    }

}   // END OF CLASS