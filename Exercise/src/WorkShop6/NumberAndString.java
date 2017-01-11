/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkShop6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

/**
 *
 * @author Minnn
 */
public class NumberAndString {
    
    static String initialsName(String name){
        String initials = "";
        name = name.trim();
        String result[] = name.split("[ ]");
        for (String result1 : result) {
            initials += result1.charAt(0);
        }
        initials = initials.toUpperCase();
        return initials;
    }
    
    static Boolean anagramExercise(String s1, String s2){
        ArrayList<Integer> arrL = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != ' ' && s1.charAt(i) != '.') {
                arrL.add((int)s1.charAt(i));
            }
        }
        Collections.sort(arrL);
        
        ArrayList<Integer> arrL2 = new ArrayList<>();
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) != ' ' && s2.charAt(i) != '.') {
                arrL2.add((int)s2.charAt(i));
            }
        }
        Collections.sort(arrL2);
        for (int i = 0; i < arrL.size(); i++) {
            if (Objects.equals(arrL.get(i), arrL2.get(i)) && arrL.size() == arrL2.size()) {
                return true;
            }
        }
        return false;
        
    }
    
    public static void main(String[] args) {
        String hi = "Hi, ";
        String mom = "mom.";
        System.out.println("Way1: " + hi + mom);
        System.out.println("Way2: " + hi.concat(mom));
        
        System.out.println("Cau 2: " + initialsName("Tran minh Quang"));
        String s1 = "abcx--yz";
        String s2 = "axbycz --";
        System.out.println("Cau 3: " + anagramExercise(s1, s2));
        
    }
}
