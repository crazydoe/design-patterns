package com.kurs.wzorce.konstrukcyjne.singleton;

import java.util.List;

public class Client {

    public static void main(String... args) {
        List<UserDetails> users = LazySingleton.getInstance().getUsers();

        printUsers(users);

        System.out.println();

        LazySingleton.getInstance().create("User1", "User1");
        LazySingleton.getInstance().create("User2", "User2");
        LazySingleton.getInstance().create("User3", "User3");

        users = LazySingleton.getInstance().getUsers();

        printUsers(users);

    }

    private static void printUsers(List<UserDetails> users) {
        for(UserDetails user : users) {
            System.out.println(user.getId() + " " + user.getName() + " " + user.getLastName());
        }
    }

}
