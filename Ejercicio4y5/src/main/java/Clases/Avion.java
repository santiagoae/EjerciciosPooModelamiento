
package Clases;


public class Avion extends Vehiculo {
    
    
    
    public void Mostrar(){
        System.out.println("Aerolinea que lo usa: " + getAerolinea());
        System.out.println("Tiene una tripulacioin de: " + getTripulacion() + " integrantes");
        System.out.println("Tiene una capacidad taotal de: " + getNumeroPasajeros() + " pasajeros");
        System.out.println("Tiene un total de: " + getNumeroRuedas() + " ruedas");
        System.out.println("Se desplaza totalmente por: " + getMedioPorElCualSeDesplaza());
    }
   
}
