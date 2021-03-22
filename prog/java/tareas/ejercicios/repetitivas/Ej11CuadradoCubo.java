package repetitivas;

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 * 
 *  Ejercicio 11:   Escribe un programa que muestre en tres columnas, el cuadrado y el 
 *                  cubo de los 5 primeros números enteros a partir de uno que se 
 *                  introduce por teclado.
 *
 */
public class Ej11CuadradoCubo {

  /**
   * Main method
   */
  public static void main(String[] args) {
    
    // Declare the variables we are going to use
    int num;
    
    // Our Scanner variable to read text from the user
    Scanner sc = new Scanner(System.in);
    
    // Presentation
    System.out.println("\n\t*** SQUARE AND CUBE ***\t\n");
    
    // Ask the user for his number
    System.out.print("Give a number: ");
    num = sc.nextInt();
    
    System.out.println("Number\tSquare\tCube");
    for (int i = num; i < (num+5); i++) {
      System.out.println(i + "\t" + (int)Math.pow(i, 2) + "\t" + (int)Math.pow(i, 3));
      
    }
    
  }

}
