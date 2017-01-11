/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkShop5.bai2;

/**
 *
 * @author Minnn
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Worker(300000, 5.7, "Quang");
        
        System.out.println(person1);
        System.out.println("Salary: " + person1.getSalary());
    }
}
