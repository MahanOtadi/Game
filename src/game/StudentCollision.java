package game;

import city.cs.engine.BodyImage;
import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;
import city.cs.engine.StaticBody;

public class StudentCollision implements CollisionListener {

    private Runner runner;
    public StudentCollision(Runner runner){
        this.runner = runner;
    }

    @Override
    public void collide(CollisionEvent e) {
        if (e.getOtherBody() instanceof Platform && runner.getIsJumping()) {
            runner.setIsJumping(false);
            runner.removeAllImages();
            runner.addImage(new BodyImage("data/runner.gif", 11));
        }
    }
}
