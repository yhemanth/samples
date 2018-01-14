package com.dsinpractice.samples;

public class Plateau {

    private int length;
    private int width;

    public Plateau(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public boolean isWithinBounds(Position newPos) {
        return newPos.isWithinBounds(length, width);
    }
}
