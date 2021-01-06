/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajar.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Acer
 */
public class ScannerStringTokenizer {
    public static void main(String[] args)throws IOException{
        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferdReader = new BufferedReader(fileInput);
        Scanner scanner = new Scanner(bufferdReader);
        
        // cek ada kata selanjutnya atau tidak
        System.out.println("=== Delimiter Spasi ===");
        //untuk membaca kata dengan pemisah atau delimet
            String kata1 = scanner.next();
            System.out.println(kata1);
            
        // menggunakan delimiter tertentu
        FileReader fileInput2 = new FileReader("input2.txt");
        bufferdReader = new BufferedReader(fileInput2);
        bufferdReader.mark(200);       
        System.out.println("=== Delimiter Tertentu ===");
        scanner = new Scanner(bufferdReader);
        scanner.useDelimiter(";");
        while(scanner.hasNextLine()){
           while(scanner.hasNext()){
            System.out.print(scanner.next()+" ");
           }
        }
        System.out.println("");
        // menggunakan string tokenizer
        System.out.println("=== Tokenizer ===");
        bufferdReader.reset();
        String data = bufferdReader.readLine();
        System.out.println(data);
        
        StringTokenizer stringToken = new StringTokenizer(data,";");
        String a = stringToken.nextToken();
        System.out.println(a);
        
        
        
    }
}
