/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondemo;

import java.util.List;
import java.util.Vector;

/**
 *
 * @author luyenchu
 */
public class TestVector {
    public static void main(String[] args) {
        List<String> vec = new Vector<>();
        vec.add("Quang");
        vec.add("Hoang Hung");
        vec.add("Hieu");
        System.out.println(vec);
        for(String aStr : vec){
            System.out.println(aStr);
        }
        
//        for (int i = 0; i < vec.size(); i++) {
//            String get = vec.get(i);
//            
//        }
    }
}
