package game;

import city.cs.engine.*;

public class Runner extends Walker {

    private static boolean isJumping = false;
    private static final Shape RunnerShape = new BoxShape(0.4F,5);

    private static final BodyImage RunnerImage =
            new BodyImage("data/runner.gif", 11);


    public Runner(World world) {
        super(world, RunnerShape);
        addImage(RunnerImage);
    }

    public boolean getIsJumping(){
        return isJumping;
    }
    public void setIsJumping(boolean state){
        isJumping = state;
    }
}