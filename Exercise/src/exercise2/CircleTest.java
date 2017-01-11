/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author Minnn
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.0, "blue");
        Circle c2 = new Circle(2.0, "red");
        Circle c3 = new Circle(2.0, "red");
        Circle c4 = new Circle();
        
        System.out.println(c4);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
