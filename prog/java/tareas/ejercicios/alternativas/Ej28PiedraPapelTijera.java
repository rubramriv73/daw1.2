package alternativas;

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 * 
 * 	Ejercicio 28:	Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce 
 * 								su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción 
 * 								incorrecta, el programa deberá mostrar un mensaje de error.
 *
 */
public class Ej28PiedraPapelTijera {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		
		// Declare the variable for each user pick
		String user1;
		String user2;

		// Our Scanner variable to read text from the user
		Scanner sc = new Scanner(System.in);
		
		// Presentation
		System.out.println("\n\t*** ROCK PAPPER SCISSORS ***\t\n");

		// User 1 picks his election
		System.out.print("User 1 picks: ");
		user1 = sc.next();
				System.out.print("User 2 picks: ");
		user2 = sc.next();
		
		if (user1.equals(user2)) {
			System.out.println("Tie game!!");
		} else {
			switch (user1) {
			case "rock":
				if (user2.equals("papper")) {
					System.out.println("User 2 wins!!");
					
				} else {
					System.out.println("User 1 wins");
					
				}
				break;
				
			case "papper":
				if (user2.equals("scissors")) {
					System.out.println("User 2 wins!!");
					
				} else {
					System.out.println("User 1 wins");
					
				}
				break;
				
			case "scissors":
				if (user2.equals("rock")) {
					System.out.println("User 2 wins!!");
					
				} else {
					System.out.println("User 1 wins");
					
				}
				break;

			default:
				if ((user2.equals("rock")) || (user2.equals("papper")) || (user2.equals("scissors"))) {
					System.out.println("User 2 wins!!");
					
				} else {
					System.out.println("Wrong selection!! Nobody wins");
					
				}
				break;
			}
			
		}
				
	}

}
