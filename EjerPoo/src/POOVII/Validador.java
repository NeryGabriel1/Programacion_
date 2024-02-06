package POOVII;

public class Validador {
	// Para validar si un string es un número
	public static boolean isNumber(String valor) {
		if (valor == null || valor.isEmpty()) {
			return false;
		}
		String num = "-0123456789";
		for (char elem : valor.toCharArray()) {
			if (num.indexOf(elem) == -1) {
				return false;
			}
		}
		return valor.lastIndexOf('-') <= 0;
	}

	// Para comprobar si está en un rango dado
	public static boolean isInRange(int valor, int inferior, int superior) {
		boolean resultados = false;
		if (inferior <= valor && valor <= superior) {
			resultados = !resultados;
		}
		return resultados;
	}
}
