package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class Runner extends Walker {
    private static final Shape RunnerShape = new BoxShape(1f,2f);

    private static final BodyImage RunnerImage =
            new BodyImage("data/runner.gif", 11f);


    public Runner(World world) {
        super(world, RunnerShape);
        addImage(RunnerImage);
    }
}