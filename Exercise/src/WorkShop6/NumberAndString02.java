/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkShop6;

import java.util.*;

/**
 *
 * @author Minnn
 */
public class NumberAndString02 {

    static void bai1(String str) {
        str = str.trim();
        String result[] = str.split("[ ]");
        for (String string : result) {
            if (string.equals("me")) {
                System.out.println("This String contains the following word: me");
            }
            if (string.equals("why")) {
                System.out.println("This String contains the following word: why");
            }
            if (string.equals("well")) {
                System.out.println("This String contains the following word: well");
            }
        }
    }

    static void bai2(String str) {
        str = str.trim();
        int count = 0;
        String result[] = str.split("[ ]");
        for (String string : result) {
            if (string.equals("you")) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("The word \"you\" is not appear in this String");
        } else {
            System.out.println("The word \"you\" appear " + count + " times");
        }
        
    }

    static void bai3(String str) {
        if (str == null) {
            System.out.println("Input String is null!");
            return;
        }
        str = str.trim();
        String result[] = str.split("[ ]");
        String str2 = "";
        for (String string : result) {
            str2 += string;
            str2 += " ";
        }
        str2 = str2.trim();
        char ch[] = str2.toCharArray();
        ch[0] = Character.toUpperCase(ch[0]);
        for (int i = 1; i < ch.length; i++) {
            if (ch[i] == ' ' || ch[i] == '.') {
                ch[i + 1] = Character.toUpperCase(ch[i + 1]);
            }
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
        System.out.println("");
    }

    static void bai4(String str) {
        if (str == null) {
            System.out.println("Input String is null!");
            return;
        }
        str = str.trim();
        String result[] = str.split("[ ]");
        String str2 = "";
        for (String string : result) {
            str2 += string;
            str2 += " ";
        }
        str2 = str2.trim();
        char ch[] = str2.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ' || ch[i] == '.') {
                ch[i - 1] = Character.toUpperCase(ch[i - 1]);
            }
        }
        ch[ch.length - 1] = Character.toUpperCase(ch[ch.length - 1]);
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
        System.out.println("");
    }

    static void bai5(String str) {
        str = str.trim();
        String result[] = str.split("[ ]");
        String temp;
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i].compareTo(result[j]) > 0) {
                    temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        for (String string : result) {
            System.out.println(string);
        }
    }

    static void bai6(String str, char c) {
        String str2;
        str2 = str.substring(0, str.indexOf(c)) + str.substring(str.indexOf(c) + 1, str.length());
        System.out.println(str2);
    }

    static void bai7(String str) {
        
        str = str.trim();
        String result[] = str.split("[ ]");
        if (str.length() == 0) {
            System.out.println("Empty String");
        } else {
            System.out.println("Words: " + result.length);
        }
        
    }
    
    static void bai8(String str){
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println("");
    }
    static String bai9(String str){
        String str2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i);
        }
        return str2;
    }
    
    static String bai10(String str){
        str = str.replaceAll("a", "A");
        str = str.replaceAll("b", "B");
        return str;
    }
    
    static int bai12(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
//        bai1(s1);
//        bai2(s1);
//        bai3(s1);
//        bai4(s1);
//        bai5(s1);
//        bai6(s1,'a');
//        bai7(s1);
        bai8(s1);
        System.out.println(bai9(s1));
        System.out.println(bai10(s1));
        System.out.println("Number of Upperletter: " +bai12(s1));
    }
}
