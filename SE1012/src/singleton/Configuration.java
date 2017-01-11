/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author luyenchu
 */
public class Configuration {
    private int maxAge;
    private String fileToWrite;
    //etc

    Configuration(int maxAge, String fileToWrite) {
        this.maxAge = maxAge;
        this.fileToWrite = fileToWrite;
        System.out.println("Configuration is instatiated!!!!");
    }

    public String getFileToWrite() {
        return fileToWrite;
    }

    public int getMaxAge() {
        return maxAge;
    }

    @Override
    public String toString() {
        return "Configuration{" + "maxAge=" + maxAge + ", fileToWrite=" + fileToWrite + '}';
    }
    
}
