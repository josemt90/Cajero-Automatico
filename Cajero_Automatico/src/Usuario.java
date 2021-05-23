import java.util.regex.*;
import java.util.Scanner;

public class Usuario {
		
	private String nombre;
	private int edad;
	private String DNI;
	
	 Usuario() {
	    this.nombre="";
	    this.edad=0;
	    this.DNI="";
			
	}	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {			
		this.nombre=nombre;
	}

	public int getEdad() {
        return edad;
	}

	public void setEdad(int edad) {	 
		this.edad = edad;
	}

	public String getDNI() {			
		return DNI; 
	}
	
	public boolean setDNI(String DNI) {
		if(DNI.matches("^[0-9]{8}-?[A-Z]$")) {   // si el numero introducido tiene 8 numeros y una letra devuelve true
			this.DNI=DNI;
			return true;
			
			}return false;
	}
    @Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + "]";
	}
}


		
	


			

	


