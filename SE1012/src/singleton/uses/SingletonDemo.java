/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.uses;

import singleton.Configuration;
import singleton.Singleton;

/**
 *
 * @author luyenchu
 */
public class SingletonDemo {
    static void useSingleton(){
        Singleton singleton = Singleton.getInstance();
        System.out.println("SingleTon In Method: " + singleton.getConfig());
    }
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("SingleTon: " + singleton.getConfig());
        
        useSingleton();
        
    }
}
