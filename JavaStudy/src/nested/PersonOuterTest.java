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
public class PersonOuterTest {
    public static void main(String[] args) {
        PersonOuter.Address addres = new PersonOuter.Address("HQV", "HN");
        System.out.println(addres);
        PersonOuter person = new PersonOuter("Hung",20);
        person.setAddress(addres);
        //try to access address:
        System.out.println(person.getAddress().getStreet());
        System.out.println(person);
    }
}
