import java.io.*;

public class ACT2_EJ7 {

	static BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
	static String cadenaLeida;

	public static void main(String[] args) {

		// DECLARACIÓN DE LAS VARIABLES
		short shDorsal;
		float fPeso, fAltura;

		
		shDorsal = pedirDorsal();
		fPeso = pedirPeso();
		fAltura = pedirAltura();

		
		mostrarResultado(shDorsal, fPeso, fAltura);

	}

	/**
	 * Función que devuelve las variables leidas por teclado anteriormente, es decir
	 * devuelve el valor del dorsal, de la altura y del peso.
	 *
	 * @author Carla
	 * @param short, float y float
	 * @return String
	 */
	public static void mostrarResultado(short shDorsal, float fPeso, float fAltura) {
		System.out.println("El dorsal numero " + shDorsal + " mide " + fAltura + " m y pesa " + fPeso + "kg");
	}

	/**
	 * Función que pide al usuario por teclado el valor del peso de una persona
	 * 
	 * @author Carla
	 * @param ninguno
	 * @return float
	 */
	public static float pedirPeso() {
		float fPeso;
		System.out.println("Introduce el peso (40...150): ");

		try {

			cadenaLeida = lector.readLine();

		} catch (Exception e) {

			cadenaLeida = "";

		}
		fPeso = Float.parseFloat(cadenaLeida);
		return fPeso;
	}

	/**
	 * Función que pide al usuario por teclado el valor de la altura de una persona
	 * 
	 *  @author Carla
	 *  @param ninguno
	 *  @return Altura
	 */
	public static float pedirAltura() {
		float fAltura;
		System.out.println("Introduce el altura(1,40...2.10): ");

		try {

			cadenaLeida = lector.readLine();

		} catch (Exception e) {

			cadenaLeida = "";

		}
		fAltura = Float.parseFloat(cadenaLeida);
		return fAltura;
	}
	
	
	/**
	 * 	Función que pide al usuario por teclado el valor del dorsal de una persona
	 * 
	 *  @author Carla
	 *  @param ninguno
	 *  @return short
	 */
	public static short pedirDorsal() {
		short shDorsal;
		System.out.println("Introduce el dorsal (1...9999): ");

		try {

			cadenaLeida = lector.readLine();

		} catch (Exception e) {

			cadenaLeida = "";

		}

		shDorsal = Short.parseShort(cadenaLeida);
		return shDorsal;
	}

}
