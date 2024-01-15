package Application;

import Panel.DrawingFrame;

import javax.swing.*;

public class RectangleApp {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> new DrawingFrame());

    }
}
