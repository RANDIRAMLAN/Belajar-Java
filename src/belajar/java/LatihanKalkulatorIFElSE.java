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
public class LatihanKalkulatorIFElSE {
    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        int x,y, hasil;
        char tombol;
        System.out.print("Masukkan Angka Pertama : ");
        x = userInput.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        y = userInput.nextInt();
        System.out.print("Operasi Aretmatika (+, -, *) : ");
        tombol = userInput.next().charAt(0);
        if( tombol == '+'){
        hasil = x + y;
            System.out.println("Hasilnya = "+hasil);
        }else if (tombol == '-'){
            hasil = x - y;
            System.out.println("Hasilnya = "+hasil);
        }else if (tombol == '*'){
            hasil = x * y;
            System.out.println("Hasilnya = "+hasil);
        }
        
    }
    
}
