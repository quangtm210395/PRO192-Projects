/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojavaiose1012;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
class Student implements Serializable
{
    public String ID;
    public String name;
}

public class DemoReaderWritterAndBuffer {
    
    public static ArrayList<Student> load()
    {
        FileReader fr = null;
        try {
            ArrayList<Student> students = new ArrayList<>();
            File f = new File("student.std");
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            Scanner scanner = new Scanner(br);
            while(scanner.hasNext())
            {
                String studentData = scanner.nextLine();
                String[] studInfo = studentData.split(";");
                Student student = new Student();
                student.ID = studInfo[0];
                student.name = studInfo[1];
                students.add(student);
            }
            br.close();
            return students;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoReaderWritterAndBuffer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DemoReaderWritterAndBuffer.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoReaderWritterAndBuffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    public static void write(ArrayList<Student> students)
    {
        FileWriter fw = null;
        try {
            File file = new File("student.std");
            fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Student student : students) {
                bw.write(student.ID+";"+student.name+";");
                bw.newLine();
            }
            bw.close();
           
        } catch (Exception ex) {
            Logger.getLogger(DemoReaderWritterAndBuffer.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoReaderWritterAndBuffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    
    public static void main(String[] args)
    {
        ArrayList<Student> students = load();
        for (Student student : students) {
            System.out.println(student.ID);
        }
        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            student.ID = "SE000"+i;
            student.name = "Mr"+ i;
            students.add(student);
        }
        DemoReaderWritterAndBuffer.write(students);
        Student student = new Student();
        student.ID = "ABC";
        student.name = "CDF";
        DemoReaderWritterAndBuffer.writeStudent(student);
        
        Student std = loadStudent();
        System.out.println(std.ID);
        
    }
    
    
    public static void writeStudent(Student student)
    {
        ObjectOutputStream oos = null;
        try {
            File file = new File("stupid.stu");
            OutputStream os = new FileOutputStream(file);
            oos = new ObjectOutputStream(os);
            oos.writeObject(student);
        } catch (Exception ex) {
            Logger.getLogger(DemoReaderWritterAndBuffer.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoReaderWritterAndBuffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static Student loadStudent()
    {
        Student student = null;
        ObjectInputStream ois = null;
        try {
            File file = new File("stupid.stu");
            InputStream is = new FileInputStream(file);
            ois = new ObjectInputStream(is);
            
            student = (Student)ois.readObject();
            
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(DemoReaderWritterAndBuffer.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoReaderWritterAndBuffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return student;
    }
    
    
    
}
