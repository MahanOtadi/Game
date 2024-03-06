package game;

import city.cs.engine.*;
import org.jbox2d.collision.Collision;
import org.jbox2d.common.Vec2;

public class GameWorld extends World {

    Barrel[] barrels = new Barrel[10];
    int x = 260;
    private Runner runner;

    public GameWorld(){
        runner = new Runner(this);
        runner.setPosition(new Vec2(-18, -12));
        runner.setGravityScale(0);

        for (int i=0; i<10; i++){
            barrels[i] = new Barrel(this);
            barrels[i].setPosition(new Vec2(x - (25 * i),-15));
            barrels[i].setGravityScale(0);
            barrels[i].startWalking(-5);
            barrels[i].setAngularVelocity(-1);
        }


    }

    public Runner getRunner() {
        return runner;
    }

}
