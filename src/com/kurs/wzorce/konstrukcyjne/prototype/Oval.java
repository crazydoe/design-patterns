package com.kurs.wzorce.konstrukcyjne.prototype;

import com.kurs.wzorce.konstrukcyjne.prototype.commons.OvalType;

public class Oval implements Shape {

    private Long id;
    private OvalType type;
    private Long pxSize;

    public Oval(Long id, OvalType type, Long pxSize) {
        this.id = id;
        this.type = type;
        this.pxSize = pxSize;
    }

    private Oval(Oval oval) {
        this.pxSize = oval.pxSize;
        this.type = oval.type;
    }

    public Shape setId(Long id) {
        this.id = id;
        return this;
    }

    public Shape setPxSize(Long pxSize) {
        this.pxSize = pxSize;
        return this;
    }

    @Override
    public Shape clone() {
        return new Oval(this);
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public String getType() {
        return this.type.toString();
    }

    @Override
    public Long getPxSize() {
        return this.pxSize;
    }
}
