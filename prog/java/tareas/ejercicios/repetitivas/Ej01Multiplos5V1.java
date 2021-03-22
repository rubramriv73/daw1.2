package repetitivas;

/**
 * @author Rubén Ramírez Rivera
 * 
 * 	Ejercicio 1:	Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
 *
 */
public class Ej01Multiplos5V1 {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		
		// Presentation
		System.out.println("\n\t*** 5 MULTIPLIERS BETWEEN 0-100 ***\t\n");
		
		for (int i = 5; i <= 100; i+=5) {
			System.out.print (i +" ");
		}

	}

}
