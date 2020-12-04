/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresajardín;

import java.util.*;

public abstract class Persona {
    
    
    //-------------ATRIBUTOS PARA CLASE ABSTRACTA--------------//
    
    Scanner Entrada = new Scanner(System.in);
    protected String nombre_completo;
    protected String apellidos;
    protected String domicilio;
    protected String RFC;
    protected String telefono;
    protected String correo_elect;
    protected int ID;

    

    
    //-----------------MÉTODO CONSTRUCTOR--------------//
    
    public Persona(){
		super();
	}
	

    public Persona(String nombre_completo, String apellidos, String domicilio, String RFC, String telefono, String correo_elect,int ID) {
        super();
        this.nombre_completo = nombre_completo;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
        this.RFC = RFC;
        this.telefono = telefono;
        this.correo_elect = correo_elect;
        this.ID = ID;
        
        
    }
     

    
    
    //----------------------MÉTODOS GETTERS Y SETTERS--------------------//


    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo_elect() {
        return correo_elect;
    }

    public void setCorreo_elect(String correo_elect) {
        this.correo_elect = correo_elect;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    



    
   //-------------------MÉTODOS ABSTRACTOS--------------//
    
    public abstract void alta();
    public abstract void baja();
    public abstract void consultar();
    public abstract void modificar();

    //VER SI SE REQUIERE PARA LO DEL METODO CONSTRUCTOR VACIO O PARA QUE ES
   
    @Override
    public String toString(){
		return "Nombre: " + nombre_completo+ "\nRFC: " + RFC + "\nTelefono: " + telefono + "\nDomicilio: " + domicilio + 
				"\nCorreo electronico: " + correo_elect + "ID: " + ID;
		
	}
}
