/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastudy;

/**
 *
 * @author Minnn
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        IPod ipod = new IPod();
        ipod.play();
        
        SonyWalkMan Sony = new SonyWalkMan();
        Sony.play();
    }
    
}
