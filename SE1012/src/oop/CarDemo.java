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
public class CarDemo {
    public static void main(String[] args) {
        Car santafe = new Car();
        santafe.color = "Black";
        System.out.println("Color: " + santafe.color);
        System.out.println("Color: " + santafe.engine);
        santafe.move("From HN", "Hoa Lac");
        
        Car civic = new Car();
        civic.color = "Gray";
        civic.noOfSeats = 4;
        
        Car[] cars = {santafe,civic};
        for (Car car : cars) {
            System.out.println("Color:  "+ car.color);
        }
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter something:");
//        String s = scanner.nextLine();
//        System.out.println("Entered: " + s);
//        
        Car newCar = new Car();
        System.out.print("Enter fast:");
        newCar.fastFurious = Boolean.valueOf(scanner.nextLine());
        System.out.print("Enter engine:");
        newCar.engine = scanner.nextLine();
        System.out.println("Car's fast: "
                + newCar.fastFurious
                +", Engine: " + newCar.engine );
    }
}
