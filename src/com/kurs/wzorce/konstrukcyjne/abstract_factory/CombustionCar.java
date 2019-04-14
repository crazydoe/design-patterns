package com.kurs.wzorce.konstrukcyjne.abstract_factory;

public class CombustionCar implements Car {
    @Override
    public String getName() {
        return "Porche 911";
    }

    @Override
    public int getMaxSpeed() {
        return 360;
    }

    @Override
    public int getPrice() {
        return 750000;
    }

    @Override
    public String getSound() {
        return "WRRRRRRR";
    }
}
