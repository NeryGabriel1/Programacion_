package POO3;

public class Use_alarmas {

	public static void main(String[] args) {
		Alarma reloj = new Alarma();

		System.out.println(reloj.dime_horaAlarma());
		System.out.println(reloj.dime_HoraActual());
		reloj.establecer_AlarmaActivada(true);
		reloj.comprobaralarmaActivada();
	}

}
