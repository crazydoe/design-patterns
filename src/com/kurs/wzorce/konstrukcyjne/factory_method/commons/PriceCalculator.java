package com.kurs.wzorce.konstrukcyjne.factory_method.commons;

public class PriceCalculator {

    public PriceTag getPriceForUK(Long price) {
        return new PriceTag(price * 5, "GPB");
    }

    public PriceTag getPriceForUSA(Long price) {
        return new PriceTag(price * 4, "USD");
    }
}
