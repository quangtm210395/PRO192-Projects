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
public abstract class Database<T,P extends Printer<T>> {
    public void writeDB(T value){
        getPrinter().print(value);
    }
    public abstract P getPrinter();
}
