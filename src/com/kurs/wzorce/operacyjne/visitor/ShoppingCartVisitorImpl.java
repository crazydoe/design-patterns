package com.kurs.wzorce.operacyjne.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public int visit(Book book) {
        int cost;
        //apply 5$ discount if book price is greater than 50
        if(book.getPrice() > 50){
            cost = book.getPrice()-5;
        }else cost = book.getPrice();
        System.out.println("Book ISBN::"+book.getIsbnNumber() + " cost = "+cost);
        return cost;    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg()*fruit.getWeight();
        System.out.println(fruit.getName() + " cost = "+cost);
        return cost;
    }

    @Override
    public double visit(Meat meat) {
        int cost = meat.getPricePerKg() * meat.getWeighgInGram() / 1000;
        System.out.println("Meat of type: " + meat.getType() + " cost = " + cost);
        return cost;
    }
}
