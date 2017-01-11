/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojavaiose1012;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class DemoJavaIOSE1012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputStream is = null;
        try {
            File inFile = new File("E:\\demo\\source\\abc.pptx");
            is = new FileInputStream(inFile);
            byte[] content = new byte[(int)inFile.length()];
            is.read(content);
            
            
            File outFile = new File("E:\\demo\\destination\\abc.pptx");
            
            FileOutputStream fos = new FileOutputStream(outFile);
            fos.write(content);
            
        } catch (Exception ex) {
            Logger.getLogger(DemoJavaIOSE1012.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                is.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoJavaIOSE1012.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          
          
        
    }
    
}
