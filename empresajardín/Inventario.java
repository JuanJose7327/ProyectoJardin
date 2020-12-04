/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresajardín;


public class Inventario {
    
    private String tipoMateriales;
    private String tipoAbono;
    private String tipoTierra;
    
    public Inventario(){
        super();
    }

    public Inventario(String tipoMateriales, String tipoAbono, String tipoTierra) {
        this.tipoMateriales = tipoMateriales;
        this.tipoAbono = tipoAbono;
        this.tipoTierra = tipoTierra;
    }

public void crearInvent(){
    
    
}    

    public String getTipoMateriales() {
        return tipoMateriales;
    }

    public void setTipoMateriales(String tipoMateriales) {
        this.tipoMateriales = tipoMateriales;
    }

    public String getTipoAbono() {
        return tipoAbono;
    }

    public void setTipoAbono(String tipoAbono) {
        this.tipoAbono = tipoAbono;
    }

    public String getTipoTierra() {
        return tipoTierra;
    }

    public void setTipoTierra(String tipoTierra) {
        this.tipoTierra = tipoTierra;
    }


}
