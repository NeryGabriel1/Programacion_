package POOVII;

import javax.swing.JOptionPane;

public class Use_Contador_Instancias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contador_Instancias[] lista = new Contador_Instancias[30];
		for (int i = 0; i < 30; i++) {
			lista[i] = new Contador_Instancias();
		}
		JOptionPane.showMessageDialog(null, "Instancia actual es de " + Contador_Instancias.dimeInstanciaActual());
	}

}
