/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajar.java;

import java.util.Scanner;
import java.lang.String;
/**
 *
 * @author Acer
 */
public class OperasiString {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String kalimat = "Saya suka makan pisang";
        String capital = "SAYA SUKA MAKAN PISANG";
        // mengambil komponen string
        System.out.println(kalimat.charAt(0));
        
        // substring
        String kata = kalimat.substring(10, 15);
        System.out.println(kata);
        
        // menggabungkan 2 string (concat)
        String kalimat2 = kata+ " Nanas";
        System.out.println(kalimat2);
        
        // concat dengan non string / casting
        int jumlah = 10;
        String kalimat3 = kalimat2+" "+jumlah;
        System.out.println(kalimat3);
        
        //lowercase dan uppercase string
        System.out.println(kalimat.toUpperCase());
        System.out.println(capital.toLowerCase());
        
        //replace
        String kalimat4 = kalimat.replace("pisang", "nanas");
        System.out.println(kalimat4);
        
        // persamaan string (equality)
        String kataTest = "text";
        System.out.print("Kata Test : "+kataTest+"\n");
        System.out.print("Masukkan Kata Input : ");
        String katainput = userInput.next();
        katainput = katainput.toLowerCase();
        if (kataTest.equals(katainput)){
            System.out.println("Sama");
        }else{
            System.out.println("Tidak Sama");
        }
        
        // komparasi
        String motor1 = "supra x";
        String motro2 = "supra x";
        System.out.println(motor1.compareTo(motro2));
        
        
    }
    
}