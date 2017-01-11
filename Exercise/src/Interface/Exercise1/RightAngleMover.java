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
public class RightAngleMover implements Movable {

    @Override
    public void moveTo(Point begin, Point end) {
        System.out.println("Move from " + begin + ", to " + end + ", length = " 
                + getRightAngleLength(begin, end));
    }
    
    private double getRightAngleLength(Point begin, Point end ) {
        double a = (double)(begin.getX() - end.getX());
        double b = (double)(begin.getY() - end.getY());
        return (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }
}
