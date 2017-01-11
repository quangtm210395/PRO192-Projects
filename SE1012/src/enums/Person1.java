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
public class Person1 {
    private String name;
    private int age;
    private String gender;

    public Person1() {
    }

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person1(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }
}
