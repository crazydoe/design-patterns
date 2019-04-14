package com.kurs.wzorce.operacyjne.template_method;

public abstract class SocialNetwork {

    protected String userName;
    protected String password;

    public SocialNetwork(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public boolean publishPost(String message) {
        if (logIn(this.userName, this.password)) {
            boolean result =  sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}
