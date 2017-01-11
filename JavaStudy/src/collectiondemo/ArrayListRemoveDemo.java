/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author luyenchu
 */
public class ArrayListRemoveDemo {
    public static void removeUsingFor(List<Integer> list){
        for(int i = 0; i< list.size(); i++){
            int x = list.get(i);
            if(x>3){
                list.remove(i);
                i--;
            }
        }
    }
    static List<Integer> createList(){
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(6);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(8);
        return list;
    }
    static void removeUsingIterator(List<Integer> list){
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            Integer next = iterator.next();
            if(next > 3){
                iterator.remove();
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> list = createList();
        removeUsingFor(list);
        System.out.println(list);
        list = createList();
        removeUsingIterator(list);
        System.out.println(list);
    }
}
