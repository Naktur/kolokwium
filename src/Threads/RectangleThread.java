package Threads;

import java.awt.*;
import Panel.DrawingPanel;

public class RectangleThread extends Thread{
    public Rectangle rectangle;
    private DrawingPanel drawingPanel;
    private int move=5;

    public RectangleThread(Rectangle rectangle, DrawingPanel drawingPanel) {
        this.rectangle = rectangle;
        this.drawingPanel = drawingPanel;
    }


    @Override
    public void run(){
        while(true){
            if(rectangle.y+ rectangle.height>=600)
            {
                continue;
            }
            else {
                rectangle.y+=move;
            }


            drawingPanel.repaint();

            try {
                Thread.sleep(50);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
