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
public interface MyPredicate<T> {
    public boolean test(T obj);
    public void filter(List<T> list);
}
