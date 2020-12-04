/*
JUAN JOSÉ SOLÓRZANO CARRILLO
*/
package empresajardín;
        

public class Jardinero extends Empleado{
    
    private double tiempExtra;
    
//------MÉTODO CONSTRUCTOR JARDINERO-------//
    
    public Jardinero(double tiempExtra, double sueldoEmpleado, double hrsTrabajadas, double sueldo, 
       String nombre_completo, String apellidos, String domicilio, String RFC, String telefono,String correo_elect, int ID) 
    {
        super(sueldoEmpleado, hrsTrabajadas, sueldo, nombre_completo, apellidos, domicilio, RFC, telefono, correo_elect,ID);
        this.tiempExtra = tiempExtra;
    }
    
//-------MÉTODO CONSTRUCTOR VACÍO---------//
    
    public Jardinero(){
        
        super();
    }
    
//----------GETTERS Y SETTERS-----------//
    
    public double getTiempExtra() {
        return tiempExtra;
    }

    public void setTiempExtra(double tiempExtra) {
        this.tiempExtra = tiempExtra;
    }

    @Override
    public void CalSalario() {
        super.CalSalario();System.out.println("¿Generó tiempo Extra?\n 1- SI\n 2- NO");
        String resp = Entrada.next();
        if(resp.equals("1"))
        {
            System.out.println("¿Cuantas horas extras generó?");
            setTiempExtra(Entrada.nextDouble());
            var tE = getTiempExtra();
            var tt = (tE*2*super.getSueldo())+getSueldoEmpleado();
            setSueldo(tt);
            System.out.println("Sueldo total: $"+getSueldo());
        }else{
             System.out.println("Sueldo total: $"+getSueldoEmpleado());
        }
        
    }

      
    @Override
    public void setSueldo(double sueldo) {
        super.setSueldo(sueldo); 
    }

    @Override
    public double getSueldo() {
        return super.getSueldo(); 
    }

    @Override
    public void setID(int ID) {
        super.setID(ID); 
    }

    @Override
    public int getID() {
        return super.getID(); 
    }


    @Override
    public void modificar() {
        super.modificar(); 
    }

    @Override
    public void consultar() {
        super.consultar();
    }

    @Override
    public void baja() {
        super.baja();
    }

    @Override
    public void alta() {
        super.alta(); 
    }

    
    

}
