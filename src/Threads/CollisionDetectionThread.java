package Threads;

import Panel.DrawingPanel;

import java.awt.*;
import java.util.List;


public class CollisionDetectionThread extends Thread{
    public DrawingPanel drawingPanel;
    public List<RectangleThread> rectangleArrayList;

    public CollisionDetectionThread(DrawingPanel drawingPanel, List rectangleArrayList){
        this.drawingPanel=drawingPanel;
        this.rectangleArrayList=rectangleArrayList;
    }

    @Override
    public void run(){
        while (true) {
            try {
                checkCollisions();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            drawingPanel.repaint();

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void checkCollisions() throws InterruptedException {
        for (int i = 0; i < rectangleArrayList.size(); i++) {
            RectangleThread thread1 = rectangleArrayList.get(i);
            Rectangle rectangle1 = thread1.rectangle;

            for (int j = i + 1; j < rectangleArrayList.size(); j++) {
                RectangleThread thread2 = rectangleArrayList.get(j);
                Rectangle rectangle2 = thread2.rectangle;

                if (rectangle1.intersects(rectangle2)) {

                    thread1.stopThread();
                    thread2.stopThread();
                }
            }
        }
    }
}
