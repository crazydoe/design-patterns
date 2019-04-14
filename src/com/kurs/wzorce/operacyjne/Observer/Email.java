package com.kurs.wzorce.operacyjne.Observer;

import java.sql.SQLOutput;

public class Email implements Observer {
    @Override
    public void update(String content) {
        System.out.println();
        System.out.println("Nowy post!");
        System.out.println(content);
        System.out.println();
    }
}
