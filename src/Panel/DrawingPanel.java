package Panel;
import java.awt.geom.Area;
import Threads.RectangleThread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Path2D;
import java.util.ArrayList;
import java.util.List;

public class DrawingPanel extends JPanel {

    private List<RectangleThread> rectangleThreadsList;
    private int startX, startY, endX, endY;

    DrawingPanel(){
        rectangleThreadsList = new ArrayList<>();
        this.setPreferredSize(new Dimension(600,600));
        this.setFocusable(true);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                startX=e.getX();
                startY=e.getY();

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                endX=e.getX();
                endY=e.getY();

                Rectangle newRectangle=new Rectangle(startX,startY,endX-startX,endY-startY);
                rectangleThreadsList.add(new RectangleThread(newRectangle, DrawingPanel.this));
                rectangleThreadsList.get(rectangleThreadsList.size()-1).start();
            }
        });

    }

    public void paint(Graphics g) {
        super.paintComponent(g);
        if(rectangleThreadsList.size()!=0)
        {
            for (RectangleThread rectangleThread : rectangleThreadsList) {
                Rectangle rectangle = rectangleThread.rectangle;
                g.setColor(Color.BLUE);
                g.fillRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
            }
        }



    }
}
