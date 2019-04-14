package com.kurs.wzorce.strukturalne.decorator;

public class ChristmasTreeBalls extends TreeDecorator {

    public ChristmasTreeBalls(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithBalls();
    }

    private String decorateWithBalls() {
        return " full of hand crafted christmas tree balls";
    }
}
