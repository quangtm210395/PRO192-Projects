/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

/**
 *
 * @author Minnn
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ArrayListExercise {

    static void removeEvenLength(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() % 2 == 0) {
                arr.remove(arr.get(i));
                i--;
            }
        }
    }
    
    static void minToFront(ArrayList<Integer> arr){
        int min = arr.get(0);
        int count = 0;
        for (int i = 1; i < arr.size(); i++) {
            min = Math.min(min, arr.get(i));
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == min) {
                arr.remove(i);
                count++;
                i--;
            }
        }
        for (int i = 0; i < count; i++) {
            arr.add(i, min);
        }
    }
    
    static void doubleList(ArrayList<String> arr){
        for (int i = 0; i < arr.size(); i+=2) {
            arr.add(i+1, arr.get(i));
        }
    }
    
    static void removeDuplicates(ArrayList<String> arr){
//        for (int i = 0; i < arr.size(); i++) {
//            for (int j = i + 1; j < arr.size(); j++) {
//                if (arr.get(j).equals(arr.get(i))) {
//                    arr.remove(j);
//                }
//            }
//        }
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == null ? arr.get(i+1) == null : arr.get(i).equals(arr.get(i+1))) {
                arr.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bai 1");
        ArrayList<String> arrL = new ArrayList<>();
        arrL.add(sc.nextLine());
        arrL.add(sc.nextLine());
        arrL.add(sc.nextLine());
        removeEvenLength(arrL);
        System.out.println(arrL);
        System.out.println("");
        System.out.println("Bai 2");
        ArrayList<Integer> arrL1 = new ArrayList<>();
        arrL1.add(9);
        arrL1.add(6);
        arrL1.add(1);
        arrL1.add(4);
        arrL1.add(1);
        arrL1.add(9);
        arrL1.add(4);
        arrL1.add(95);
        System.out.println(arrL1);
        minToFront(arrL1);
        System.out.println("After min To front: ");
        System.out.println(arrL1);
        System.out.println("");
        System.out.println("Bai3");
        ArrayList<String> arrL3 = new ArrayList<>();
        arrL3.add(sc.nextLine());
        arrL3.add(sc.nextLine());
        arrL3.add(sc.nextLine());
        doubleList(arrL3);
        System.out.println(arrL3);
        System.out.println("");
        System.out.println("Bai 4");
        ArrayList<String> arrL4 = new ArrayList<>();
        arrL4.add(sc.nextLine());
        arrL4.add(sc.nextLine());
        arrL4.add(sc.nextLine());
        arrL4.add(sc.nextLine());
        arrL4.add(sc.nextLine());
        removeDuplicates(arrL4);
        System.out.println(arrL4);
    }
}
