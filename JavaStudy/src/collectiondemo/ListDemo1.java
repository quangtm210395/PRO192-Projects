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
public class ListDemo1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Hoa Hao");
        names.add("Hoa Hao1");
        names.add("Hoa Hao2");
        //names.add(332211);//error on compile
        names.add("Hung Hoang");
        System.out.println(names);
        //traverse the list of strings
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println(names.indexOf("Hung hoang"));
        System.out.println(names.indexOf("Hung Hoang"));
    }
}
