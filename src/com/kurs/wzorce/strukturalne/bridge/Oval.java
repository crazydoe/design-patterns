package com.kurs.wzorce.strukturalne.bridge;

public class Oval extends Shape {

    Oval(Colour colour) {
        super(colour);
    }

    @Override
    String getColoredShape() {
        return "Oval + " + colour;
    }
}
