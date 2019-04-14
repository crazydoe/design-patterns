package com.kurs.wzorce.strukturalne.bridge;

public abstract class Shape {

    Colour colour;

    Shape(Colour colour) {
        this.colour = colour;
    }

    abstract String getColoredShape();
}
