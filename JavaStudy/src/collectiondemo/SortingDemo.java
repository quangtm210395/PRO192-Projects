/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Minnn
 */
public class SortingDemo {
    static List<Integer> createList(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(2);
        return list;
    }
    public static void main(String[] args) {
        List<Integer> list = createList();
        Comparator<Integer> compar = new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
            
        };
        Comparator<Person> compar1 = new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge() - o1.getAge();
            }
            
        };
        System.out.println(list);
        Collections.sort(list, compar);
        System.out.println(list);
        
        List<Person> ps = new ArrayList<>();
        ps.add(new Person("quang", 21));
        ps.add(new Person("quynh", 19));
        ps.add(new Person("thanh", 18));
        ps.add(new Person("kien", 20));
        ps.add(new Person("hai", 21));
        Collections.sort(ps, compar1);
        System.out.println(ps);
    }
}
