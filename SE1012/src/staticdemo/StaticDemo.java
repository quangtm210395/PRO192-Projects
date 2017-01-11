/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticdemo;

/**
 *
 * @author luyenchu
 */
public class StaticDemo {
    public static void main(String[] args) {
        AClzz.i = 30;
        BClzz.displayInfo();
        System.out.println("Value Of AClzz.i="+AClzz.i);
    }
}
