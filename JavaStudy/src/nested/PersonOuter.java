/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nested;

/**
 *
 * @author luyenchu
 */
public class PersonOuter {
    private String name;
    private int age;
    private Address address;

    public PersonOuter() {
    }

    public PersonOuter(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "PersonOuter{" + "name=" + name + ", age=" + age + ", address=" + address + '}';
    }
    
    
    
    public static class Address{
        private String street;
        private String city;

        public Address(String street, String city) {
            this.street = street;
            this.city = city;
        }

        public String getCity() {
            return city;
        }

        public String getStreet() {
            return street;
        }

        @Override
        public String toString() {
            return "Address{" + "street=" + street + ", city=" + city + '}';
        }

    }
}
