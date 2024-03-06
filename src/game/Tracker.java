package game;

import city.cs.engine.StepEvent;
import city.cs.engine.StepListener;

public class Tracker implements StepListener {
    private Runner runner;
    public Tracker(GameView view, Runner runner) {
        this.runner = runner;
    }
    public void preStep(StepEvent e) {}
    public void postStep(StepEvent e) {
        runner.setAngle(0);
    }
}