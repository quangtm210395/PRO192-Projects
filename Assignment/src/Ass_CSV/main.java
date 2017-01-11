/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ass_CSV;

import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Minnn
 */
public class main {

    static BufferedReader br = null;
    static ArrayList<String> list = new ArrayList<>();
    static ArrayList<String[]> listArray = new ArrayList<>();
    static Map<String, Double> mapValues = new TreeMap();
    static Set<String> setCtry = new TreeSet();
    static Set<String> setYear = new TreeSet();
    static Scanner sc = new Scanner(System.in);
    static double max;

    static {
        String[] S;
        try {
            File f = new File("UNdata_Export_20160419_033545375.csv");
            String s;
            br = new BufferedReader(new FileReader(f));
            br.readLine();

            // add all information to List 
            while ((s = br.readLine()) != null) {
                s = s.trim();
                list.add(s);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // add all information to List of String[]
//        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            S = list.get(i).split("\"");
            listArray.add(S);
        }
        // add all countries to Set
        for (int i = 0; i < listArray.size(); i++) {
            setCtry.add(listArray.get(i)[3]);
        }
        // add all years to Set
        for (int i = 0; i < listArray.size(); i++) {
            setYear.add(listArray.get(i)[5]);
        }
        // add Countries and it's Total value to Map
        for (int i = 0; i < listArray.size(); i++) {
            mapValues.put(listArray.get(i)[3], 0.0);
        }
        for (Map.Entry<String, Double> entry : mapValues.entrySet()) {
            for (int i = 0; i < listArray.size(); i++) {
                if (entry.getKey().equals(listArray.get(i)[3])) {
                    mapValues.put(entry.getKey(), entry.getValue() + Double.parseDouble(listArray.get(i)[11]));
                }
            }
        }

        // find Highest Value
        for (Map.Entry<String, Double> entry : mapValues.entrySet()) {
            max = Math.max(max, entry.getValue());
        }

    }

    public static void main(String[] args) {

        Integer choose;
        do {
            System.out.println("");
            System.out.println("MENU:");
            System.out.println("\t1. Reading file");
            System.out.println("\t2. Report");
            System.out.println("\t3. Highest Value");
            System.out.println("\t0. Exit!");
            System.out.print("Choose: ");
            choose = sc.nextLine().charAt(0) - '0';
            if (choose < 0 || choose > 3) {
                System.out.println("Please enter a number between 0 and 3 !!!");
            }
            switch (choose) {
                case 0:
                    break;
                case 1:
                    Menu1();
                    break;
                case 2:
                    Menu2();
                    break;
                case 3:
                    Menu3();
                    break;
            }
        } while (choose != 0);

    }

    private static void Menu2() {
        Integer c;
        do {
            System.out.println("");
            System.out.println("Filter by: ");
            System.out.println("\t1. Country");
            System.out.println("\t2. Year");
            System.out.println("\t3. Both");
            System.out.print("Choose: ");
            c = sc.nextLine().charAt(0) - '0';
            if (c < 1 || c > 3) {
                System.out.println("Enter a nunber <1-3> !");
            }
            switch (c) {
                case 1:
                    System.out.println("\tList of country: ");
                    int index = 1;
                    for (String str : setCtry) {
                        System.out.print(index++ + ". ");
                        System.out.println(str);
                    }
                    System.out.print("\tEnter country: ");
                    String ctry = sc.nextLine();
                    Boolean ch = false;
                    for (String str : setCtry) {
                        if (ctry.equalsIgnoreCase(str)) {
                            System.out.println("\t<Enter \"all\" to display all information of country> ");
                            System.out.println("\t<Enter \"total\" to display total value of country>");
                            System.out.print("\tYour choice: ");
                            String s1 = sc.nextLine();
                            if (s1.equalsIgnoreCase("all")) {
                                for (int i = 0; i < listArray.size(); i++) {
                                    if (listArray.get(i)[3].equalsIgnoreCase(str)) {
                                        ch = true;
                                        System.out.println(list.get(i));
                                    }
                                }
                            } else if (s1.equalsIgnoreCase("total")) {
                                for (Map.Entry<String, Double> entry : mapValues.entrySet()) {
                                    if (str.equalsIgnoreCase(entry.getKey())) {
                                        ch = true;
                                        System.out.println("[" + entry.getKey() + "] [" + entry.getValue() + "]");
                                    }
                                }
                            }
                            break;
                        }
                    }
                    if (ch == false) {
                        System.out.println("No information!");
                    }
                    break;
                case 2:
                    System.out.print("\tEnter a year between 1948 and 2009: ");
                    String year = sc.nextLine();
                    Boolean ch1 = false;
                    for (String string : setYear) {
                        if (year.equalsIgnoreCase(string)) {
                            for (int i = 0; i < list.size(); i++) {
                                if (listArray.get(i)[5].equalsIgnoreCase(year)) {
                                    ch1 = true;
                                    System.out.println(list.get(i));
                                }
                            }
                        }
                    }
                    if (ch1 == false) {
                        System.out.println("No information!");
                    }
                    break;
                case 3:
                    System.out.print("\tEnter a country:  ");
                    String country = sc.nextLine();
                    Boolean c1 = false;
                    for (String string : setCtry) {
                        if (country.equalsIgnoreCase(string)) {
                            System.out.print("\tEnter a year between 1948 and 2009: ");
                            String y = sc.nextLine();
                            for (int i = 0; i < listArray.size(); i++) {
                                if (listArray.get(i)[3].equalsIgnoreCase(country)
                                        && listArray.get(i)[5].equalsIgnoreCase(y)) {
                                    c1 = true;
                                    System.out.println(list.get(i));
                                }
                            }
                        }
                    }
                    if (c1 == false) {
                        System.out.println("No information!");
                    }
                    break;
            }
        } while (c != 1 && c != 2 && c != 3);
    }

    private static void Menu1() {
        Integer page;
        do {
            System.out.print("\tEnter page number <1-609>: ");
            try {
                page = Integer.parseInt(sc.nextLine());
                if (page <= 609 && page >= 1) {
                    int pageMax = (page == 609) ? page * 10 - 1 : page * 10;
                    for (int i = (page-1) * 10; i < pageMax; i++) {
                        System.out.println(list.get(i));
                    }
                } else {
                    System.out.println("\tPlease enter a number <1-609>!");
                    page = 0;
                }
            } catch (NumberFormatException e) {
                System.out.println("\tPlease enter a Number!");
                page = 0;
            }

        } while (page == 0);
    }

    private static void Menu3() {
        System.out.println("The highest value are:");
        for (Map.Entry<String, Double> entry : mapValues.entrySet()) {
            if (max == entry.getValue()) {
                System.out.println("[" + entry.getKey() + "] [" + entry.getValue() + "]");
            }
        }
    }

}
