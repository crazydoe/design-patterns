package com.kurs.wzorce.operacyjne.memento;

public class Client {

    public static void main(String... args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("super tekst");
        careTaker.add(originator.createMemento());

        originator.setState("super tekst jest super");
        careTaker.add(originator.createMemento());

        originator.setState("super tekst jest super że hej");
        careTaker.add(originator.createMemento());

        System.out.println(originator.getState());

        careTaker.previous(originator);

        System.out.println(originator.getState());

        careTaker.previous(originator);

        System.out.println(originator.getState());

        careTaker.next(originator);
        System.out.println(originator.getState());
        careTaker.next(originator);
        System.out.println(originator.getState());
        careTaker.next(originator);
        System.out.println(originator.getState());


        originator.setState("to nasz nowy super tekst");
        careTaker.add(originator.createMemento());
        System.out.println(originator.getState());

        careTaker.previous(originator);
        System.out.println(originator.getState());

    }

}
