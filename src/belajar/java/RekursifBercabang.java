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
public class RekursifBercabang {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int x = userInput.nextInt();
        int nilaiFibonaccu = fibonacci(x, "Atas");
        System.out.println("Nilai Fibonacci ke-5 adalah "+ nilaiFibonaccu);
    }
    private static int fibonacci(int n, String daun){
        if ( n == 1 || n == 0){
            return n;
        }
        System.out.print("Daun "+daun);
        System.out.println(" Cetak Fibonacci ke = "+n);
        return fibonacci(n - 1, "kiri") + fibonacci(n - 2, "kanan");
    }
}
