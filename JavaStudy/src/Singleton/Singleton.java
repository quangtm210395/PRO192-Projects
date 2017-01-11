/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Minnn
 */
public class Singleton {
    private Configuration config;
    
    private static Singleton single; 
    private Singleton(){
        config = new Configuration(65, "D:/fileToWrite.txt");
    }
    public static Singleton getInstance(){
        if (single == null) {
            single = new Singleton();
        }
        return single;
    }

    public Configuration getConfig() {
        return config;
    }

    public static Singleton getSingle() {
        return single;
    }
    
}
