/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Minnn
 */
public class SetExercise {
    
    static int maxLength(Set<String> set){
        ArrayList<String> arrL = new ArrayList<>();
        for (String set1 : set) {
            arrL.add(set1);
        }
        int length = 0;
        for (int i = 0; i < arrL.size(); i++) {
            if (arrL.get(i).length() > length) {
                length = arrL.get(i).length();
                i--;
            }
        }
        
        return length ;
    }
    
    static int countUnique(List<Integer> list){
       
       Set<Integer> set = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
        int count = set.size();
       return count;
    }
    
    static int countCommon(List<Integer> list1, List<Integer> list2){
        Set<Integer> set = new HashSet();
        for (int i = 0; i < list1.size(); i++) {
            set.add(list1.get(i));
        }
        int count = set.size();
        for (int i = 0; i < list2.size(); i++) {
            set.remove(list2.get(i));
        }
        count = count - set.size();
        return count;
    }
    
    
    
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        System.out.println(maxLength(set));
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(2);
        list1.add(4);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(7);
        list2.add(2);
        list2.add(4);
        list2.add(2);
        list2.add(4);
        list2.add(5);
        list2.add(4);
        System.out.println(countUnique(list1));
        System.out.println(countCommon(list1, list2));
    }
}
