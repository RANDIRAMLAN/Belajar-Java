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
public class MethodVoid {
    public static void main(String[] args){
        System.out.println(simple());
        funsiVoid("Ceatak");
        
    }
    //method tanpa kembalian
    private static void funsiVoid(String input){
        System.out.println(input);
    }
    // methos dengan kembalian
    private static float simple(){
        return 10.f;
    }
    
}
