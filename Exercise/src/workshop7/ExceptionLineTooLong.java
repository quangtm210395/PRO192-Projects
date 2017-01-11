/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop7;

/**
 *
 * @author Minnn
 */
public class ExceptionLineTooLong extends Exception {
    public ExceptionLineTooLong(){
        System.out.println("The String is too long!");
    }
}
