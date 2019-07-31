package com.kurs.wzorce.strukturalne.proxy;

public class TMobileProxy implements SmsGateway {

    private SmsGateway gateway;
    private static int MESSAGE_SIZE = 160;
    private static int NUMBER_SIZE = 9;

    public TMobileProxy() {
        this.gateway = new TMobileGateway();
    }

    @Override
    public void sendMessage(String phoneNumber, String message) {
        if(validatePhoneNumber(phoneNumber) && validateMessage(message)) {
            gateway.sendMessage(phoneNumber, message);
        } else {
            throw new RuntimeException("Validation exception");
        }
    }

    private boolean validateMessage(String message) {
        return message.length() <= MESSAGE_SIZE;
    }

    private boolean validatePhoneNumber(String number) {
        return number.length() == NUMBER_SIZE;
    }
}
