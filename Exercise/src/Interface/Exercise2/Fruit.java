/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Exercise2;

/**
 *
 * @author Minnn
 */
public class Fruit {
    private String color;
    private String taste;
    private String size;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Fruit(String color, String taste, String size) {
        this.color = color;
        this.taste = taste;
        this.size = size;
    }

    public Fruit() {
    }

    @Override
    public String toString() {
        return "Fruit{" + "color=" + color + ", taste=" + taste + ", size=" + size + '}';
    }
    
    
}
