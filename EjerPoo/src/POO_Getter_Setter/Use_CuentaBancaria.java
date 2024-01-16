package POO_Getter_Setter;

public class Use_CuentaBancaria {

	public static void main(String[] args) {
		CuentaBancaria cuentaGabriel = new CuentaBancaria();

		cuentaGabriel.establece_titular();
		System.out.println(cuentaGabriel.dime_titular());

		cuentaGabriel.establece_saldo();
		System.out.println(cuentaGabriel.dime_saldo());

	}

}
