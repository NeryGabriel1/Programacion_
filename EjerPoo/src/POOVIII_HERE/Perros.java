package POOVIII_HERE;

import javax.swing.JOptionPane;

public class Perros extends Animal {
	// Constructor que usa el contructor de la clase madre
	public Perros() {
		super();
	}

	// Overriding, sobreescritura del método emitir Sonido
	@Override
	public void emitirSonido() {
		JOptionPane.showMessageDialog(null, "El perro hace guau");
	}
}
