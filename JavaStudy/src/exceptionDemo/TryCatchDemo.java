/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionDemo;

/**
 *
 * @author Minnn
 */
public class TryCatchDemo {

    static void demoCatch(String input) {
        try {
            int i = Integer.parseInt(input);
            System.out.println("I= " + (i + 2));
        } catch (Exception e) {
            System.out.println("-------" + e);
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        demoCatch("3333");
        demoCatch("S333");
        System.out.println("End of program!");
    }
}
