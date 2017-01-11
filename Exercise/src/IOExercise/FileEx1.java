/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOExercise;

import java.util.*;
import java.io.*;

/**
 *
 * @author Minnn
 */
public class FileEx1 {

    private String directory;

    public FileEx1(String directory) {
        this.directory = directory;
    }

    public String getDirectory() {
        return directory;
    }

    public LinkedList<String> returnDirectories() {

        LinkedList<String> listD = new LinkedList<>();
        File inFile = new File(directory);
        String[] listFile = inFile.list();
        for (String str : listFile) {
            listD.add(str.toUpperCase());
        }
        return listD;

    }
}
