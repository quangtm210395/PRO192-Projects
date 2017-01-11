/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuilderdemo;

/**
 *
 * @author luyenchu
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello HaNoi");
        sb.append(",").append(" I'm comming!");
        //
        //String s = "Hello HaNoi";s+=", I'm comming!";
        System.out.println(sb);
        System.out.println(sb.reverse());
        
        sb = new StringBuilder("Jet'mai beaucoup");
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.append(", ").append(1000).append(" times");
        System.out.println(sb);
        String operatorPlsString = "Jet'mai beaucoup,"
                + " 1000 timesJet'mai beaucoup, "
                + "1000 timesJ"
                + "et'mai beaucoup, "
                + "1000 timesJet'mai beaucoup, "
                + "1000 timesJet'mai beaucoup, "
                + "1000 timesJet'mai beaucoup, 1000 timesJet'mai beaucoup, "
                + "1000 timesJet'mai beaucoup, 1000 times";
        
        //string buffer is the same but synchorized
        StringBuffer sbuf = new StringBuffer("Hello");
        sbuf.reverse();
        System.out.println(sbuf);
        //sbuf.append(sb)
    }
}
