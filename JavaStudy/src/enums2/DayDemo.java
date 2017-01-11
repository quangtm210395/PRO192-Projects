/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums2;

/**
 *
 * @author Minnn
 */
public class DayDemo {
    private Day day;
     
    public DayDemo(Day day){
        this.day = day;
    }
    public void giveMessage(){
        if (day.num() < 6) {
            System.out.println("Today is Monday!");
        }else if (day.num() == 6){
            System.out.println("Today is pre-Saturday");
        }else {
            System.out.println("Today is pre-Monday");
        }
    }
    public static void main(String[] args) {
        DayDemo dayDemo = new DayDemo(Day.FRIDAY);
        dayDemo.giveMessage();
    }
}
