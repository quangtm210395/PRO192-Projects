/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastudy.buoi2;

import java.util.Random;

/**
 *
 * @author Minnn
 */
public class OperatorDemo {
    public static void main(String[] args) {
        String aString = "toi yeu viet nam";
        Object s = aString;
        if (s instanceof String) {
            System.out.println("Sure!");
        }
        System.out.println(~2);
        System.out.println(3<<2);
        
        //short condition
        int age = 20;
        String role = "";
        if (age > 20) {
            role = "Student";
        } else {
            role = "Other";
        }
        role = age > 20 ? "Studen" : "Other";
        
        boolean x = age <= 20;
        int mark = 4;
        x &= mark < 5;
        System.out.println(x);
        boolean b= false;
        b |= age <15 && mark > 5;
        System.out.println(b);
        
        
        Random rd = new Random();
        boolean khi1 = rd.nextBoolean();
        boolean khi2 = rd.nextBoolean();
        
        String said = (khi1 == true)&&(khi2 == true)? "May lam tao boi roi vl" : "Ke me may";
        System.out.println(said);
    }
}
