/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author Minnn
 */
public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }
    
    @Override
    void said(){
        System.out.println("Dog");
    }
}
