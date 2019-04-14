package com.kurs.wzorce.operacyjne.visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String... args) {
        List<ItemElement> items = new ArrayList<>();
        items.add(new Book(20, "1234", "The Book"));
        items.add(new Fruit(10, 2, "Apple"));
        items.add(new Meat(30, 600, "Beef"));

        double total = calculatePrice(items);
        System.out.println("Total Cost = "+total);
    }

    private static double calculatePrice(List<ItemElement> items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        double sum=0;
        for(ItemElement item : items){
            sum += item.accept(visitor);
        }
        return sum;
    }
}
