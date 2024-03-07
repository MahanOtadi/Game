package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;
import java.util.Random;

public class GameWorld extends World {

    Random random = new Random();
    Barrel[] barrels = new Barrel[8];
    private final int barrelX = 210;
    private Runner runner;

    public GameWorld(){
        runner = new Runner(this);
        runner.setPosition(new Vec2(-18, -13));

        Shape platformShape = new BoxShape(0, 0);
        StaticBody platform = new StaticBody(this, platformShape);
        platform.setPosition(new Vec2(-18, -18));

        for (int i=0; i<8; i++){
            int barrelY = random.nextInt((-13 - (-16)) + 1) + (-16);
            int barrelNo = random.nextInt(4);
            barrels[i] = new Barrel(this, barrelNo);
            barrels[i].setPosition(new Vec2(barrelX - (25 * i), barrelY));
            barrels[i].setGravityScale(0);
            barrels[i].startWalking(-7);
            barrels[i].setAngularVelocity(1);
        }
    }

    public Runner getRunner() {
        return runner;
    }

    public Barrel[] getBarrels() {
        return barrels;
    }
}
