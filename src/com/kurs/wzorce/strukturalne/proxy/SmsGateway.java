package com.kurs.wzorce.strukturalne.proxy;

public interface SmsGateway {

    void sendMessage(String phoneNumber, String message);

}
