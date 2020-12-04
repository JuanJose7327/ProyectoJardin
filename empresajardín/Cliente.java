/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresajardín;

public class Cliente extends Persona {

     public Cliente(){
        super();
    }

    public Cliente(String nombre_completo, String apellidos, String domicilio, String RFC, String telefono, String correo_elect, int ID,int id) {
        super(nombre_completo, apellidos, domicilio, RFC, telefono, correo_elect, ID);
    }





    @Override
    public void modificar() {
        System.out.println("-------MODIFICAR CLIENTE------");
        System.out.println("Ingrese nombre");
        super.setNombre_completo(Entrada.next());
        System.out.println("Ingrese apellidos");
        super.setApellidos(Entrada.next());
        System.out.println("Ingrese domicilio");
        super.setDomicilio(Entrada.next());
        System.out.println("Ingrese RFC");
        super.setRFC(Entrada.next());
        System.out.println("Ingrese teléfono");
        super.setTelefono(Entrada.next());
        System.out.println("Ingrese Email");
        super.setCorreo_elect(Entrada.next());
        System.out.println("Ingrese ID");
        setID(Entrada.nextInt());

    }

    @Override
    public void consultar() {
        System.out.println("Nombre: "+super.getNombre_completo());
        System.out.println("Apellidos: "+super.getApellidos());
        System.out.println("Domicilio: "+super.getDomicilio());
        System.out.println("RFC: "+super.getRFC());
        System.out.println("Teléfono: "+super.getTelefono());
        System.out.println("Email: "+super.getCorreo_elect());
        System.out.println("ID: "+getID());
    }

    @Override
    public void alta() 
    {
        System.out.println("-------ALTA CLIENTE------");
        System.out.println("Ingrese nombre");
        super.setNombre_completo(Entrada.next());
        System.out.println("Ingrese apellidos");
        super.setApellidos(Entrada.next());
        System.out.println("Ingrese domicilio");
        super.setDomicilio(Entrada.next());
        System.out.println("Ingrese RFC");
        super.setRFC(Entrada.next());
        System.out.println("Ingrese teléfono");
        super.setTelefono(Entrada.next());
        System.out.println("Ingrese Email");
        super.setCorreo_elect(Entrada.next());
        System.out.println("El ID del cliente es: \n"+ getID());            
    }

    @Override
    public void baja() {
         System.out.println("¿ELIMINAR ESTE CLIENTE?\n"
                                + "1. Si\n"
                                + "2. No");
    }

}
