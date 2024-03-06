package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class Barrel extends Walker {

    private static int count = 0;
    private int flag = 0;
    private static final Shape BarrelShape = new CircleShape(3);

    private static final BodyImage BarrelImage =
            new BodyImage("data/barrel.png", 4);


    public Barrel(World world) {
        super(world, BarrelShape);
        addImage(BarrelImage);
        count++;
    }

    public int getCount() {
        return count;
    }
}