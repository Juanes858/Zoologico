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
public class Terrestre {
    private String velocidadMax;
    private String terrenoPref;
    
    public Terrestre() {
    }

    public Terrestre(String velocidadMax, String terrenoPref) {
        this.velocidadMax = velocidadMax;
        this.terrenoPref = terrenoPref;
    }
    
    /**
     * @return the velocidadMax
     */
    public String getVelocidadMax() {
        return velocidadMax;
    }

    /**
     * @param velocidadMax the velocidadMax to set
     */
    public void setVelocidadMax(String velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    /**
     * @return the terrenoPref
     */
    public String getTerrenoPref() {
        return terrenoPref;
    }

    /**
     * @param terrenoPref the terrenoPref to set
     */
    public void setTerrenoPref(String terrenoPref) {
        this.terrenoPref = terrenoPref;
    }

    
    
}
