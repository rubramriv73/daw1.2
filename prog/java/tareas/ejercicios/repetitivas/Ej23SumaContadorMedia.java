/**
 * 
 */
package repetitivas;

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 * 
 *  Ejercicio 23:   Escribe un programa que permita ir introduciendo una serie indeterminada
 *                  de números mientras su suma no supere el valor 10000. Cuando esto último
 *                  ocurra, se debe mostrar el total acumulado, el contador de los números
 *                  introducidos y la media.
 *
 */
public class Ej23SumaContadorMedia {

  /**
   * Main method
   */
  public static void main(String[] args) {
    
    // Declare the variables for the nums, the addition and the average
    int num;
    int add = 0;
    double avg;
    double count = 0;
    
    
    // Our Scanner variable to read text from the user
    Scanner sc = new Scanner(System.in);
    
    // Presentation
    System.out.println("\n\t*** ADD COUNT AVEGARE ***\t\n");
    
    do {
      System.out.print("Give a number: ");
      num = sc.nextInt();
      add += num;
      count++;
      
    } while (add < 10000);
    
    avg = (double)add / count;
    
    System.out.println("\nTotal numbers: " + count
        + "\nAddition: " + add
        + "\nAverage: " + avg);
  }

}
