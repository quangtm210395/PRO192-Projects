/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

/**
 *
 * @author luyenchu
 */
public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box("Kien");
        Object get = box.get();
        
        //use generic
        Box<String> box2 = new Box<>(3+"");
        String str = box2.get();
        System.out.println("STR: " + str);
    }
}
