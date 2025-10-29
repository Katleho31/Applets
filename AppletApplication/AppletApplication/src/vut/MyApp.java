package vut;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApp extends Applet {

    public void init() {
        System.out.println("Initialization");
        
    }
    
    public void paint(Graphics g){
    g.drawString("Primo's class", 50, 50);
    }
    public void start(){
        System.out.println("Starting");
    }
    
    public void stop(){
        System.out.println("Stopping");
    }
    public void destroy(){
        System.out.println("destroyed");
    }
}
