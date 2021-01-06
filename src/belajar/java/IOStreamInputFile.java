/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajar.java;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Acer
 */
public class IOStreamInputFile {
    public static void main(String[] args)throws IOException{
//        try {
//            FileInputStream fileInput = new FileInputStream("input.txt");
//        } catch (Exception e) {
//        }
        
        FileInputStream fileInput = new FileInputStream("input.txt");
        char a = (char)fileInput.read();
        char b = (char)fileInput.read();

        System.out.print(a);
        System.out.printf(b+"\n");
    }
}
