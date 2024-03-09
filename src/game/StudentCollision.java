package game;

import city.cs.engine.BodyImage;
import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class StudentCollision implements CollisionListener {

    private GameWorld world;
    private Runner runner;
    public StudentCollision(GameWorld world, Runner runner){
        this.world = world;
        this.runner = runner;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() instanceof Platform && runner.getIsJumping()) {
            runner.setIsJumping(false);
            runner.removeAllImages();
            runner.addImage(new BodyImage("data/runner.gif", 11));
        }

        if(e.getOtherBody() instanceof Barrel) {
            runner.removeAllImages();
            runner.addImage(new BodyImage("data/staticRunner.png", 11));
            runner.setIsGameOver(true);
            world.stop();
        }
    }
}
