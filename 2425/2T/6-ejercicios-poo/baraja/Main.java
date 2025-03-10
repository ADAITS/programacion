import java.util.ArrayList;

import clases.Card;
import clases.Deck;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void printGreen(String text){
        System.out.println(ANSI_GREEN + text + ANSI_RESET);
    }           

    public static void main(String[] args) {
        Card o = new Card("oro",1);
        Card c = new Card("copa",1);
        Card e = new Card("espada",1);
        Card b = new Card("basto",1);
        System.out.println(c);

        Deck d = new Deck();
        printGreen("### Original ###");
        System.out.println(d);
        d.shuffle();
        printGreen("### Shuffle ###");
        System.out.println(d);
        Card drawedCard = d.draw();
        printGreen("### Draw ###");
        System.out.println(drawedCard + "\n" + d.getNumberOfCards());
        printGreen("### Cut ###");
        d.cut();
        System.out.println(d);
        d.americanShuffle();
    }
}
