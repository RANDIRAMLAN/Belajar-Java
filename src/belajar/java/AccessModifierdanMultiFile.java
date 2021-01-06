/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajar.java;
import JGK.java.memasak;

/**
 *
 * @author Acer
 */
public class AccessModifierdanMultiFile {
    public static void main(String[] args) {
        // akses modifier (public, private, default dan protected)
        
        // dapat dipanggil walaupun method tersebut berada pada class yang lain
        ClassLain.methodPublic();
        
        // dapat di panggil walaupun dalam kelas yang lain karna berada pada package yang sama
        ClassLain.methodDefault();
        
        // masih dapat dipangil walaupun berada pada kelas yang lain
        ClassLain.methodProtected();
        
        // memanggil dari kelas dengan package yang beda
        memasak.memasakDangin();
    }
}
