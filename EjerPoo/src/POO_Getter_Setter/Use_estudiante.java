package POO_Getter_Setter;

public class Use_estudiante {

	public static void main(String[] args) {
		estudiante estudianteGaby = new estudiante();
		estudianteGaby.establece_nombre();
		System.out.println(estudianteGaby.dime_nombre());

		estudianteGaby.establece_edad();
		System.out.println(estudianteGaby.dime_edad());

		estudianteGaby.establece_calificacion();
		System.out.println(estudianteGaby.dime_calificacion());

	}

}
