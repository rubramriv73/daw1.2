package alternativas;

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 *
 *	Ejercicio 27:	Una pastelería nos ha pedido realizar un programa que haga presupuestos 
 *								de tartas. El programa preguntará primero de qué sabor quiere el usuario 
 *								la tarta: manzana, fresa o chocolate. La tarta de manzana vale 18 euros y 
 *								la de fresa 16. En caso de seleccionar la tarta de chocolate, el programa 
 *								debe preguntar además si el chocolate es negro o blanco; la primera opción 
 *								vale 14 euros y la segunda 15. Por último se pregunta si se añade nata y si 
 *								se personaliza con un nombre; la nata suma 2.50 y la escritura del nombre 
 *								2.75.
 *
 */
public class Ej27Pasteles {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		
		// Declare our variables
		String flavour;
		char cream;
		char name;
		String typeChoco;
		double price;
		
		// Our Scanner variable to read text from the user
		Scanner sc = new Scanner(System.in);
		
		// Presentation
		System.out.println("\n\t*** PASTELERIA PAKI ***\t\n");

		System.out.print("Which flavour do you want?? (apple , strawberry, chocolate)");
		flavour = sc.next();
		
		switch (flavour) {
		case "apple":
			price = 18;
			
			System.out.print("Do you want cream??(y/n)");
			cream = sc.next().charAt(0);
			System.out.print("Do you want you name on th cake??(y/n)");
			name = sc.next().charAt(0);
			
			if (cream == 'y') {
				price += 2.5;
				
			}
			
			if (name == 'y') {
				price += 2.75;
				
			}
			
			System.out.println("Your cake cost " + price + "€");
			break;
			
		case "strawberry":
			price = 16;
			
			System.out.print("Do you want cream??(y/n)");
			cream = sc.next().charAt(0);
			System.out.print("Do you want you name on th cake??(y/n)");
			name = sc.next().charAt(0);
			
			if (cream == 'y') {
				price += 2.5;
				
			}
			
			if (name == 'y') {
				price += 2.75;
				
			}
			
			System.out.println("Your cake cost " + price + "€");
			break;
			
		case "chocolate":
			System.out.print("What type of chocolate do you like??(dark or white)");
			typeChoco = sc.next();
			if (typeChoco.equalsIgnoreCase("dark")) {
				price = 14;
				
			} else {
				price = 16;
				
			}
			
			System.out.print("Do you want cream??(y/n)");
			cream = sc.next().charAt(0);
			System.out.print("Do you want you name on th cake??(y/n)");
			name = sc.next().charAt(0);
			
			if (cream == 'y') {
				price += 2.5;
				
			}
			
			if (name == 'y') {
				price += 2.75;
				
			}
			
			System.out.println("Your cake cost " + price + "€");
			break;

		default:
			System.out.println("Wrong flavour!!");
			break;
		}
	}

}
