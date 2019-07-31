package com.kurs.wzorce.strukturalne.proxy;

public class TMobileGateway implements SmsGateway {

    @Override
    public void sendMessage(String phoneNumber, String message) {
        System.out.println("---: OUTGOING MESSAGE");
        System.out.println("to: " + phoneNumber);
        System.out.println(message);
        System.out.println("---: END");
    }
}
