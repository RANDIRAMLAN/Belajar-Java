/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajar.java;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class TryCatchException {
    public static void main(String[] args) {
        int[] a = {1,3,6,2};
        Scanner userInput = new Scanner(System.in);
        FileInputStream fileInput =  null;
        
        System.out.print("Masukkan Index : ");
        int index = userInput.nextInt();
        
        // exception handling try catch and finanlly
        try {
            System.out.printf("Index ke %d adalah %d \n", index, a[index]);
        } catch (Exception e) {
            System.err.println("Index Tidak Ditemukan. "+ e);
        }
        
        // runtime error jika file tidak ada  
        try {
            fileInput = new FileInputStream("input.txt");
        } catch (Exception e) {
            System.err.println("File Tidak Ditemukan. "+ e);
        }
        
        // finally
         try {
            fileInput = new FileInputStream("input.txt");
        } catch (Exception e) {
            System.err.println("File Tidak Ditemukan. "+ e);
        } finally{
             System.out.println("Finaly");
         }
        
        System.out.println("Program Selesai");
    }
}
