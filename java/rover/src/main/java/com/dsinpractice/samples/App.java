package com.dsinpractice.samples;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Rover rover = new Rover(new Position(0, 0), Direction.EAST);
        rover.landOnPlateau(new Plateau(10, 10));
        RoverCommand[] commands = new RoverCommand[] {
                new MoveCommand(),
                new MoveCommand(),
                new MoveCommand(),
                new MoveCommand(),
                new MoveCommand(),
                new TurnLeftCommand(),
                new MoveCommand(),
                new MoveCommand(),
                new TurnRightCommand()
            };
        for (RoverCommand cmd : commands) {
            cmd.execute(rover);
        }
        System.out.println(rover);
    }
}
