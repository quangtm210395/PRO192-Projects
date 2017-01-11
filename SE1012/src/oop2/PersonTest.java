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
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Person: " + person.getName()+", age="+person.getAge());
        person.setName("Hung");
        person.setAge(20);
        System.out.println("Person: " + person.getName()+", age="+person.getAge());
        System.out.println("*************");
        Person person2 = new Person("Hoang",20);
        System.out.println("Person: " + person2.getName()+", age="+person2.getAge());
    }
}
