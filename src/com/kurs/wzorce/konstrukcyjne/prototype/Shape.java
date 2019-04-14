package com.kurs.wzorce.konstrukcyjne.prototype;

public interface Shape {

    Shape clone();

    Shape setId(Long id);

    Shape setPxSize(Long pxSize);

    Long getId();

    String getType();

    Long getPxSize();
}
