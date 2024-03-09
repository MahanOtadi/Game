package game;

import city.cs.engine.StepEvent;
import city.cs.engine.StepListener;

public class Tracker implements StepListener {
    private Runner runner;
    private Barrel[] barrels;
    private Barrel[] removingBarrels;

    public Tracker(Runner runner, Barrel[] barrels) {
        this.runner = runner;
        this.barrels = barrels;
        this.removingBarrels = barrels;
    }
    public void preStep(StepEvent e) {}
    public void postStep(StepEvent e) {
        runner.setAngle(0);

        if(runner.getPosition().x - 10 > barrels[barrels.length - 1].getPosition().x){
            runner.startWalking(6);
        }

        for(Barrel barrel : removingBarrels) {
            if(barrel.getPosition().x < runner.getPosition().x){
                runner.implementScore();
                removingBarrels = removeFirstElement(removingBarrels);
            }
        }

        for (Barrel barrel : barrels) {
            if (barrel.getPosition().x < -50) {
                barrel.destroy();
            }
        }
    }

    private static Barrel[] removeFirstElement(Barrel[] array) {
        if (array.length <= 1) {
            return new Barrel[0];
        }

        // Create a new array with size one less than the original array
        Barrel[] resultArray = new Barrel[array.length - 1];

        // Copy elements from the original array (excluding the first element)
        System.arraycopy(array, 1, resultArray, 0, resultArray.length);

        return resultArray;
    }
}