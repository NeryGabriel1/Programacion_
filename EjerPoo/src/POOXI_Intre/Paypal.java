package POOXI_Intre;

import javax.swing.JOptionPane;

public class Paypal implements ProcesadorDePago {
	@Override
	public void realizarPago() {
		JOptionPane.showMessageDialog(null, "El Pago fue realizado con exito.");
		JOptionPane.showMessageDialog(null, "Gracias por utilizar PayPal.");
	}

	@Override
	public void reembolsarPago() {
		JOptionPane.showMessageDialog(null, "El reembolso de la transferencia se realizó con exito.");
		JOptionPane.showMessageDialog(null, "Gracias por utilizar PayPal.");
	}

}
