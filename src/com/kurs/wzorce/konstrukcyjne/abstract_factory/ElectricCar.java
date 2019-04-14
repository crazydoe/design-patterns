package com.kurs.wzorce.konstrukcyjne.abstract_factory;

public class ElectricCar implements Car {
    @Override
    public String getName() {
        return "Tesla";
    }

    @Override
    public int getMaxSpeed() {
        return 400;
    }

    @Override
    public int getPrice() {
        return 1000000;
    }

    @Override
    public String getSound() {
        return "Szzzzzzzz";
    }
}
