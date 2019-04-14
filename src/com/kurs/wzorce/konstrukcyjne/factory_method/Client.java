package com.kurs.wzorce.konstrukcyjne.factory_method;

import static java.lang.System.out;

public class Client {

    public static void main(String... args) {
        Product flower = new TapeCreator().create();
        Product ball = new VinylCreator().create();

        printProduct(flower);
        out.println();
        printProduct(ball);


    }

    private static void printProduct(Product product) {
        out.println("Description: " + product.describeProduct());
        out.println(product.getProduct());
        out.println("price: ");
        out.println(product.getPrice().getPrice() + " " + product.getPrice().getCurrency());
    }
}
