/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author luyenchu
 */
public class OverloadingMethodDemo {
    public int sum(int i1, int i2){
        return i1+i2;
    }
    public int sum(int i1, int i2, int i3){
        return i1 + i2 + i3;
    }
    public int sum(double i1, double i2){
        return (int)(i1 + i2);
    }
    public static void main(String[] args) {
        OverloadingMethodDemo overload = new OverloadingMethodDemo();
        int sum  =overload.sum(3, 2);
        System.out.println("SUM="+ sum);
    }
}
