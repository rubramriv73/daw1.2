package secuenciales;

import java.lang.Math;
import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 * 
 *	Ejericicio 9: Escribe un programa que calcule el volumen de un cono
 *								segun la formula:
 *
 * 								V = 1/3 * pi * r^2 * h
 *								
 */
public class Ej09Cono {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		
		// We declare the radius and the height of the cone
		float r;
		float h;
		
		// Our Scanner variable to read text from the user
		Scanner sc = new Scanner(System.in);
		
		// Presentation
		System.out.println("\n\t*** VOLUME OF A CONE ***\t\n");
		
		// We ask the user to insert the radius and the height
		System.out.print("Insert the radius: ");
		r = sc.nextFloat();
		System.out.print("Insert the height: ");
		h = sc.nextFloat();
		
		// Show the user the result
		System.out.println("\nVolume = " + ((Math.PI * Math.pow(r, 2) * h) / 3));
		
	}

}
