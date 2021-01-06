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
public class UserInpt {
    public static void main(String[] args){
        Scanner UserInput = new Scanner(System.in);
        // Perhitungan luas
        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.print("Masukkan Lebar = ");
        int lebar = UserInput.nextInt();
        System.out.print("Masukkan Lebar = ");
        int panjang = UserInput.nextInt();
        int luas;
        luas = lebar * panjang;
        System.out.println("Luasnya adalah = "+luas);
    }
    
}
