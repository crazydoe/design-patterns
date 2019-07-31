package com.kurs.wzorce.operacyjne.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private long pointer = 0;
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
        pointer = mementoList.size() - 1;
    }

    public Memento get(long index){
        return mementoList.get((int)index);
    }

    public void previous(Memorizable memorizable) {
        if(pointer > 0) {
            memorizable.restoreState(get(--pointer));
        }
    }

    public void next(Memorizable memorizable) {
        if(pointer < mementoList.size() - 1) {
            memorizable.restoreState(get(++pointer));
        }
    }
}
