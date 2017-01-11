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
public class IPod implements IPlayer {

    @Override
    public void play() {
        System.out.println("IPod is play ing music kind");
    }

    @Override
    public void pause() {
        System.out.println("IPod is pause music kind");
    }
    
}
