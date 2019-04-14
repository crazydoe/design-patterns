package com.kurs.wzorce.konstrukcyjne.prototype;

import com.kurs.wzorce.konstrukcyjne.prototype.commons.OvalType;
import com.kurs.wzorce.konstrukcyjne.prototype.commons.TetragonType;

public class Client {

    public static void main(String... args) {
        Shape smallCircle = new Oval(1L, OvalType.CIRCLE, 12L);

        Shape mediumCircle = smallCircle.clone()
                .setId(2L)
                .setPxSize(24L);
        Shape largeCircle = smallCircle.clone()
                .setId(3L)
                .setPxSize(48L);


        Shape smallRactangle = new Tetragon(4L, TetragonType.RECTANGLE, 12L);

        Shape mediumRactangle = smallRactangle.clone()
                .setId(5L)
                .setPxSize(24L);
        Shape largeRactangle = mediumRactangle.clone()
                .setId(6L)
                .setPxSize(48L);

    }
}
