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
public class SwitchCase {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        String inputan = input.next();
        // biasanya digunakan untuk pemilihan menu 
        switch(inputan){
            case "Randi":
                System.out.println("Nama saya Randi");
                break;
            case "Ramlan":
                System.out.println("Nama saya Ramlan");
                break;
             default:
                 System.out.println("Dia Tidak Hadir");     
        }
        System.out.println("SELESAI...");
    }
    
}
