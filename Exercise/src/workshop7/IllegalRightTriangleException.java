/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop7;

/**
 *
 * @author chuot
 */
public class IllegalRightTriangleException extends Exception {
    public IllegalRightTriangleException(){
        System.out.println("This is not a right triangle!");
    }
}
