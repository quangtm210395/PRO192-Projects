/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums3;

/**
 *
 * @author luyenchu
 */
public class EnumAsSingletonDemo {
    static void useSingleton(){
        Configuration configuration = InitializerEnum.INSTANCE.config();
        System.out.println(configuration);
    }
    public static void main(String[] args) {
        Configuration configuration = InitializerEnum.INSTANCE.config();
        System.out.println(configuration);
        useSingleton();
    }
}
