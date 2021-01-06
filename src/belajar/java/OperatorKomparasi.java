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
public class OperatorKomparasi {
    public static void main (String[] args){
        // operator komparasi menghasilkan nilai dalam bentuk boolean
        int a,b;
        a = 10;
        b = 10;
        System.out.printf("%d apakah = %d ? %s \n", a, b, (a == b));
        System.out.printf("%d apakah != %d ? %s \n", a, b, (a != b));
        System.out.printf("%d apakah < %d ? %s \n", a, b, (a < b));
        System.out.printf("%d apakah > %d ? %s \n", a, b, (a > b));
        System.out.printf("%d apakah <= %d ? %s \n", a, b, (a <= b));
    }
    
}
