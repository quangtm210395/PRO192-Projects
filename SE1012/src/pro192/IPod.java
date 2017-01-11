/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro192;

/**
 *
 * @author luyenchu
 */
public class IPod implements IPlayer{

    @Override
    public void play() {
        System.out.println("IPOD is playing music kind");
    }

    @Override
    public void pause() {
        System.out.println("IPOD paused music kind");
    }
    
}
