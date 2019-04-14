package com.kurs.wzorce.konstrukcyjne.factory;

public class PizzaFactory {

    public Pizza createPizza(PizzaType type) {
        switch (type) {
            case THIN: return new ThinPizza();
            case THICK: return new ThickPizza();
        }
        throw new RuntimeException("Pizza type not found");
    }
}
