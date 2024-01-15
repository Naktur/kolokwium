package Panel;

import javax.swing.*;

public class DrawingFrame extends JFrame {

    public DrawingFrame(){
        this.add(new DrawingPanel());
        this.setTitle("Rectangle App");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
