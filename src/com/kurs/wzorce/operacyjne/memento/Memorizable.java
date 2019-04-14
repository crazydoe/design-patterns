package com.kurs.wzorce.operacyjne.memento;

public interface Memorizable {

    void restoreState(String state);

    Memento createMemento();
}
