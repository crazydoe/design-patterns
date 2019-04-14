package com.kurs.wzorce.konstrukcyjne.factory_method;

import com.kurs.wzorce.konstrukcyjne.factory_method.commons.PriceTag;

public class Tape implements Product {

    private PriceTag priceTag;

    public void setPriceTag(PriceTag priceTag) {
        this.priceTag = priceTag;
    }

    @Override
    public String getProduct() {
        return ".------------------------.\n" +
                "|\\\\////////              |\n" +
                "| \\/  __  ______  __     |\n" +
                "|    /  \\|\\.....|/  \\    |\n" +
                "|    \\__/|/_____|\\__/    |\n" +
                "| A                      |\n" +
                "|    ________________    |\n" +
                "|___/_._o________o_._\\___|";
    }

    @Override
    public String describeProduct() {
        return "Machine Head is the sixth studio album released by the English rock band Deep Purple. \n" +
                "It was recorded during December 1971 in Montreux, Switzerland, and released in March 1972";
    }

    @Override
    public PriceTag getPrice() {
        return priceTag;
    }
}
