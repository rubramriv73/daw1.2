package alternativas;

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 * 
 *	Ejercicio 5:	Realiza un programa que resuelva una ecuación de primer 
 *								grado (del tipo ax+b = 0).
 *
 *
 */
public class Ej05PrimerGrado {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		
		// Declare our variables a and b from the ecuation
		int a;
		int b;
		
		// Our Scanner variable to read text from the user
		Scanner sc = new Scanner(System.in);
		
		// Presentation
		System.out.println("\n\t*** FIRST GRADE ECUATION ***\t\n");
		
		// We ask the user to give us a, b and c
		System.out.println("ax + b = 0  -->  x = -b / a");
		System.out.print("Insert the value of a: ");
		a = sc.nextInt();
		System.out.print("Insert the value of b: ");
		b = sc.nextInt();
		
		// We compare 'a' if it's different to 0 or it's 0
		// If a is 0, we do the division we showed
		if (a != 0) {
			System.out.println("x = " + (-b / a));
			
		} else {
			if (b != 0) {
				System.out.println("The ecuation has no solutions");
				
			} else {
				System.out.println("The ecuation has infinite solutions");
				
			}
			
		}

	}

}
