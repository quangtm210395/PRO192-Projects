/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangleExercise;

import java.util.*;

/**
 *
 * @author Minnn
 */
public class main {

    static double calIntersection(Rectangle rec1, Rectangle rec2) {
        double x1L, x1R, y1T, y1B, x2R, x2L, y2T, y2B;
        x1L = rec1.getX();
        x1R = rec1.getX() + rec1.getW();
        x2L = rec2.getX();
        x2R = rec2.getX() + rec2.getW();
        y1T = rec1.getY();
        y1B = rec1.getY() - rec1.getH();
        y2T = rec2.getY();
        y2B = rec2.getY() - rec2.getH();
        double H, W;
        H = Math.min(y2T, y1T) - Math.max(y1B, y2B);
        W = Math.min(x1R, x2R) - Math.max(x1L, x2L);

        return Math.max(0, H) * Math.max(0, W);
    }

    public static void main(String[] args) {
        ArrayList<Rectangle> list = new ArrayList<>();
//        list.add(new Rectangle(1, 1, 3, 3));
//        list.add(new Rectangle(2, 0, 1, 1));
//        list.add(new Rectangle(1, 1, 5, 5));
//        list.add(new Rectangle(5, 2, 2, 2));

        Scanner sc = new Scanner(System.in);
        int check;
        do {
            System.out.println("Choose: <1-2>! Press 0 to exit!");
            check = sc.nextInt();
            if (check < 0 || check > 2) {
                System.out.println("Please enter a number between 1 and 2 !!!");
            }
            switch (check) {
                case 0:
                    break;
                case 1:
                    double x, y, h, w;
                    System.out.println("Input a Rectangle!");
                    System.out.print("Enter x: ");
                    x = sc.nextDouble();
                    System.out.print("Enter y: ");
                    y = sc.nextDouble();
                    System.out.print("Enter h: ");
                    h = sc.nextDouble();
                    System.out.print("Enter w: ");
                    w = sc.nextDouble();
                    list.add(new Rectangle(x, y, h, w));
                    System.out.println("");
                    break;
                case 2:
                    for (int i = 0; i < list.size() - 1; i++) {
                        for (int j = i + 1; j < list.size(); j++) {
                            if (calIntersection(list.get(i), list.get(j)) > 0) {
                                System.out.println("Intersection area of " + list.get(i).toString()
                                        + " and " + list.get(i).toString() + " : " + calIntersection(list.get(i), list.get(j)));
                            } else {
                                System.out.println(list.get(i).toString() + " and " + list.get(j).toString() + " are not intersect!");
                            }
                        }
                    }
                    System.out.println("");
                    check = 0;
                    break;
            }
        } while (check != 0); 
    }
}
