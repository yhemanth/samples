package com.dsinpractice.samples;

public class Position {

    private int xPos;
    private int yPos;

    public Position(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public boolean isWithinBounds(int length, int width) {
        return (xPos < length) && (yPos < width);
    }

    public Position stepBy(int xStep, int yStep) {
        return new Position(xPos + xStep, yPos + yStep);
    }

    @Override
    public String toString() {
        return "Position{" +
                "xPos=" + xPos +
                ", yPos=" + yPos +
                '}';
    }

}
