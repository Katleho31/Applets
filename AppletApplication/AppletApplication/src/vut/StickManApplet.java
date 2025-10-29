package vut;

import java.applet.Applet;
import java.awt.*;


public class StickManApplet extends Applet {
   
    @Override
    public void init() {
        setSize(700, 700);
        System.out.println("Initialization");
    } 
    
    @Override
    public void start() {
        System.out.println("Starting");
    }
    
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        
        // Set stroke for head
        g2.setStroke(new BasicStroke(8));
        g2.setColor(Color.BLACK); // Stickman color
        
        // Head
        g2.drawOval(200, 50,  100, 100); 
        g2.fillOval(220, 80, 15, 10); // Left eye
        g2.fillOval(265, 80, 15, 10); // Right eye
        g2.drawOval(190, 85, 15, 25); // Left ear
        g2.drawOval(295, 85, 15, 25); // Right ear
        g2.drawArc(240, 90, 20, 20, 0, -180); // Nose
        g2.drawArc(225, 110, 50, 20, 0, -180); // Mouth
        
        // Set stroke for body parts
        g2.setStroke(new BasicStroke(3));
        
        // Body
        g2.drawLine(250, 150, 250, 300); 
        
        // Legs
        g2.drawLine(250, 300, 300, 350); // Left Leg
        g2.drawLine(300, 350, 320, 350); // Left Foot
        g2.drawLine(250, 300, 200, 350); // Right Leg
        g2.drawLine(200, 350, 180, 350); // Right Foot
        
        // Arms
        g2.drawLine(250, 225, 200, 265); // Right Arm
        g2.drawLine(200, 265, 175, 225); // Right Hand
        g2.drawLine(250, 225, 300, 265); // Left Arm
        g2.drawLine(300, 265, 325, 225); // Left Hand
        
        // Tie
        g2.setColor(Color.RED);
        g2.fillPolygon(new int[]{240, 260, 250}, new int[]{150, 150, 180}, 3);
        g2.fillPolygon(new int[]{250, 240, 260}, new int[]{180, 250, 250}, 3);
        
        // Weapon (Sword)
        g2.setColor(Color.DARK_GRAY);
        g2.setStroke(new BasicStroke(3));
        g2.drawLine(320, 200, 340, 250); // 1st line of the sword
        g2.drawLine(320, 200, 340, 185); // 2nd line of the sword top
        g2.drawLine(340, 250, 360, 235); // 3rd line of the sword bottom
        g2.drawLine(330, 150, 380, 270); // 4th line of the sword
        g2.drawLine(330, 150, 344, 145); // 5th line of the sword top
        g2.drawLine(380, 270, 394, 265); // 6th line of the sword bottom
        g2.drawLine(344, 145, 394, 265); // 7th line of the sword
        g2.drawLine(365, 188, 440, 110); // 8th line of the sword
        g2.drawLine(370, 210, 470, 220); // 9th line of the sword
        g2.drawLine(440, 110, 520, 135); // 10th line of the sword
        g2.drawLine(470, 220, 520, 135); // 11th line of the sword
        
        // Text
        g2.setColor(Color.BLACK);
        g2.setFont(new Font("Arial", Font.BOLD, 20));
        g2.drawString("Sanale Stick Man Completed", 200, 650);
        
        System.out.println("Printing");
    }
    
    @Override
    public void stop() {
        System.out.println("Stopping");
    }
    
    @Override
    public void destroy() {
        System.out.println("Destroying");
    } 
}
