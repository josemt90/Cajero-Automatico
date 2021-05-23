import java.util.List;
import java.util.ArrayList;

public class Cuenta {

	private double saldo;
	private Usuario usuario;
	private List<Gasto> gastos;
	private List<Ingreso>ingresos;
	
		
	public Cuenta(Usuario usuario) {
		
	this.usuario=usuario;	
	 this.saldo=0;
	gastos = new ArrayList<>();
	ingresos = new ArrayList<>();
	
		
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public List<Gasto> getGastos() {
				
	return gastos;	
	}

		
	public List<Ingreso> getIngresos() {
		return ingresos;
	}
		
	public double addGastos(String description,double cantidad) {
		
		try {
			if(cantidad>saldo) {
				throw new GastoException();  // si el gasto es mayor a la cantidad salta la excepcion
			}
			else {
				gastos.add(new Gasto(cantidad,description));		 //almanecamos los gastos en una lista
			    this.saldo= saldo-cantidad;				    
			}
			}catch(GastoException e) {				
		   }
		return saldo;	
	}

	public double addIngresos(String description,double cantidad) {
		ingresos.add(new Ingreso(cantidad,description));
		this.saldo= saldo+cantidad;                         // almacenamos los ingresos en una lista
		return saldo;
	}
	
	public String toString() {
		return"El saldo de "+ usuario.getNombre() + " es de: " + saldo + " euros";   // se devuelve el gasto total
	}
	
}
