package game;

import city.cs.engine.*;
import org.jbox2d.collision.Collision;
import org.jbox2d.common.Vec2;

public class GameWorld extends World {
    private Runner runner;

    public GameWorld(){
        runner = new Runner(this);
        runner.setPosition(new Vec2(-18, -12));
        runner.setGravityScale(0);
//        runner.startWalking(10);

        Barrel barrel = new Barrel(this);
        barrel.setPosition(new Vec2(-5,-10));

    }

    public Runner getRunner() {
        return runner;
    }

}
