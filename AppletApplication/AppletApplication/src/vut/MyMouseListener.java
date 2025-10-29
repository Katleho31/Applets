package vut;

import java.awt.event.*;
import javax.swing.*;

public class MyMouseListener implements MouseListener {
    

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered component");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited component");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Listener Example");
        JPanel panel = new JPanel();
        panel.setSize(400, 400);
        panel.addMouseListener(new MyMouseListener());
        
        frame.add(panel);
        frame.setSize(1900, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}