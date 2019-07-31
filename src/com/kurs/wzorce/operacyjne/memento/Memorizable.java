package com.kurs.wzorce.operacyjne.memento;

public interface Memorizable {

    void restoreState(Memento state);

    Memento createMemento();
}
