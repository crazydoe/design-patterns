package com.kurs.wzorce.operacyjne.visitor;

public interface ItemElement {

    double accept(ShoppingCartVisitor visitor);
}
