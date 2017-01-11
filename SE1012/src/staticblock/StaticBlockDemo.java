/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticblock;

/**
 *
 * @author luyenchu
 */
public class StaticBlockDemo {
    private int x;
    static{
        System.out.println("Is in static block 1");
    }
    static{
        System.out.println("Is in static block 2");
    }
    {
        System.out.println("Block 3");
    }
    public StaticBlockDemo(){
        System.out.println("Is in constructor");
    }
    
}
