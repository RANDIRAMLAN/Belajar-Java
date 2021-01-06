/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajar.java;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Arrays;

/**
 *
 * @author Acer
 */
public class BufferedCharStream {
    public static void main(String[] args)throws IOException{
        
        // membaca file
        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);
        bufferedReader.mark(200);
        // == membaca kedalam string
        String data = bufferedReader.readLine();
        System.out.println(data);
        
        // == membaca kedalam char dari string
        bufferedReader.reset();
        char[] datachar = new char[25];
        bufferedReader.read(datachar, 0,25);
        System.out.println(Arrays.toString(datachar));
        
        // == membaca baris
        bufferedReader.reset();
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        
        // menulis file
        FileWriter fileOutput = new FileWriter("output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileOutput);
        
        bufferedReader.reset();
        String baris1 = bufferedReader.readLine();
        bufferedWriter.write(baris1, 0,baris1.length());
        bufferedWriter.flush();
        
        // menambah new line
        bufferedWriter.newLine();
        String baris2 = bufferedReader.readLine();
        bufferedWriter.write(baris2, 0,baris2.length());
        bufferedWriter.flush();
        
        fileInput.close();
        bufferedReader.close();
        fileOutput.close();
        bufferedWriter.close();
    }
}
 