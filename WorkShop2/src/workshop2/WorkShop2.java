/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Minnn
 */
public class WorkShop2 {

    public static void main(String[] args) {
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("");
        int i = 2;
        boolean x = true;
        while (x != false){
            System.out.print(i + " ");
            i += 2;
            if (i > 10) {
                x = false;
            }
        }
        System.out.println("");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Array elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int j = 0; j < n; j++) {
                System.out.print("Element " + (j+1) + ": ");
                arr[j] = sc.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
        Arrays.sort(arr);
        System.out.println("Array after sorting: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
        int max = 0;
        for (int j = 0; j < arr.length; j++) {
            max = Math.max(arr[j], max);
        }
        System.out.println("Max: " + max);
    }

}
