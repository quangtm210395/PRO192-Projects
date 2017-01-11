/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Exercise1;

/**
 *
 * @author Minnn
 */
public class MoveTest {
    public static void main(String[] args) {
        Point A = new Point(5, 2);
        Point B = new Point(6, 4);
        
        RightAngleMover right1 = new RightAngleMover();
        LineMover line1 = new LineMover();
        
        line1.moveTo(A, B);
        right1.moveTo(A, B);
        
    }
}
