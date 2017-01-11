/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOExercise;

import java.io.*;
import java.util.*;
import java.awt.*;

/**
 *
 * @author Minnn
 */
public class Main {
    
    public static void main(String[] args) {
        File file1 = new File("E:\\Study\\A");
        LinkedList<String> ll = new LinkedList<>();
        String[] listFile = file1.list();
        for (String str : listFile) {
            ll.add(str.toUpperCase());
        }
        System.out.println(ll);
        
        FileEx1 file2 = new FileEx1("E:\\Ebook");
        System.out.println(file2.returnDirectories());
        
        File02 bai2 = new File02("E:\\Media-Entertainment\\Ảnh");
        LinkedList<File> ll2 = bai2.getLL();
        bai2.setDirectories(bai2.getDirectory());
        System.out.println("Number of image: " + bai2.numberOfImage());
        System.out.println("Number of Sub-directory: " + bai2.numberOfSubFolder());
        
        
    }
}
