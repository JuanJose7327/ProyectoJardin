/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresajardín;


public class Factura {
    private double importe;
    private String tipoJardin;
    private double Extension;
    private double TeimpDedicado;
    private String materiales;
    
    
    
    public Factura(){
        super();
    }
    public Factura(double importe, String tipoJardin, double Extension, double TeimpDedicado, String materiales) {
        this.importe = importe;
        this.tipoJardin = tipoJardin;
        this.Extension = Extension;
        this.TeimpDedicado = TeimpDedicado;
        this.materiales = materiales;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getTipoJardin() {
        return tipoJardin;
    }

    public void setTipoJardin(String tipoJardin) {
        this.tipoJardin = tipoJardin;
    }

    public double getExtension() {
        return Extension;
    }

    public void setExtension(double Extension) {
        this.Extension = Extension;
    }

    public double getTeimpDedicado() {
        return TeimpDedicado;
    }

    public void setTeimpDedicado(double TeimpDedicado) {
        this.TeimpDedicado = TeimpDedicado;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }
    
    
    
}
