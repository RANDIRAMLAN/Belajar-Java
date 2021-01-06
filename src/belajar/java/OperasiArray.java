/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajar.java;

import java.util.Arrays;
/**
 *
 * @author Acer
 */
public class OperasiArray {
    public static void main(String[] args) {
        int[] arrayAngka1 = {1,2,3,4};
        int i;
        // mengubah array menjadi string
        System.out.println("=== Mengubha Array Menjadi String ===");
        cetakArray(arrayAngka1);
        
        // mengcopy array
        System.out.println("=== Mengcopy Array ===");
        int[] arrayAngka2 = new int[4];
        cetakArray(arrayAngka1);
        cetakArray(arrayAngka2);
        System.out.println("=== Mengcopy dengan Loop ===");
        for(i=0; i < arrayAngka1.length; i++){
            arrayAngka2[i] = arrayAngka1[i];
        }
        cetakArray(arrayAngka1);
        cetakArray(arrayAngka2);
        
        //mengcopy dengan copyOf
        System.out.println("=== Mengcopy dengan copyOf ===");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, 4);
        cetakArray(arrayAngka1);
        cetakArray(arrayAngka3);
        
        // mencopy array dengan copyOfRange
        System.out.println("=== Mengcopy dengan copyOfRange ===");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 2, 4);
        cetakArray(arrayAngka1);
        cetakArray(arrayAngka4);
        
        //fill array
        System.out.println("=== Fill Array ===");
        int[] arrayAngka5 = new int[10];
        Arrays.fill(arrayAngka5, 5);
        cetakArray(arrayAngka5);
        
        //komparsi Array
        int[] arrayAngka6 = {1,2,3,4,5};
        int[] arrayAngka7 = {1,2,3,4,5};
        System.out.println("=== Membandingkan 2 Array ===");
        if(Arrays.equals(arrayAngka6, arrayAngka7)){
            System.out.println("Array Sama");
        }else{
            System.out.println("Array Beda");
        }
        //Compare
        //mismatch
        int[] arrayAngka8 = {1,2,3,4,5,6,7,8,9};
        System.out.println("=== Sort Array ===");
        cetakArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        cetakArray(arrayAngka8);
        int angka = 3;
       //binarysearch
        int lokasi = Arrays.binarySearch(arrayAngka8, angka);
        System.out.println("=== Search Array ===");
        System.out.println(lokasi);
    }
    private static void cetakArray(int[] dataArry){
        System.out.println("Array : "+Arrays.toString(dataArry));
    }
}
