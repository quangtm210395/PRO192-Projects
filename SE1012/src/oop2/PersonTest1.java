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
public class PersonTest1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.display();
        person.setName("Hung");
        person.setAge(20);
        person.display();
        System.out.println("*************");
        Person person2 = new Person("Hoang",20);
        person2.display();
    }
}
