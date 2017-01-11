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
public class InterfaceDemo {
    public static void main(String[] args) {
        IPlayer player = new IPod();
        player.play();
        IPlayer player2 = new SonyWalkman();
        player2.play();
    }
}
