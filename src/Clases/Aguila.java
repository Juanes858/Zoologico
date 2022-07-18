/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author estuam
 */
public class Aguila extends Aereo{
    private String nombre;
    private String peso;
    private String medidas;
    private String distanciaVision;

    public Aguila() {
    }

    public Aguila(String nombre, String peso, String medidas, String distanciaVision, String tiempoVueloProm, String alturaMaxVuelo) {
        super(tiempoVueloProm, alturaMaxVuelo);
        this.nombre = nombre;
        this.peso = peso;
        this.medidas = medidas;
        this.distanciaVision = distanciaVision;
    }

    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the peso
     */
    public String getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(String peso) {
        this.peso = peso;
    }

    /**
     * @return the medidas
     */
    public String getMedidas() {
        return medidas;
    }

    /**
     * @param medidas the medidas to set
     */
    public void setMedidas(String medidas) {
        this.medidas = medidas;
    }

    /**
     * @return the distanciaVision
     */
    public String getDistanciaVision() {
        return distanciaVision;
    }

    /**
     * @param distanciaVision the distanciaVision to set
     */
    public void setDistanciaVision(String distanciaVision) {
        this.distanciaVision = distanciaVision;
    }
    
    public void Guardar(){
        String nombre, peso, medidas, distanciaVision, AlturaMaxVuelo, TiempoVueloProm;
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("|GUARDANDO AGUILA|");
        System.out.println("Digite el nombre del animal: ");
        nombre = sc.nextLine();
        System.out.println("Digite el peso del animal: ");
        peso = sc.nextLine();
        System.out.println("Digite las medidas del animal: ");
        medidas = sc.nextLine();
        System.out.println("Digite la Altura maxima de Vuelo del animal: ");
        AlturaMaxVuelo = sc.next();
        System.out.println("Digite el tiempo de vuelo promedio del animal: ");
        TiempoVueloProm = sc.next();
        System.out.println("¿Hasta que distancia puede ver el animal?");
        distanciaVision = sc.nextLine();
        
        this.nombre = nombre;
        this.medidas = medidas;
        this.peso = peso;
        this.distanciaVision = distanciaVision;
        super.setAlturaMaxVuelo(AlturaMaxVuelo);
        super.setTiempoVueloProm(TiempoVueloProm);
    }
    
    public void mostrarDatos(){
        System.out.println("|MOSTRANDO AGUILAS|");
        System.out.println("El nombre del animal es: "
                +this.getNombre()
                +"\nEl peso del animal es: "
                +this.peso+" kg"
                + "\nLas medidas del animal son: "
                + this.medidas+" m"
                + "\nEl animal puede ver a una distancia de: "
                + this.distanciaVision+" km");
    }
    
    
}
