/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author kawa
 */
public class Moto extends Vehiculo {
     public void Mostrar(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Tipo de combustible: " + getTipoCombustible());
        System.out.println("Numero de ruedas: " + getNumeroRuedas());
        System.out.println("Fecha de matricula: " + getFechaMatriculacion());
        System.out.println("Numero de matricula" + getNumeroMatricula());        
        System.out.println("Se desplaza totalmente por: " + getMedioPorElCualSeDesplaza());
    }
}
