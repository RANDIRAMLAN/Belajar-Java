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
public class BreakContinueReturn {
    public static void main(String[] args){
        int a= 0;
        while(true){
            a++;
            if (a == 10){
                break;          //Break untuk mengeluarkan dari looping
            }else if (a ==5){
                continue;       // keyword untuk memulai aksi dari awal
            }else if (a == 7){
                return;         // untuk menghenikan aksi 
            }
            System.out.println("Looping ke"+a);

        }
        //continue
        //Retur
    }
    
}
