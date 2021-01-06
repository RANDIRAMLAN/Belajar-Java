/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajar.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Acer
 */
public class ByteStream {
    public static void main(String[] args) throws IOException{
        FileInputStream fileInput = null;
        FileOutputStream fileOutput = null;
        
//        System.out.println(fileInput);
//        fileInput = new FileInputStream("input.txt");
//        System.out.println((char)fileInput.read());
//        fileInput.close(); // close filenya sebelum membuka file yang baru
//        ==================================================================
        
//        fileInput = new FileInputStream("input2.txt");
//        System.out.println((char)fileInput.read());
//        ==================================================================
        
//        // membuka file
        fileInput = new FileInputStream("input.txt");
        // membaca file
        int data = fileInput.read();
        while (data != -1){
            System.out.print((char)data);
            data = fileInput.read();
        }
        System.out.print("\n");
        // menutup file
        fileInput.close();
//        ==================================================================
        
//        // salah satu contoh skenario program pembukaan file
        try {
            // membuka file
            fileInput = new FileInputStream("input2.txt");
            fileOutput = new FileOutputStream("output.txt");
            // membaca file
            int buffer = fileInput.read();
            while(buffer != -1){
                // menulis file
                fileOutput.write(buffer);
                buffer = fileInput.read();
            }
            System.out.println("Data Berhasil Disalin");
        } finally {
            if(fileInput != null){
                fileInput.close();
            }
            if(fileInput != null){
                fileOutput.close();
            }
        }
//        ====================================================================
        
        // try with resource : sesuatu yang harus di close
        try(FileInputStream in = new FileInputStream("input.txt")){
            int data2 = in.read();
            while (data2 != -1){
            System.out.print((char)data2);
            data2 = in.read();
            }
        }
        
        System.out.print("\n");
        
    }
    
}
