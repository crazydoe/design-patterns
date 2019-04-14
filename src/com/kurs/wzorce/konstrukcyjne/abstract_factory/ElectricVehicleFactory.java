package com.kurs.wzorce.konstrukcyjne.abstract_factory;

public class ElectricVehicleFactory implements AbstractFactory {
    @Override
    public Motorcycle createMotorcycle() {
        return new ElectricMotorcycle();
    }

    @Override
    public Car createCar() {
        return new ElectricCar();
    }
}
