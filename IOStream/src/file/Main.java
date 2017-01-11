/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Minnn
 */
public class Main {
   public static void main(String[] args) {
      File file = new File("C:/test/myfile.txt");
      System.out.println(file.exists());
   }
}
