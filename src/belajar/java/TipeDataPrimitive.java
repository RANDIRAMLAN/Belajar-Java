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
public class TipeDataPrimitive {
    public static void main(String[] args){
        //integer (satuan)
        int a = 10;
        System.out.println("Nilai Integer");
        System.out.println("Nilai a = "+a);
        System.out.println("Nilai Max = "+Integer.MAX_VALUE);
        System.out.println("Nilai Min = "+Integer.MIN_VALUE);
        System.out.println("Besar Integer "+Integer.BYTES+" bytes");
        System.out.println("Besar Integer "+Integer.SIZE+" bit");
        
        // byte (satuan)
         byte b = 126;
        System.out.println("Nilai byte");
        System.out.println("Nilai a = "+b);
        System.out.println("Nilai Max = "+Byte.MAX_VALUE);
        System.out.println("Nilai Min = "+Byte.MIN_VALUE);
        System.out.println("Besar byte "+Byte.BYTES+" bytes");
        System.out.println("Besar byte "+Byte.SIZE+" bit");
        
        //short (satuan)
        short c = 10;
        System.out.println("Nilai short");
        System.out.println("Nilai a = "+c);
        System.out.println("Nilai Max = "+Short.MAX_VALUE);
        System.out.println("Nilai Min"+Short.MIN_VALUE);
        System.out.println("Besar short "+Short.BYTES+" bytes");
        System.out.println("Besar short "+Short.SIZE+" bit");
        
        // long (satuan)
        long d = 10l;
        System.out.println("Nilai long");
        System.out.println("Nilai a = "+d);
        System.out.println("Nilai Max = "+Long.MAX_VALUE);
        System.out.println("Nilai Min"+Long.MIN_VALUE);
        System.out.println("Besar Long "+Long.BYTES+" bytes");
        System.out.println("Besar long "+Long.SIZE+" bit");
        
        // double (koma, bilangan real)
        double e = 10d;
        System.out.println("Nilai double");
        System.out.println("Nilai a = "+e);
        System.out.println("Nilai Max = "+Double.MAX_VALUE);
        System.out.println("Nilai Min"+Double.MIN_VALUE);
        System.out.println("Besar double "+Double.BYTES+" bytes");
        System.out.println("Besar double "+Double.SIZE+" bit");
        
        // float (koma, bilangan real)
        float f = 10f;
        System.out.println("Nilai float");
        System.out.println("Nilai a = "+f);
        System.out.println("Nilai Max = "+Float.MAX_VALUE);
        System.out.println("Nilai Min"+Float.MIN_VALUE);
        System.out.println("Besar float "+Float.BYTES+" bytes");
        System.out.println("Besar float "+Float.SIZE+" bit");
        
        // char (karakter)
        char g = 'G';
        System.out.println("Nilai chart");
        System.out.println("Nilai a = "+g);
        System.out.println("Nilai Max = "+Character.MAX_VALUE);
        System.out.println("Nilai Min"+Character.MIN_VALUE);
        System.out.println("Besar chart "+Character.BYTES+" bytes");
        System.out.println("Besar chart "+Character.SIZE+" bit");
    }
    
}
