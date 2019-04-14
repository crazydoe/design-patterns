package com.kurs.wzorce.konstrukcyjne.builder_by_bloch;

public class Client {

    public static void main(String... args) {
        Car challenger = new Car.CarBuilder("Dodge", "Challenger")
                .airConditioning(true)
                .satNav(true)
                .build();
    }
}
