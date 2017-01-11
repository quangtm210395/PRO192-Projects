/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentGeneric;

import java.util.*;

/**
 *
 * @author Minnn
 */
public class MyPredicates {
    /*  Remove every object, obj, from coll for which
        pred.test(obj) is true.*/
    public static <T> void remove(Collection<T> coll, MyPredicate<T> pred){
        Iterator<T> iter = coll.iterator();
        while (iter.hasNext()) {
            T item = iter.next();
            if (pred.test(item)) {
                iter.remove();
            }
        }
    }
    
    /*  Return the index of the first item in list
        for which the predicate is true, if any.
        If there is no such item, return -1 */
    public static <T> int find(ArrayList<T> list, MyPredicate<T> pred){
        for (int i = 0; i < list.size(); i++) {
            if (pred.test(list.get(i))) {
                return i;
            }
        }
        return -1;
    }
}
