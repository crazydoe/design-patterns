package com.kurs.wzorce.strukturalne.bridge;

public class Client {

    public static void main(String... args) {
        Shape blueOval = new Oval(new Blue());
        System.out.println(blueOval.getColoredShape());

    }
}
