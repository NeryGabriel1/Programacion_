package POO5;

import java.util.*;
public class Empleado {
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre=nom;
		sueldo=sue;
		
		GregorianCalendar calendario = new GregorianCalendar (agno, mes-1, dia);
		alta_contrato=calendario.getTime();
	}
	
	private String nombre;
	private double sueldo;
	private Date alta_contrato;
	
	public String dameNombre() { //getter
		return nombre;
	}
	
	public void estableceNombre() { //setter
		nombre=nombre;
	}
	public double dameSueldo() { //getter
		return sueldo;
	}
	public Date dameFechaContrato() { //getter
		return alta_contrato;
	}
	public void estableceFechaContrato() { //setter
		alta_contrato=alta_contrato;
	}
	
	// Método para umentar el sueldo
		public void subeSueldo(double aumento) {
			if (aumento > 0) {
				this.sueldo += this.sueldo*(aumento*0.01);
			}else {
				System.out.println("El porcentaje debe ser mayor a cero.");
			}
		}
		// Método para mostrar los datos del empleado
		public String toString() {
			String resultado = "Nombre del empleado: " + this.nombre;
			resultado += "\nSueldo: " + this.sueldo;
			resultado += "\nFecha de contrato: " + this.alta_contrato +"\n";
			return resultado;
		}
 
}



