/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ass07;

/**
 *
 * @author Minnn
 */
public class Main {
    public static void main(String[] args) {
        
        Employee ep1 = new HavardLawyer();
        System.out.println("HavardLawyer: ");
        System.out.println("Hour: " + ep1.getHours());
        System.out.println("Salary: " + ep1.getSalary());
        System.out.println("VacationDays: " + ep1.getVacationDays());
        System.out.println("VacationForm: " + ep1.getVacationForm());
        
        Employee ep2 = new Employee();
        System.out.println("Employee: ");
        System.out.println("Hour: " + ep2.getHours());
        System.out.println("Salary: " + ep2.getSalary());
        System.out.println("VacationDays: " + ep2.getVacationDays());
        System.out.println("VacationForm: " + ep2.getVacationForm());
        
        Employee ep3 = new Lawyer();
        System.out.println("Lawyer: ");
        System.out.println("Hour: " + ep3.getHours());
        System.out.println("Salary: " + ep3.getSalary());
        System.out.println("VacationDays: " + ep3.getVacationDays());
        System.out.println("VacationForm: " + ep3.getVacationForm());
    }
}
