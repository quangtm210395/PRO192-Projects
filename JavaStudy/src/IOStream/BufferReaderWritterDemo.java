/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOStream;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Minnn
 */
class Student implements Serializable{
    public String ID;
    public String name;
}

public class BufferReaderWritterDemo {
    
    static ArrayList<Student> load(){
        FileReader fr = null;
        try {
            ArrayList<Student> students = new ArrayList<>();
            File f = new File("student.txt");
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            Scanner sc = new Scanner(br);
            
            while(sc.hasNext()){
                String studentData = sc.nextLine();
                String[] studInfo = studentData.split(";");
                Student student = new Student();
                student.ID = studInfo[0];
                student.name = studInfo[1];
                students.add(student);
            }
            br.close();
            return students;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BufferReaderWritterDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BufferReaderWritterDemo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(BufferReaderWritterDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    static void write(ArrayList<Student> students){
        FileWriter fw = null;
        try {
            File file = new File("student.txt");
            fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Student student : students) {
                bw.write(student.ID + ";" + student.name + ";");
                bw.newLine();
            }
            bw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(BufferReaderWritterDemo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(BufferReaderWritterDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Student> students = load();
        for (Student student : students) {
            System.out.println(student.ID);
        }
        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            student.ID = "SE0000" + i;
            student.name = "Mr" + i;
            students.add(student);
        }
        BufferReaderWritterDemo.write(students);
        Student student = new Student();
        student.ID = "ABC";
        student.name = "CDF";
        Student student1 = new Student();
        student1.ID = "123";
        student1.name = "CDF";
        BufferReaderWritterDemo.writeStudent(student);
        BufferReaderWritterDemo.writeStudent(student1);
        
        Student std = loadStudent();
        System.out.println(std.ID);
    }
    
    static void writeStudent(Student student) {
        
        ObjectOutputStream oos = null;
        try {
            File file = new File("stupid.stu");
            OutputStream os = new FileOutputStream(file);
            oos = new ObjectOutputStream(os);
            oos.writeObject(student);
        } catch (Exception ex) {
            Logger.getLogger(BufferReaderWritterDemo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(BufferReaderWritterDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    static Student loadStudent()
    {
        Student student = null;
        ObjectInputStream ois = null;
        try {
            File file = new File("stupid.stu");
            InputStream is = new FileInputStream(file);
            ois = new ObjectInputStream(is);
            
            student = (Student)ois.readObject();
            
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(BufferReaderWritterDemo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(BufferReaderWritterDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return student;
    }
}
