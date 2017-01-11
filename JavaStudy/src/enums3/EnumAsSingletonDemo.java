/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums3;

/**
 *
 * @author Minnn
 */
public class EnumAsSingletonDemo {
    static void useSingleton(){
        Configuration configuration = IntializerEnum.INSTANCE.config();
        System.out.println(configuration);
    }
    public static void main(String[] args) {
        Configuration configuration = IntializerEnum.INSTANCE.config();
        System.out.println(configuration);
        useSingleton();
    }
}
