package com.kurs.wzorce.operacyjne.visitor;

public class Book implements ItemElement {

    private int price;
    private String isbnNumber;
    private String tittle;

    public Book(int price, String isbnNumber, String tittle) {
        this.price = price;
        this.isbnNumber = isbnNumber;
        this.tittle = tittle;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public String getTittle() {
        return tittle;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
