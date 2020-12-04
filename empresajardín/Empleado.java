/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresajardín;


public class Empleado extends Persona{
    
    private double sueldoEmpleado;
    private double hrsTrabajadas;
    private double sueldo;


    
    
    
    
    //-----------MÉTODO CONSTRUCTOR---------//
    
    public Empleado()
    {
        super();
    }

    public Empleado(double sueldoEmpleado, double hrsTrabajadas, double sueldo, String nombre_completo, 
           String apellidos, String domicilio, String RFC, String telefono, String correo_elect,int ID) 
    {
        super(nombre_completo, apellidos, domicilio, RFC, telefono, correo_elect,ID);
   
        this.sueldoEmpleado = sueldoEmpleado;
        this.hrsTrabajadas = hrsTrabajadas;
        this.sueldo = sueldo;
        
       
    }
    
  public void CalSalario() {
           
        System.out.println("¿Cuántas horas trabajó?");
        setHrsTrabajadas(Entrada.nextDouble());
        
        var s = getSueldo();
        var h = getHrsTrabajadas();
        var t = s*h;
        setSueldoEmpleado(t);

  }

    //------------GETTERS Y SETTERS-----------------//
    @Override
    public int getID() {
        return super.getID(); 
    }
    
        @Override
    public void setID(int ID) {
        super.setID(ID); 
    }
    

    public double getSueldoEmpleado() {
        return sueldoEmpleado;
    }

    public void setSueldoEmpleado(double sueldoEmpleado) {
        this.sueldoEmpleado = sueldoEmpleado;
    }

    public double getHrsTrabajadas() {
        return hrsTrabajadas;
    }

    public void setHrsTrabajadas(double hrsTrabajadas) {
        this.hrsTrabajadas = hrsTrabajadas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }



//-----------MÉTODOS ABSTRACTOS---------//
    
    @Override
    public void alta() 
    {
        System.out.println("-------ALTA EMPLEADO------");
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
        System.out.println("El ID del empleado es: \n"+ getID());
        System.out.println("Ingrese sueldo por hora");
        setSueldo(Entrada.nextDouble());   
    }

    @Override
    public void baja() {
        System.out.println("¿ELIMINAR ESTE EMPLEADO?\n"
                                + "1. Si\n"
                                + "2. No");
    }

    @Override
    public void consultar() 
    {
        System.out.println("Nombre: "+super.getNombre_completo());
        System.out.println("Apellidos: "+super.getApellidos());
        System.out.println("Domicilio: "+super.getDomicilio());
        System.out.println("RFC: "+super.getRFC());
        System.out.println("Teléfono: "+super.getTelefono());
        System.out.println("Email: "+super.getCorreo_elect());
        System.out.println("ID: "+getID());
        System.out.println("Sueldo: "+getSueldo());
    }

    @Override
    public void modificar() 
    {  
        
        System.out.println("-------MODIFICAR EMPLEADO------");
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
        System.out.println("Ingrese sueldo por hora");
        setSueldo(Entrada.nextDouble()); 
    }
    
    

    @Override
    public String toString()
    {
        return super.toString();
    }
    
}
