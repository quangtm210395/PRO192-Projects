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
public class Square extends Rectangle{

    public Square() {
    }
    
    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    
    public double getSide(){
        return super.getLength();
    }
    
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    
    @Override
    public void setLength(double side){
        super.setLength(side);
    }
    
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "A Square with side = " + getSide() + " , which is a subclass of " +super.toString();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
