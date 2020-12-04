//JUAN JOSÉ SOLÓRZANO CARRILLO

package empresajardín;
import java.util.*;

public class EmpresaJardín 
{ 
    public static void main(String[] args) 
    {
        //Arreglos de clases y variables globales
        Scanner Entrada = new Scanner(System.in);
        Persona  newPersona[]  = new Persona[20];
        Empleado newEmpleado[] = new Empleado[20];
        Jardin   newJardin[]   = new Jardin[20];
        Contrato   newContrato[]   = new Contrato[20];
        
        int i=0,z=0,ja = 0, co = 0,k = 0;
        boolean band = true,menu = true;
        while(menu)
        {
            String selec = "",selecn = "0",selec2 = "";
            System.out.println("---------MENÚ PRINCIPAL-------\n"
                  + "1. Empleados.\n"
                  + "2. Clientes.\n"
                  + "3. jardín.\n"  
                  + "4. Crear contrato.\n"
                  + "5. Salir");
            selec = Entrada.next();
            
            do{
                switch(selec){
                    case "1":
                
                        System.out.println("-----MENÚ EMPLEADOS---\n"
                                + "1. Dar de alta.\n"
                                + "2. Dar de baja.\n"
                                + "3. Colsultar.\n"
                                + "4. Modificar.\n" 
                                + "5. Consultar Salario.\n"
                                + "6. Regresar");
                        String selec1 = Entrada.next();
                        
                        switch(selec1)
                        {
                            case "1":
                                
                                do{
                                 System.out.println("---MENÚ ALTA EMPLEADO---\n"
                                         + "1. Jardinero.\n"
                                         + "2. Atención a cliente.\n"
                                         + "3. Regresar.");

                                 selec2 = Entrada.next();
                                 if(selec2.equals("1"))
                                 {
                                     Jardinero newJard = new Jardinero();
                                     z=z+1;
                                     newJard.setID(z);
                                     do{
                                     try{
                                     newJard.alta();
                                     band = true;
                                     }catch(java.util.InputMismatchException e){System.out.println("¡Valor no valido!");
                                     band = false;}
                                     }while(!band);
                                     newEmpleado[i] = newJard;
                                     i = i+1;
                                 }
                         
                                 if(selec2.equals("2"))
                                 {
                                     AtencionClientes newAtC = new AtencionClientes();
                                     z=z+1;
                                     newAtC.setID(z);
                                     do{
                                     try{
                                     band = true;
                                     newAtC.alta();
                                     }catch(java.util.InputMismatchException e){System.out.println("¡Valor no valido!");
                                     band = false;}
                                     }while(!band);
                                     newEmpleado[i] = newAtC;
                                     i = i+1;
                                 }
                                 
                                }while(!selec2.equals("3")); 
                                
                            break;
                            case "2":
                                
                                System.out.println("DAR DE BAJA A EMPLEADO...");
                                int n=0;
                                for(int j = 0; j<newEmpleado.length; j++)
                                {
                                    try
                                    {
                                        System.out.println("Empleado ID:" + newEmpleado[j].getID()+ 
                                                          " -"+newEmpleado[j].getNombre_completo());
                                    }catch(java.lang.NullPointerException exc){n=n+1;}
                                }
                                if(n==20)
                                {
                                 System.out.println("NO HAY EMPLEADOS, SE NECESITA DAR DE ALTA"); 
                                }
                                else
                                {
                                    do{
                                        System.out.println("Seleccione número empleado");
                                        try{
                                        k = Entrada.nextInt();
                                        newEmpleado[k-1].consultar();
                                        band = true;
                                        }catch(java.lang.NullPointerException e){System.out.println("OPCIÓN NO VALIDA!");
                                        band = false;}
                                        }while(!band);
                                        newEmpleado[k-1].baja();
                                        int re = Entrada.nextInt();
                                        if(re==1)
                                        {        
                                            newEmpleado[k-1]= new Empleado(0,0,0,"","","","","","",0);
                                            System.out.println("Empleado eliminado...");
                                        }
                                }
                            break;
                            case "3":
                                int ID=0;
                                try
                                {
                                    for(int j = 0; j<newEmpleado.length; j++)
                                {
                                    if(newEmpleado[j].getID()!=0){
                                    System.out.println("Empleado ID:" + newEmpleado[j].getID() + 
                                                     " -"+newEmpleado[j].getNombre_completo());}
                                }
                                }catch(java.lang.NullPointerException e){}
                                
                                if(newEmpleado[0]!=null||newEmpleado[i].getID()!=0)
                                {
                                    System.out.println("Ingresa ID de empleado");
                                    ID = Entrada.nextInt();
                                }
                                boolean h = true;
                                try
                                {
                                for(int j = 0; j<newEmpleado.length; j++)
                                {
                                        if(newEmpleado[j].getID()==ID)
                                        {
                                            newEmpleado[j].consultar();
                                            System.out.println("!ENCONTRADO!");
                                            h = false;
                                        }
                                }
                                }catch(java.lang.NullPointerException e){}
                                if(h)
                                {
                                    System.out.println("¡No empleados para dar de baja!");
                                    //selec2 = "3";
                                }
                            break;
                            case "4":
                                System.out.println("Ingresa ID de empleado que desea modificar");
                                n=0;
                                
                                for(int j = 0; j<newEmpleado.length; j++)
                                {
                                    try
                                    {
                                        System.out.println("Empleado ID:" + newEmpleado[j].getID()+ " -"+newEmpleado[j].getNombre_completo());
                                    }
                                    catch(java.lang.NullPointerException exc)
                                    {n=n+1;}
                                }
                                
                                if(n==20)
                                {
                                 System.out.println("NO HAY EMPLEADOS, SE NECESITA DAR DE ALTA");
                                 break;
                                }
                                
                                ID = Entrada.nextInt();
                               try
                               { 
                                   for(int j = 0; j<newEmpleado.   length; j++)
                                   {
                                        if(newEmpleado[j].getID()==ID)
                                        { 
                                            System.out.println("EMPLEADO A MODIFICAR:\n");
                                            newEmpleado[j].consultar();
                                            newEmpleado[j].modificar();
                                        }else
                                            System.out.println("No hay coinsidencia");
                                    }
                                }catch(java.lang.NullPointerException e){}
                               
                            break;
                            case "5":
                                try
                                {
                                    for(int j = 0; j<newEmpleado.length; j++)
                                    {
                                        System.out.println("Empleado ID:" + newEmpleado[j].getID() + " -"+newEmpleado[j].getNombre_completo());
                                    }
                                }catch(java.lang.NullPointerException e){}
                                
                                if(newEmpleado[0]!=null)
                                {
                                    System.out.println("Ingresa ID de empleado");
                                    k = Entrada.nextInt();
                                    newEmpleado[k-1].CalSalario();}else{System.out.println("¡No hay empleados!");}
                            break;
                        
                        }
                        
 ///CASE 2 SWITCH PRINCIPAL///
                        
                        break; 
                        case "2":
                            i=0;
                              System.out.println("-----MENÚ CLIENTES---\n"
                                    + "1. Dar de alta.\n"
                                    + "2. Dar de baja.\n"
                                    + "3. Colsultar.\n"
                                    + "4. Modificar.\n"
                                    + "5. Regresar");
                            String selec3 = Entrada.next();

                            switch(selec3){
                                
                                case "1":
                                    
                                    System.out.println("---MENÚ ALTA CLIENTE---\n");
                                     Cliente newCliente = new Cliente();
                                     z=z+1;
                                     newCliente.setID(z);
                                     newCliente.alta();
                                     newPersona[i] = newCliente;
                                     i = i+1;
                                     
                                break;
                                case "2":

                                     System.out.println("DAR DE BAJA A CLIENTE...Seleccione número empleado");
                                     int n=0;
                                     for(int j = 0; j<newPersona.length; j++)
                                     {
                                        try
                                        {
                                            System.out.println("Empleado ID:" + newPersona[j].getID()+ " -"+newPersona[j].getNombre_completo());
                                        }
                                        catch(java.lang.NullPointerException exc){n=n+1;}
                                     }
                                     
                                    if(n==20)
                                    {
                                        System.out.println("NO HAY CLIENTES, SE NECESITA DAR DE ALTA");
                                    }else
                                    {
                                        k = Entrada.nextInt();
                                        newPersona[k-1].consultar();
                                        newPersona[k-1].baja();
                                        int re = Entrada.nextInt();
                                        
                                        if(re==1)
                                        {        
                                            newPersona[k-1]= new Cliente("","","","","","",0,0);
                                            System.out.println("Cliente eliminado...");
                                        }
                                    }

                                break;
                                case "3":
                                    
                                    boolean h = true;
                                    int ID=0;
                                    try{
                                    for(int j = 0; j<newPersona.length; j++)
                                    {
                                        System.out.println("Cliente ID:" + newPersona[j].getID() + " -"+newPersona[j].getNombre_completo());
                                    }
                                    }catch(java.lang.NullPointerException e){}
                                   
                                    if(newPersona[0]!=null)
                                    {
                                        System.out.println("Ingresa ID de cliente");
                                        ID = Entrada.nextInt();
                                    }
                                    try
                                    {
                                        for(int j = 0; j<newPersona.length; j++)
                                        
                                        {
                                            if(newPersona[j].getID()==ID)
                                            {
                                                newPersona[j].consultar();
                                                System.out.println("!ENCONTRADO!");
                                                h = false;
                                            }
                                        }
                                    }catch(java.lang.NullPointerException e){}
                                    
                                    if(h)
                                    {
                                        System.out.println("No hay clientes para dar de baja!");
                                    }
                                    
                                break;
                                case "4":
                                    System.out.println("Ingresa ID de cliente que desea modificar");
                                    n=0;
                                    for(int j = 0; j<newPersona.length; j++)
                                    {
                                        try
                                        {
                                            System.out.println("Empleado ID:" + newPersona[j].getID()+ " -"+newPersona[j].getNombre_completo());
                                        }
                                        catch(java.lang.NullPointerException exc)
                                        {n=n+1;}
                                    }
                                    if(n==20)
                                    {
                                     System.out.println("NO HAY CLIENTES, SE NECESITA DAR DE ALTA");

                                    }else{
                                    ID = Entrada.nextInt();

                                    try{
                                    for(int j = 0; j<newPersona.   length; j++)
                                    {
                                            if(newPersona[j].getID()==ID)
                                            { 
                                                newPersona[j].consultar();
                                                newPersona[j].modificar();
                                            }else
                                                System.out.println("No hay coinsidencia");
                                    }
                                     }catch(java.lang.NullPointerException e){}}
                                break;
                                case "5":
                                    selecn="1";
                                break;
                            }
                            
                    break;
                    case "3": 
                        
                        i=0;
                        System.out.println("-----MENÚ JARDÍN---\n"
                                    + "1. Dar de alta.\n"
                                    + "2. Dar de baja.\n"
                                    + "3. Colsultar.\n"
                                    + "4. Modificar.\n"
                                    + "5. Regresar");
                        
                        String selec4 = Entrada.next();
                        
                        switch(selec4){  
                            
                                case "1":
                                    System.out.println("---MENÚ ALTA JARDÍN---\n");
                                     Jardin newJar = new Jardin();
                                     ja=ja+1;
                                     newJar.setID(ja);
                                     newJar.agregar();
                                     newJardin[i]= newJar;
                                     i = i+1;
                                break;
                                case "2":

                                    System.out.println("DAR DE BAJA JARDÍN...Seleccione ID jardin");
                                    int n=0;
                                    for(int j = 0; j<newJardin.length; j++)
                                    {
                                        try
                                        {
                                            System.out.println("Jadín ID:" + newJardin[j].getID()+ " -"+newJardin[j].getNomjardin());
                                        }
                                        catch(java.lang.NullPointerException exc)
                                        {n=n+1;}
                                    }
                                    if(n==20)
                                    {
                                     System.out.println("NO HAY JARDINES, SE NECESITA DAR DE ALTA");
                                     selec2 = "3";
                                    }else
                                    {
                                    k = Entrada.nextInt();
                                    newJardin[k-1].consultar();
                                    newJardin[k-1].eliminar();
                                    int re = Entrada.nextInt();
                                    if(re==1)
                                    {        
                                        newJardin[k-1]= new Jardin();
                                        System.out.println("Jardin eliminado...");
                                    }
                                    }

                                break;
                                case "3":
                                    try{

                                    for(int j = 0; j<newJardin.length; j++)
                                    {
                                        if(newJardin[j].getID()!=0)
                                        System.out.println("Jardin ID:" + newJardin[j].getID() + " -"+newJardin[j].getNomjardin());
                                    }
                                    }catch(java.lang.NullPointerException e){}
                                    if(newJardin[0]==null||newJardin[0].getID()==0){
                                        System.out.println("¡No hay jardines!");break;}

                                    System.out.println("Ingresa ID del jardin");
                                    boolean h = true;
                                    int ID = Entrada.nextInt();
                                    try
                                    {
                                        for(int j = 0; j<newJardin.length; j++)
                                        {
                                            if(newJardin[j].getID()==ID)
                                            {
                                                newJardin[j].consultar();
                                                System.out.println("!ENCONTRADO!");
                                                h = false;
                                            }
                                        }
                                    }catch(java.lang.NullPointerException e){}
                                    
                                    if(h)
                                    {
                                        System.out.println("No hay coincidencias");
                                        selec2 = "3";
                                    }
                                    
                                break;
                                case "4":
                                    System.out.println("Ingresa ID de jardin a modificar");
                                    n=0;
                                    for(int j = 0; j<newJardin.length; j++)
                                    {
                                        try
                                        {
                                            System.out.println("Jardin ID:" + newJardin[j].getID() + " -"+newJardin[j].getNomjardin());
                                        }
                                        catch(java.lang.NullPointerException exc)
                                        {n=n+1;}
                                    }
                                    if(n==20)
                                    {
                                     System.out.println("NO HAY JARDINES, SE NECESITA DAR DE ALTA");

                                    }else{
                                    ID = Entrada.nextInt();
                                    try{
                                    for(int j = 0; j<newJardin.   length; j++)
                                    {
                                            if(newJardin[j].getID()==ID)
                                            { 
                                                newJardin[j].consultar();
                                                newJardin[j].modificar();
                                            }else
                                                System.out.println("No hay coinsidencia");
                                    }
                                    }catch(java.lang.NullPointerException e){}}
                                break;
                                case "5":
                                    selecn="1";
                                break;
                            }
                    break;       
                    
                    case "4":
                        
                        i=0;
                        co=co+1;
                        Contrato newContra = new Contrato();
                        System.out.println("---MENÚ CONTRATO---\n"
                                + "1.Crear contrato.\n"
                                + "2.Colsutar\n"
                                + "3.Modificar\n"
                                + "4.Eliminar\n"
                                + "5.Regresar");
                        String selec6 = Entrada.next();
                        switch(selec6){
                            case "1":
                                System.out.println("¿Que datos tiene?\n"
                                + "1.Nombre, domicilio y telefono\n"
                                + "2.Nombre, domicilio, telefono, email y RFC\n"
                                + "3.Todos\n"
                                + "4.Regresar");
                                String selec5 = Entrada.next();
                                switch(selec5){
                                    case "1":

                                         System.out.println("---ALTA CONTRATO---\n");
                                         System.out.println("Nombre: ");
                                         newContra.setNombre_completo(Entrada.next());
                                         System.out.println("Apellidos: ");
                                         newContra.setApellidos(Entrada.next());
                                         System.out.println("Domicilio: ");
                                         newContra.setDomicilio(Entrada.next());
                                         System.out.println("Telefono: ");
                                         newContra.setTelefono(Entrada.next());
                                         Contrato newContra1 = new Contrato(newContra.getNombre_completo(),
                                  newContra.getApellidos(),newContra.getDomicilio(), newContra.getTelefono());
                                         newContra1.setNumContrato(co);
                                         newContrato[i]= newContra1;
                                         i = i+1;
                                    break;
                                    case "2":

                                         newContra.setNumContrato(co);
                                         System.out.println("---ALTA CONTRATO---\n");
                                         System.out.println("Nombre: ");
                                         newContra.setNombre_completo(Entrada.next());
                                         System.out.println("Apellidos: ");
                                         newContra.setApellidos(Entrada.next());
                                         System.out.println("Domicilio: ");
                                         newContra.setDomicilio(Entrada.next());
                                         System.out.println("Telefono: ");
                                         newContra.setTelefono(Entrada.next());
                                         System.out.println("RFC: ");
                                         newContra.setRFC(Entrada.nextLine());
                                         System.out.println("Email: ");
                                         newContra.setCorreo_elect(Entrada.nextLine());
                                         Contrato newContra2 = new Contrato(newContra.getNombre_completo(),
                                  newContra.getApellidos(),newContra.getDomicilio(), newContra.getTelefono(),
                                         newContra.getRFC(),newContra.getCorreo_elect());
                                         newContra2.setNumContrato(co);
                                         newContrato[i]= newContra2;
                                         i = i+1;
                                    break;
                                    case "3":

                                         newContra.setNumContrato(co);
                                         System.out.println("---ALTA CONTRATO---\n");
                                         System.out.println("Nombre: ");
                                         newContra.setNombre_completo(Entrada.next());
                                         System.out.println("Apellidos: ");
                                         newContra.setApellidos(Entrada.next());
                                         System.out.println("Domicilio: ");
                                         newContra.setDomicilio(Entrada.next());
                                         System.out.println("Telefono: ");
                                         newContra.setTelefono(Entrada.next());
                                         System.out.println("RFC: ");
                                         newContra.setRFC(Entrada.nextLine());
                                         System.out.println("Email: ");
                                         newContra.setCorreo_elect(Entrada.nextLine());
                                         System.out.println("Tipo de jardín: ");
                                         newContra.setTipoJardin(Entrada.nextLine());
                                         System.out.println("Tiempo dedicado: ");
                                         newContra.setTiempoDedicacion(Entrada.nextInt());
                                         System.out.println("Extencion del jardín: ");
                                         newContra.setExtencionJard(Entrada.nextDouble());

                                         Contrato newContra3 = new Contrato(newContra.getNombre_completo(),
                                         newContra.getApellidos(),newContra.getDomicilio(), newContra.getTelefono(),
                                         newContra.getRFC(),newContra.getCorreo_elect(),newContra.getTipoJardin(),newContra.getTiempoDedicacion(),
                                         newContra.getExtensionJard() );
                                         newContra3.setNumContrato(co);
                                         newContrato[i]= newContra3;
                                         i = i+1;
                                    break;
                                    case "4":
                                    break;

                                }
                            break;
                            case "2":
                                try{

                                    for(int j = 0; j<newContrato.length; j++)
                                    {
                                        if(newContrato[j].getNumContrato()!=0);
                                        System.out.println("Numero de contrato: " + newContrato[j].getNumContrato() + " -"+newContrato[j].getNombre_completo());
                                    }
                                    }catch(java.lang.NullPointerException e){}
                                    if(newContrato[0]==null||newContrato[0].getNumContrato()==0){
                                        System.out.println("¡No hay contratos!");break;}

                                    System.out.println("Ingresa número de contrato");
                                    boolean h = true;
                                    int ID = Entrada.nextInt();
                                    try{
                                    for(int j = 0; j<newContrato.length; j++)
                                    {
                                            if(newContrato[j].getNumContrato()==ID)
                                            {
                                                newContrato[i].mostar();
                                                System.out.println("!ENCONTRADO!");
                                                h = false;
                                            }
                                    }
                                    } catch(java.lang.NullPointerException e){}
                                    if(h)
                                    {
                                        System.out.println("No hay coincidencias");
                                        selec2 = "3";
                                    }
                            break;
                            case "3":
                                 System.out.println("Ingresa numero de contrato a modificar");
                                    int n=0;
                                    for(int j = 0; j<newContrato.length; j++)
                                    {
                                        try
                                        {
                                            System.out.println("Numero de contrato: " + newContrato[j].getNumContrato() + " -"+newContrato[j].getNombre_completo());
                                        }
                                        catch(java.lang.NullPointerException exc)
                                        {n=n+1;}
                                    }
                                    if(n==20)
                                    {
                                     System.out.println("NO HAY CONTRATOS, SE NECESITA DAR DE ALTA");

                                    }else{
                                    ID = Entrada.nextInt();
                                    try{
                                    for(int j = 0; j<newContrato.   length; j++)
                                    {
                                            if(newContrato[j].getNumContrato()==ID)
                                            {
                                                newContrato[i].mostar();
                                                newContrato[i].modificar();

                                            }else
                                                System.out.println("No hay coinsidencia");
                                    }
                                    }catch(java.lang.NullPointerException e){}}
                            break;
                            case "4":

                                    System.out.println("Eliminar contrato...Seleccione ID jardin");
                                    n=0;
                                    for(int j = 0; j<newContrato.length; j++)

                                    {
                                        try
                                        {
                                            System.out.println("Numero de contrato: " + newContrato[j].getNumContrato() + " -"+newContrato[j].getNombre_completo());
                                        }
                                        catch(java.lang.NullPointerException exc)
                                        {n=n+1;}
                                    }
                                    
                                    if(n==20)
                                    {
                                        System.out.println("NO HAY CONTRATOS, SE NECESITA DAR DE ALTA");
                                        selec2 = "3";
                                    }
                                    else
                                    {
                                        k = Entrada.nextInt();
                                        newContrato[k-1].mostar();
                                        newContrato[k-1].eliminar();
                                        int re = Entrada.nextInt();
                                        
                                        if(re==1)
                                        {        
                                            newContrato[k-1]= new Contrato();
                                            System.out.println("Jardin eliminado...");
                                        }
                                    }
                                    
                                break;
                            case "5":
                                selecn="0";
                                break;
                        }
                    break;    
                    case "5":   
                         menu=false;
                        break;
                    }break;
                    
                    }while(selecn.equals("0"));

    }
        
    }
}
