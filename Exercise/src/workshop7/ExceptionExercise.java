/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop7;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Minnn
 */
public class ExceptionExercise {
    Scanner sc = new Scanner(System.in);
    static void acceptString() throws ExceptionLineTooLong{
        String accept;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        accept = sc.nextLine();
        if (accept.length() > 80) {
            throw new ExceptionLineTooLong();
        }
        System.out.println("Entered String: " + accept);
    }
    
    public static void main(String[] args) {
        try {
            acceptString();
        } catch (ExceptionLineTooLong ex) {
        }
    }
}
