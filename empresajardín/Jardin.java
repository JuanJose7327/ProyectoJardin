/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresajardín;

import java.util.*;

/**
 *
 * @author juanj
 */
public class Jardin {
    
    private String tipojardin;
    private String nomjardin;
    private String numPlantas;
    private String fechaPlanta;
    private int ID;
    Scanner Entrada = new Scanner(System.in);
    
    public Jardin(){
        
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTipojardin() {
        return tipojardin;
    }

    public void setTipojardin(String tipojardin) {
        this.tipojardin = tipojardin;
    }

    public String getNomjardin() {
        return nomjardin;
    }

    public void setNomjardin(String nomjardin) {
        this.nomjardin = nomjardin;
    }

    public String getNumPlantas() {
        return numPlantas;
    }

    public void setNumPlantas(String numPlantas) {
        this.numPlantas = numPlantas;
    }

    public String getFechaPlanta() {
        return fechaPlanta;
    }

    public void setFechaPlanta(String fechaPlanta) {
        this.fechaPlanta = fechaPlanta;
    }
    
    
    
    
    public void agregar() 
    { 
        System.out.println("Nuevo Jardín\n Tipo de jardín: ");
        tipojardin = Entrada.nextLine();
        System.out.println("Nombre de jarín: ");
        nomjardin= Entrada.nextLine(); 
        System.out.println("Número de plantas: ");
        numPlantas = Entrada.nextLine();
        System.out.println("Fecha de plantación: ");
        fechaPlanta = Entrada.nextLine();
        System.out.println("El ID jardín: \n"+ getID());
    }

    
    public void modificar() 
    {   System.out.println("MODIFICAR JARDÍN");
        System.out.println("Nuevo Jardín\n Tipo de jardín: ");
        tipojardin = Entrada.nextLine();
        System.out.println("Nombre de jarín: ");
        nomjardin= Entrada.nextLine(); 
        System.out.println("Número de plantas: ");
        numPlantas = Entrada.nextLine();
        System.out.println("Fecha de plantación: ");
        fechaPlanta = Entrada.nextLine();
        System.out.println("El ID jardín: \n"+ getID());    
    }

   
    public void consultar()
    {
        System.out.println("Tipo de jardín: "+getTipojardin());        
        System.out.println("Nombre de jarín: "+ getNomjardin());
        System.out.println("Número de plantas: "+getNumPlantas());
        System.out.println("Fecha de plantación: "+getFechaPlanta());
        System.out.println("El ID jardín: \n"+ getID());        
    }

    
    public void eliminar() {
                System.out.println("¿ELIMINAR ESTE EMPLEADO?\n"
                                + "1. Si\n"
                                + "2. No");
    }
}
