/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Exercise2;

/**
 *
 * @author Minnn
 */
public class Apple extends Fruit {
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Apple(String location, String color, String taste, String size) {
        super(color, taste, size);
        this.location = location;
    }

    public Apple(String location) {
        this.location = location;
    }
    
    @Override
    public void setColor(String color){
        super.setColor(color);
    }
    
    @Override
    public String getColor(){
        return super.getColor();
    }
    
    @Override
    public void setTaste(String taste){
        super.setTaste(taste);
    }
    
    @Override
    public String getTaste(){
        return super.getTaste();
    };
    
    @Override
    public void setSize(String size){
        super.setSize(size);
    }
    
    @Override
    public String getSize(){
        return super.getSize();
    }
}
