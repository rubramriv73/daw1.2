package repetitivas;

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 * 
 *  Ejercicio 9:    Realiza un programa que nos diga cuántos dígitos tiene un número 
 *                  introducido por teclado. Este ejercicio es equivalente a otro 
 *                  realizado anteriormente, con la salvedad de que el anterior estaba 
 *                  limitado a números de 5 dígitos como máximo. En esta ocasión, hay 
 *                  que realizar el ejercicio utilizando bucles; de esta manera, la única 
 *                  limitación en el número de dígitos la establece el tipo de dato que 
 *                  se utilice (int o long).

 *
 */
public class Ej09Digitos {

  /**
   * Main method
   */
  public static void main(String[] args) {
    
    // Declare the variable for the number the user is going to give us and the result
    int num;
    int numAux;
    int countDigit = 0;
    Boolean numSize = true;
    
    // Our Scanner variable to read text from the user
    Scanner sc = new Scanner(System.in);
    
    // Presentation
    System.out.println("\n\t*** DIGITS OF A NUMBER ***\t\n");
    
    // Ask the user the number for the multiplication
    System.out.println("Give a number: ");
    num = sc.nextInt();
    
    numAux = num;
    
    do {
      numAux /= 10;
      countDigit++;
      if (numAux == 0) {
        numSize = false;
      }
    } while (numSize);
    
    System.out.println("Number " + num + " has " + countDigit + " digits");
    
  }

}
