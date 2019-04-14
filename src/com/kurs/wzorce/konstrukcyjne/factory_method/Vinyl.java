package com.kurs.wzorce.konstrukcyjne.factory_method;

import com.kurs.wzorce.konstrukcyjne.factory_method.commons.PriceTag;

public class Vinyl implements Product {

    private PriceTag priceTag;

    public void setPriceTag(PriceTag priceTag) {
        this.priceTag = priceTag;
    }

    @Override
    public String getProduct() {
        return "  .-\"\"\"-.\n" +
                " /   _   \\\n" +
                "|   (+)   |\n" +
                " \\   ^   /\n" +
                "  '-...-'";
    }

    @Override
    public String describeProduct() {
        return "The untitled fourth studio album by the English rock band Led Zeppelin, \n" +
                "commonly known as Led Zeppelin IV, was released on 8 November 1971 by Atlantic Records.";
    }

    @Override
    public PriceTag getPrice() {
        return priceTag;
    }
}
