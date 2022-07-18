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
public class Pato extends Aereo {
    private String nombre;
    private String peso;
    private String medidas;
    private String colorPlumas;

    public Pato() {
    }

    public Pato(String nombre, String peso, String medidas, String colorPlumas, String tiempoVueloProm, String alturaMaxVuelo) {
        super(tiempoVueloProm, alturaMaxVuelo);
        this.nombre = nombre;
        this.peso = peso;
        this.medidas = medidas;
        this.colorPlumas = colorPlumas;
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
     * @return the colorPlumas
     */
    public String getColorPlumas() {
        return colorPlumas;
    }

    /**
     * @param colorPlumas the colorPlumas to set
     */
    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
    
    public void Guardar(){
        String nombre, peso, medidas, colorPlumas, AlturaMaxVuelo, TiempoVueloProm;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("GUARDANDO PATO..");
        System.out.println("Digite el nombre del animal: ");
        nombre = sc.next();
        System.out.println("Digite el peso del animal: ");
        peso = sc.next();
        System.out.println("Digite las medidas del animal: ");
        medidas = sc.next();
        System.out.println("¿Cual es el color de las plumas del animal?: ");
        colorPlumas = sc.next();
        System.out.println("¿Cual es la altura maxima a la que llega el animal?: ");
        AlturaMaxVuelo = sc.next();
        System.out.println("¿Que tiempo de vuelo promedio tiene el animal?: ");
        TiempoVueloProm = sc.next();
        
        this.colorPlumas = colorPlumas;
        this.medidas = medidas;
        this.nombre = nombre;
        this.peso = peso;
        super.setAlturaMaxVuelo(AlturaMaxVuelo);
        super.setTiempoVueloProm(TiempoVueloProm);
        
        
    }
    
    public void mostrarDatos(){
        System.out.println("DATOS PATO..");
        System.out.println("El nombre del animal es: "
                +this.getNombre()
                +"\nEl peso del animal es: "
                +this.peso+" kg"
                + "\nLas medidas del animal son: "
                + this.medidas+" m"
                + "\nEl color de las plumas del animal es: "
                + this.colorPlumas
                + "\nEl tiempo de vielo promedio del animal es "
                + super.getTiempoVueloProm()+" horas"
                + "\nLa altura maxima de vuelo del animal es "
                + super.getAlturaMaxVuelo() +" km");
    }
    
}
