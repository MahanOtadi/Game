package game;

import city.cs.engine.StepEvent;
import city.cs.engine.StepListener;
import org.jbox2d.common.Vec2;

import java.awt.geom.Point2D;

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