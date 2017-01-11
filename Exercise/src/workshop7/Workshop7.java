/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop7;

import java.util.*;

/**
 *
 * @author chuot
 */
public class Workshop7 {

    /**
     * @param args the command line arguments
     */
    static class RightTriangle {

        int a, b, c;

//Constructor
        public RightTriangle(int a, int b, int c)
                throws IllegalTriangleException, IllegalRightTriangleException {
            this.a = a;
            this.b = b;
            this.c = c;

            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new IllegalTriangleException();
            } else if (a * a != b * b + c * c && b * b != a * a + c * c && c * c != a * a + b * b) {
                throw new IllegalRightTriangleException();
            }
        }
    }

    public static void main(String[] args) {
        int a, b, c;
        Scanner nhap = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter a: ");
                a = Integer.parseInt(nhap.nextLine());
                System.out.print("Enter b: ");
                b = Integer.parseInt(nhap.nextLine());
                System.out.print("Enter c: ");
                c = Integer.parseInt(nhap.nextLine());
            
                //call constructor of RightTriangle class
                RightTriangle rt = new RightTriangle(a, b, c);
                System.out.println("This is a right triangle!");
            
            } catch (InputMismatchException e){
                System.out.println("Please input again!");
            } catch (IllegalTriangleException | IllegalRightTriangleException e1) {

            }
            //continue?
            System.out.print("Continue?(Y/N):");
            //Enter a character
            char chon = nhap.next().charAt(0);
            if (chon != 'Y' && chon != 'y') {
                break;
            }
        }

    }

}
