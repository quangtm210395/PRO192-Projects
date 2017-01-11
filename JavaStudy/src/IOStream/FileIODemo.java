/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOStream;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Minnn
 */
public class FileIODemo {
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
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileIODemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileIODemo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                is.close();
            } catch (IOException ex) {
                Logger.getLogger(FileIODemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
        
    }
}
