/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkShop5.bai2;

/**
 *
 * @author Minnn
 */
public class Worker extends Person {
    private double bSalary;
    private double rate;

    public Worker() {
    }

    public Worker(double bSalary, double rate) {
        this.bSalary = bSalary;
        this.rate = rate;
    }

    public Worker(double bSalary, double rate, String name) {
        super(name);
        this.bSalary = bSalary;
        this.rate = rate;
    }

    
    
    public double getbSalary() {
        return bSalary;
    }

    public void setbSalary(double bSalary) {
        this.bSalary = bSalary;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
    @Override
    public String getName(){
        return super.getName();
    }
    
    @Override
    public void setName(String name){
        super.setName(name);
    }

    @Override
    public double getSalary() {
        return bSalary * rate;
    }

    @Override
    public String toString() {
        return "Worker{ " + super.toString() + " bSalary=" + bSalary + ", rate=" + rate + '}';
    }
    
    
}
