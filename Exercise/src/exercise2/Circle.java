/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author Minnn
 */
public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){
        
    }
    
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    
    public double getArea(){
        return this.radius * this.radius * 3.14;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + ", Area=" + getArea() + '}';
    }
    
    
    
}
