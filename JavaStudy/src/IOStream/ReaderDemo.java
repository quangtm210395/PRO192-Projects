/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luyenchu
 */
public class ReaderDemo {

    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        boolean notExit = true;
        List<String> strs = new ArrayList<>();
        while (notExit) {
            menu();
            try {
                int choice = option(br);
                switch (choice) {
                    case 0:
                        notExit = false;
                        break;
                    case 1:
                        strs.add(readLine("Enter STR: ", br));
                        break;
                    case 2:
                        display(strs);
                        break;
                    case 3:
                        String line = readLine("Search for:", br);
                        search(strs,line);
                        break;
                    default:
                        System.out.println("Must be a number!!!!");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Must be a number!");
            }

        }
    }

    private static String readLine(String message, BufferedReader br) throws IOException {
        System.out.print(message);
        return br.readLine();
    }

    private static void menu() {
        System.out.println("Choose function:");
        System.out.println("1. Enter String");
        System.out.println("2. Display all strings");
        System.out.println("3. Search for text");
        System.out.println("0. Exit");
    }

    private static int option(BufferedReader br) throws IOException {
        String line = readLine("Your choice: ", br);
        return Integer.parseInt(line);
    }

    private static void display(List<String> strs) {
        System.out.println("Your list:");
        for(String str: strs){
            System.out.println(str);
        }
    }

    private static void search(List<String> strs,String text) {
        System.out.println("FOUND:");
        for(String str: strs){
            if(str.toLowerCase().contains(text.toLowerCase())){
                System.out.println(str);
            }
        }
    }
}
