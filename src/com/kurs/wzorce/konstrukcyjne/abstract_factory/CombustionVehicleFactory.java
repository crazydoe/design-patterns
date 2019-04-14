package com.kurs.wzorce.konstrukcyjne.abstract_factory;

public class CombustionVehicleFactory implements AbstractFactory {
    @Override
    public Motorcycle createMotorcycle() {
        return new CombustionMotorcycle();
    }

    @Override
    public Car createCar() {
        return new CombustionCar();
    }
}
