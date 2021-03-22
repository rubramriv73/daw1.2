package secuenciales;

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 * 
 *	Ejercicio 2: Realiza un conversor de euros a pesetas. La cantidad de euros
 *								que se quiere convertir debe ser  introducida por teclado
 */
public class Ej02Euro {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		
		// We declare our euro and pesetas variables
		double euro;
		double pts;
		
		// Our Scanner variable to read text from the user
		Scanner sc = new Scanner(System.in);
		
		// Presentation
		System.out.println("\n\t*** EURO TO PESETA CONVERTER ***\t\n");
		
		// We ask the user to insert the quantity of euros to convert
		System.out.print("Insert the quantity of euros you want to convert: ");
		euro = sc.nextDouble();
		
		// 1€ equals 166,386pts
		pts = euro * 166.386;
		
		// Show the user the result
		System.out.println(euro + " € = " + pts +" pts");
	}

}
