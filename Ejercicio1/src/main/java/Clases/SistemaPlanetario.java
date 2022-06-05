/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Interfaz.AtraccionGravitatoria;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kawa
 */
public class SistemaPlanetario implements AtraccionGravitatoria {

    private ArrayList<Planeta> planeta = new ArrayList<>();
    private String PlanetaError, BuscarPlaneta;
    Scanner teclado = new Scanner(System.in);

    public void Llenar(int Index, Planeta cualquiera) {
        planeta.add(Index, cualquiera);
    }

    public void MostrarPlanetas() {
        for (int i = 0; i < planeta.size(); i++) {
            System.out.println("");
            planeta.get(i).Mostrar();
            System.out.println("");
        }
    }

    public void BuscarPlaneta() {
        Planeta Planeta1 = new Planeta();
        Planeta Planeta2 = new Planeta();
        double Distancia;
        int count = 0;
        int count2 = 0;
        System.out.println("Digita el Nombre del primer planeta: ");
        BuscarPlaneta = teclado.next();
        for (int i = 0; i < planeta.size(); i++) {
            if (planeta.get(i).getNombre().equals(BuscarPlaneta)) {
                Planeta1 = planeta.get(i);
                count ++;
            }
        }

        System.out.println("Digita el Nombre del segundo planeta: ");
        BuscarPlaneta = teclado.next();
        for (int i = 0; i < planeta.size(); i++) {
            if (planeta.get(i).getNombre().equals(BuscarPlaneta)) {
                Planeta2 = planeta.get(i);
                count2 ++;
            }
        }
        if (count != 0 && count2 != 0) {
            System.out.println("Digita la distancia entre ellos: ");
            Distancia = teclado.nextDouble();
            AtraccionGravitatoriaEntreDosCuerpos(Planeta1, Planeta2, Distancia);
        } else {

            System.out.println("Alguno de los planetas no se encuentra planeta no se ecnuentra");
            BuscarPlaneta();

        }

    }

    @Override
    public void AtraccionGravitatoriaEntreDosCuerpos(Planeta a, Planeta b, double Distancia) {
        double ConstanteG = 6.67 * Math.pow(10, -23);
        double FuerzaG = (ConstanteG * a.getMasa() * b.getMasa()) / (Math.pow(Distancia, 2));
        System.out.println("La Fuerza Gravitatoria entre: " + a.getNombre() + " y " + b.getNombre() + " es de: " + FuerzaG + " Nm^2/Kg^2");
    }

}
