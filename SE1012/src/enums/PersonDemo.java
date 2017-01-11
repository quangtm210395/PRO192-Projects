/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author luyenchu
 */
public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person("Quang", 20, Gender.MALE);
        System.out.printf("Person Name: %s, %s, %s\n",
                person.getName(),
                person.getAge(),
                person.getGender());
        
        //
        Person1 person1 = new Person1("Quang",20, Constants.GENDER_MALE);
    }
}
