package com.kurs.wzorce.konstrukcyjne.abstract_factory;

public class ElectricMotorcycle implements Motorcycle {
    @Override
    public String getName() {
        return "Vespa";
    }

    @Override
    public int getMaxSpeed() {
        return 100;
    }

    @Override
    public int getPrice() {
        return 30000;
    }

    @Override
    public String getDriverLicenceType() {
        return "B2";
    }
}
