/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes.abstractclass;


/**
 *
 * @author Minnn
 */
public class Circle extends Shape{
    protected double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return radius * radius * 3.14;
    }
    
    @Override
    public double getPerimeter(){
        return radius * 2 * 3.14;
    }

    @Override
    public String toString() {
        return "A Circle with radius: " + radius + " which is a subclass of " +super.toString();
    }
    
    
}
