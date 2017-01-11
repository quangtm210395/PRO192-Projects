/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author luyenchu
 */
public class ListDemo11 {
    public static void main(String[] args) {
        List<Person> names = new ArrayList<>();
        names.add(new Person("Hoa Hao",20));
        Person kien = new Person("Kien",20);
        names.add(kien);
        names.add(new Person("Hai",20));
        System.out.println(names);
        
        for(Person p: names){
            System.out.println(p.getName());
        }
        
        System.out.println(names.indexOf(new Person("Kien0",20)));
        System.out.println(names.indexOf(kien));
        System.out.println(names.indexOf(new Person("Kien",20)));
    }
}
