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
public class LatihanKalkulatorSwitchCase {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int x,y, hasil;
        String tombol;
        System.out.print("Masukkan Angka Pertama : ");
        x = userInput.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        y = userInput.nextInt();
        System.out.print("Operasi Aretmatika (+, -, *) : ");
        tombol = userInput.next();
        switch(tombol){
            case "+":
                hasil = x + y;
                System.out.println("Hasilnya = "+hasil);  
                break;
            case "-":
                hasil = x - y;
                System.out.println("Hasilnya = "+hasil);  
                break;
            case "*":
                hasil = x * y;
                System.out.println("Hasilnya = "+hasil);  
                break;
            default:
                System.out.println("Operasi Tidak Ditemukan..!");
        }
    }
    
}
