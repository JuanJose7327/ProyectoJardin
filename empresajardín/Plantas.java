/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresajardín;


public class Plantas {
    
    private String aspectoPlanta;
    private String tipoHojas;
    private String tipoFlores;
    private String temporada;
    private String flora;
    private String familia;
    private String origen;
    
    public Plantas(){
        super();
    }

    public Plantas(String aspectoPlanta, String tipoHojas, String tipoFlores, String temporada, String flora, String familia, String origen) {
        this.aspectoPlanta = aspectoPlanta;
        this.tipoHojas = tipoHojas;
        this.tipoFlores = tipoFlores;
        this.temporada = temporada;
        this.flora = flora;
        this.familia = familia;
        this.origen = origen;
    }
    
    public void crearPlanta(){
        
    }

    public String getAspectoPlanta() {
        return aspectoPlanta;
    }

    public void setAspectoPlanta(String aspectoPlanta) {
        this.aspectoPlanta = aspectoPlanta;
    }

    public String getTipoHojas() {
        return tipoHojas;
    }

    public void setTipoHojas(String tipoHojas) {
        this.tipoHojas = tipoHojas;
    }

    public String getTipoFlores() {
        return tipoFlores;
    }

    public void setTipoFlores(String tipoFlores) {
        this.tipoFlores = tipoFlores;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public String getFlora() {
        return flora;
    }

    public void setFlora(String flora) {
        this.flora = flora;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
    
    
    
}
