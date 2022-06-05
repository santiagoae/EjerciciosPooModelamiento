
package Clases;

public class Ferry extends Vehiculo {
    public void Mostrar(){        
        System.out.println("Nombre: " + getNombre());
        System.out.println("Tipo de combustible: " + getTipoCombustible());
        System.out.println("Numero de matricula" + getNumeroMatricula());        
        System.out.println("Se desplaza totalmente por: " + getMedioPorElCualSeDesplaza());
        System.out.println("Tiene una tripulacioin de: " + getTripulacion() + " integrantes");
        System.out.println("Tiene una capacidad taotal de: " + getNumeroPasajeros() + " pasajeros");
    }
}
