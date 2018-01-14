package com.dsinpractice.samples;

public enum Direction {
    NORTH (0, 1) {
        @Override
        Direction left() {
            return Direction.WEST;
        }

        @Override
        Direction right() {
            return Direction.EAST;
        }
    },

    SOUTH (0, -1) {
        @Override
        Direction left() {
            return Direction.EAST;
        }

        @Override
        Direction right() {
            return Direction.WEST;
        }
    },

    EAST (1, 0) {
        @Override
        Direction left() {
            return Direction.NORTH;
        }

        @Override
        Direction right() {
            return Direction.SOUTH;
        }
    },

    WEST (-1, 0) {
        @Override
        Direction left() {
            return Direction.SOUTH;
        }

        @Override
        Direction right() {
            return Direction.NORTH;
        }
    };

    private final int incrXStep;
    private final int incrYStep;

    public int getIncrXStep() {
        return incrXStep;
    }

    public int getIncrYStep() {
        return incrYStep;
    }

    Direction(int incrXStep, int incrYStep) {
        this.incrXStep = incrXStep;
        this.incrYStep = incrYStep;

    }

    abstract Direction left();
    abstract Direction right();
}
