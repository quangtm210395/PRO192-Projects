/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic.demo2;

import java.util.Date;

/**
 *
 * @author luyenchu
 */
public class ConsolePrinter implements Printer<String>{

    @Override
    public void print(String value) {
        System.out.println(new Date()+": " + value);
    }
    
}
