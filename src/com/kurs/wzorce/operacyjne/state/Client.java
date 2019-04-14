package com.kurs.wzorce.operacyjne.state;

public class Client {

    public static void main(String... args) {
        Package pkg = new Package();
        pkg.printStatus();

        System.out.println();

        pkg.nextState();
        pkg.printStatus();

        System.out.println();

        pkg.nextState();
        pkg.printStatus();

        System.out.println();

        pkg.nextState();
    }
}
