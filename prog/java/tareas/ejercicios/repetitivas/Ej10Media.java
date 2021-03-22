package repetitivas;

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 * 
 *  Ejercicio 10:   Escribe un programa que calcule la media de un conjunto de números 
 *                  positivos introducidos por teclado. A priori, el programa no sabe 
 *                  cuántos números se introducirán. El usuario indicará que ha terminado 
 *                  de introducir los datos cuando meta un número negativo.
 *
 */
public class Ej10Media {

  /**
   * Main method
   */
  public static void main(String[] args) {
     
    // Declare the variable for the number the user is going to give us and the result
    int num;
    int add = 0;
    double avg;
    int countNumbers = 0;
    Boolean numStatus = true;
    
    // Our Scanner variable to read text from the user
    Scanner sc = new Scanner(System.in);
    
    // Presentation
    System.out.println("\n\t*** AVERAGE OF x NUMBERS ***\t\n");
    
    do {
      System.out.print("Give a number: ");
      num = sc.nextInt();
      
      if (num > 0) {
        add += num;
        countNumbers++;
        
      } else {
        numStatus = false;
        
      }
    } while (numStatus);
    
    avg = (double)add / countNumbers;
    
    System.out.println("The average is " + avg);

  }

}
