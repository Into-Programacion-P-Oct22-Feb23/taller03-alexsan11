/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio07;

/**
 *
 * @author aysanchez6
 */
public class Ejercicio07 {

    public static void main(String[] args) {
        int var1 = 81;
        int var2 = 9;
        int var3 = 3;
        int var4 = 10;
        int var5 = 1;
        int var6 = 100;
        int var7 = 25;
         // System.out.println((Math.sqrt(var1) + var2) / var3) == var2) || (var4 > var5) && ((var6 / var7) > Math.sqrt(var6));
        
         boolean valor;

        valor = (((Math.sqrt(var1) + var2) / var3) == var2) || (var4 > var5) && ((var6 / var7) > Math.sqrt(var6));

        System.out.println("====================Ejercicio 7==================== ");
        System.out.println("Resultado de la operacion es: " + valor);

    }
}
