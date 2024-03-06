package game;

import city.cs.engine.BodyImage;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class RunnerController implements KeyListener {

    private Runner runner;

    public RunnerController(Runner r){
        runner = r;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        // other key commands omitted
        if (code == KeyEvent.VK_UP){
            runner.jump(13);
            runner.removeAllImages();
            runner.addImage( new BodyImage("data/StaticRunner.png", 11));
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        runner.removeAllImages();
        runner.addImage( new BodyImage("data/runner.gif", 11));
    }
}
