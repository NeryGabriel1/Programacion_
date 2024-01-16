package POO_Getter_Setter;

public class CuentaBancaria {
	private String Titular;
	private double Saldo;

	public String dime_titular() {
		return "El Titular de la cuenta es " + Titular;
	}

	public void establece_titular() {
		Titular = "Gabriel";
	}

	public double dime_saldo() {
		return Saldo;
	}

	public void establece_saldo() {
		Saldo = 500;
		if (Saldo >= 0) {
			Saldo = Saldo;

		} else {
			System.out.println("El saldo no puede ser negativo.");
		}

	}
}
