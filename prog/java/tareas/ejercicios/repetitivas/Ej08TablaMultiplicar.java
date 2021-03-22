package repetitivas;

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 * 
 *  Ejercicio 8:    Muestra la tabla de multiplicar de un número introducido por teclado.
 *  
 *
 */
public class Ej08TablaMultiplicar {

  /**
   * @param args
   */
  public static void main(String[] args) {
    
    // Declare the variable for the number the user is going to give us and the result
    int num;
    int result;
    
    // Our Scanner variable to read text from the user
    Scanner sc = new Scanner(System.in);
    
    // Presentation
    System.out.println("\n\t*** MULTIPLICATION TABLE ***\t\n");
    
    // Ask the user the number for the multiplication
    System.out.println("Give a number: ");
    num = sc.nextInt();
    
    for (int i = 0; i <= 10; i++) {
      result = i * num;
      System.out.println(num + " x " + i + " = " + result);
    }

  }

}
