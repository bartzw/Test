package nl.qien.weekopdrachtYahtzeeSimple;

import java.util.Scanner;

public class Yahtzee {
    public static void main(String[] args) {
        YahtzeeSpel spel = new YahtzeeSpel();
        spel.spelen();

    }
}

class YahtzeeSpel {
    YahtzeeSpel() {

    }
    void spelen() {
        Scanner reader = new Scanner(System.in);
        while (reader.nextLine() != null) {
            System.out.println("niet null");
        }

    }
}
