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
public class Morsa extends Acuatico{
    private String nombre;
    private String peso;
    private String medidas;
    private String longitudColmillos;

    public Morsa() {
    }

    public Morsa(String nombre, String peso, String medidas, String longitudColmillos, String tiempoMaxRespiracion, String profundidadMax) {
        super(tiempoMaxRespiracion, profundidadMax);
        this.nombre = nombre;
        this.peso = peso;
        this.medidas = medidas;
        this.longitudColmillos = longitudColmillos;
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
     * @return the longitudColmillos
     */
    public String getLongitudColmillos() {
        return longitudColmillos;
    }

    /**
     * @param longitudColmillos the longitudColmillos to set
     */
    public void setLongitudColmillos(String longitudColmillos) {
        this.longitudColmillos = longitudColmillos;
    }
    
    public void Guardar(){
        String nombre, peso, medidas, longitudColmillos, ProfundidadMax, TiempoMaxRespiracion;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("GUARDANDO MORSA..");
        System.out.println("Digite el nombre del animal: ");
        nombre = sc.next();
        System.out.println("Digite el peso del animal: ");
        peso = sc.next();
        System.out.println("Digite las medidas del animal: ");
        medidas = sc.next();
        System.out.println("¿Que longitud tienen los colmillos del animal?: ");
        longitudColmillos = sc.next();
        System.out.println("¿Cual es la profundidad maxima a la que llega el animal?: ");
        ProfundidadMax = sc.next();
        System.out.println("¿Cual es el tiempo de respiracion maxima del animal?: ");
        TiempoMaxRespiracion = sc.next();
        
        
        this.longitudColmillos = longitudColmillos;
        this.medidas = medidas;
        this.nombre = nombre;
        this.peso = peso;
        super.setProfundidadMax(ProfundidadMax);
        super.setTiempoMaxRespiracion(TiempoMaxRespiracion);
    }
    
    public void mostrarDatos(){
        System.out.println("DATOS MORSA..");
        System.out.println("El nombre del animal es: "
                +this.getNombre()
                +"\nEl peso del animal es: "
                +this.peso+" kg"
                + "\nLas medidas del animal son: "
                + this.medidas+" m"
                + "\na longitud de los colmillos del animal es: "
                + this.longitudColmillos+" cm"
                + "\nEl animal llega a una profundidad maxima de "+super.getProfundidadMax()+" m"
                + "\nEl animal Tiene un tiempo de respiracion maxima "+super.getTiempoMaxRespiracion()+" horas");
    }
    
}
