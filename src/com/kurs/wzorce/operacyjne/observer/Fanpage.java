package com.kurs.wzorce.operacyjne.observer;

public interface Fanpage {

    void addPost(String content);

    void notifyObeservers(String newContent);

    void attachObserver(Observer observer);

}
