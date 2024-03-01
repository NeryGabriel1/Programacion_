package POOXI_Intre;

import javax.swing.JOptionPane;

public class ExportadorPDF implements Exportable {

	@Override
	public void exportarDatos() {
		JOptionPane.showMessageDialog(null, "Exportando un documento PDF");
	}

}
