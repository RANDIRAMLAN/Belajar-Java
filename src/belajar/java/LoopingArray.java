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
public class LoopingArray {
    public static void main(String[] args){
        int[] a = {22,33,44,55};
        int i;
        // looping dengan for
        for (i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
        // looping menggunakan foreach
        for(int b : a){
            System.out.println(b);
        }
        
        int [] b = {1,2,3};
        int [] c = new int [3];
        b = c ; // dengan membuat b = c maka array tersebut akan memiliki memori yang sama karna merupakan kerakteristik array
    }
    
}
