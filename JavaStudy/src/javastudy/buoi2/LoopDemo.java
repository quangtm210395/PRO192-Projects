/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastudy.buoi2;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Minnn
 */
public class LoopDemo {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] intArr = new int[10];
        for (int index = 0; index < intArr.length; index++) {
            intArr[index] = rd.nextInt(10);
        }
        
//        System.out.println(Arrays.toString(intArr));

        for (int index = 0; index < intArr.length; index++) {
            System.out.println("Index: " + index + " Value: " + intArr[index]);
        }
        
        for(int item: intArr){
            System.out.println("Item: " + item);
        }
        
    }
}
