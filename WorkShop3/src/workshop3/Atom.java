/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop3;

import java.util.Scanner;

/**
 *
 * @author Minnn
 */
public class Atom {

    public int number;
    public String symbol;
    public String fullname;
    public double weight;

    public Atom() {
    }

    public void display() {
        if (number == 0) {
            System.out.println("");
        } else {
            System.out.format("%-2d %-3s %-10s %-2.3f", number, symbol, fullname, weight);
            System.out.println("");
        }
    }

    public boolean accept() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter atomic number: ");
            number = sc.nextInt();
            if (number <= 0) {
                throw new Exception();
            }
            sc.nextLine();
            System.out.print("Enter symbol: ");
            symbol = sc.nextLine();
            System.out.print("Enter fullname: ");
            fullname = sc.nextLine();
            System.out.print("Enter atomic weight: ");
            weight = sc.nextDouble();
            System.out.println("");
        } catch (Exception e) {
            System.out.println("");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 10;
//        number = sc.nextInt(); //Nếu muốn nhập vào số lượng Atom cho mảng từ đầu
        System.out.println("Atomic information:");
        System.out.println("==================");
        
        int n = 0;
        Atom[] atom = new Atom[number];
        atom[n] = new Atom();
        atom[n].accept();
        while (atom[n].number != 0) {
            n++;
            atom[n] = new Atom();
            atom[n].accept();
        }

        for (int i = 0; i < n; i++) {
            atom[i].display();
        }

    }
}
