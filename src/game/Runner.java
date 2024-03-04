package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class Runner extends Walker {
    private static final Shape RunnerShape = new CircleShape(5);

    private static final BodyImage RunnerImage =
            new BodyImage("data/runner.gif", 10f);


    public Runner(World world) {
        super(world, RunnerShape);
        addImage(RunnerImage);
    }
}