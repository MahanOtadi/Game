package game;

import city.cs.engine.*;

public class Platform extends StaticBody {
    private static final Shape PlatformShape = new BoxShape(100, 0);

    public Platform(World world) {
        super(world, PlatformShape);
    }
}