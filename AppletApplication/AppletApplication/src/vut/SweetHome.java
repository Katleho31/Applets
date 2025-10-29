package vut;

import java.applet.Applet;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import static javafx.scene.paint.Color.color;

public class SweetHome extends Applet {
    @Override
    public void init() {
        setSize(1900, 950);
        setBackground(Color.cyan);
        //System.out.println("Initialization");
    }
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        
        drawSweetHome(g2);
        displayTextAndLine(g2);
        /*g2.drawRect(27, 54, 1900, 950);
        g2.setColor(Color.white);
        g2.fillRect(27, 54, 1900,950);*/
    }
    private void displayTextAndLine(Graphics2D g2) {
        g2.setColor(Color.BLUE);
        g2.setFont(new Font("Algerian", Font.ITALIC, 20));
        g2.drawString("HOME SWEET HOME, NO PLACE LIKE HOME ", 50, 50);
        g2.drawString("CREATED BY: 223215562 Letsoho Samuel Katleho", 50, 60);
        
        g2.setStroke(new BasicStroke(5));
        g2.setColor(Color.RED);
        g2.drawLine(30, 60, 300, 60);
    }
    
    private void drawSweetHome(Graphics2D g2){
        g2.setColor(Color.WHITE);
        g2.fillRect(25, 100, 1700, 700);
        g2.setStroke(new BasicStroke(4));
        g2.setColor(Color.BLACK);
        //1st roof (Left Side)
        g2.drawLine(115, 50, 900, 50);
        g2.drawLine(113, 60, 890, 60);
        g2.drawLine(115, 50, 30, 180);
        g2.drawLine(30, 180, 725, 180);
        g2.drawLine(40, 165, 750, 165);
        //1st roof (right side)
        g2.drawLine(1000, 50, 1490, 50);
        g2.drawLine(1008, 60, 1500, 60);
        g2.drawLine(1160, 230, 1680, 230);
        g2.drawLine(1160, 240, 1690, 240);
        g2.drawLine(1490, 50, 1690, 240);
        //right last wall
        g2.drawLine(1580, 240, 1580, 375);
        g2.drawLine(1580, 425, 1580, 610);
        //Right Window Frame(Up-stairs)
        g2.drawRect(1360, 240, 75, 95);
        //Right Window (2nd Window)(Up-Stairs)
        g2.drawRect(1365, 245, 30, 40);
        g2.drawRect(1365, 290, 30, 40);
        g2.drawRect(1400, 245, 30, 40);
        g2.drawRect(1400, 290, 30, 40);
        //Balcony
        g2.drawLine(75, 180, 75, 285);
        g2.drawLine(85, 180, 85, 285);
        g2.drawLine(60, 285, 350, 285);
        g2.drawLine(60, 295, 350, 295);
        g2.drawLine(60, 285, 60, 295);
        g2.drawLine(85, 295, 85, 375);
        g2.drawLine(75, 295, 75, 375);

        g2.setStroke(new BasicStroke(6));
        g2.drawLine(75, 375, 350, 375);
        g2.drawLine(350, 375, 350, 285);

        g2.setStroke(new BasicStroke(4));
        //Left Bottom Roof
        g2.drawLine(350, 375, 686, 375);
        g2.drawLine(75, 375, 28, 430);
        g2.drawLine(28, 430, 612, 430);
        g2.drawLine(40, 420, 623, 420);
        
        g2.drawLine(60, 430, 60, 750);
        
        g2.drawLine(60, 750, 710, 750);
        g2.drawLine(1160, 750, 1630, 750);
        g2.drawLine(1630, 750, 1630, 740);
        g2.drawLine(135, 295, 135, 375);
        g2.drawLine(145, 295, 145, 375);
        g2.drawLine(205, 295, 205, 375);
        g2.drawLine(215, 295, 215, 375);
        g2.drawLine(285, 295, 285, 375);
        g2.drawLine(295, 295, 295, 375);
        g2.drawLine(350, 375, 350, 180);

        //Left Window Frame (1st Window)(Up-Stairs)
        g2.drawRect(395, 210, 88, 122);
        //Left Window (1st Window)(Up-Stairs)
        g2.drawRect(403, 217, 32, 48);
        g2.drawRect(403, 275, 32, 48);
        g2.drawRect(443, 275, 32, 48);
        g2.drawRect(443, 217, 32, 48);

        //Garage
        g2.drawLine(150, 750, 150, 500);
        g2.drawLine(150, 500, 600, 500);
        g2.drawLine(600, 500, 600, 750);
        g2.drawLine(158, 750, 158, 510);
        g2.drawLine(592, 510, 592, 745);
        g2.drawLine(592, 510, 158, 510);

        //Garage Window
        g2.setStroke(new BasicStroke(6));
        g2.drawLine(190, 545, 550, 545);
        g2.drawLine(190, 545, 190, 580);
        g2.drawLine(190, 580, 550, 580);
        g2.drawLine(550, 580, 550, 545);
        g2.drawLine(245, 545, 245, 580);
        g2.drawLine(305, 545, 305, 580);
        g2.drawLine(430, 545, 430, 580);
        g2.drawLine(490, 545, 490, 580);

        //roof
        g2.setStroke(new BasicStroke(6));
        g2.drawLine(670, 220, 955, 15);
        g2.drawLine(955, 15, 1200, 220);
        g2.setStroke(new BasicStroke(4));
        g2.drawLine(670, 222, 715, 222);
        g2.drawLine(715, 222, 952, 48);
        g2.drawLine(1200, 222, 1155, 222);
        g2.drawLine(1155, 222, 952, 48);

        //top of double window
        g2.drawLine(952, 115, 830, 200);
        g2.drawLine(830, 200, 1065, 200);
        g2.drawLine(952, 115, 1065, 200);

        //double front window
        g2.drawRect(825, 210, 231, 112); //frame
        //glasses
        g2.drawRect(830, 215, 48, 48);
        g2.drawRect(830, 268, 48, 48);
        g2.drawRect(883, 215, 48, 48);
        g2.drawRect(883, 268, 48, 48);
        g2.drawLine(940, 210, 940, 322);
        g2.drawRect(950, 215, 48, 48);
        g2.drawRect(950, 268, 48, 48);
        g2.drawRect(1003, 215, 48, 48);
        g2.drawRect(1003, 268, 48, 48);
        //window stand
        g2.setStroke(new BasicStroke(3));
        g2.drawRect(820, 327, 243, 4);

        //front part
        g2.drawLine(710, 222, 710, 360);
        g2.drawLine(710, 448, 710, 770);
        g2.drawLine(710, 770, 827, 770);
        g2.drawLine(1030, 770, 1160, 770);
        g2.drawLine(680, 445, 680, 750);
        g2.drawLine(1160, 222, 1160, 360);
        g2.drawLine(1160, 448, 1160, 770);
        g2.setStroke(new BasicStroke(2));
        g2.drawLine(710, 345, 1160, 345);
        //front Roof
        g2.setStroke(new BasicStroke(4));
        g2.drawLine(710, 360, 590, 445);
        g2.drawLine(710, 360, 1160, 360);
        g2.drawLine(1160, 360, 1275, 445);
        g2.drawLine(590, 445, 1275, 445);
        g2.drawLine(605, 435, 1260, 435);

        //1st Front Window (Left)
        g2.drawRect(740, 510, 75, 95);//frame
        //Glasses
        g2.drawRect(745, 515, 30, 40);
        g2.drawRect(780, 560, 30, 40);
        g2.drawRect(745, 560, 30, 40);
        g2.drawRect(780, 515, 30, 40);
        //Window Stand 2
        g2.setStroke(new BasicStroke(3));
        g2.drawRect(735, 610, 85, 4);

        //Door Frame
        g2.setStroke(new BasicStroke(4));
        g2.drawRect(880, 500, 100, 220);
        //Dooor Steps
        g2.drawLine(860, 720, 1000, 720);
        g2.drawLine(840, 740, 1020, 740);
        g2.drawRect(840, 740, 180, 20);
        g2.drawLine(840, 740, 860, 720);
        g2.drawLine(1000, 720, 1020, 740);
        g2.drawLine(820, 780, 1040, 780);
        g2.drawLine(840, 760, 820, 780);
        g2.drawLine(1040, 780, 1020, 760);
        g2.drawRect(820, 780, 220, 20);
        // Door Glasses
        g2.drawRect(885, 505, 40, 65);
        g2.drawRect(885, 575, 40, 65);
        g2.drawRect(885, 645, 40, 65);
        g2.drawLine(930, 500, 930, 718);
        g2.drawRect(935, 505, 40, 65);
        g2.drawRect(935, 575, 40, 65);
        g2.drawRect(935, 645, 40, 65);

        //2nd Front Window (Right)
        g2.drawRect(1050, 510, 75, 95);
        //Glasses
        g2.drawRect(1055, 515, 30, 40);
        g2.drawRect(1055, 560, 30, 40);
        g2.drawRect(1090, 515, 30, 40);
        g2.drawRect(1090, 560, 30, 40);
        // Window Stand 3
        g2.setStroke(new BasicStroke(3));
        g2.drawRect(1045, 610, 85, 4);

        //Bottom right roof
        g2.setStroke(new BasicStroke(4));
        g2.drawLine(1180, 375, 1580, 375);
        g2.drawLine(1251, 425, 1660, 425);
        g2.drawLine(1237, 415, 1640, 415);
        g2.drawLine(1580, 375, 1660, 425);
        
        //3rd Window (below the 3rd roof)
        g2.drawRect(1275, 425, 125, 92);
        //Glasses
        g2.drawRect(1283, 475, 50, 35);
        g2.drawRect(1341, 433, 50, 35);
        g2.drawRect(1341, 475, 50, 35);
        g2.drawRect(1283, 433, 50, 35);
        
        //
        g2.setStroke(new BasicStroke(2));
        g2.drawLine(1160, 610, 1578, 610);
        g2.drawLine(1578, 610, 1630, 630);
        
        // 1st Piller
        g2.setStroke(new BasicStroke(6));
        g2.drawRect(1290, 426, 15, 182);
        g2.setColor(Color.WHITE);
        g2.fillRect(1290, 425, 15, 185);
        
        //2nd Piller
        g2.setColor(Color.BLACK);
        g2.drawRect(1610, 428, 15, 200);
        g2.setColor(Color.WHITE);
        g2.fillRect(1610, 428, 15, 200);
        
        //Base Part (Bricks)
        g2.setStroke(new BasicStroke(3));
        g2.setColor(Color.BLACK);
        g2.drawRect(1160, 630, 470, 110);
        g2.drawLine(1162, 655, 1630, 655);
        g2.drawLine(1162, 685, 1630, 685);
        g2.drawLine(1162, 715, 1630, 715);
        //Bricks
        g2.drawLine(1225, 630, 1225, 655);
        g2.drawLine(1190, 655, 1190, 682);
        g2.drawLine(1225, 685, 1225, 712);
        g2.drawLine(1190, 715, 1190, 739);
        
        g2.drawLine(1290, 630, 1290, 655);
        g2.drawLine(1255, 655, 1255, 682);
        g2.drawLine(1290, 685, 1290, 712);
        g2.drawLine(1255, 715, 1255, 739);
        
        g2.drawLine(1355, 630, 1355, 655);
        g2.drawLine(1320, 655, 1320, 682);
        g2.drawLine(1355, 685, 1355, 712);
        g2.drawLine(1320, 715, 1320, 739);
        
        g2.drawLine(1420, 630, 1420, 655);
        g2.drawLine(1385, 655, 1385, 682);
        g2.drawLine(1420, 685, 1420, 712);
        g2.drawLine(1385, 715, 1385, 739);
        
        g2.drawLine(1485, 630, 1485, 655);
        g2.drawLine(1450, 655, 1450, 682);
        g2.drawLine(1485, 685, 1485, 712);
        g2.drawLine(1450, 715, 1450, 739);
        
        g2.drawLine(1550, 630, 1550, 655);
        g2.drawLine(1515, 655, 1515, 682);
        g2.drawLine(1550, 685, 1550, 712);
        g2.drawLine(1515, 715, 1515, 739);
        
        g2.drawLine(1605, 630, 1605, 655);
        g2.drawLine(1580, 655, 1580, 682);
        g2.drawLine(1605, 685, 1605, 712);
        g2.drawLine(1580, 715, 1580, 739);
    }

}
