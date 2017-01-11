/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro192;

/**
 *
 * @author luyenchu
 */
public class CarDemo {
    public static void main(String[] args) {
        Car civic = new Car();
        civic.color = "GRAY";
        civic.engineType = "Gasoline";
        civic.noOfSeats = 4;
        
        Car santafe = new Car();
        santafe.color = "BLACK";
        santafe.engineType = "Diesel";
        santafe.noOfSeats = 5;
    }
}
