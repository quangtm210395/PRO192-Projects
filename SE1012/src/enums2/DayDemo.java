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
public class DayDemo {
    private Day day;

    public DayDemo(Day day) {
        this.day = day;
    }
    public void giveMessage(){
        if(day.num() < 6){
            System.out.println("Today is monday!");
        }else if (day.num() == 6){
            System.out.println("Today is pre-satturday");
        }else{
            System.out.println("Today is pre-monday");
        }
    }
    public static void main(String[] args) {
        DayDemo dayDemo = new DayDemo(Day.THURDAY);
        dayDemo.giveMessage();
    }
}
