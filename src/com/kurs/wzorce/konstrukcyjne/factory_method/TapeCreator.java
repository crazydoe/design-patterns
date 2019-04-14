package com.kurs.wzorce.konstrukcyjne.factory_method;

import com.kurs.wzorce.konstrukcyjne.factory_method.commons.PriceCalculator;
import com.kurs.wzorce.konstrukcyjne.factory_method.commons.PriceTag;

public class TapeCreator implements Creator {
    private PriceCalculator calculator;

    public TapeCreator() {
        calculator = new PriceCalculator();
    }

    @Override
    public Product create() {
        Tape tape = new Tape();
        PriceTag priceForUK = calculator.getPriceForUK(12L);
        tape.setPriceTag(priceForUK);
        return tape;
    }
}
