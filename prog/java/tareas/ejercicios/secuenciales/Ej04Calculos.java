package secuenciales;

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 * 
 *	Ejericicio 4: Escribe un programa que sume, reste, multiplique y divide 
 *								dos numeros introducidos por teclado.
 *								
 */
public class Ej04Calculos {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		
		// Variables to save the number inserted by the user
		int num1;
		int num2;
		
		// Our Scanner variable to read text from the user
		Scanner sc = new Scanner(System.in);
		
		// Presentation
		System.out.println("\n\t*** OPERATIONS ***\t\n");
		
		// We ask the user to insert 2 numbers
		System.out.print("Insert a number: ");
		num1 = sc.nextInt();
		System.out.print("Insert a number: ");
		num2 = sc.nextInt();
		
		// We show the user the results
		System.out.println("\nOperations:");
		System.out.println("Add = " + (num1 + num2));
		System.out.println("Subtract = " + (num1 - num2));
		System.out.println("Multiplication = " + (num1 * num2));
		System.out.println("Division = " + (num1 / num2));
	}

}
