/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton.demo;

import Singleton.Singleton;

/**
 *
 * @author Minnn
 */
public class SingletonDemo {
    static void useSingleton(){
        Singleton singleton = Singleton.getInstance();
        System.out.println("Singleton in Method: " + singleton.getConfig());
    }
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("SingleTon: " +singleton.getConfig());
    }
}
