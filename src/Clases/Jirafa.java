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
public class Jirafa extends Terrestre{
    private String nombre;
    private String peso;
    private String medidas;
    private String longitudCuello;

    public Jirafa() {
    }

    public Jirafa(String nombre, String peso, String medidas, String longitudCuello, String velocidadMax, String terrenoPref) {
        super(velocidadMax, terrenoPref);
        this.nombre = nombre;
        this.peso = peso;
        this.medidas = medidas;
        this.longitudCuello = longitudCuello;
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
     * @return the longitudCuello
     */
    public String getLongitudCuello() {
        return longitudCuello;
    }

    /**
     * @param longitudCuello the longitudCuello to set
     */
    public void setLongitudCuello(String longitudCuello) {
        this.longitudCuello = longitudCuello;
    }
    public void Guardar(){
        String nombre, peso, medidas, longitudCuello, VelocidadMax,TerrenoPref;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("GUARDANDO JIRAFA..");
        System.out.println("Digite el nombre del animal: ");
        nombre = sc.next();
        System.out.println("Digite el peso del animal: ");
        peso = sc.next();
        System.out.println("Digite las medidas del animal: ");
        medidas = sc.next();
        System.out.println("¿Que longitud tiene el cuello del animal?: ");
        longitudCuello = sc.next();
        System.out.println("¿Cual es la velocidad Max del animal?: ");
        VelocidadMax = sc.next();
        System.out.println("¿Cual es el terreno preferido del animal?: ");
        TerrenoPref = sc.next();
        
        this.longitudCuello = longitudCuello;
        this.medidas = medidas;
        this.nombre = nombre;
        this.peso = peso;
        super.setTerrenoPref(TerrenoPref);
        super.setVelocidadMax(VelocidadMax);
    }
    
    public void mostrarDatos(){
        System.out.println("DATOS JIRAFA..");
        System.out.println("El nombre del animal es: "
                +this.getNombre()
                +"\nEl peso del animal es: "
                +this.peso+" kg"
                + "\nLas medidas del animal son: "
                + this.medidas+" m"
                + "\nLa longitud del cuello del animal es: "
                + this.longitudCuello+" m"
                + "\nLa velocidad Max del animal es "
                + super.getVelocidadMax() + " km/h"
                + "\nEl terreno preferido del animal es "
                + super.getTerrenoPref());
    }
}
