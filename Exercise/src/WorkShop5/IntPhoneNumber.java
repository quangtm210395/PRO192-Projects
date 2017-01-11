/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkShop5;

/**
 *
 * @author Minnn
 */
public class IntPhoneNumber extends PhoneNumber {
    private String countryCode;

    public IntPhoneNumber() {
    }

    public IntPhoneNumber(String countryCode) {
        this.countryCode = countryCode;
    }


    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    
    @Override
    public void display(){
        System.out.println(countryCode + " - " + getArea() + " - " + getNumber());
    }
    
    @Override
    public int getArea() {
        return super.getArea();
    }

    @Override
    public void setArea(int area) {
        super.setArea(area);
    }

    @Override
    public String getNumber() {
        return super.getNumber();
    }

    @Override
    public void setNumber(String number) {
        super.setNumber(number);
    }
    
    @Override
    public String toString() {
        return "IntPhoneNumber{" + "countryCode=" + countryCode + super.toString() + '}';
    }

    
    
}
