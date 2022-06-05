/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejercicio6;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author kawa
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Vector vector = new Vector();
        int Numero;
        boolean verificar = true;

        while (verificar == true) {
            System.out.println("Ingresa el numero: ");            
            Numero = teclado.nextInt();
            
            if (vector.contains(Numero)) {
                System.out.println("---Este es tu vector, recuerda que no se pueden repetir numeros---");
                for (int i = 0; i < vector.size(); i++) {
                    System.out.println("Numero: " + vector.get(i));
                }
                verificar = false;
            } else {
                vector.add(Numero);
                System.out.println("");
            }
        }

    }
}
