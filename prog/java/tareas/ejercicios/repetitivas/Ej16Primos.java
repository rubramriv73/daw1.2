package repetitivas;

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 * 
 *  Ejercicio 16:   Escribe un programa que diga si un número introducido 
 *                  por teclado es o no primo. Un número primo es aquel 
 *                  que sólo es divisible entre él mismo y la unidad.
 *
 */
public class Ej16Primos {

  /**
   * Main method
   */
  public static void main(String[] args) {
    
    // Declare the variable for number the user is going to give us
    int num;
    
    // Declare our boolean variable compare if its prime or not
    Boolean isPrime = true;
    
    // Our Scanner variable to read text from the user
    Scanner sc = new Scanner(System.in);
    
    // Presentation
    System.out.println("\n\t*** PRIME, NOT AMAZON ***\t\n");

    System.out.print("Give us a number to see if it's prime: ");
    num = sc.nextInt();
    
    if ((num % 2) == 0) {
      isPrime = false;
      
    } else {
      for (int i = 3; i < num; i += 2) {
        if ((num % i) == 0) {
          isPrime = false;
          
        }
      }
    }

    if (isPrime) {
      System.out.println(num + " it's a Prime number");
      
    } else {
      System.out.println(num + " isn't a Prime number");
      
    }
    
  }

}
