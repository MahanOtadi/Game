package game;

import javax.swing.JFrame;

public class Game {

    private GameWorld world;
    private GameView view;

    public Game() {

        // make the world
        world = new GameWorld();

        // make a view
        view = new GameView(world, 1000, 800);

        RunnerController controller = new RunnerController(world.getRunner());

        world.addStepListener(new Tracker(view, world.getRunner()));


        // add the view to a frame (Java top level window)
        final JFrame frame = new JFrame("Degree Quest");
        frame.add(view);
        // enable the frame to quit the application
        // when the x button is pressed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        // don't let the frame be resized
        frame.setResizable(false);
        // size the frame to fit the world view
        frame.pack();
        // finally, make the frame visible
        frame.setVisible(true);
        frame.addKeyListener(controller);

        // uncomment this to make a debugging view
        //JFrame debugView = new DebugViewer(world, 500, 500);

        // start our game world simulation!
        world.start();
    }

    /** Run the game. */
    public static void main(String[] args) {
        new Game();
    }
}
