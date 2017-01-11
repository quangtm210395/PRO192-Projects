/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2;

/**
 *
 * @author luyenchu
 */
public class Person {
    private String name;
    private int age;
    
    
    
    public Person(){
        name = "Unnamed";
        age = -1;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void display(){
        System.out.println("Name="+name +", Age="+ age);
    }
    public String toString(){
        return "Name="+name +", Age="+ age;
    }
    
}
