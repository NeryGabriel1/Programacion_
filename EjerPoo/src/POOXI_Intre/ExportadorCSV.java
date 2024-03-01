package POOXI_Intre;

import javax.swing.JOptionPane;

public class ExportadorCSV implements Exportable {

	@Override
	public void exportarDatos() {
		JOptionPane.showMessageDialog(null, "Exportando un documento CSV.");
	}
}
