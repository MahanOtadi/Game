package game;

import city.cs.engine.StepEvent;
import city.cs.engine.StepListener;

public class Tracker implements StepListener {
    private Runner runner;
    private Barrel[] barrels;

    public Tracker(Runner runner, Barrel[] barrels) {
        this.runner = runner;
        this.barrels = barrels;
    }
    public void preStep(StepEvent e) {}
    public void postStep(StepEvent e) {
        runner.setAngle(0);
        for(Barrel barrel : barrels) {
            if(barrel.getPosition().x < -50){
                barrel.destroy();
            }
        }

        if(runner.getIsJumping() == false){

        }
    }
}