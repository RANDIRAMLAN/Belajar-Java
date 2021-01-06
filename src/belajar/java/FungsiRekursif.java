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
public class FungsiRekursif {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        int nilai = userInput.nextInt();
        cetakNilai(nilai);
        int jumlah = jumlahNilai(nilai);
        System.out.println("Totalnya = "+jumlah);
        int hasilKali = faktorial(nilai);
        System.out.println("Faktorial = "+hasilKali);
    }
    private static int faktorial(int params){
        System.out.println("Params = "+params );
        if (params == 1){
            return params;
        }
        return params * faktorial(params - 1);
    }
    private static int jumlahNilai(int params){
        System.out.println("Params = "+params );
        if (params == 0){
            return params;
        }
        return params + jumlahNilai(params - 1);
    }
    private static void cetakNilai(int params){
        System.out.println("Nilainya "+ params);
        if ( params == 0){
            return ;
        }
        params--;
        cetakNilai(params);
    }
}
