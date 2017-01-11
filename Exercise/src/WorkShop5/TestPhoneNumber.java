/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkShop5;

import java.util.Scanner;

/**
 *
 * @author Minnn
 */
public class TestPhoneNumber {
    public static void main(String[] args) {
        PhoneNumber phoneList[] = new PhoneNumber[100];
        int check;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list of phone numbers: ");
        do{
            System.out.println("Type of phone number? (1 - Local phone, 2 - Inter phone, 0 - Exit: ");
            check = sc.nextInt();
            if (check < 0 || check > 2) {
                System.out.println("Please enter a number between 0 and 2");
            }
            switch(check){
                case 1:
                    phoneList[n] = new PhoneNumber();
                    System.out.print("Enter area code: ");
                    phoneList[n].setArea(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Enter number: ");
                    phoneList[n].setNumber(sc.nextLine());
                    System.out.println("");
                    n++;
                    break;
                case 2:
                    IntPhoneNumber phoneData = new IntPhoneNumber();
                    System.out.print("Enter country code: ");
                    sc.nextLine();
                    phoneData.setCountryCode(sc.nextLine());
                    System.out.print("Enter area code: ");
                    phoneData.setArea(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Enter number: ");
                    phoneData.setNumber(sc.nextLine());
                    System.out.println("");
                    phoneList[n] = phoneData;
                    n++;
                    break;
                case 0:
                    break;
            }
        } while(check != 0);
        System.out.println("");
        System.out.println("List of PhoneNumber: ");
        for (int i = 0; i < n; i++) {
            phoneList[i].display();
        }
        
    }
}
