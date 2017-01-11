/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Rin's
 */
public class LinearSearch {
    Scanner sc = new Scanner(System.in);
    
    public int inputNumber(String mess, int min, int max){
        int num = 0;
        do {
            try {
                System.out.print(mess);
                num = Integer.parseInt(sc.nextLine());
                if (num < min || num > max) {
                    System.out.println("Input again!");
                    throw new Exception();
                }
            } catch (Exception e) {
            }
        } while(num < min || num > max);
        
        return num;
    }
    
    public int[] randomArray(int size) {
        int[] arr = new int[size];
        Random rd = new Random();
        for (int i = 0; i < size; i++) {
            
        }
        
        return arr;
    }
    
    public int linearSearch(int[] arr){
        int index = 0;
        
        return index;
    }
    
}
