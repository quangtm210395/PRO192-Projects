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
public abstract class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
    
    public void display(){
        System.out.println("Person: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public abstract double getSalary();

    @Override
    public String toString() {
        return "Person{" + "name=" + name + '}';
    }
    
    
}
