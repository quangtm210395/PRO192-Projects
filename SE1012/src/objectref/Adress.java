/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectref;

/**
 *
 * @author luyenchu
 */
public class Adress {
    private String num;
    private String street;
    private String city;

    public Adress() {
    }

    public Adress(String num, String street, String city) {
        this.num = num;
        this.street = street;
        this.city = city;
    }
    
    
    @Override
    public String toString() {
        return "Adress{" + "num=" + num + ", street=" + street + ", city=" + city + '}';
    }
    
    
}
