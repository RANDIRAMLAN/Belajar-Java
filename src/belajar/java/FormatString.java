/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajar.java;
import java.util.Formatter;
/**
 *
 * @author Acer
 */
public class FormatString {
    public static void main(String[] args) {
        String nama = "Randi";
        int umur = 29;
        // format string
        System.out.println("Format String");
        System.out.printf("Nama saya %s, umur saya %d \n", nama, umur);
        // konversion : f=float, d=integer, c=character, s=String, b= boolean
        // struktur format = %[argument_index][flags][width][.precisions]konvertion
        
        // =================================================
        //[argument_index] : ($..) randi, wahai randi, darimana randi
        System.out.println("Argument Index");
        System.out.printf("%1$s, wahai %1$s, darimana %1$s \n", nama);
        
        // [flags] : +
        System.out.println("Flags");
        int a = 5;
        int b = 8;
        int hasil = a + b;
        System.out.printf("%d + %d = %+d \n", a,b,hasil);
        
        //[width]
        System.out.println("Integer");
        int c = 1000;
        System.out.printf("%d \n", c);
        System.out.printf("%7d \n", c); // ke kanan
        System.out.printf("%-7d \n", c);  // ke kiri
        System.out.printf("%07d \n", c); // menambahkan leading di depan 00
        System.out.printf("%+07d \n", c); // menambah +  dan leading di depan
        System.out.printf("%,7d \n", c); // menambah delimiter (,)pemisah tiap seribu
        System.out.println("Float Point");
        float float1 = 1.543f;
        System.out.printf("%f \n", float1); // akan mengambil 6 desimal
        
        // [.percision] = angka di belakang koma\
        float float2 = 1.267f;
        System.out.println("Percision");
        System.out.printf("%f \n", float2);
        System.out.printf("%.1f \n", float2); // membulankan angka dibelakang koma
        System.out.printf("%07.1f \n", float2);
        
        // kesimpulan
        // 1. format dapat disimpanke dalam variable string
        String d = String.format("nama : %s, IPK : %.2f ", nama, float2);
        System.out.println(d);
        // 2. simpan format kedalam string builder
        StringBuilder builder = new StringBuilder();
        Formatter formatBuilder = new Formatter(builder);
        formatBuilder.format("nama : %s, IPK : %.2f ", nama, float2);
        System.out.println(builder); 
   }
    
}
