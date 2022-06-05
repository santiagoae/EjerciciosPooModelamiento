/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author kawa
 */
public class Globo extends Vehiculo {
    public void Mostrar(){        
        System.out.println("Nombre: " + getNombre());
        System.out.println("Tipo de combustible: " + getTipoCombustible());       
        System.out.println("Se desplaza totalmente por: " + getMedioPorElCualSeDesplaza());
        System.out.println("Tiene una tripulacioin de: " + getTripulacion() + " integrantes");
        System.out.println("Tiene una capacidad taotal de: " + getNumeroPasajeros() + " pasajeros");
    }
}
