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
public class ExceptionPadaMethod {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        Scanner userInput = new Scanner(System.in);
        System.out.print("Data ke : ");
        int index = userInput.nextInt();
        // Exception Biasa
        System.out.println("Exception Biasa");
        try {
            System.out.printf("Data array ke %d adalah %d \n", index, a[index]);
        } catch (Exception e) {
            System.err.println("Data Index Tidak Ditemukan. "+e);
        }
        
        // exception dalam method
        System.out.println("exception dalam method");
        int data = ambilDataArray(a, index);
        System.out.printf("Data array ke %d adalah %d \n", index, data);
        
        //Exception Throws by method  
        System.out.println("Exception Throws by method  ");
        try {
            int data2 = ambilDataArray2(a, index);
            System.out.printf("Data array ke %d adalah %d \n", index, data2);
        } catch (Exception e) {
            System.err.println("Data Tidak Ditemukan"+ e);
        }
        
        System.out.print("\n");
        System.out.println("Program Selesai");
    }
    
    private static int ambilDataArray2(int[] array, int indexke) throws Exception{
        int hasil = array[indexke];
        return hasil;
    }
    
    public static int ambilDataArray(int[] array, int indexke){
        int hasil = 0;
        try {
           hasil = array[indexke];
        } catch (Exception e) {
            System.err.println("Data Index Tidak Ditemukan. "+e);
        }
        return hasil;
    }
}
