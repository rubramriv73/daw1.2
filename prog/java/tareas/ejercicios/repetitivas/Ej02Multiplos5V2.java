package repetitivas;

/**
 * @author Rubén Ramírez Rivera
 *
 *	Ejercicio 2:	Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
 *
 */
public class Ej02Multiplos5V2 {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		
		// Presentation
		System.out.println("\n\t*** 5 MULTIPLIERS BETWEEN 0-100 ***\t\n");
		
		int i = 5;
		
		while (i < 101) {
			System.out.print(i + " ");
			i+=5;
			
		}

	}

}
