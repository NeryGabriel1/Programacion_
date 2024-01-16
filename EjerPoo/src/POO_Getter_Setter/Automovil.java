package POO_Getter_Setter;

public class Automovil {
	private String marca, modelo;

	public Automovil() { 
		marca = "Mamerto";
		modelo = "fiesta";
	}

	public String dime_marca() {
		return "He comprado un coche de la marca " + marca;
	}
	public void estarblecer_marca() { 
		marca="Mamerto";
	}
	
	public String dime_modelo() { 
		return "He conseguido un coche modelo "+modelo;
	}
	
	public void establecer_modelo() {
		modelo="Fiesta";
	}

}
