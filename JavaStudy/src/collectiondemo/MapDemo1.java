/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author luyenchu
 */
public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>();
        map.put("Minh",10);
        map.put("Hoa",20);
        map.put("Ngoc",15);
        map.put("Minh",12);
        System.out.println(map);
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key="+key+", Value="+value);
        }
        System.out.println("By Key: " + map.get("Minh"));
        Set<String> keySet = map.keySet();
        for(String key: keySet){
            Integer value = map.get(key);
            System.out.println("Value: " + value);
        }
        //check if key is existed
        if(map.containsKey("Minh")){
            map.put("Minh",16);
            System.out.println("Replaced!");
        }
        System.out.println(map);
    }
}
