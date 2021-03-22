package alternativas;

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 *
 *	Ejercicio 3:	Escribe un programa en que dado un número del 1 a 7 escriba 
 *								el correspondiente nombre del día de la semana.
 *
 */
public class Ej03Dia {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		
		int day;
		
		// Our Scanner variable to read text from the user
		Scanner sc = new Scanner(System.in);
		
		// Presentation
		System.out.println("\n\t*** DAY OF THE WEEK ***\t\n");
		
		// Ask the user the number of the day it is
		System.out.println("Number of the day of the week: ");
		day = sc.nextInt();
		
		// We set every possible day its respective day of the week
		switch (day) {
			case 1:
				System.out.println("Day " + day + ": Monday\n");
				break;
				
			case 2:
				System.out.println("Day " + day + ": Tuesday\\n");
				break;
				
			case 3:
				System.out.println("Day " + day + ": Wednesday\n");
				break;
				
			case 4:
				System.out.println("Day " + day + ": Thursday\n");
				break;
				
			case 5:
				System.out.println("Day " + day + ": Friday\n");
				break;
				
			case 6:
				System.out.println("Day " + day + ": Saturday\n");
				break;
				
			case 7:
				System.out.println("Day " + day + ": Sunday\n");
				break;
				
			default:
				System.out.println("Wrong day my friend\n");
				break;
		}

	}

}
