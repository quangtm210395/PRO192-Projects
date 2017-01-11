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
public class Employee {

    private int baseHours = 40;
    private double baseSalary = 40000;
    private int baseVacationDays = 10;
    private String baseVacationForm = "yellow";

    public int getHours() {
        return baseHours;
    }

    public double getSalary() {
        return baseSalary;
    }

    public int getVacationDays() {
        return baseVacationDays;
    }

    public String getVacationForm() {
        return baseVacationForm;
    }

    public final void setBaseHours(int hours) {
        baseHours = hours;
    }

    public final void setBaseSalary(double salary) {
        baseSalary = salary;
    }

    public final void setBaseVacationDays(int days) {
        baseVacationDays = days;
    }

    public final void setBaseVacationForm(String form) {
        baseVacationForm = form;
    }

    

}
