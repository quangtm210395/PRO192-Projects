/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastudy;

/**
 *
 * @author Minnn
 */
public class XCopy {
    static int go(int arg){
        arg = arg * 2;
        return arg;
    }
    public static void main(String[] args) {
        int orig = 42;
        XCopy x = new XCopy();
        int y = XCopy.go(orig);
        System.out.println("orig : " + y);
    }
}
