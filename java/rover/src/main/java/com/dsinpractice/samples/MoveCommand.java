package com.dsinpractice.samples;

public class MoveCommand implements RoverCommand{
    public void execute(Rover rover) {
        rover.move();
    }
}
