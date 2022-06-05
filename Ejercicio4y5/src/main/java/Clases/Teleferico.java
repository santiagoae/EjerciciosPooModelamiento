
package Clases;

public class Teleferico extends Vehiculo {
     public void Mostrar(){        
        System.out.println("Nombre: " + getNombre());
        System.out.println("Tipo de combustible: " + getTipoCombustible());
        System.out.println("Numero de puertas: " + getNumeroPuertas());        
        System.out.println("Se desplaza totalmente por: " + getMedioPorElCualSeDesplaza());
    }
}
