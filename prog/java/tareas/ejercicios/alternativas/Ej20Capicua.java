package alternativas;

import java.util.Scanner;


/**
 * @author Rubén Ramírez Rivera
 * 
 * 	Ejercicio 20:	Realiza un programa que diga si un número entero positivo 
 * 					introducido por teclado es capicúa. Se permiten números de 
 * 					hasta 5 cifras.
 *
 */
public class Ej20Capicua {

	/**
	 * Main Method
	 */
	public static void main(String[] args) {
		
		// Declare the variable to save the number
		int num;
		Boolean palindromic = false;
		
		// Our Scanner variable to read text from the user
		Scanner sc = new Scanner(System.in);
		
		// Presentation
		System.out.println("\n\t*** PALINDROMIC NUMBER ***\t\n");
		
		// We ask the user to give us a number
		System.out.print("Insert the value of a: ");
		num = Math.abs(sc.nextInt());
		
		if (num < 10) {
			palindromic = true;
			
		} else if ((num >= 10) && (num < 100)) {
			if ((num / 10) == (num % 10)) {
				palindromic = true;
				
			}
		} else if ((num >= 100) && (num < 1000)) {
			if ((num / 100) == (num % 10)) {
				palindromic = true;
				
			}
		} else if ((num >= 1000) && (num < 10000)) {
			if (((num / 1000) == (num % 10)) && ((( num / 100 ) % 10)== (( num / 10) % 10))) {
				palindromic = true;
				
			}
		} else if ((num >= 10000) && (num < 100000)) {
			if (((num / 10000) == (num % 10) ) && ((((num / 1000) % 10)) == ((num / 10) % 10))) {
				palindromic = true;
				
			}
		} else {
			System.out.println("Your number is to big");
			
		}
		
		if (palindromic) {
			System.out.println(num + " is a palindromic number");
			
		} else {
			System.out.println(num + " isn't a palindromic number");
		}

	}

}
