package Implementacion;

import Clases.Avion;
import Clases.Carro;
import Clases.Ferry;
import Clases.Globo;
import Clases.MontaCargas;
import Clases.Moto;
import Clases.Teleferico;
import Clases.Tractomula;
import Clases.Tren;
import Clases.Vehiculo;
import Clases.Yate;
import java.util.Scanner;

public class MenuPrincipal {

    Vehiculo v = new Vehiculo();
    Avion avion = new Avion();
    Carro carro = new Carro();
    Ferry ferry = new Ferry();
    Globo globo = new Globo();
    MontaCargas montaCargas = new MontaCargas();
    Moto moto = new Moto();
    Teleferico teleferico = new Teleferico();
    Tractomula tractomula = new Tractomula();
    Tren tren = new Tren();
    Yate yate = new Yate();
    int opcion = 0;
    int countAvion = 0;
    int countYate = 0;
    int countCarro = 0;
    int countFerry = 0;
    int countGlobo = 0;
    int countMontaCargas = 0;
    int countMoto = 0;
    int countTeleferico = 0;
    int countTractomula = 0;
    int countTren = 0;
    Scanner teclado = new Scanner(System.in);

    public void MenuPp() {
        System.out.println("1. Crear avion");
        System.out.println("2. Crear Carro");
        System.out.println("3. Crear Ferry");
        System.out.println("4. Crear Globo");
        System.out.println("5. Crear Monta cargas");
        System.out.println("6. Crear Moto");
        System.out.println("7. Crear Teleferico");
        System.out.println("8. Crear Tractomula");
        System.out.println("9. Crear Tren");
        System.out.println("10.Crear Yate");
        System.out.println("11. Mostrar Vehiculos");
        System.out.println("0. Salir");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Digite el nombre de la aerolinea: ");
                avion.setAerolinea(teclado.next());
                System.out.println("Cuantos son los integrantes de la tripulacion: ");
                avion.setTripulacion(teclado.nextInt());
                System.out.println("Cuanta capacidad tiene: ");
                avion.setNumeroPasajeros(teclado.nextInt());
                System.out.println("Cuantas ruedas tiene: ");
                avion.setNumeroRuedas(teclado.nextInt());
                System.out.println("Medio por el cual se desplaza: ");
                avion.setMedioPorElCualSeDesplaza(teclado.next());
                v.AgregarVehiculo(countAvion, avion);
                countAvion++;
                MenuPp();
                break;

            case 2:
                System.out.println("Ingresa la marca: ");
                carro.setMarca(teclado.next());
                System.out.println("Ingresa el nombre: ");
                carro.setNombre(teclado.next());
                System.out.println("Ingresa tipo de combustible: ");
                carro.setTipoCombustible(teclado.next());
                System.out.println("Ingresa numero de puertas: ");
                carro.setNumeroPuertas(teclado.nextInt());
                System.out.println("Ingresa numero de ruedas: ");
                carro.setNumeroRuedas(teclado.nextInt());
                System.out.println("Ingresa fecha de matricula: ");
                carro.setFechaMatriculacion(teclado.next());
                System.out.println("Ingresa numero de matricula: ");
                carro.setNumeroMatricula(teclado.next());
                System.out.println("Ingresa el medio por el cual se moviliza : ");
                carro.setMedioPorElCualSeDesplaza(teclado.next());                
                v.AgregarVehiculo(countCarro, carro);
                countCarro++;
                MenuPp();
                break;
                
            case 3:                
                System.out.println("Ingresa el nombre: ");
                ferry.setNombre(teclado.next());
                System.out.println("Ingresa tipo de combustible: ");
                ferry.setTipoCombustible(teclado.next());
                System.out.println("Ingresa numero de matricula: ");
                ferry.setNumeroMatricula(teclado.next());
                System.out.println("Ingresa el medio por el cual se moviliza : ");
                ferry.setMedioPorElCualSeDesplaza(teclado.next());
                System.out.println("Cuantos son los integrantes de la tripulacion: ");
                ferry.setTripulacion(teclado.nextInt());
                System.out.println("Cuanta capacidad tiene: ");
                ferry.setNumeroPasajeros(teclado.nextInt());                
                v.AgregarVehiculo(countFerry, ferry);
                countFerry++;
                MenuPp();
                break;
                
            case 4:
                
                System.out.println("Ingresa el nombre: ");
                globo.setNombre(teclado.next());
                System.out.println("Ingresa tipo de combustible: ");
                globo.setTipoCombustible(teclado.next());                
                System.out.println("Ingresa el medio por el cual se moviliza : ");
                globo.setMedioPorElCualSeDesplaza(teclado.next());
                System.out.println("Cuantos son los integrantes de la tripulacion: ");
                globo.setTripulacion(teclado.nextInt());
                System.out.println("Cuanta capacidad tiene: ");
                globo.setNumeroPasajeros(teclado.nextInt());                    
                v.AgregarVehiculo(countGlobo, globo);
                countGlobo++;
                MenuPp();
                break;
                
            case 5:
                System.out.println("Ingresa la marca: ");
                montaCargas.setMarca(teclado.next());
                System.out.println("Ingresa el nombre: ");
                montaCargas.setNombre(teclado.next());
                System.out.println("Ingresa tipo de combustible: ");
                montaCargas.setTipoCombustible(teclado.next());                
                System.out.println("Ingresa el medio por el cual se moviliza : ");
                montaCargas.setMedioPorElCualSeDesplaza(teclado.next());
                System.out.println("Cuanta capacidad tiene: ");
                montaCargas.setNumeroPasajeros(teclado.nextInt());                
                v.AgregarVehiculo(countMontaCargas, montaCargas);                
                countMontaCargas++;
                MenuPp();
                break;
                
            case 6:
                System.out.println("Ingresa la marca: ");
                moto.setMarca(teclado.next());
                System.out.println("Ingresa el nombre: ");
                moto.setNombre(teclado.next());
                System.out.println("Ingresa tipo de combustible: ");
                moto.setTipoCombustible(teclado.next());
                System.out.println("Ingresa numero de ruedas: ");
                moto.setNumeroRuedas(teclado.nextInt());
                System.out.println("Ingresa fecha de matricula: ");
                moto.setFechaMatriculacion(teclado.next());
                System.out.println("Ingresa numero de matricula: ");
                moto.setNumeroMatricula(teclado.next());
                System.out.println("Ingresa el medio por el cual se moviliza : ");
                moto.setMedioPorElCualSeDesplaza(teclado.next());                
                v.AgregarVehiculo(countMoto, moto);
                countMoto++;
                MenuPp();
                break;              
                
                
            case 7:
                
                System.out.println("Ingresa el nombre: ");
                teleferico.setNombre(teclado.next());
                System.out.println("Ingresa tipo de combustible: ");
                teleferico.setTipoCombustible(teclado.next());
                System.out.println("Ingresa numero de puertas: ");
                teleferico.setNumeroPuertas(teclado.nextInt());
                System.out.println("Ingresa el medio por el cual se moviliza : ");
                teleferico.setMedioPorElCualSeDesplaza(teclado.next());                               
                v.AgregarVehiculo(countTeleferico, teleferico);
                countTeleferico++;
                MenuPp();
                break;
                
                
                
            case 8:
                System.out.println("Ingresa la marca: ");
                tractomula.setMarca(teclado.next());
                System.out.println("Ingresa el nombre: ");
                tractomula.setNombre(teclado.next());
                System.out.println("Ingresa tipo de combustible: ");
                tractomula.setTipoCombustible(teclado.next());
                System.out.println("Ingresa numero de puertas: ");
                tractomula.setNumeroPuertas(teclado.nextInt());
                System.out.println("Ingresa numero de ruedas: ");
                tractomula.setNumeroRuedas(teclado.nextInt());
                System.out.println("Ingresa fecha de matricula: ");
                tractomula.setFechaMatriculacion(teclado.next());
                System.out.println("Ingresa numero de matricula: ");
                tractomula.setNumeroMatricula(teclado.next());
                System.out.println("Ingresa el medio por el cual se moviliza : ");
                tractomula.setMedioPorElCualSeDesplaza(teclado.next());                
                v.AgregarVehiculo(countTractomula, tractomula);
                countTractomula++;
                MenuPp();
                break;  
                
            case 9:
                
                System.out.println("Ingresa el nombre: ");
                tren.setNombre(teclado.next());
                System.out.println("Ingresa tipo de combustible: ");
                tren.setTipoCombustible(teclado.next());
                System.out.println("Ingresa numero de puertas: ");
                tren.setNumeroPuertas(teclado.nextInt());               
                System.out.println("Ingresa el medio por el cual se moviliza : ");
                tren.setMedioPorElCualSeDesplaza(teclado.next());                
                v.AgregarVehiculo(countTren, tren);
                countTren++;
                MenuPp();
                break;
                
            case 10:
                System.out.println("Ingresa la marca: ");
                yate.setMarca(teclado.next());
                System.out.println("Ingresa el nombre: ");
                yate.setNombre(teclado.next());
                System.out.println("Ingresa tipo de combustible: ");
                yate.setTipoCombustible(teclado.next());                
                System.out.println("Ingresa fecha de matricula: ");
                yate.setFechaMatriculacion(teclado.next());
                System.out.println("Ingresa numero de matricula: ");
                yate.setNumeroMatricula(teclado.next());
                System.out.println("Ingresa el medio por el cual se moviliza : ");
                yate.setMedioPorElCualSeDesplaza(teclado.next());                
                v.AgregarVehiculo(countYate, yate);
                countYate++;
                MenuPp();
                break;
                
            case 11:
                v.MostrarAvion();
                v.MostrarCarro();
                v.MostrarFerry();
                v.MostrarGlobo();
                v.MostrarMontaCargas();
                v.MostrarMoto();
                v.MostrarTeleferico();
                v.MostrarTractoMula();
                v.MostrarTren();
                v.MostrarYate();
                MenuPp();
                break;
                
            case 0:
                break;
                
            default:
                throw new AssertionError();
        }
    }

}
