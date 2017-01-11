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
public class Box<T> {
    private T value;
    
    public Box(T value){
        this.value = value;
    }
    
    public T get(){
        return value;
    }
    
    public static <V> void printArray(V...vs){
        for(V v: vs){
            System.out.println(v);
        }
    }
}
