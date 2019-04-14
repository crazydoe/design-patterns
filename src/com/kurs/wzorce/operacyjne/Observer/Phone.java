package com.kurs.wzorce.operacyjne.Observer;

public class Phone implements Observer{
    @Override
    public void update(String content) {
        System.out.println();
        System.out.println("PHONE NOTIFICATION:");
        System.out.println("        New post on Snarky Puppy fanpage");
        System.out.println();
    }
}
