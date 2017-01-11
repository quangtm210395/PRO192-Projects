/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOExercise;

import java.io.*;
import java.util.*;

/**
 *
 * @author Minnn
 */
public class File02 {

    private String directory;
    private LinkedList<File> LL = new LinkedList<>();

    public File02(String directory) {
        this.directory = directory;
    }

    public String getDirectory() {
        return directory;
    }

    public LinkedList<File> getLL() {
        return LL;
    }

    public void setDirectories(String directory) {

        File file = new File(directory);
        File[] listFile = file.listFiles();
        if (listFile == null) {
            return;
        }
        for (File file1 : listFile) {
            if (file1.isDirectory()) {
                LL.add(file1);
            }
        }
        for (File file1 : listFile) {
            if (file1.isDirectory()) {
                setDirectories(file1.getAbsolutePath());
            }
        }

    }

    public int numberOfSubFolder() {
        return LL.size();
    }

    public int numberOfImage() {
        int count = 0;
        for (File file : LL) {
            if (file.isDirectory()) {
                File[] file1 = file.listFiles();
                for (File f : file1) {
                    if (f.isFile() && (f.getName().toLowerCase().endsWith(".jpg") 
                            || f.getName().toLowerCase().endsWith(".png") 
                            || f.getName().toLowerCase().endsWith(".bmp"))) {
                        count++;
                    }
                }
            }

        }
        return count;
    }
}
