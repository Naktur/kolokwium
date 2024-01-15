package Panel;

import Threads.RectangleThread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class DrawingPanel extends JPanel {
    DrawingPanel(){

        this.setPreferredSize(new Dimension(600,600));
        this.setFocusable(true);

    }
}
