package com.kurs.wzorce.operacyjne.memento;

public class Originator implements Memorizable{
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    @Override
    public void restoreState(Memento state) {
        this.state = state.getState();
    }

    @Override
    public Memento createMemento() {
        return new Memento(state);
    }
}
