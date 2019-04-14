package com.kurs.wzorce.konstrukcyjne.factory_method;

import com.kurs.wzorce.konstrukcyjne.factory_method.commons.PriceTag;

public interface Product {

    String getProduct();

    String describeProduct();

    PriceTag getPrice();
}
