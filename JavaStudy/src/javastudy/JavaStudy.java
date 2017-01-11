/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastudy;

/**
 *
 * @author Minnn
 */
public class JavaStudy {

    /**
     * @param args the command line arguments
     */
    public static boolean check(int num){
        if (num < 2){
            return false;
        }
        int count = 0;
        for (int i = 1; i<= num; i++) {
            if(num % i == 0){
                count++;
            }
        }
        if (count == 2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Bonjour");
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (check(i) == true){
                count++;
            }
            System.out.println(i); 
        }
        System.out.println(count);
    }
}
