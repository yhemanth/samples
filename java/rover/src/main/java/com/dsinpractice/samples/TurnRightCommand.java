package com.dsinpractice.samples;

public class TurnRightCommand implements RoverCommand {
    public void execute(Rover rover) {
        rover.turnRight();
    }
}
