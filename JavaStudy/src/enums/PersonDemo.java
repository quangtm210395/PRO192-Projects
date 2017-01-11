/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Minnn
 */
public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person("Quang", 21, Gender.Male);
        System.out.format("Person name: %s, %s, %s", person.getName(), person.getAge(), person.getGender());
        System.out.println("");
        Person1 person1 = new Person1("Rin", 19, Constants.GENDER_FEMALE);
        System.out.format("Person name: %s, %s, %s", person1.getName(), person1.getAge(), person1.getGender());
    }
}
