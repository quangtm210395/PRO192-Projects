/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums2;

/**
 *
 * @author luyenchu
 */
public enum Day {
    MONDAY(2), 
    TUESDAY(3), 
    WEDNESDAY(4), THURDAY(5), FRIDAY(6), SATURDAY(7), SUNDAY(8);
    private int number;
    Day(int num){
        this.number = num;
    }
    public int num(){
        return number;
    }
}
