/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajar.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Acer
 */
public class CharacterStream {
    public static void main(String[] args)throws IOException{
        //membuka file
        // byte stream -> menggunakan FileInputStream
        FileInputStream inputByteFile = new FileInputStream("input.txt");
        FileOutputStream outputByteFile = new FileOutputStream("outputbyte.txt");
        // character Stream - > FileReader
        FileReader inputCharFile = new FileReader("input.txt");
        FileWriter outputCharFile = new FileWriter("outputchar.txt");
        
        //membaca file
        // ==== membaca file untuk byte file ===
        int buffer = inputByteFile.read();
        while(buffer != -1){
            System.out.print((char)buffer);
            outputByteFile.write(buffer);
            buffer = inputByteFile.read();
            
        }
        System.out.print("\n");
        
        // === membaca file untuk char file ===
        buffer = inputCharFile.read();
        while(buffer != -1){
            System.out.print((char)buffer);
            outputCharFile.write(buffer);
            buffer = inputCharFile.read();
        }
        System.out.print("\n");
        
        //menutup file
        inputByteFile.close();
        inputCharFile.close();
    }
}
