package com.kurs.wzorce.operacyjne.dependency_chain;

public abstract class AbstractHandler {

    protected AbstractHandler next;

    public void setNext(AbstractHandler next) {
        this.next = next;
    }

    public abstract void handleRequest(EmergencyType emergencyType);
}
