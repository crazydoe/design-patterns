package com.kurs.wzorce.strukturalne.proxy;

public class Client {

    public static void main(String... args) {
        sendMessage("123", "message content");
        sendMessage("123123123", "message content");
    }

    public static void sendMessage(String number, String content) {
        SmsGateway gateway = new TMobileProxy();
        try {
            gateway.sendMessage(number, content);
        } catch (RuntimeException exc) {
            System.out.println(exc.getMessage());
        }
    }
}
