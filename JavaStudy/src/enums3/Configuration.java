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
public class Configuration {
    private int maxAge;
    private String fileToWrite;

    public int getMaxAge() {
        return maxAge;
    }

    public String getFileToWrite() {
        return fileToWrite;
    }

    public Configuration(int maxAge, String fileToWrite) {
        this.maxAge = maxAge;
        this.fileToWrite = fileToWrite;
        System.out.println("Configuration is instatiated!!!");
    }

    @Override
    public String toString() {
        return "Configuration{" + "maxAge=" + maxAge + ", fileToWrite=" + fileToWrite + '}';
    }
    
    
}
