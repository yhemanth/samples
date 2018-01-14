package com.dsinpractice.samples;

public class Rover {

    private Position position;
    private Direction direction;
    private Plateau plateau;

    public Rover (Position initPos, Direction initDir) {
        position = initPos;
        direction = initDir;
    }

    public void landOnPlateau(Plateau plateau) {
        this.plateau = plateau;
        if (!plateau.isWithinBounds(position)) {
            throw new RoverOutOfBoundsException();
        }
    }

    public void move() {
        Position newPos = this.position.stepBy(direction.getIncrXStep(), direction.getIncrYStep());
        if (plateau.isWithinBounds(newPos)) {
            this.position = newPos;
        } else {
            throw new RoverOutOfBoundsException();
        }

    }

    public void turnLeft() {
        direction = direction.left();
    }

    public void turnRight() {
        direction = direction.right();
    }

    @Override
    public String toString() {
        return "Rover{" +
                "position=" + position +
                ", direction=" + direction +
                '}';
    }

}
