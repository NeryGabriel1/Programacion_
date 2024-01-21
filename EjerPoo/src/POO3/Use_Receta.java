package POO3;

import java.util.Scanner;

public class Use_Receta {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receta receta = new Receta();

		cargarReceta(receta);
		receta.mostrarReceta();
	}

	private static void cargarReceta(Receta receta) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Para generar la receta ingrese la cantidad de ingredietes que va a tener:");
		int cantidadIngrediente = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cantidadIngrediente; i++) {
			System.out.print("Ingrese el ingrediente:");
			receta.setAñadirIngrediente(sc.nextLine());
		}
		System.out.print("Ahora ingrese la cantidad de pasos que va a tener la receta: ");
		int cantidadPasos = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < cantidadPasos; i++) {
			System.out.print("Ingrese el paso " + (i + 1) + ":");
			receta.addPaso(sc.nextLine());
		}
		sc.close();
	}

}
