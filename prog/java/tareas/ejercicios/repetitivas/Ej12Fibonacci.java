package repetitivas;

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 * 
 *  Ejercicio 12:   Escribe un programa que muestre los n primeros términos de la serie 
 *                  de Fibonacci. El primer término de la serie de Fibonacci es 0, el 
 *                  segundo es 1 y el resto se calcula sumando los dos anteriores, por 
 *                  lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 
 *                  34, 55, 89, 144... El número n se debe introducir por teclado.
 *
 */
public class Ej12Fibonacci {

  /**
   * Main method
   */
  public static void main(String[] args) {
    
    // Declare our variable
    int n;
    int fibo = 1;
    
    // Our Scanner variable to read text from the user
    Scanner sc = new Scanner(System.in);
    
    // Presentation
    System.out.println("\n\t*** FIBONACCI'S RATIO ***\t\n");
    
    // Ask the user for the amount of numbers he want to display
    System.out.print("Give a number bigger than 0: ");
    n = sc.nextInt();
    
    if (n == 1) {
      System.out.print("FIBONACCI RATIO: 0 1 ");
      
    } else {
      System.out.print("FIBONACCI RATIO: 0 1 ");
      for (int i = 1; i < n; i++) {
        fibo += fibo;
        System.out.print(fibo + " ");
      }
      
    }

  }

}
