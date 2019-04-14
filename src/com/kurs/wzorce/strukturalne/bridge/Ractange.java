package com.kurs.wzorce.strukturalne.bridge;

public class Ractange extends Shape {

    Ractange(Colour colour) {
        super(colour);
    }

    @Override
    String getColoredShape() {
        return "Ractangle + " + colour.getColour();
    }
}
