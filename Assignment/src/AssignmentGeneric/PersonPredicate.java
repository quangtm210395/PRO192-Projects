/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentGeneric;

import java.util.List;

/**
 *
 * @author Minnn
 */
public class PersonPredicate implements MyPredicate<Person> {
    
    String[] nameDef = {"Quang","Kien","Hai"};
    @Override
    public boolean test(Person obj) {
        for (String name : nameDef) {
            if (obj.name.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void filter(List<Person> list) {
        for (String name1 : nameDef) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).name.equals(name1)) {
                    list.remove(i);
                }
            }
        }
    }
    
}
