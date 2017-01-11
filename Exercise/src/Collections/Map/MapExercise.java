/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.Map;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Minnn
 */
public class MapExercise {
    
    static Map<String, Integer> reserve(Map<String, Integer> map2, Map<Integer, String> map1){
        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            map2.put(entry.getValue(), entry.getKey());
        }
        
        
        return map2;
    }
    
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(21, "quang");
        map1.put(21, "hai");
        map1.put(20, "kien");
        map1.put(19, "thanh");
        map1.put(19, "quynh");
        Map<String, Integer> map2 = new HashMap<>();
        System.out.println(reserve(map2, map1));
        
    }
}
