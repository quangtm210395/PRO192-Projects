/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberAndString;

import java.text.DecimalFormat;

/**
 *
 * @author Minnn
 */
public class FormatDemo {
    static void formatUsingPrintf(){
        System.out.printf("Hello %s, %d\n", "Hung", 20);
    }
    static void decimalFormatDemo(){
        DecimalFormat df = new DecimalFormat("###,###.##");
        String format = df.format(Long.MAX_VALUE);
        System.out.println("Max Long: " + format);
    }
    public static void main(String[] args) {
        formatUsingPrintf();
        decimalFormatDemo();
    }
}
