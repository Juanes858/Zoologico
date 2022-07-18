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
public class Acuatico {
    private String tiempoMaxRespiracion;
    private String profundidadMax;

    public Acuatico() {
    }

    public Acuatico(String tiempoMaxRespiracion, String profundidadMax) {
        this.tiempoMaxRespiracion = tiempoMaxRespiracion;
        this.profundidadMax = profundidadMax;
    }
    
    /**
     * @return the tiempoMaxRespiracion
     */
    public String getTiempoMaxRespiracion() {
        return tiempoMaxRespiracion;
    }

    /**
     * @param tiempoMaxRespiracion the tiempoMaxRespiracion to set
     */
    public void setTiempoMaxRespiracion(String tiempoMaxRespiracion) {
        this.tiempoMaxRespiracion = tiempoMaxRespiracion;
    }

    /**
     * @return the profundidadMax
     */
    public String getProfundidadMax() {
        return profundidadMax;
    }

    /**
     * @param profundidadMax the profundidadMax to set
     */
    public void setProfundidadMax(String profundidadMax) {
        this.profundidadMax = profundidadMax;
    }
    
}
