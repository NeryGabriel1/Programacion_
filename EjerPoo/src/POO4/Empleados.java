package POO4;

public class Empleados {
	// atributos
	private String nombre;
	private int horas;
	private double tarifa;

	// constructor
	public Empleados() {
		this.nombre = nombre;
		this.horas = horas;
		this.tarifa = tarifa;
	}

	// getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	// método para calcular el salario de los empleados
	public double calcularSalario() {
		return horas * tarifa;
	}
}