/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author estuam
 */
public class Aereo {
    private String tiempoVueloProm;
    private String alturaMaxVuelo;

    public Aereo() {
    }

    public Aereo(String tiempoVueloProm, String alturaMaxVuelo) {
        this.tiempoVueloProm = tiempoVueloProm;
        this.alturaMaxVuelo = alturaMaxVuelo;
    }
    
    /**
     * @return the tiempoVueloProm
     */
    public String getTiempoVueloProm() {
        return tiempoVueloProm;
    }

    /**
     * @param tiempoVueloProm the tiempoVueloProm to set
     */
    public void setTiempoVueloProm(String tiempoVueloProm) {
        this.tiempoVueloProm = tiempoVueloProm;
    }

    /**
     * @return the alturaMaxVuelo
     */
    public String getAlturaMaxVuelo() {
        return alturaMaxVuelo;
    }

    /**
     * @param alturaMaxVuelo the alturaMaxVuelo to set
     */
    public void setAlturaMaxVuelo(String alturaMaxVuelo) {
        this.alturaMaxVuelo = alturaMaxVuelo;
    }
    
}
