package com.kurs.wzorce.operacyjne.Observer;

import java.util.ArrayList;
import java.util.List;

public class SnarkyPuppyFanpage implements Fanpage {

    private List<String> posts = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addPost(String content) {
        posts.add(content);
        notifyObeservers(content);
    }

    @Override
    public void notifyObeservers(String newContent) {
        observers.forEach(observer -> observer.update(newContent));
    }

    @Override
    public void attachObserver(Observer observer) {
        observers.add(observer);
    }
}
