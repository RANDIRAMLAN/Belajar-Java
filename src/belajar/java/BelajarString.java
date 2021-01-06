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
public class BelajarString {
    public static void main(String[] args) {
        String kata = "hallo Bandung";
        char[] katachar = {'h','a','l','l','o'};
        // mengakses komponen dari string
        System.out.println("Huruf Pertama dari String = "+kata.charAt(0));
        System.out.println("Huruf Pertama dari Array = "+ katachar[0]);
        System.out.print("\n");
        // merubah komponen string tidak bisa karna string dijava itu immutable
        //mengubah komponen secara tidak langsung
        cetakAlamat("kata", kata);
        System.out.println("\n");
        katachar[4] = 'i';
        System.out.println(Arrays.toString(katachar));
        kata = kata.substring(0,4)+"i "+kata.substring(6,13);
        System.out.println(kata);
        System.out.print("\n");
        
        cetakAlamat("kata", kata); // menyebabkan perubahan alamat/memori dari array tersebut -> membuat memori baru
        
        //kesimpulan
        //1. string dijava itu immutable
        //2. string yang ada pada string pool itu akan reuseable sehingga memori lebih efisien
        //3. membuat string dengan method baru maka akan di taru pada memeori lain
        
    }
    private static void cetakAlamat(String nama, String data){
        int alamat = System.identityHashCode(data);
        System.out.println(nama+" = "+data+ "\t || alamat = "+Integer.toHexString(alamat));
    }
    
}
