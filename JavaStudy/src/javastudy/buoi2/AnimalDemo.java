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

public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Bird","North American","worm");
        
        Animal animal2 = new Animal("Dog","Asia","skeleton");
        
        Animal animal3 = new Animal("Mouse","Europe","rice");
        
        Animal[] animals = {animal1,animal2,animal3};
        
        for (Animal animal : animals) {
            System.out.println("Loai: " + animal.loai);
            System.out.println("Location: " + animal.location);
            animal.eat();
        }
    }
}
