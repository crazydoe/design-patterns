package com.kurs.wzorce.konstrukcyjne.singleton;

public class UserDetails {

    private Long id;

    private String name;

    private String lastName;

    public UserDetails(Long id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
