
package Clases;

import java.util.ArrayList;


/**
 *
 * @author kawa
 */
public class Vehiculo {
    
    private int NumeroPasajeros;
    private int Tripulacion;
    private int NumeroRuedas;
    private String NumeroMatricula;
    private String FechaMatriculacion;
    private String MedioPorElCualSeDesplaza;
    private int NumeroPuertas;
    private String TipoCombustible;
    private String Nombre;
    private String Marca;
    private String Aerolinea;
    

    ArrayList<Avion> avion= new ArrayList<>();
    ArrayList<Carro> carro= new ArrayList<>();
    ArrayList<Ferry> ferry= new ArrayList<>();
    ArrayList<Globo> globo= new ArrayList<>();
    ArrayList<MontaCargas> montaCargas= new ArrayList<>();
    ArrayList<Moto> moto= new ArrayList<>();
    ArrayList<Teleferico> teleferico= new ArrayList<>();
    ArrayList<Tractomula> tractoMula= new ArrayList<>();
    ArrayList<Tren> tren= new ArrayList<>();
    ArrayList<Yate> yate= new ArrayList<>();

    
    
    public String getAerolinea() {
        return Aerolinea;
    }

    public void setAerolinea(String Aerolinea) {
        this.Aerolinea = Aerolinea;
    }
        
    

    public int getNumeroPasajeros() {
        return NumeroPasajeros;
    }

    public void setNumeroPasajeros(int NumeroPasajeros) {
        this.NumeroPasajeros = NumeroPasajeros;
    }

    public int getTripulacion() {
        return Tripulacion;
    }

    public void setTripulacion(int Tripulacion) {
        this.Tripulacion = Tripulacion;
    }    

    public int getNumeroRuedas() {
        return NumeroRuedas;
    }

    public void setNumeroRuedas(int NumeroRuedas) {
        this.NumeroRuedas = NumeroRuedas;
    }

    public String getFechaMatriculacion() {
        return FechaMatriculacion;
    }

    public void setFechaMatriculacion(String FechaMatriculacion) {
        this.FechaMatriculacion = FechaMatriculacion;
    }

    public String getNumeroMatricula() {
        return NumeroMatricula;
    }

    public void setNumeroMatricula(String NumeroMatricula) {
        this.NumeroMatricula = NumeroMatricula;
    }
    
    

    public String getMedioPorElCualSeDesplaza() {
        return MedioPorElCualSeDesplaza;
    }

    public void setMedioPorElCualSeDesplaza(String MedioPorElCualSeDesplaza) {
        this.MedioPorElCualSeDesplaza = MedioPorElCualSeDesplaza;
    }

    public int getNumeroPuertas() {
        return NumeroPuertas;
    }

    public void setNumeroPuertas(int NumeroPuertas) {
        this.NumeroPuertas = NumeroPuertas;
    }

    public String getTipoCombustible() {
        return TipoCombustible;
    }

    public void setTipoCombustible(String TipoCombustible) {
        this.TipoCombustible = TipoCombustible;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
    public void MostrarAvion(){
        for (int i = 0; i < avion.size(); i++) {
            System.out.println("----Avion----");
            avion.get(i).Mostrar();            
        }
    }
    
    public void MostrarCarro(){
        for (int i = 0; i < carro.size(); i++) {
            System.out.println("----Carro----");
            carro.get(i).Mostrar();           
        }        
    }
    
    public void MostrarFerry(){
        for (int i = 0; i < ferry.size(); i++) {
            System.out.println("----Ferry----");
            ferry.get(i).Mostrar();           
        }        
    }
    
    public void MostrarGlobo(){
        for (int i = 0; i < globo.size(); i++) {
            System.out.println("----Globo----");
            globo.get(i).Mostrar();           
        }        
    }
    
    public void MostrarMontaCargas(){
        for (int i = 0; i < montaCargas.size(); i++) {
            System.out.println("----Monta Cargas----");
            montaCargas.get(i).Mostrar();           
        }        
    }
    
    public void MostrarMoto(){
        for (int i = 0; i < moto.size(); i++) {
            System.out.println("----Moto----");
            moto.get(i).Mostrar();           
        }        
    }
    
    public void MostrarTeleferico(){
        for (int i = 0; i < teleferico.size(); i++) {
            System.out.println("----Teleferico----");
            teleferico.get(i).Mostrar();           
        }        
    }
    
    public void MostrarTractoMula(){
        for (int i = 0; i < tractoMula.size(); i++) {
            System.out.println("----Tracto mula----");
            tractoMula.get(i).Mostrar();           
        }        
    }
    
    public void MostrarTren(){
        for (int i = 0; i < tren.size(); i++) {
            System.out.println("----Tren----");
            tren.get(i).Mostrar();           
        }        
    }
    
    public void MostrarYate(){
        for (int i = 0; i < yate.size(); i++) {
            System.out.println("----Yate----");
            yate.get(i).Mostrar();           
        }        
    }
    
    public void AgregarVehiculo(int index, Object a){
        
        if( a.getClass() == Avion.class){
            Avion avi = (Avion) a;
            avion.add(index, avi);
        }else if(a.getClass() == Carro.class){
            Carro car = (Carro) a;
            carro.add(index, car);
        }else if(a.getClass() == Ferry.class){
            Ferry ferr = (Ferry) a;
            ferry.add(index, ferr);
        }
        else if(a.getClass() == Globo.class){
            Globo glo = (Globo) a;
            globo.add(index, glo);
        }
        else if(a.getClass() == MontaCargas.class){
            MontaCargas moncar = (MontaCargas) a;
            montaCargas.add(index, moncar);
        }
        else if(a.getClass() == Moto.class){
            Moto mot = (Moto) a;
            moto.add(index, mot);
        }
        else if(a.getClass() == Teleferico.class){
            Teleferico tel = (Teleferico) a;
            teleferico.add(index, tel);
        }
        else if(a.getClass() == Tractomula.class){
            Tractomula tracto = (Tractomula) a;
            tractoMula.add(index, tracto);
        }
        else if(a.getClass() == Tren.class){
            Tren tre = (Tren) a;
            tren.add(index, tre);
        }else{
            Yate yat = (Yate) a;
            yate.add(index, yat);
        }
        
    }
    
    
    
    
           
        
}
