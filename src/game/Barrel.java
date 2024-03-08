package game;

import city.cs.engine.*;

public class Barrel extends Walker {

    private static final Shape BarrelShape = new BoxShape(1F, 1.7F);

    public Barrel(World world, int number) {
        super(world, BarrelShape);

        BodyImage barrelImage = new BodyImage("data/barrels/barrel" + number + ".png", 3.5F);
        addImage(barrelImage);
    }
}