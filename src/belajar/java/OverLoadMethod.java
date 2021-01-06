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
public class OverLoadMethod {
    public static void main(String[] args){
        cetakAngka(10);
        cetakAngka(8.5f);
        cetakAngka(9.3d);
        cetakAngka("Randi Ramlan");
    }
    public static void cetakAngka(float  angka){
        System.out.println("Ini Angka Float "+angka);
    }
    public static void cetakAngka(double angka){
        System.out.println("Ini Angka Double "+angka);
    }
    public static void cetakAngka(int angka){
        System.out.println("Ini Angka Intiger "+angka);
    }
    public static void cetakAngka(String kalimat){
        System.out.println("Ini Angka String "+ kalimat);
    }
}
