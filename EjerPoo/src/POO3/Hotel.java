package POO3;

import java.util.*;

public class Hotel {
	ArrayList<Habitacion> habitaciones;// crea una lista

	// Constructor
	public Hotel() {
		this.habitaciones = new ArrayList<>();
	}

	// Método de reserva
	public void reservar_Habitacion(int numero) {
		if (verificar_Disponibilidad(numero)) {
			for (Habitacion ha : habitaciones) {
				if (ha.getNumero() == numero) {
					ha.setOcupada(true);
					System.out.println("Reserva exitosa.");
					break;
				}
			}
		} else {
			System.out.println("No se puede hacer la reserva.");
		}
	}

	// metodo de cancelamiento
	public void cancelar_Reserva(int numero) {
		if (!verificar_Disponibilidad(numero)) {
			for (Habitacion h : habitaciones) {
				if (h.getNumero() == numero) {
					h.setOcupada(false);
					System.out.println("Reserva cancelada");
					break;
				}
			}
		} else {
			System.out.println("La habitación no está reservada.");
		}

	}

	// metodo de verificado
	public boolean verificar_Disponibilidad(int numero) {
		for (Habitacion h : habitaciones) {
			if (h.getNumero() == numero) {
				return !h.getOcupada();
			}
		}
		System.out.println("No existe dicha habitación.");
		return false;
	}

}
