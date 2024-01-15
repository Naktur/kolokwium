package Panel;

import Threads.RectangleThread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class DrawingPanel extends JPanel {
    private List<RectangleThread> rectangleThreadsList;
    private int startX, startY, endX, endY;
    DrawingPanel(){
        rectangleThreadsList = new ArrayList<>();
        this.setPreferredSize(new Dimension(600,600));
        this.setFocusable(true);

    }

    public void paint(Graphics g) {
        super.paintComponent(g);


    }
}
