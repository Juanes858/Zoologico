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
public class Pinguino extends Acuatico{
    private String nombre;
    private String peso;
    private String medidas;
    private boolean tienePareja;

    public Pinguino() {
    }

    public Pinguino(String nombre, String peso, String medidas, boolean tienePareja, String tiempoMaxRespiracion, String profundidadMax) {
        super(tiempoMaxRespiracion, profundidadMax);
        this.nombre = nombre;
        this.peso = peso;
        this.medidas = medidas;
        this.tienePareja = tienePareja;
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
     * @return the tienePareja
     */
    public boolean isTienePareja() {
        return tienePareja;
    }

    /**
     * @param tienePareja the tienePareja to set
     */
    public void setTienePareja(boolean tienePareja) {
        this.tienePareja = tienePareja;
    }
    
    public void Guardar(){
        String nombre, peso, medidas, ProfundidadMax, TiempoMaxRespiracion, tieneParejaL;
        boolean tienePareja = false;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("GUARDANDO PINGUINO..");
        System.out.println("Digite el nombre del animal: ");
        nombre = sc.next();
        System.out.println("Digite el peso del animal: ");
        peso = sc.next();
        System.out.println("Digite las medidas del animal: ");
        medidas = sc.next();
        System.out.println("¿El animal tiene pareja?: ");
        System.out.println("(n) Si la respuesta es NO"
                + "\n(s) Si la respuesta es SI");
        tieneParejaL = sc.next();
        if(tieneParejaL.equalsIgnoreCase("s"))
            tienePareja = true;
        if(tieneParejaL.equalsIgnoreCase("n"))
            tienePareja = false;
        System.out.println("¿Cual es la profundidad maxima a la que llega el animal?: ");
        ProfundidadMax = sc.next();
        System.out.println("¿Cual es el tiempo de respiracion maxima del animal?: ");
        TiempoMaxRespiracion = sc.next();
        
        this.medidas = medidas;
        this.nombre = nombre;
        this.peso = peso;
        this.tienePareja = equals(tienePareja);
        super.setProfundidadMax(ProfundidadMax);
        super.setTiempoMaxRespiracion(TiempoMaxRespiracion);
    }
    
    public void mostrarDatos(){
        System.out.println("DATOS PINGUINO..");
        System.out.println("El nombre del animal es: "
                +this.getNombre()
                +"\nEl peso del animal es: "
                +this.peso+" kg"
                + "\nLas medidas del animal son: "
                + this.medidas+" m"
                + "\nEl animal tiene pareja: "
                + this.tienePareja
                + "\nEl animal llega a una profundidad maxima de "+super.getProfundidadMax()+" m"
                + "\nEl animal Tiene un tiempo de respiracion maxima "+super.getTiempoMaxRespiracion()+" horas");
    }
}
