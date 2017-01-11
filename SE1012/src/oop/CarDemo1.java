/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.Scanner;

/**
 *
 * @author luyenchu
 */
public class CarDemo1 {
    Car createCar(String color, String engine, int noOfSeats){
        Car car = new Car();
        car.color = color;
        car.engine = engine;
        car.noOfSeats = noOfSeats;
        return car;
    }
    public static Car createCarStatic(String color, String engine, int noOfSeats){
        Car car = new Car();
        car.color = color;
        car.engine = engine;
        car.noOfSeats = noOfSeats;
        return car;
    }
    public static void main(String[] args) {
        CarDemo1 carDemo = new CarDemo1();
        Car car = carDemo.createCar("Black", "Gasoline", 4);
        Car car2 = CarDemo1.createCarStatic("Gray", "Gasoline", 0);
    }
}
