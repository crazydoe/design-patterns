package com.kurs.wzorce.operacyjne.template_method;

public class NaszaKlasa extends SocialNetwork {


    public NaszaKlasa(String userName, String password) {
        super(userName, password);
    }

    @Override
    boolean logIn(String userName, String password) {
        System.out.println("Zalgowano");
        return true;
    }

    @Override
    boolean sendData(byte[] data) {
        System.out.println("wysłano");
        return true;
    }

    @Override
    void logOut() {
        System.out.println("Wylogowano");
    }
}
