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
public class Person {
    private String name;
    private int age;
    private Adress address;
    
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

    public Adress getAddress() {
        return address;
    }

    public void setAddress(Adress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", address=" + address + '}';
    }
    
}
