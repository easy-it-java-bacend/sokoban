package view;

import model.Model;

import javax.swing.*;

public class View extends JFrame {

    public View() {
        Model model = new Model();
        MainPanel mainPanel = new MainPanel(model);
        this.add(mainPanel);

        this.setTitle("Sokoban");
        this.setSize(SokobanDetails.WIDTH, SokobanDetails.HEIGHT);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
