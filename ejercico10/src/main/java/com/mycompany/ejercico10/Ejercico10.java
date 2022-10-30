/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercico10;

/**
 *
 * @author aysanchez6
 */
public class Ejercico10 {

    public static void main(String[] args) {
        int var1 = 25;
        int var2 = 10;
        int var3 = 100;
        int var4 = 10;
        int var5 = 5;
        int var6 = 2;
        
        // System.out.println(Math.sqrt(var1) * 10 >= var3) && (true) || (false) || (var4 / var5 >= var6);
        
        boolean valor = (Math.sqrt(var1) * var2 >= var3) && (true) || (false) || (var4 / var5 >= var6);
        
        System.out.println("=======ejercicio10=========");
        System.out.println(valor);
        
    }
}
