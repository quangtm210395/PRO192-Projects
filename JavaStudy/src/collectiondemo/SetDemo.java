/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author luyenchu
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(20);
        set1.add(3);
        set1.add(2);
        set1.add(5);
        set1.add(9);
        set1.add(2);
        //set1.add(null);
        System.out.println(set1);
        
        Set<Integer> set2 = new TreeSet<>();
        set2.add(20);
        set2.add(3);
        set2.add(2);
        set2.add(5);
        set2.add(9);
        System.out.println(set2);
        
        for (Integer next : set2) {
            System.out.println("NV: "+ next);
        }
    }
}
