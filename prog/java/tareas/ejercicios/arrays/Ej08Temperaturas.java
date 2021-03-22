package arrays;

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 * 
 * Ejercicio 8: Realiza un programa que pida la temperatura media que ha 
 *              hecho en cada mes de un determinado año y que muestre a 
 *              continuación un diagrama de barras horizontales con esos 
 *              datos. Las barras del diagrama se pueden dibujar a base de 
 *              asteriscos o cualquier otro carácter.    
 *
 */
public class Ej08Temperaturas {

  /**
   * Main Method
   */
  public static void main(String[] args) {
    
    // Declare our arrays
    int[] temperature = new int[12];
    String[] month = {"January", "February", "March", "April", "May", "June",
                      "July", "August", "September", "October", "November", "December"};
    
    // Declare our scanner variable
    Scanner sc = new Scanner(System.in);
    
    // Ask the user every average temperature
    for (int i = 0; i < 12; i++) {
      System.out.print("Average temperature of " + month[i] + ": ");
      temperature[i] = sc.nextInt();
    }
    
    //Show the graph
    for (int i = 0; i < 12; i++) {
      System.out.print("\n" + month[i] + " | " + temperature[i] + "ºC ");
      for (int j = 0; j < temperature[i]; j++) {
        System.out.print(">");
      }
    }

  }

}
