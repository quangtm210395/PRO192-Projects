/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberAndString;

/**
 *
 * @author Minnn
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Tran Minh Quang";
        System.out.println("S1 Length: " + s1.length());
        char c = s1.charAt(4);
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            int asciiC = c1;
            System.out.println("Ascii: " + asciiC);
            if (Character.isUpperCase(c1)) {
                System.out.println("Is Uppercase: " + c1);
            }
        }
    }
    
    
}
