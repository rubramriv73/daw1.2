package alternativas;

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 * 
 *	Ejercicio 2: Realiza un programa que pida una hora por teclado y que muestre
 *								luego buenos dias, buenas tardes o buenas noches segun la hora.
 *								Se utilizaran los tramos de 6 a 12, 13 a 20 y de 21 a 5, 
 *								respectivamente. Solo se tienen en cuenta las horas, los minutos
 *								no se deben introducir por teclado 
 *								
 *
 */
public class Ej02Hora {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		
		// Variable to save the hour from the user
		int hour;
		
		// Our Scanner variable to read text from the user
		Scanner sc = new Scanner(System.in);
		
		// Presentation
		System.out.println("\n\t*** GREETINGS ***\t\n");
		
		// We ask the user to give us the hour
		System.out.print("What hour is it?? ");
		hour = sc.nextInt();
		
		if ((hour >= 6) && (hour <= 12)) {
			System.out.println("Good moorning!!");
			
		} else if ((hour >= 13) && (hour <= 20)) {
			System.out.println("Good afternoon!!");

		} else if (((hour >= 21) && (hour <= 24)) || ((hour <= 5) && (hour >= 0))) {
			System.out.println("Good evening!!");
			
		} else {
			System.out.println("Wrong hour");
			 
		}
		
	}

}
