package com.Amit;

<<<<<<< HEAD
import java.awt.*;

=======
>>>>>>> b803448... Initial commit
/**
 * Created by qlogy on 12/3/13.
 */
public class MyLine {
<<<<<<< HEAD

    private int y1;
    private int x2;
    private int y2;
    private int x1;

    public MyLine() {
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;

    }

    public MyLine(int x1, int y1, int x2, int y2) {

        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }


    private void setX1(int x1) {
        this.x1 = (x1 >= 0 ? x1 : 0);

    }

    private void setY1(int y1) {
        this.y1 = (y1 >= 0 ? y1 : 0);

    }

    private void setX2(int x2) {
        this.x2 = (x2 >= 0 ? x2 : 0);

    }

    private void setY2(int y2) {
        this.y2 = (y2 >= 0 ? y2 : 0);

    }

    public void draw(Graphics g) {
        g.drawLine(x1, y1, x2, y2);
        System.out.println("inside myline draw");
    }

}
