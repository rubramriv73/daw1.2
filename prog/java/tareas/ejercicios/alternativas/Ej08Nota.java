package alternativas;

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 * 
 * 	Ejercicio 8:	Amplía el programa anterior para que diga la nota del 
 * 								boletín (insuficiente, suficiente, bien, notable o 
 * 								sobresaliente).
 *
 */
public class Ej08Nota {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		
		// We declare the variables to save our exam grades
		double grade1;
		double grade2;
		double grade3;
		double avg;
		
		// Our Scanner variable to read text from the user
		Scanner sc = new Scanner(System.in);
		
		// Presentation
		System.out.println("\n\t*** EXAM GRADE ***\t\n");
		
		// We ask the user to give us the 3 grades
		System.out.print("First Grade: ");
		grade1 = sc.nextInt();
		System.out.print("Second Grade: ");
		grade2 = sc.nextInt();
		System.out.print("Three Grade: ");
		grade3 = sc.nextInt();
		
		// We calculate the average between the 3 grades
		avg = (grade1+grade2+grade3) / 3;
		
		if (avg < 0 || avg > 10) {
			System.out.println("Average Grade: " + avg);
			System.out.println("Incorrect Grade");
			
		} else if (avg >= 0 && avg < 5) {
			System.out.println("Average Grade: " + avg);
			System.out.println("Insuficient Grade");
			
		} else if (avg == 5) {
			System.out.println("Average Grade: " + avg);
			System.out.println("Suficient Grade");
			
		} else if (avg == 6) {
			System.out.println("Average Grade: " + avg);
			System.out.println("Good Grade");
			
		} else if (avg == 7 || avg == 8) {
			System.out.println("Average Grade: " + avg);
			System.out.println("Notable Grade");
			
		} else if (avg == 9) {
			System.out.println("Average Grade: " + avg);
			System.out.println("Excellent Grade");
			
		} else {
			System.out.println("Average Grade: " + avg);
			System.out.println("Outstanding Grade");
			
		}

	}

}
