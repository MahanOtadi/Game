package game;

import city.cs.engine.*;

public class Runner extends Walker {

    private static int score = 0;
    private static boolean isGameOver = false;
    private static boolean isJumping = false;
    private static final Shape RunnerShape = new BoxShape(0.4F,5);

    private static final BodyImage RunnerImage =
            new BodyImage("data/runner.gif", 11);


    public Runner(World world) {
        super(world, RunnerShape);
        addImage(RunnerImage);
    }

    public int getScore(){
        return score;
    }
    public void implementScore(){
        score++;
    }
    public boolean getIsJumping(){
        return isJumping;
    }
    public void setIsJumping(boolean state){
        isJumping = state;
    }
    public boolean getIsGameOver(){
        return isGameOver;
    }
    public void setIsGameOver(boolean state){
        isGameOver = state;
    }
}