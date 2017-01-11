/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managestudent;

import java.util.*;

/**
 *
 * @author Minnn
 */
public class Valid {

    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        String s = inputID("Enter a string: ");
        System.out.println(s);
    }

    static int inputInt(String text) {
        int number = -1;
            try {
                System.out.print(text);
                number = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
            }
        return number;
    }
    static String inputName(String text){
        String s;
        do{
            System.out.print(text);
            s = sc.nextLine();
            if (checkWord(s)) {
                s = removeSpace(s);
                s = toUpper(s);
            } else System.out.println("Please enter again!");
        }while(checkWord(s) == false);
        
        return s;
    }
    static String inputCourse(String text){
        String s;
        do{
            System.out.print(text);
            s = sc.nextLine();
            if (checkCourse(s)) {
                s = removeSpace(s);
                s = toUpper(s);
            } else System.out.println("Please enter again!");
        }while(checkCourse(s) == false);
        
        return s;
    }
    static String inputID(String text){
        String s;
        int check;
        do{
            check = 0;
            System.out.print(text);
            s = sc.nextLine();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != ' ') check ++;
            }
            if (check != s.length()) {
                System.out.println("Please input again!");
            }
        }while(check != s.length());
        return s;
    }
    static String removeSpace(String s){
        s = s.trim();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 1; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == ' ' && sb.charAt(i+1) == ' ') {
                sb.replace(i, i+1, "");
                i--;
            }
        }
        return new String(sb);
    }
    static boolean checkWord(String s){
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) || s.charAt(i) == ' ') {
                index++;
            }
        }
        return index == s.length() && s.length() != 0;
    }
    static boolean checkCourse(String s){
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) || s.charAt(i) == ' ' 
                    || Character.isDigit(s.charAt(i))) {
                index++;
            }
        }
        return index == s.length() && s.length() != 0;
    }
    static String toUpper(String s){
        char[] c = s.toCharArray();
        c[0] = Character.toUpperCase(c[0]);
        for (int i = 1; i < c.length; i++) {
            if (c[i] == ' ') {
                c[i+1] = Character.toUpperCase(c[i+1]);
            }
        }
        s = "";
        for (int i = 0; i < c.length; i++) {
            s+= c[i];
        }
        return s;
    }
}
