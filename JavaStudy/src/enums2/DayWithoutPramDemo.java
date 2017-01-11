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
public class DayWithoutPramDemo {
    public static void main(String[] args) {
        DayWithoutPram day = DayWithoutPram.MONDAY;
        switch(day){
            case MONDAY:
                System.out.println("Today is Monday!");
                break;
            case TUESDAY:
                System.out.println("Today is TuesDay!");
                break;
        }
    }
}
