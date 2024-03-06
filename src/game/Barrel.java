package game;

import city.cs.engine.*;

public class Barrel extends Walker {
    private static final Shape BarrelShape = new CircleShape(1.5F);

    private static final BodyImage BarrelImage =
            new BodyImage("data/barrel.png", 3.5F);


    public Barrel(World world) {
        super(world, BarrelShape);
        addImage(BarrelImage);
    }
}