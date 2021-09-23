package view;

import model.Model;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class MainPanel extends JPanel {

    private Image wall;
    private Image box;
    private Model model;

    public MainPanel(Model model) {
        File wallPath = new File("C:\\Users\\mruma_000\\IdeaProjects\\sokoban\\src\\resources\\wall.jpg");
        File boxPath = new File("C:\\Users\\mruma_000\\IdeaProjects\\sokoban\\src\\resources\\box.jpg");

        this.model = model;

        try {
            wall = ImageIO.read(wallPath);
            box = ImageIO.read(boxPath);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);

        int width = SokobanDetails.WIDTH / SokobanDetails.ENTITIES_PER_WIDTH;
        int height = SokobanDetails.HEIGHT / SokobanDetails.ENTITIES_PER_HEIGHT;

        for (int row = 0; row < SokobanDetails.HEIGHT; row += width) {
            int y = row / width;
            for (int col = 0; col < SokobanDetails.WIDTH; col += height) {
                Image image = null;
                int x = col / height;
                switch (model.getFieldData(y, x)) {
                    case Model.WALL:
                        image = wall;
                        break;

                    case Model.BOX:
                        image = box;
                        break;
                }
                g.drawImage(image, col, row, null);
            }
        }
    }
}
