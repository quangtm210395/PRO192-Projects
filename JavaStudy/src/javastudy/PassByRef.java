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
public class PassByRef {
    public static void changeVal(int a){
        a = 10;
    }
    
    public static void changeVal(Car car){
        if (car != null){
            car.noOfSeats = 6;
        }
    }
    
    static int a = 100;
    
    
}
