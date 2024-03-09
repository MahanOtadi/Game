package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;
import java.util.Random;

public class GameWorld extends World {

    Random random = new Random();
    Barrel[] barrels = new Barrel[8];
    private final int barrelX = 30;
    private Runner runner;

    private Platform platform;

    public GameWorld(){
        runner = new Runner(this);
        runner.setPosition(new Vec2(-18, -13));

        platform = new Platform(this);
        platform.setPosition(new Vec2(-18, -18));

        StudentCollision collide = new StudentCollision(this, runner);
        runner.addCollisionListener(collide);

        for (int i=0; i<barrels.length; i++){
            int barrelY = random.nextInt((-13 - (-16)) + 1) + (-16);
            int barrelNo = random.nextInt(4);
            barrels[i] = new Barrel(this, barrelNo);
            barrels[i].setPosition(new Vec2(barrelX + (25 * i), barrelY));
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
