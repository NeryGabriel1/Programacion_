package POOXI_Intre;

import javax.swing.JOptionPane;

public class NotificacionApp implements Notificable {
	private String nombreUsuario;

	// Constructor
	public NotificacionApp(String nomUsuario) {
		this.nombreUsuario = nomUsuario;
	}

	@Override
	public void enviarNotificacion(String mensaje) {
		JOptionPane.showMessageDialog(null, "Enviando notificación de un App a " + this.nombreUsuario);
		JOptionPane.showMessageDialog(null, "Notificación mediante a app:\n" + mensaje);
		JOptionPane.showMessageDialog(null, "La notificación fue enviada correctamente para vos");
	}

	// Método getter para nombre del usuario
	public String dimeNombreUsuario() {
		return this.nombreUsuario;
	}

	// Método setter para email
	public void establecerEmail(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

}
