/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajar.java;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class TernaryOperator {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int input;
        System.out.print("Masukkan Nilai : ");
        input = userInput.nextInt();
        // ternari operator
        // variable = ekspresi ? statment true : statement false
       float x = (input == 10) ? input*input : (float)input/2; 
        System.out.println("Nilainya adalah = "+x);
    }
    
}
