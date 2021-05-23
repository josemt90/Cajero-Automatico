import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Usuario usuario= new Usuario();          //se crean las instancias
		Cuenta cuenta=new Cuenta(usuario);		   
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el nombre de usuario: ");
		
		usuario.setNombre(teclado.nextLine());  
        usuario.getNombre();                        //guardamos el nombre en la clase usuario
        
		System.out.println("Introduce la edad: ");	
		
		usuario.setEdad(teclado.nextInt());	
		usuario.getEdad();                         //guardamos la edad en la clase usuario
		
		System.out.println("Introduce el DNI: ");
							
	   if( usuario.setDNI(teclado.next())!=true) {            
		   System.out.println("introduce un dni valido");
		    teclado.next();                                // si el numero de dni es valido se guarda en la clase usurio
	     }usuario.setDNI(teclado.nextLine());
	     usuario.getDNI();
		   	     
	  int cierre=1;		     
	   do { 
	   System.out.println("Realiza una nueva acción\n");       
	   System.out.println("1 Introduce un nuevo gasto");
	   System.out.println("2 Introduce un nuevo ingreso");
	   System.out.println("3 Mostrar gasto");
	   System.out.println("4 Mostrar ingreso");
	   System.out.println("5 Mostrar saldo");
	   System.out.println("0 salir");
	   	   
	   int dato= teclado.nextInt();
	   cierre=dato;
		  
	  switch(dato) {                   // se crea el switch con las opciones disponibles
	  case 1: {
		
		  Gasto gasto = new Gasto(0,null);
		  System.out.println("introduce la descripcion");   // se introduce gasto
		  gasto.setDescription(teclado.next());
		  System.out.println("introduce la cantidad");
		  gasto.setDinero(teclado.nextDouble());
		  cuenta.addGastos(gasto.getDescription(),gasto.getDinero());
		  	 		  
		  break;
	  }
	  case 2: {
		  
		Ingreso ingreso = new Ingreso(0,null);
		 System.out.println("introduce la descripcion");
		 ingreso.setDescription(teclado.next());             // se introduce ingreso
		 System.out.println("introduce la cantidad");
		 ingreso.setDinero(teclado.nextDouble());
		 
		 cuenta.addIngresos(ingreso.getDescription(),ingreso.getDinero());
		 
		  break;
	  }
	  case 3:{
		  Iterator iterator = cuenta.getGastos().iterator();
		  while (iterator.hasNext()) {
			  System.out.println(iterator.next());            // se muestran los gastos
		  }
		  break;
	  }
	  case 4: {
		  Iterator iterator = cuenta.getIngresos().iterator();    // se muestran los ingresos
		  while (iterator.hasNext()) {
			  System.out.println(iterator.next());                 
		  }
			 	  
		  break;
	  }
	  case 5: {
		  
		  System.out.println(cuenta.toString());          // se muestra el saldo total
		  break;
	  }
	  case 0: {
		  System.out.println("Fin del programa.");
		  System.out.println("Gracias por utilizar la aplicacion.");    // se cierra el programa
		 
		  break;
	  }
	  default:{
		  System.out.println("introduce un numero correcto");
	  }
	  }	  	  
	   }while (cierre!=0) ;
	}
	 	
}
