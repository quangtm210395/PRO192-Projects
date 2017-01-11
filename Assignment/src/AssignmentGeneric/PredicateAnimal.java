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
public class PredicateAnimal implements MyPredicate<String> {
    
    String[] preDef = {"Monkey","Tiger","Cat","Dog"};
    
    @Override
    public boolean test(String obj) {
        for (String preDef1 : preDef) {
            if (obj.equalsIgnoreCase(preDef1)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void filter(List<String> list){
        for (String string : preDef) {
            for (int i = 0; i < list.size(); i++) {
                if (string.equals(list.get(i))) {
                    list.remove(i);
                }
            }
        }
    }
    
}
