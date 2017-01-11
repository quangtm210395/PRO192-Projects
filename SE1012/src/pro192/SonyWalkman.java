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
public class SonyWalkman implements IPlayer{

    @Override
    public void play() {
        System.out.println("Sony is playing music kind");
    }

    @Override
    public void pause() {
        System.out.println("Sony paused music kind");
    }
    
}
