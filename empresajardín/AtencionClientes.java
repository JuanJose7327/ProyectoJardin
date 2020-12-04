
package empresajardín;

import java.util.Scanner;


public class AtencionClientes extends Empleado{
    
    private double comision;   

    
    public AtencionClientes(double comision, double sueldoEmpleado, int diasTrabajados, double sueldo, String nombre_completo, 
            String apellidos, String domicilio, String RFC, String telefono, String correo_elect, int ID) {
        super(sueldoEmpleado, diasTrabajados, sueldo, nombre_completo, apellidos, domicilio, RFC, telefono, correo_elect,ID);
        this.comision = comision;
    }
    
    //-------MÉTODO CONSTRUCTOR VACÍO---------//
    
    public AtencionClientes(){
        super();
    }

    @Override
    public void CalSalario() {
        super.CalSalario(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("¿Generó comisiones?\n 1- SI\n 2- NO");
        String resp = Entrada.next();
        if(resp.equals("1"))
        {
            System.out.println("¿Cuanto en comisiones generó?");
            setComision(Entrada.nextDouble());
            var tE = getComision();
            var tt = (tE*super.getSueldo())+getSueldoEmpleado();
            setSueldo(tt);
            System.out.println("Sueldo total: $"+getSueldo());
        }else{
             System.out.println("Sueldo total: 1$"+getSueldoEmpleado());
        }
    }



    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public Scanner getEntrada() {
        return Entrada;
    }

    public void setEntrada(Scanner Entrada) {
        this.Entrada = Entrada;
    }

    @Override
    public String getNombre_completo() {
        return nombre_completo;
    }

    @Override
    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    @Override
    public String getApellidos() {
        return apellidos;
    }

    @Override
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String getDomicilio() {
        return domicilio;
    }

    @Override
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String getRFC() {
        return RFC;
    }

    @Override
    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String getCorreo_elect() {
        return correo_elect;
    }

    @Override
    public void setCorreo_elect(String correo_elect) {
        this.correo_elect = correo_elect;
    }



}
