package com.kurs.wzorce.konstrukcyjne.prototype;

import com.kurs.wzorce.konstrukcyjne.prototype.commons.TetragonType;

public class Tetragon implements Shape {

    private Long id;
    private TetragonType type;
    private Long pxSize;

    public Tetragon(Long id, TetragonType type, Long pxSize) {
        this.id = id;
        this.type = type;
        this.pxSize = pxSize;
    }

    private Tetragon(Tetragon tetragon) {
        this.pxSize = tetragon.pxSize;
        this.type = tetragon.type;
    }

    @Override
    public Shape setPxSize(Long pxSize) {
        this.pxSize = pxSize;
        return this;
    }

    @Override
    public Shape setId(Long id) {
        this.id = id;
        return this;
    }

    @Override
    public Shape clone() {
        return new Tetragon(this);
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
