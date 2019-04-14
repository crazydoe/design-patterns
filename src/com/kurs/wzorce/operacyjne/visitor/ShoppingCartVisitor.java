package com.kurs.wzorce.operacyjne.visitor;

public interface ShoppingCartVisitor {

    int visit(Book book);

    int visit(Fruit fruit);

    double visit(Meat meat);
}
