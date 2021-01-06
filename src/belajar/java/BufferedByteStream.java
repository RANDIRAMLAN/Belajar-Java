/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajar.java;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Acer
 */
public class BufferedByteStream {
    public static void main(String[] args) throws IOException{
        
        // membaca dari file
        FileInputStream byteInput = new FileInputStream("input.txt");
//        System.out.println(byteInput.available());
        
        // ===  menghitung waktu proses ===
        long mulai, selesai;
        mulai = System.nanoTime();
        int buffer = byteInput.read();
        while(buffer != -1){
            System.out.print((char)buffer);
            buffer = byteInput.read();
        }
        selesai = System.nanoTime();
        System.out.print("\n");
        System.out.println("Waktunya :"+(selesai-mulai));
        byteInput.close();
       
        // membaca dari memori
        FileInputStream byteInput2 = new FileInputStream("input.txt");
        BufferedInputStream bufferdInput = new BufferedInputStream(byteInput2);
        // ===  menghitung waktu proses ===
        bufferdInput.mark(200);
        mulai = System.nanoTime();
        int buffer2 = bufferdInput.read();
        while(buffer2 != -1){
            System.out.print((char)buffer2);
            buffer2 = bufferdInput.read();
        }
        selesai = System.nanoTime();
        System.out.print("\n");
        System.out.println("Waktunya :"+(selesai-mulai));
        byteInput.close();
        
        // baca ulang
        bufferdInput.reset();
        int buffer3 = bufferdInput.read();
        while(buffer3 != -1){
            System.out.print((char)buffer3);
            buffer3 = bufferdInput.read();
        }
        
        //menulis dengan buffered
        FileOutputStream byteOutput = new FileOutputStream("output.txt");
        BufferedOutputStream bufferedOutput = new BufferedOutputStream(byteOutput);
        // === write data berupda byte ===
        bufferedOutput.write(buffer3);
        bufferedOutput.flush();
        byteOutput.close();
        bufferedOutput.close();
        bufferdInput.close();
        byteInput2.close();
        
        System.out.println("");
    }
}
