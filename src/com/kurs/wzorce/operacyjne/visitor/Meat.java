package com.kurs.wzorce.operacyjne.visitor;

public class Meat implements ItemElement {

    private int pricePerKg;
    private int weighgInGram;
    private String type;

    public Meat(int pricePerKg, int weighgInGram, String type) {
        this.pricePerKg = pricePerKg;
        this.weighgInGram = weighgInGram;
        this.type = type;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public int getWeighgInGram() {
        return weighgInGram;
    }

    public String getType() {
        return type;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
