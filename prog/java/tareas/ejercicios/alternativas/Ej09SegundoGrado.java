package alternativas;

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 * 
 * 	Ejercicio 9: 	Realiza un programa que resuelva una ecuación de 
 * 								segundo grado (del tipo ax2 + bx + c = 0).
 *
 */
public class Ej09SegundoGrado {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		
		// Declare our variables 'a', 'b' and 'c' from the ecuation
		int a;
		int b;
		int c;
		// Our Scanner variable to read text from the user
		Scanner sc = new Scanner(System.in);
		
		// Presentation
		System.out.println("\n\t*** SECOND GRADE ECUATION ***\t\n");
		
		// We ask the user to give us a and b
		System.out.println("ax^2 + bx + c = 0");
		System.out.print("Insert the value of a: ");
		a = sc.nextInt();
		System.out.print("Insert the value of b: ");
		b = sc.nextInt();
		System.out.print("Insert the value of c: ");
		c = sc.nextInt();
		
		if (a == 0) {
			System.out.println("This is a First Grade Ecuation, use another program for it");
			
		} else {
			System.out.println("Solutions of this ecuation:");
			System.out.println("x = " + (-b + Math.sqrt(Math.pow(b, 2) - (4*a*c))));
			System.out.println("x = " + (-b - Math.sqrt(Math.pow(b, 2) - (4*a*c))));
		}

	}

}
