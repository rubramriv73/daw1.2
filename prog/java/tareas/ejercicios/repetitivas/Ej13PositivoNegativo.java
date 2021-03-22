package repetitivas; 

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 *
 *  Ejercicio 13:   Escribe un programa que lea una lista de diez números y determine 
 *                  cuántos son positivos, y cuántos son negativos.

 */
public class Ej13PositivoNegativo {

  /**
   * Main method
   */
  public static void main(String[] args) {
    
    // Declare our variable
    int num;
    int positiveNumber = 0;
    int negativeNumber = 0;
    
    // Our Scanner variable to read text from the user
    Scanner sc = new Scanner(System.in);
    
    // Presentation
    System.out.println("\n\t*** POSITIVES AND NEGATIVES ***\t\n");
    
    for (int i = 0; i < 10; i++) {
      System.out.print(i + " Give a number different than 0: ");
      num = sc.nextInt();
      
      if (num > 0) {
        positiveNumber++;
        
      } else {
        negativeNumber++;
        
      }
    }
    
    System.out.println("Positive numbers: " + positiveNumber +
        "\nNegative numbers: " + negativeNumber);

  }

}
