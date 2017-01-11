/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic.demo2;

/**
 *
 * @author luyenchu
 */
public class StringDatabase extends Database<String, ConsolePrinter>{

    @Override
    public ConsolePrinter getPrinter() {
        return new ConsolePrinter();
    }
    
}
