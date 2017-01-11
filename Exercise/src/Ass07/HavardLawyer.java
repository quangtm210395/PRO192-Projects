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
public class HavardLawyer extends Lawyer {

    private final String havardLawyerVacationForm = "pinkpinkpinkpink";
    
    @Override
    public double getSalary(){
        return super.getSalary()*1.2;
    }
    
    @Override
    public void sue() {
        super.sue(); 
    }

    @Override
    public String getVacationForm() {
        return havardLawyerVacationForm; 
    }

    @Override
    public int getVacationDays() {
        return super.getVacationDays() + 3; 
    }

    

    

    

}
