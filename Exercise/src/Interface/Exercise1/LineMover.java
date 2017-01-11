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
public class LineMover implements Movable {

    @Override
    public void moveTo(Point begin, Point end) {
        System.out.println("Move from " + begin + ", to " + end + ", length = " + 
                getLineLength(begin, end));
    }

    private String getLineLength(Point begin, Point end ) {
        return ("" + (Math.abs(begin.getX() - end.getX()) + (Math.abs(begin.getY() - end.getY())) ));
    }
    
}
