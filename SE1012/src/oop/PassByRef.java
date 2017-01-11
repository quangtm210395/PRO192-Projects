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
public class PassByRef {
    public static  void changeVal(int a){
        a = 10;
    }
    public static void changeVal(Car car){
        if(car != null)
            car.noOfSeats = 6;
    }
    static int a = 100;
    public static void main(String[] args) {
        PassByRef.changeVal(a);
        System.out.println("I = "+ a);
        
        Car car = new Car();
        car.noOfSeats = 4;
        PassByRef.changeVal(car);
        System.out.println("No of seats: " + car.noOfSeats);
    }
}

