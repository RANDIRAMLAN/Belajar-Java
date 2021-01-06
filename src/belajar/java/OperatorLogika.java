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
public class OperatorLogika {
    public static void main(String[] args){
        boolean a,b,c,d;
        // operasi untuk tipe data boolean
        a = true;
        b = false;
        // and akan true jika semua nilainya true
        c = ( a && b);
        System.out.println(a+" && "+b+" = "+c);
        // or akan true jika salah satu nilainya 
        c = ( a || b);
        System.out.println(a+" || "+b+" = "+c);
        // xor akan tue jika memiliki nilai yang berbeda
        c = ( a ^ b);
        System.out.println(a+" ^ "+b+" = "+c);
        // NOT
        d = !a;
        System.out.println("Dipentung jadi "+d);
    }
    
}
