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
public class IFELSEStatement {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        System.out.print("Masukkan Nilai A = ");
        int a = Input.nextInt();
        System.out.print("Masukkan Nilai B = ");
        int b = Input.nextInt();
        if (a == b){
            System.out.println("Nila A dan B Sama");
        }else{
            System.out.println("Nilai A dan B Berbeda");
        }
    }
}
