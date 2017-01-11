/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringdemo;

/**
 *
 * @author luyenchu
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Hello HaNoi, 4 years";
        System.out.println("S1'sLength: " + s1.length());
        char c = s1.charAt(4);
        System.out.println("Char at(4): " + c);
        System.out.println("----------");
        for (int i = 0; i < s1.length(); i++) {
            char cAt = s1.charAt(i);
            int asciiC = cAt;
            System.out.println("Asci: " + asciiC);
            if(Character.isUpperCase(cAt)){
                System.out.println("Is Upercase: "+cAt);
            }
        }
        System.out.println("----------");
        boolean compare = "Hanoi".equals(s1);
        System.out.println(compare);
        System.out.println(s1.startsWith("Hello"));
        ///////equalsIgnoreCase
        String s2 = "haNOI";
        System.out.println("hanoi".equalsIgnoreCase(s2));
        /////////////////
        s2 = "Hello Hanoi,     long 4 time 4 no see 3 you, Hanoi";
        int indxOfHn = s2.indexOf("Hanoi");
        System.out.println("Index Of Hanoi: " + indxOfHn);
        int lastIdxOfHn = s2.lastIndexOf("Hanoi");
        System.out.println("Last Of Hanoi: " + lastIdxOfHn);
        String sub1 = s2.substring(indxOfHn);
        System.out.println(sub1);
        sub1 = s2.substring(indxOfHn + "Hanoi".length(),lastIdxOfHn);
        System.out.println(sub1);
        
        /////////////
        System.out.println("***********");
        String replacement = s2.replaceAll("Hanoi", "Vietnam");
        System.out.println(replacement);
        
        replacement = s2.replaceAll("\\d", "*");
        System.out.println(replacement);
        replacement = s2.replaceAll("\\s+"," ");
        System.out.println(replacement);
    }
}
