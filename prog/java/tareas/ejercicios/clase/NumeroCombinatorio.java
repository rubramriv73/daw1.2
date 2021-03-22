/**
 * 
 */
package clase;

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 * 
 * Numero                   n!
 *                      ---------
 * Combinatorio         m! * (n-m)!
 *
 */
public class NumeroCombinatorio {

  /**
   * Main method
   */
  public static void main(String[] args) {
    
    // Declare our variables for both numbers
    long n;
    long m;
    
    // A boolean variable to ask the user numbers when they are not correct
    Boolean correcto = true;
    
    // Variables to operate with the numbers
    long nFact = 1;
    long mFact = 1;
    long subFact = 1;
    long subNumbers;
    double combNumber;
    
    
    // Our Scanner variable to read text from the user
    Scanner sc = new Scanner(System.in);

    // Presentation
    System.out.println("\n\t*** NUMEROS COMBINATORIOS ***\t\n");
    System.out.println("    n!");
    System.out.println("----------");
    System.out.println(" m!*(n-m)!");
    
    // Ask the user the 2 numbers
    do {
      
      System.out.println("\nAmbos numeros tienen que ser mayor que 0 y "
          + "n tiene que ser mayor que m\n");
      System.out.print("Dame el numero 'n': ");
      n = sc.nextLong();
      System.out.print("Dame el numero 'm': ");
      m = sc.nextLong();
     
      // If the user give us 2 numbers below 0 or n is bigger than m 
      // we ask for new numbers
      if (n > 0 && m > 0) {
        if (n >= m) {
          correcto = false;
        }
      }
    } while (correcto);
    
    // Calculate the subtract of n - m
    subNumbers = n - m;
    
    // Calculate n factorial
    for (int i = 1; i <= n; i++) {
      nFact *= i;
      
    }
    
    // Calculate m factorial
    for (int i = 1; i <= m; i++) {
      mFact *= i;
      
    }
    
    // Calculate the subtract factorial
    for (int i = 1; i <= subNumbers; i++) {
      subFact *= i;
      
    }
    
    // Add all the results
    combNumber = (double)(nFact / (mFact*subFact));
    
    // Show the user the result
    System.out.println("El numero combinatorio es " + combNumber);
    
  }

}
