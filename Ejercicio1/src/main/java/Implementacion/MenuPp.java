/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementacion;

import Clases.Planeta;
import Clases.SistemaPlanetario;
import java.util.Scanner;

/**
 *
 * @author kawa
 */
public class MenuPp {

    int op, op2;        
    Scanner teclado = new Scanner(System.in);
    SistemaPlanetario sistemaPlanetario = new SistemaPlanetario();

    public void Menu() {

        System.out.println("|Bienvenido al Sistem Solar");
        System.out.println("|1. ¿Quieres Saber cuales son los planetas que contiene el sistema solar?");
        System.out.println("|2. Aqui puedes calcular la atraccion gravitatoria entre dos planetas");
        System.out.println("|0. Salir");
        this.op = teclado.nextInt();
        switch (op) {
            case 1:
                sistemaPlanetario.MostrarPlanetas();
                Menu();
                break;
            case 2:                
                sistemaPlanetario.BuscarPlaneta();
                Menu();
                break;
            case 0:
                System.exit(0);
                break;
        }
    }

    public void LlenarSistemaSolar() {

        Planeta p = new Planeta();
        Planeta p1 = new Planeta();
        Planeta p2 = new Planeta();
        Planeta p3 = new Planeta();
        Planeta p4 = new Planeta();
        Planeta p5 = new Planeta();
        Planeta p6 = new Planeta();
        Planeta p7 = new Planeta();
        Planeta p8 = new Planeta();

        p.setDensidad(5430);
        p.setDiametro(4879);
        p.setDistanciaSol(69.8);
        p.setId(0);
        p.setMasa((3.3) * (Math.pow(10, 23)));
        p.setNombre("Mercurio");
        sistemaPlanetario.Llenar(0, p);

        p1.setDensidad(5.24);
        p1.setDiametro(12103.6);
        p1.setDistanciaSol(108);
        p1.setId(1);
        p1.setMasa((4.869) * (Math.pow(10, 23)));
        p1.setNombre("Venus");
        sistemaPlanetario.Llenar(1, p1);

        p2.setDensidad(5.515);
        p2.setDiametro(12742);
        p2.setDistanciaSol(149.6);
        p2.setId(2);
        p2.setMasa((5.9736) * (Math.pow(10, 23)));
        p2.setNombre("Tierra");
        sistemaPlanetario.Llenar(2, p2);

        p3.setDensidad(3.9335);
        p3.setDiametro(6794.4);
        p3.setDistanciaSol(227.9);
        p3.setId(3);
        p3.setMasa((5.9736) * (Math.pow(10, 23)));
        p3.setNombre("Marte");
        sistemaPlanetario.Llenar(3, p3);

        p4.setDensidad(13.360);
        p4.setDiametro(142984);
        p4.setDistanciaSol(750);
        p4.setId(4);
        p4.setMasa((1.899) * (Math.pow(10, 23)));
        p4.setNombre("Jupiter");
        sistemaPlanetario.Llenar(4, p4);

        p5.setDensidad(6.9);
        p5.setDiametro(120536);
        p5.setDistanciaSol(750);
        p5.setId(5);
        p5.setMasa((5.683) * (Math.pow(10, 23)));
        p5.setNombre("Saturno");
        sistemaPlanetario.Llenar(5, p5);

        p6.setDensidad(1.274);
        p6.setDiametro(51118);
        p6.setDistanciaSol(2600.1);
        p6.setId(6);
        p6.setMasa((8.686) * (Math.pow(10, 23)));
        p6.setNombre("Urano");
        sistemaPlanetario.Llenar(6, p6);

        p7.setDensidad(1.64);
        p7.setDiametro(49572);
        p7.setDistanciaSol(4495.1);
        p7.setId(7);
        p7.setMasa((1.024) * (Math.pow(10, 26)));
        p7.setNombre("Neptuno");
        sistemaPlanetario.Llenar(7, p7);

    }
}
