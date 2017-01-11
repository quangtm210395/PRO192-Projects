/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastudy;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Minnn
 */
public class ArrayDemo {

    public static void main(String[] args) {
        int[] arr1 = new int[5];
        Random rd = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rd.nextInt(100);
            System.out.println("Element " + (i + 1) + ": " + arr1[i]);
        }
        int[] arr2 = {3, 2, 3, 6, 9, 4, 5};
        int max = 0;
        for (int i = 0; i < arr2.length; i++) {
            max = Math.max(arr2[i], max);
        }
        System.out.println(max);
        Arrays.sort(arr1);
//        SnmpMibNode.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println("");
        }
        
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 1 || j == 7 || i == 7 || j == 1) {
                    System.out.print("* ");
                } else if (i == j || i + j == 8) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == 1 || j == 9 || i == 9 || j == 1) {
                    System.out.print("* ");
                } else if (i == j || i + j == 10) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
