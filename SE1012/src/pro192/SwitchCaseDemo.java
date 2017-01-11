/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro192;

import java.util.Random;

/**
 *
 * @author luyenchu
 */
public class SwitchCaseDemo {

    public static void main(String[] args) {
        Random random = new Random();
        int radomized = random.nextInt(10);
        switch (radomized) {
            case 0:
                System.out.println("Zero value");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            case 1:
                System.out.println("value is one");
                break;
            default:
                System.out.println("Value is: " + radomized); 
        }
    }
}
