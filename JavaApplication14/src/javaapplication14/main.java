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
public class main {
    
    public static void main(String[] args) {
        ArrayList<Animal> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
//        arr.add(new Animal("dog", 2));
//        Animal a = new Animal("a", 1);
//        Animal a1 = new Animal("a", 1);
//        arr.add(a);
//        Animal b = new Animal("cat", 1);
//        if (a1.equals(a)) {
//            System.out.println(true);
//        } else System.out.println(false);
//        System.out.println(arr);
        Animal a = new Animal("tran minh quang", 0);
        arr.add(a);
//        System.out.println("enter string: ");
//        String s = sc.nextLine();
        System.out.println("enter part: ");
        String s1 = sc.nextLine();
        if (arr.get(0).getName().contains(s1)) {
            System.out.println(true);
        } else System.out.println(false);

    }
}
