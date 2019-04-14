package com.kurs.wzorce.konstrukcyjne.factory_method;

import com.kurs.wzorce.konstrukcyjne.factory_method.commons.PriceCalculator;
import com.kurs.wzorce.konstrukcyjne.factory_method.commons.PriceTag;

public class VinylCreator implements Creator {

    private PriceCalculator calculator;

    public VinylCreator() {
        calculator = new PriceCalculator();
    }

    @Override
    public Product create() {
        Vinyl ball = new Vinyl();
        PriceTag priceForUSA = calculator.getPriceForUSA(30L);
        ball.setPriceTag(priceForUSA);
        return ball;
    }
}
