/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceExercise;

/**
 *
 * @author Minnn
 */
public class Line {
    private Point begin;
    private Point end;

    public Line(int x1, int y1, int x2, int y2){
        begin = new Point(x1,y1);
        end = new Point(x2,y2);
    }
    
    
    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
    
    public int getBeginX(){
        return begin.getX();
    }
    
    public void setBeginX(int x){
        begin.setX(x);
    }
    
    public int getBeginY(){
        return begin.getY();
    }
    
    public void setBeginY(int y){
        begin.setY(y);
    }
    
    public void setBeginXY(int x, int y){
        begin.setX(x);
        begin.setY(y);
    }
    
    public int getEndX(){
        return begin.getX();
    }
    
    public void setEndX(int x){
        begin.setX(x);
    }
    
    public int getEndY(){
        return begin.getY();
    }
    
    public void setEndY(int y){
        begin.setY(y);
    }
    
    public void setEndXY(int x, int y){
        begin.setX(x);
        begin.setY(y);
    }

    @Override
    public String toString() {
        return "Line{" + "begin=" + begin + ", end=" + end + '}';
    }
    
    public double getLength() {
      int xDiff = begin.getX() - end.getX();
      int yDiff = begin.getY() - end.getY();
      return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
   }
    
    

}
