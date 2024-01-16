package POO_Getter_Setter;

public class CuentaBancaria {
	private String Titular;
	private double Saldo;

// metodo añadir constructor
	public CuentaBancaria() {
		Titular = "Gabriel";
		Saldo = 50.00;

	}

	public String dime_titular() {// getter
		return "El Titular de la cuenta es " + Titular;
	}

	public void establece_titular() {// setter
		Titular = "Gabriel";
	}

	public String dime_saldo() {
		return "El saldo de la cuenta es " + Saldo;
	}

	public void establece_saldo() {
		if (Saldo >= 0) {
			Saldo = Saldo;

		} else {
			System.out.println("El saldo no puede ser negativo.");
		}

	}
}
