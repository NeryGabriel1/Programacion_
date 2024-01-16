package POO_Getter_Setter;

public class Use_Automovil {

	public static void main(String[] args) {
		Automovil fiestax = new Automovil();

		fiestax.estarblecer_marca();
		System.out.println(fiestax.dime_marca());

		fiestax.establecer_modelo();
		System.out.println(fiestax.dime_modelo());

	}

}
