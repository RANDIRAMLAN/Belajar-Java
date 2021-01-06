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
public class BuilderString {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("hallo");
        cetakData(builder);
        
        // append
        builder.append(" semuanya");
        cetakData(builder);
        
        // + appen
        builder.append(" warga Makassar");
        cetakData(builder);
        
        //insert
        builder.insert(21, "Kota ");
        cetakData(builder);
        
        //delete
        builder.delete(21, 26);
        cetakData(builder);
        
        //mengubah pada karakter tertentu
        builder.setCharAt(0,'c');
        cetakData(builder);
        
        //replace
        builder.replace(0, 5, "Assalamu Alaikum");
        cetakData(builder);
        
        //casting stringbuilder menjadi string
        String kalimat = builder.toString();
        System.out.println(kalimat);
    }
    
    public static void cetakData(StringBuilder dataBuilder){
        System.out.println("Data : "+dataBuilder);
        System.out.println("Kapasitas : "+dataBuilder.capacity() );
        System.out.println("Panjang : "+dataBuilder.length());
        
        int addressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("Adress : "+Integer.toString(addressBuilder));
        System.out.printf("\n");
    }
}
