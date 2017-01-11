/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author Minnn
 */
public class PhraseOMatic {
    public static void main(String[] args) {
        
        String[] listOne = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        int rand = (int) (Math.random() * listOne.length);
        System.out.println(Math.random());
        
        System.out.println(listOne[rand]);
    }
}
