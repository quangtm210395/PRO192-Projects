/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastudy.buoi2;

/**
 *
 * @author Minnn
 */
public class Animal {
    public String loai;
    public String location;
    public String food;
    public void eat(){
        System.out.println(this.loai + " eated " + this.food  +".");
    }

    Animal(){
        
    }
    
    public Animal(String loai, String location, String food) {
        this.loai = loai;
        this.location = location;
        this.food = food;
    }
   
}
