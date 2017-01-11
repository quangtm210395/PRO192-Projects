/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectref;

/**
 *
 * @author luyenchu
 */
public class PersonRefDemo {
    public static void main(String[] args) {
        Person person = new Person("Hung",20);
        person.setAddress(new Adress("408","HQV","HN"));
        System.out.println(person);
    }
}
