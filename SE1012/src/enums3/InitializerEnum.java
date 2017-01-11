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
public enum InitializerEnum {
    INSTANCE;
    private Configuration config;

    private InitializerEnum() {
        config = new Configuration(65, "D://FileToWrite");
    }
    public Configuration config(){
        return config;
    }
    
}
