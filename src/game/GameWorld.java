package game;

import city.cs.engine.*;
import org.jbox2d.collision.Collision;
import org.jbox2d.common.Vec2;

public class GameWorld extends World {
    private Runner runner;

    public GameWorld(){
        runner = new Runner(this);
        runner.setPosition(new Vec2(-18, -12));
    }

}
