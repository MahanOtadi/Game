package game;

import city.cs.engine.UserView;
import javax.swing.*;
import java.awt.*;

public class GameView extends UserView {

    private GameWorld world;
    private Image background;

    public GameView(GameWorld w, int width, int height) {
        super(w, width, height);
        this.world = w;
        background = new ImageIcon("data/background.png").getImage();
    }
    @Override
    protected void paintBackground(Graphics2D g) {
        g.drawImage(background, 0, 0, this);
    }

    @Override
    protected void paintForeground(Graphics2D g) {
        if(!world.getRunner().getIsGameOver()) {
            g.setColor(Color.RED);
            g.setFont(new Font("Arial", Font.BOLD, 35));
            g.drawString(Integer.toString(world.getRunner().getScore()), 940, 240);
        }
        else {
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 60));
            g.drawString("Score: " + Integer.toString(world.getRunner().getScore()), 390, 170);
            g.drawString("Game Over", 350, 230);
        }
    }
}
