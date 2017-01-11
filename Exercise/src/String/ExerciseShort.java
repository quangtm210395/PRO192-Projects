/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Minnn
 */
public class ExerciseShort {

    static String greeting(String name) {
        return "Hello " + name;
    }

    static String firstAndSecond(String str) {
        if (str.length() < 2 && str.length() > 0) {
            return str;
        } else if (str.length() < 1) {
            return "";
        } else {
            return str.substring(0, 1);
        }
    }

    static String concatString(String s1, String s2) {
        return s1 + s2;
    }

    static boolean checkEnd(String str) {
        return str.endsWith("ly");
    }

    static int countNumber(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    static boolean isNumber(char c) {
        return Character.isDigit(c);
    }

    static boolean isPrime(int a) {
        int count = 0;
        if (a < 2) {
            return false;
        } else {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    count++;
                }
            }
            return count == 2;
        }
    }

    static int hexValue(char c) {
        c = Character.toUpperCase(c);
        switch (c) {
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
        }
        return -1;
    }

    static int getFirstPrime(String str) {
        String str2 = str.replaceAll("\\D+", " ");
        str2 = str2.trim();
        String result[] = str2.split("[ ]");
        int firstPrime = Integer.parseInt(result[0]);
        return firstPrime;
    }

    static String printCapitalized(String str) {
        char[] chArr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || chArr[i] == ' ') {
                chArr[i + 1] = Character.toUpperCase(chArr[i + 1]);
            }
        }
        return new String(chArr);
    }

    static int countPrime(String str) {
        int count = 0;
        int c = 0;
        int number;
        int[] arr = new int[100];
        char[] chs = new char[100];
        String str2 = str.replaceAll("\\D+", " ");
        str2 = str2.trim();
        String result[] = str2.split("[ ]");
        for (String result1 : result) {
            arr[c] = Integer.valueOf(result1);
            c++;
        }

        for (int i = 0; i < c; i++) {
            if (isPrime(arr[i])) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = "Quang1";
        String s2 = "";
        String s3 = "X";
        System.out.println("greeting(s1)");
        System.out.println("<i>Quang</>");
        System.out.println(firstAndSecond(s1));
        System.out.println(firstAndSecond(s2));
        System.out.println(firstAndSecond(s3));
        System.out.println(concatString(s1, s2));
        System.out.println(checkEnd("Fly"));
        String s4 = "12 65 78 95 2 1 AAAA";
        System.out.println(s4.replaceAll("\\d", "*"));
        String s5 = " 2 3 5 789 11";
        System.out.println("Number of Prime of s5: " + countPrime(s5));
        System.out.println("The first Prime of s5: " + getFirstPrime(s5)
                + " and its index: " + s5.indexOf(Integer.toString(getFirstPrime(s5))));

        String s6 = " tran minh quang";
        System.out.println("Print capitalized s6: " + printCapitalized(s6));

        String str = scanner.nextLine();
        str = str.toUpperCase();
        int value = 0;
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            value = value * 16 + hexValue(str.charAt(i));
            if (hexValue(str.charAt(i)) == -1) {
                System.out.println("This is not a hexadecimal digit!");
                c = 1;
            }
        }
        if (c == 0) {
            System.out.println("Decima: " + value);
        }
//        String s = scanner.nextLine();
//        s = s.toUpperCase();
//        int value = 0;
//        int c = 0;
//        for (int i = 0; i < s.length(); i++) {
//            int n = (int) pow(16, s.length() - i - 1);
//            value = value + n * hexValue(s.charAt(i));
//            if (hexValue(s.charAt(i)) == -1) {
//                System.out.println("khong phai");
//                c = 1;
//                break;
//            }
//        }
//        if (c == 0) {
//            System.out.println("Decima: " + value);
//        }
    }
}
