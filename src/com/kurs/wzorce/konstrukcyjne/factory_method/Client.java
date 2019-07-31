package com.kurs.wzorce.konstrukcyjne.factory_method;

import static java.lang.System.out;

public class Client {

    public static void main(String... args) {
        Product tape = new TapeCreator().create();
        Product vinyl = new VinylCreator().create();

        printProduct(tape);
        out.println();
        printProduct(vinyl);


    }

    private static void printProduct(Product product) {
        out.println("Description: " + product.describeProduct());
        out.println(product.getProduct());
        out.println("price: ");
        out.println(product.getPrice().getPrice() + " " + product.getPrice().getCurrency());
    }
}
