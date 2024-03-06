package game;

import city.cs.engine.*;

public class Runner extends Walker {
    private static final Shape RunnerShape = new BoxShape(1.5F,5);

    private static final BodyImage RunnerImage =
            new BodyImage("data/runner.gif", 11);


    public Runner(World world) {
        super(world, RunnerShape);
        addImage(RunnerImage);
    }
}