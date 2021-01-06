/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajar.java;

/**
 *
 * @author Acer
 */
public class ForLoop {
    public static void main(String[] args){
        int a,b;
        // kotak
        System.out.println("Persegi");
        for (a = 0; a < 10; a++){
            for(b = 0; b < 10; b++){
                System.out.print("*");
            }
            System.out.println("*");
        }
        
        // Segitiga siku siku
        System.out.println("Segitiga Siku Siku");
        int c,d;
        for (c = 0; c < 10; c++){
            for(d = 0; d < c; d++){
                System.out.print("*");
            }
            System.out.println("*");
        }
        
        // Segitiga siku siku terbalik
        System.out.println("Segitiga Siku Siku Terbalik");
        int e,f;
        for (e = 0; e <= 10; e++){
            for(f = e; f < 10; f++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
    
}
