/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresajardín;
import java.util.*;

public final class Contrato {
     
    Scanner Entrada = new Scanner(System.in);
    private String nombre_completo;
    private String apellidos;
    private String domicilio;
    private String RFC;
    private String telefono;
    private String correo_elect;
    int NumContrato;
    private String tipoJardin;
    private double tiempoDedicacion;
    private double extensionJard;

   
    
    
    public Contrato(){
        super();
    }

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

    public int getNumContrato() {
        return NumContrato;
    }

    public void setNumContrato(int NumContrato) {
        this.NumContrato = NumContrato;
    }

    public String getTipoJardin() {
        return tipoJardin;
    }

    public void setTipoJardin(String tipoJardin) {
        this.tipoJardin = tipoJardin;
    }

    public double getTiempoDedicacion() {
        return tiempoDedicacion;
    }

    public void setTiempoDedicacion(double tiempoDedicacion) {
        this.tiempoDedicacion = tiempoDedicacion;
    }

    public double getExtensionJard() {
        return extensionJard;
    }

    public void setExtencionJard(double extensionJard) {
        this.extensionJard = extensionJard;
    }
    
    

    public Contrato(String nombre_completo, String apellidos, String domicilio, String RFC, String telefono, String correo_elect, String tipoJardin, double tiempoDedicacion, double extensionJard) {

        this.nombre_completo = nombre_completo;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
        this.RFC = RFC;
        this.telefono = telefono;
        this.correo_elect = correo_elect;
        this.tipoJardin = tipoJardin;
        this.tiempoDedicacion = tiempoDedicacion;
        this.extensionJard = extensionJard;
    }

    public Contrato(String nombre_completo, String apellidos, String domicilio, String RFC, String telefono, String correo_elect) {

        this.nombre_completo = nombre_completo;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
        this.RFC = RFC;
        this.telefono = telefono;
        this.correo_elect = correo_elect;
    }

    public Contrato(String nombre_completo, String apellidos, String domicilio, String telefono) {

        this.nombre_completo = nombre_completo;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }
    
    
    public void mostar(){
        System.out.println("---MOSTRAR CONTRATO---");
        System.out.println("Contrato número: "+NumContrato);
        System.out.println("NOMBRE: "+nombre_completo);
        System.out.println("APELLIDOS: "+apellidos);
        System.out.println("DOMICILIO: "+domicilio);
        System.out.println("TELEFONO: "+telefono);
        System.out.println("RFC: "+RFC);
        System.out.println("EMAIL: "+correo_elect);
        System.out.println("TIPO JARDIN: "+tipoJardin);
        System.out.println("TIEMPO DEDICADO: "+tiempoDedicacion);
        System.out.println("EXTENSION: "+extensionJard);
    }
    public void modificar(){
System.out.println("---MODIFICAR CONTRATO---\n");
                             System.out.println("Nombre: ");
                             setNombre_completo(Entrada.next());
                             System.out.println("Apellidos: ");
                             setApellidos(Entrada.next());
                             System.out.println("Domicilio: ");
                             setDomicilio(Entrada.next());
                             System.out.println("Telefono: ");
                             setTelefono(Entrada.next());
                             System.out.println("RFC: ");
                             setRFC(Entrada.nextLine());
                             System.out.println("Email: ");
                             setCorreo_elect(Entrada.nextLine());
                             System.out.println("Tipo de jardín: ");
                             setTipoJardin(Entrada.nextLine());
                             System.out.println("Tiempo dedicado: ");
                             setTiempoDedicacion(Entrada.nextInt());
                             System.out.println("Extencion del jardín: ");
                             setExtencionJard(Entrada.nextDouble());
    }
public void eliminar(){
                    System.out.println("¿ELIMINAR ESTE EMPLEADO?\n"
                                + "1. Si\n"
                                + "2. No");
}




}
