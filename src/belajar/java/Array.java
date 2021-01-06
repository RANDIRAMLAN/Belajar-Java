/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajar.java;
import java.util.Arrays;

/**
 *
 * @author Acer
 */
public class Array {
    public static void main(String[] args){
        int i;
        int [] a = {1,33,4};
        // menampilkan array
        System.out.println(Arrays.toString(a));
        
        // menampilkan menggunakan looping
        for (i = 0; i < a.length; i++) {
            System.out.println("Tampil "+ a[i]);
        }
    }
    
}
