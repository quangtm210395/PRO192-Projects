/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managestudent;

import java.util.*;

/**
 *
 * @author Minnn
 */
public class ManageStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Valid vl = new Valid();
        List<Student> stuList = new ArrayList<>();
        int choice;
        String ID, studentName, courseName;
        int semester;
        do{
            System.out.println("1. Create");
            System.out.println("2. Find");
            System.out.println("3. Update/Delete");
            System.out.println("4. Report");
            System.out.println("5. Create");
            choice = vl.inputInt("Enter your choice: ");
            if (choice == -1) System.out.println("Please enter a number between 1 and 5!");
            switch(choice){
                case 1:
                    ID = vl.inputID("Enter ID: ");
                    studentName = vl.inputName("Enter name: ");
                    do{
                        semester = vl.inputInt("Enter semester: ");
                        if (semester < 0 || semester > 9) System.out.println("Please input again!");
                    }while(semester < 0 || semester > 9);
                    courseName = vl.inputCourse("Enter course: ");
                    Student student = new Student(ID, studentName, semester, courseName);
                    if (stuList.size() > 0) {
                        for (int i = 0; i < stuList.size(); i++) {
                            if (stuList.get(i).getID().equalsIgnoreCase(ID) ) {
                                if (!stuList.get(i).getStudentName().equalsIgnoreCase(studentName)) {
                                    System.out.println("This ID is another Student's ID");
                                    break;
                                } else if (stuList.get(i).getSemester() == semester 
                                        && stuList.get(i).getCourseName().equalsIgnoreCase(courseName) ) {
                                    System.out.println("This information existed!");
                                    break;
                                }
                                else {
                                    stuList.add(student);
                                    System.out.println("Create successful!1");
                                    break;
                                }
                            } else {
                                stuList.add(student);
                                System.out.println("Create successful!2");
                                break;
                            }
                        }
                    } else {
                        stuList.add(student);
                        System.out.println("Create successful!3");
                    }
                    System.out.println("");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    for (int i = 0; i < stuList.size(); i++) {
                        System.out.println(stuList.get(i));
                    }
                    break;
                case 5:
                    break;
            }
        }while(choice != 0);
    }
    
}
