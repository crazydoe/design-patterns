package com.kurs.wzorce.konstrukcyjne.factory;

public class Client {

    private static PizzaFactory factory = new PizzaFactory();

    public static void main(String... args) {
        Pizza pizza = factory.createPizza(PizzaType.THICK);
        System.out.println("Pizza specification: " + pizza.getSpecification());
    }
}
