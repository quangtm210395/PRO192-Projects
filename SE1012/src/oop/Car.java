/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author luyenchu
 */
public class Car {
    public String color;
    public String engine;
    public int noOfSeats;
    public int turbin;
    public boolean fastFurious;
    public Car(){
        engine = "GAS";
        noOfSeats = 4;
    }

    public Car(String color, String engine, int noOfSeats, int turbin, boolean fastFurious) {
        this.color = color;
        this.engine = engine;
        this.noOfSeats = noOfSeats;
        this.turbin = turbin;
        this.fastFurious = fastFurious;
    }

    
    public void move(String fromAddress, String toAddress){
        int calTime = 0;
        System.out.println("Must turn left three times");
    }
    
    
}
