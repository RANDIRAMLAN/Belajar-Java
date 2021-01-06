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
public class ArrayMultiDimensi {
    public static void main(String[] args) {
        // membuat array 2 dimensi
        int[][] array2D = {
            {1,2,3,5},
            {5,6,7,8}
        };
        cetakArray2D(array2D);
       
        // membuat deklarasi array 2 dimensi
        int [][] arrayAngka1 = new int [4][2]; // baris, kolom
        cetakArray2D(arrayAngka1);
        
        // looping manual
        int i,j;
        for(i=0; i<arrayAngka1.length; i++){
            for(j=0; j<arrayAngka1[i].length; j++){
                System.out.print(arrayAngka1[i][j]);
            }
            System.out.print("\n");
        }
    }
    
    private static void cetakArray2D(int[][] dataArray){
        int i,j;
        for(i=0; i<dataArray.length; i++){
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }
}
