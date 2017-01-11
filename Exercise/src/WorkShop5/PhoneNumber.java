/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkShop5;

/**
 *
 * @author Minnn
 */
public class PhoneNumber {
    private int area;
    private String number;

    public PhoneNumber(int area, String number) {
        this.area = area;
        this.number = number;
    }

    public PhoneNumber() {
    }
    

    public void display(){
            System.out.println(area + " - " + number);

    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    

    @Override
    public String toString() {
        return "PhoneNumber{" + "area=" + area + ", number=" + number + '}';
    }

    
    
    
}


