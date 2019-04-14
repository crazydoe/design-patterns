package com.kurs.wzorce.strukturalne.decorator;

public class Client {

    public static void main(String... args) {
        ChristmasTree undecoratedTree = new ChristmasTreeImpl();
        System.out.println(undecoratedTree.decorate());

        ChristmasTree treeWithLights = new BubbleLights(undecoratedTree);
        System.out.println(treeWithLights.decorate());

                ChristmasTree fullyDecoratedTree = new ChristmasTreeBalls(treeWithLights);

        System.out.println(fullyDecoratedTree.decorate());
    }
}
