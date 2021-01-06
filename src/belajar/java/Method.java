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
public class Method {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int x, y ;
        System.out.println("Masukkan Nilai X : ");
        x = userInput.nextInt();
        y = hitung(x);
        System.out.println("Hasilnya = "+y);
        
        
    }
    // method perhitungan
   private static int hitung(int input){
        int hasil;
        hasil = (input + 2) * input;
        return hasil;
    }
    
}
