/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangleExercise;


/**
 *
 * @author Minnn
 */
public class Rectangle {
    private double x;
    private double y;
    private double h;
    private double w;

    public Rectangle(double x, double y, double h, double w) {
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "x=" + x + ", y=" + y + ", h=" + h + ", w=" + w + '}';
    }
    
}
