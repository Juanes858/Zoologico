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
public class Leon extends Terrestre {
    private String nombre;
    private String peso;
    private String medidas;
    private String longitudMelena;

    public Leon() {
    }

    public Leon(String nombre, String peso, String medidas, String longitudMelena, String velocidadMax, String terrenoPref) {
        super(velocidadMax, terrenoPref);
        this.nombre = nombre;
        this.peso = peso;
        this.medidas = medidas;
        this.longitudMelena = longitudMelena;
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
     * @return the longitudMelena
     */
    public String getLongitudMelena() {
        return longitudMelena;
    }

    /**
     * @param longitudMelena the longitudMelena to set
     */
    public void setLongitudMelena(String longitudMelena) {
        this.longitudMelena = longitudMelena;
    }
    
    public void Guardar(){
        String nombre, peso, medidas, longitudMelena, VelocidadMax, TerrenoPref;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("GUARDANDO LEON..");
        System.out.println("Digite el nombre del animal: ");
        nombre = sc.next();
        System.out.println("Digite el peso del animal: ");
        peso = sc.next();
        System.out.println("Digite las medidas del animal: ");
        medidas = sc.next();
        System.out.println("¿Que longitud tiene la melena del animal?: ");
        longitudMelena = sc.next();
        System.out.println("¿Cual es la velocidad Max del animal?: ");
        VelocidadMax = sc.next();
        System.out.println("¿Cual es el terreno preferido del animal?: ");
        TerrenoPref = sc.next();
        
        this.longitudMelena = longitudMelena;
        this.medidas = medidas;
        this.nombre = nombre;
        this.peso = peso;
        super.setTerrenoPref(TerrenoPref);
        super.setVelocidadMax(VelocidadMax);
    }
    
    public void mostrarDatos(){
        System.out.println("DATOS LEON..");
        System.out.println("El nombre del animal es: "
                +this.getNombre()
                +"\nEl peso del animal es: "
                +this.peso+" kg"
                + "\nLas medidas del animal son: "
                + this.medidas+" m"
                + "\nLa longitud de la melena del animal es: "
                + this.longitudMelena+" cm"
                + "\nLa velocidad Max del animal es "
                + super.getVelocidadMax() + " km/h"
                + "\nEl terreno preferido del animal es "
                + super.getTerrenoPref());
    }
}
