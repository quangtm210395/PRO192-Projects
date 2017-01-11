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
public class ListDemo {
    public static void main(String[] args) {
        List names = new ArrayList();
        System.out.println(names.size());
        names.add("Hoa Hao");
        names.add("Khac Kien");
        names.add("Hoa Hao");
        System.out.println(names.size());
        //traverse the list
        //the first way for iterating
        System.out.println("the first way for iterating");
        for(Object obj: names){
            System.out.println(obj);
        }
        System.out.println("the second way for iterating");
        for(int i = 0; i < names.size(); i ++ ){
            Object obj = names.get(i);
            System.out.println(obj);
        }
        System.out.println("the third way for iterating");
        for (Iterator iterator = names.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            
        }
        Iterator it = names.iterator();
        while(it.hasNext()){
            Object obj = it.next();
        }
        //////////////////
        names.add(1221100);
        names.add(new Person("Kien",20));
        for(int i = 0; i < names.size(); i ++ ){
            Object obj = names.get(i);
            if(obj instanceof String){
                String str = (String)obj;
                //String.valueOf()
                System.out.println("String: " + str.length());
            }
            if(obj instanceof Person){
                System.out.println(((Person) obj).getName());
            }
        }
    }
}
