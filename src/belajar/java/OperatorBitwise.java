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
public class OperatorBitwise {
    public static void main(String[] args){
        // operator bitwise = operator untuk nilai bit
        byte a = 24 ;
        byte b,c;
        String a_bits;
        a_bits = String.format("%8s",Integer.toBinaryString(a));
        System.out.println(a_bits+" = "+a);
        //operator SHIFT LEFT
        b = (byte)(a << 1);
        a_bits = String.format("%8s",Integer.toBinaryString(b));
        System.out.println(a_bits+" = "+b);
        // operator SHIFT RIGHT
        c = (byte)(a >> 1);
        a_bits = String.format("%8s",Integer.toBinaryString(c));
        System.out.println(a_bits+" = "+c);
        // OR , AND , XOR dapat di bitwase (| , & , ^ )
    }
    
}
