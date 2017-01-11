/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastudy;

/**
 *
 * @author Minnn
 */
public class CarDemo {
    public static void main(String[] args) {
        Car civic = new Car();
        civic.color = "Gray";
        civic.engineType = "Gasoline";
        civic.noOfSeats = 4;
        
        Car santafe = new Car();
        santafe.color = "Yellow";
        santafe.engineType = "Diesel";
        santafe.noOfSeats = 6;
    }
}
