package game;

import city.cs.engine.*;

public class Barrel extends Walker {
    private static final Shape BarrelShape = new CircleShape(1.5F);

    public Barrel(World world, int number) {
        super(world, BarrelShape);

        BodyImage barrelImage = new BodyImage("data/barrels/barrel" + number + ".png", 3.5F);
        addImage(barrelImage);
    }
}