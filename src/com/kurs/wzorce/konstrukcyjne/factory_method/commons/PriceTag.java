package com.kurs.wzorce.konstrukcyjne.factory_method.commons;

public class PriceTag {

    private Long price;

    private String currency;

    public PriceTag(Long price, String currency) {
        this.price = price;
        this.currency = currency;
    }

    public Long getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }
}
