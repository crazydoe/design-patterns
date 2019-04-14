package com.kurs.wzorce.konstrukcyjne.abstract_factory;

public class CombustionMotorcycle implements Motorcycle {
    @Override
    public String getName() {
        return "Aprilla";
    }

    @Override
    public int getMaxSpeed() {
        return 350;
    }

    @Override
    public int getPrice() {
        return 20000;
    }

    @Override
    public String getDriverLicenceType() {
        return "A1";
    }
}
