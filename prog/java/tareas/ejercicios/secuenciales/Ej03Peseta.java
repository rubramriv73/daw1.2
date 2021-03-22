package secuenciales;

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 * 
 *	Ejericicio 3: Realiza un conversor de pesetas a euros. La cantidad de euros
 *								que se quiere convertir debe ser  introducida por teclado
 */
public class Ej03Peseta {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		
		// We declare our euro and pesetas variables
		double pts;
		double euro;
		
		
		// Our Scanner variable to read text from the user
		Scanner sc = new Scanner(System.in);
		
		// Presentation
		System.out.println("\n\t*** PESETA TO EURO CONVERTER ***\t\n");
		
		// We ask the user to insert the quantity of euros to convert
		System.out.print("Insert the quantity of pesetas you want to convert: ");
		pts = sc.nextDouble();
		
		// 1€ equals 166,386pts
		euro = pts * 0.006;
		
		// Show the user the result
		System.out.println(pts +" pts = " + euro + " €");
	}

}
