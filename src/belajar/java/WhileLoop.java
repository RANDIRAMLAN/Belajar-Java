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
public class WhileLoop {
    public static void main(String[] args){
        int a = 0;
        while (a < 10){
            if (a % 2 == 0){
                System.out.println("Bilangan Genap");
            }else{
                System.out.println("Bilangan Ganjil");
            }
            a++;
        }
    }
    
}
