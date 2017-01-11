/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastudy.buoi2;

import java.util.Random;

/**
 *
 * @author Minnn
 */
public class SwitchCaseDemo {
    public static void main(String[] args) {
        Random rd = new Random();
        int randomized = rd.nextInt(10);
        switch(randomized){
            case 0:
                System.out.println("Zero Value");
                break;
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            default:
                System.out.println("Value is: " + randomized);
        }
    }
}
