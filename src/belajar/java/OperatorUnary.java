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
public class OperatorUnary {
    public static void main(String[] args){
        int a = 1;
        System.out.println("Unary(-) "+a+" Menjadi "+-a);
        
        //increment ++
        int b = 0;
        b++;
        System.out.println("Nilai ++ B = "+b);
        
        //dincrement ++
        int c = 4;
        c--;
        System.out.println("Nilai ++ C = "+c);
        
        // pada increment dan discrement ada yang dinamakan prefix dan postfix
        int d = 1;
        // prefix dapat digunakan didalam
        System.out.printf("Nilai ++ D menggunakan prefix = %d \n", ++d);
        int e = 1;
        // postfix sebaiknya digunakan diluar
        System.out.println("Nilai ++ E menggunakan prefix "+ e++);
        System.out.println("Nilai ++ E menggunakan prefix "+ e);
        
        // unary boolean dengan ! negasi
        boolean f = true;
        System.out.println("Nilai F = "+f);
        System.out.println("Nilai F = "+!f);
    }
    
}
