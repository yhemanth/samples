package com.dsinpractice.samples;

public class TurnLeftCommand implements RoverCommand {

    public void execute(Rover rover) {
        rover.turnLeft();
    }
}
