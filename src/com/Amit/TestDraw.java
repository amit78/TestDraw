package com.Amit;

import javax.swing.*;
import java.awt.*;

public class TestDraw extends JApplet {
    private static MyLine[] line;

    public void init() {

        line = new MyLine[5];


        for (int count = 0; count <= line.length; count++) {
            int x1 = (int) (Math.random() * 400);
            int y1 = (int) (Math.random() * 400);
            int x2 = (int) (Math.random() * 400);
            int y2 = (int) (Math.random() * 400);

            line[count] = new MyLine(x1, y1, x2, y2);
        }


    }

    public void paint(Graphics g) {
        for (int count = 0; count < line.length; count++) {
            line[count].draw(g);
        }
    }
}
