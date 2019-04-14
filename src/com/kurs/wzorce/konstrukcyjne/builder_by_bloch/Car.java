package com.kurs.wzorce.konstrukcyjne.builder_by_bloch;

public class Car {
    private final String manufacturer;

    private final String model;

    private final boolean airConditioning;

    private final boolean satNav;

    private Car(CarBuilder builder) {
        this.manufacturer = builder.manufacturer;
        this.model = builder.model;
        this.airConditioning = builder.airConditioning;
        this.satNav = builder.satNav;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public boolean isSatNav() {
        return satNav;
    }

    public static class CarBuilder {

        private final String manufacturer;

        private final String model;

        private boolean airConditioning;

        private boolean satNav;

        public CarBuilder(String manufacturer, String model) {

            this.manufacturer = manufacturer;
            this.model = model;
        }

        public CarBuilder airConditioning(boolean airConditioning) {

            this.airConditioning = airConditioning;
            return this;
        }

        public CarBuilder satNav(boolean satNav) {

            this.satNav = satNav;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
