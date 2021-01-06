/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajar.java;

/**
 *
 * @author Acer
 */
public class KonversiTipeDataNumerik {
    public static void main(String[] args){
        //program untuk konversi data
        int nilaiint = 100;
        System.out.println("Nilai Integer = "+nilaiint);
        // memperluas luas rentang ke tipe data yang lebih besar
        long nilailong = nilaiint;
        System.out.println("Nilai Long = "+nilailong);
        //memperkecil rentang dengan tipe data yang lebih kecil akan menghilangkan nilai aslinya jika nilai awalnya lebih besar dari max nilai tipe data
        byte nilaibyte = (byte)nilaiint;
        System.out.println("Nilai Byte = "+nilaibyte);
        //casting pembagian
        int a = 10;
        int b = 3;
        float hasil = (float) a / b;
        System.out.println(a+" / "+b+" = "+hasil);
    }
    
}
