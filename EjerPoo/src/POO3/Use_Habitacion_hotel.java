package POO3;

public class Use_Habitacion_hotel {

	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		Habitacion h1 = new Habitacion(101, "simple");
		Habitacion h2 = new Habitacion(102, "doble");
		Habitacion h3 = new Habitacion(103, "suite");

		// Añadir habitaciones al hotel
		hotel.habitaciones.add(h1);
		hotel.habitaciones.add(h2);
		hotel.habitaciones.add(h3);

		// Reservar una habitación
		hotel.reservar_Habitacion(101);
		

	}

}
