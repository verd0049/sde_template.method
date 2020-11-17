package com.hz;

public class Main {

    public static void main(String[] args) {

        // Lets print some cards

        Printer printer = new Console();

        PostCard card = new PostCard(printer);

        card.print();
    }
}
