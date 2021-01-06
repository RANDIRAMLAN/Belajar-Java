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
public class ClassLain {
    
     // jika menggunakan public dapat diakses oleh siapapun
    public static void methodPublic(){
        System.out.println("Public");
        methodPrivate();
    }
    
    //hanya dapat diakses oleh clas yang bersangkutan
    private static void methodPrivate(){
        System.out.println("Private");
    }
    
    // ini hanya dapat diakses oleh kelas dalam package yang sama
    static void methodDefault(){
        System.out.println("Default");
    }
    
    //ini hanya dapat diakses oleh kelas itu sendiri beserta turunannya (sub class)
    protected static void methodProtected(){
        System.out.println("Protected");
    }
}
