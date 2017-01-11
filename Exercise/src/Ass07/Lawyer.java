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
public class Lawyer extends Employee {
    
    private String lawyerVacationForm = "pink";
    
    

    // overrides getVacationDays from Employee class
    @Override
    public int getVacationDays() {
        return super.getVacationDays() + 5;
    }

    // overrides getVacationDays from Employee class
    @Override
    public String getVacationForm() {
        return lawyerVacationForm;
    }

    // this is the Lawyer's added behavior
    public void sue() {
        System.out.println("I'll see you in court!");
    }

    // these are so that test cases can change the Lawyer values
    // and make sure that subclasses also change
    

    public final void setVacationForm(String form) {
        lawyerVacationForm = form;
    }

}
