package com.kurs.wzorce.konstrukcyjne.abstract_factory;

public class Client {

    public static void main(String... args) {
        AbstractFactory factory = new ElectricVehicleFactory();
        Car car = factory.createCar();
        Motorcycle motorcycle = factory.createMotorcycle();

        showCar(car);
        showMotorcycle(motorcycle);
    }

    public static void showCar(Car car) {
        System.out.println(car.getName() + ", v-max: " + car.getMaxSpeed() + ", price: " + car.getPrice() + ", sound:" + car.getSound());
    }

    public static void showMotorcycle(Motorcycle moto) {
        System.out.println(moto.getName() + ", v-max: " + moto.getMaxSpeed() + ", price: " + moto.getPrice() + ", driver licence type: " + moto.getDriverLicenceType());
    }
}
