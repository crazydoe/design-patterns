package com.kurs.wzorce.konstrukcyjne.singleton;

import java.util.ArrayList;
import java.util.List;

public class DCLSingleton {
    private static volatile DCLSingleton instance;

    private List<UserDetails> users;

    public static DCLSingleton getInstance() {
        if(instance == null) {
            synchronized (DCLSingleton.class) {
                if(instance == null) {
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }

    private DCLSingleton() {
        users = new ArrayList<>();
        users.add(createAdmin());
    }

    // rest of business methods

    public List<UserDetails> getUsers() {
        return users;
    }

    public UserDetails create(String name, String lastName) {
        Long ordinalNumber = (long) users.size();
        UserDetails newUser = new UserDetails(ordinalNumber, name, lastName);
        users.add(newUser);
        return newUser;
    }

    private UserDetails createAdmin() {
        return new UserDetails(0L, "Admin", "Admin");
    }
}
