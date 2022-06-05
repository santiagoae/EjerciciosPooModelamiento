
package Clases;


public class Planeta {
    private double Masa;
    private double Densidad;
    private double Diametro;
    private double DistanciaSol;
    private int Id;
    private String Nombre;

    public double getMasa() {
        return Masa;
    }

    public void setMasa(double Masa) {
        this.Masa = Masa;
    }

    public double getDensidad() {
        return Densidad;
    }

    public void setDensidad(double Densidad) {
        this.Densidad = Densidad;
    }

    public double getDiametro() {
        return Diametro;
    }

    public void setDiametro(double Diametro) {
        this.Diametro = Diametro;
    }

    public double getDistanciaSol() {
        return DistanciaSol;
    }

    public void setDistanciaSol(double DistanciaSol) {
        this.DistanciaSol = DistanciaSol;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public void Mostrar(){
        System.out.println("El nombre del planeta es: " + getNombre());
        System.out.println("Su Identificador unico es: " + getId());
        System.out.println("La Masa del planeta es de: " + getMasa());
        System.out.println("La Densidad del planeta es de: " + getDensidad() + " Kg/m³2​");
        System.out.println("El Diametro del planeta es de: " + getDiametro() + " Km");
        System.out.println("La Distancia del planeta es de: " + getDistanciaSol() + " Millones de Km");
    }
}
