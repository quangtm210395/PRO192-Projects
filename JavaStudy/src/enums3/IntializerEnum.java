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
public enum IntializerEnum {
    INSTANCE;
    private Configuration config;
    
    private IntializerEnum(){
        config = new Configuration(65, "D:/fileToWrite.txt");
    }
    public Configuration config(){
        return config;
    }
}
