/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.*;

/**
 *
 * @author Minnn
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rd = new Random();
        int n = input("Enter n: ", "Must be an integer!", 1, Integer.MAX_VALUE);
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(n);
        }
        System.out.println("Unsorted array: ");
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(arr));
    }

    static int input(String mess, String error, int min, int max) {
        int number = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(mess);
                number = Integer.parseInt(sc.nextLine());
                if (number < min || number > max) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println(error);
            }
        }
        return number;
    }
    
    static int partition(int[] arr, int left, int right){
        int l = left;
        int r = right;
        int temp;
        int pivot = arr[(l+r) / 2];
        
        while( l <= r){
            while(arr[l] < pivot ) l++;
            while(arr[r] > pivot ) r--;
            if (l <= r) {
//                arr[l] = arr[l] + arr[r];
//                arr[r] = arr[l] - arr[r];
//                arr[l] = arr[l] - arr[r];
                temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        
        return l;
    }
    
    static void quickSort(int[] arr, int left, int right){
        int index = partition(arr, left, right);
        if (left < index - 1) {
            quickSort(arr, left, index-1);
        }
        if (index < right) {
            quickSort(arr, index, right);
        }
    }
}
