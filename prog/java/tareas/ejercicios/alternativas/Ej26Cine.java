package alternativas;

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 * 
 *	Ejercicio 26:	Realiza un programa que calcule el precio de unas entradas de cine 
 *								en función del número de personas y del día de la semana. El precio 
 *								base de una entrada son 8 euros. El miércoles (día del espectador), 
 *								el precio base es de 5 euros. Los jueves son el día de la pareja, por 
 *								lo que la entrada para dos cuesta 11 euros. Con la tarjeta CineCampa se 
 *								obtiene un 10% de descuento. Si un jueves, un grupo de 6 personas compran 
 *								entradas, el precio total sería de 33 euros ya que son 3 parejas; pero si 
 *								es un grupo de 7, pagarán 3 entradas de pareja más 1 individual que son 41 
 *								euros (33 + 8).
 *
 */
public class Ej26Cine {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		
		// Variable for the people attending the cinema and the day it is
		int numPeople;
		String day;
		char card;
		
		int couples;
		double price;
		double ticketPrice = 8;
		double couplePrice = 11;
		double discount = 0;
		double totalPrice;
		
		
		// Our Scanner variable to read text from the user
		Scanner sc = new Scanner(System.in);
		
		// Presentation
		System.out.println("\n\t*** CINECAMPA ***\t\n");
		
		// Ask the user the number of tickets
		System.out.print("Number of tickets: ");
		numPeople = sc.nextInt();
		
		// Ask the user the day it is
		System.out.print("Day of the week: ");
		day = sc.next();
		
		// Ask the user if they have the CineCampa Card
		System.out.print("Do you have CineCampa Card?(y/n): ");
		card = sc.next().charAt(0);
		
		if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Friday")
				|| day.equals("Saturday") || day.equals("Sunday")) {
			if (card == 'y') {
				discount = ((numPeople * ticketPrice) * 0.1);
			}
			
			price = numPeople * ticketPrice;
			totalPrice = price - discount;
			System.out.println("\nNumber of tickets -> " + numPeople 
					+ "\nPrice per ticket ->" + ticketPrice + "€"
					+ "\nPrice -> " + price
					+ "\nDiscount -> " + discount
					+ "\nTOTAL -> " + totalPrice);
			
		} else if (day.equals("Wednesday")) {
			ticketPrice = 5;
			
			if (card == 'y') {
				discount = ((numPeople * ticketPrice) * 0.1);
			}
			
			price = numPeople * ticketPrice;
			totalPrice = price - discount;
			System.out.println("\nNumber of tickets -> " + numPeople 
					+ "\nPrice per ticket ->" + ticketPrice + "€"
					+ "\nPrice -> " + price
					+ "\nDiscount -> " + discount
					+ "\nTOTAL -> " + totalPrice);
			
		} else if (day.equals("Thursday")) {
			if ((numPeople % 2) == 0) {
				couples = numPeople / 2;
				
				if (card == 'y') {
					discount = ((couples * couplePrice) * 0.1);
				}
				
				price = couples * couplePrice;
				totalPrice = price - discount;
				System.out.println("\nNumber of tickets -> " + numPeople 
						+ "\nPrice per ticket/couple ->" + couplePrice + "€"
						+ "\nPrice -> " + price
						+ "\nDiscount -> " + discount
						+ "\nTOTAL -> " + totalPrice);
			} else {
				couples = (numPeople - 1) / 2;
				
				if (card == 'y') {
					discount = (((couples * couplePrice) + ticketPrice) * 0.1);
				}
				
				price = (couples * couplePrice) + ticketPrice;
				totalPrice = price - discount;
				System.out.println("\nNumber of tickets -> " + numPeople 
						+ "\nPrice per ticket ->" + ticketPrice + "€"
						+ "\nPrice per ticket/couple ->" + couplePrice + "€"
						+ "\nPrice -> " + price
						+ "\nDiscount -> " + discount
						+ "\nTOTAL -> " + totalPrice);
				
			} 
			
			
		} else {
			System.out.println("Incorrect Day");
			
		}

	}

}
