/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author kawa
 */
public class Aleatorios {

    private int tamañoArray, opcion;
    int countIteracion = 0;
    private double[] numeros = new double[10];
    Scanner teclado = new Scanner(System.in);

    public void GenerarArrayAleatorio() {
        for (int i = 0; i < this.numeros.length; i++) {
            this.numeros[i] = (Math.random() * 20) + 1;
        }
    }

    public void Mostrar() {        
        for (int i = 0; i < this.numeros.length; i++) {
            System.out.println("");
            System.out.println(numeros[i]);
            System.out.println("");
           
        }
    }

    public void ordenarBurbuja() {
        double aux;
        for (int i = 0; i < this.numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (this.numeros[j + 1] < this.numeros[j]) {
                    aux = numeros[j + 1];
                    this.numeros[j + 1] = this.numeros[j];
                    this.numeros[j] = aux;
                }
            }
        }        
        Mostrar();
    }

    public void quickSort(double A[], int izq, int der) {        
        
        
        double pivote = A[izq]; // tomamos primer elemento como pivote
        int i = izq;         // i realiza la búsqueda de izquierda a derecha
        int j = der;         // j realiza la búsqueda de derecha a izquierda
        double aux;

        while (i < j) {                          // mientras no se crucen las búsquedas                                   
            while (A[i] <= pivote && i < j) {
                i++; // busca elemento mayor que pivote
            }
            while (A[j] > pivote) {
                j--;           // busca elemento menor que pivote
            }
            if (i < j) {                        // si no se han cruzado                      
                aux = A[i];                      // los intercambia
                A[i] = A[j];
                A[j] = aux;
            }
        }

        A[izq] = A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
        A[j] = pivote;      // los menores a su izquierda y los mayores a su derecha

        if (izq < j - 1) {
            quickSort(A, izq, j - 1);          // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            quickSort(A, j + 1, der);          // ordenamos subarray derecho
        }
        
        countIteracion = countIteracion + 1;
        
        System.out.println("Tu array se esta ordenando esta es la Iteracion: " + countIteracion);
        Mostrar();
    }

    public void menu() {

        GenerarArrayAleatorio();
        System.out.println("1. Mostar Array");
        System.out.println("2. Ordenar Burbuja");
        System.out.println("3. Ordenar Quicknar Burbusort");
        System.out.println("0. Salir");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                Mostrar();
                menu();
                break;
            case 2:
                ordenarBurbuja();
                menu();
                break;
            case 3:
                quickSort(numeros, 0, numeros.length - 1);
                menu();
                break;
            case 4:
                break;
            default:
                throw new AssertionError();
        }
    }
}
