package arraysBidimensionales;

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 * 
 * Ejercicio 2: Escribe un programa que pida 20 números enteros. Estos números se 
 *              deben introducir en un array de 4 filas por 5 columnas. El programa 
 *              mostrará las sumas parciales de filas y columnas igual que si de una 
 *              hoja de cálculo se tratara. La suma total debe aparecer en la esquina 
 *              inferior derecha.
 *
 */
public class Ej02TablasSuma {

  /**
   * Main method
   */
  public static void main(String[] args) {
    
    int [][] nums = new int[5][6];
    
    // Declare our scanner variable
    Scanner sc = new Scanner(System.in);
    
    // Ask the user numbers to generate our array and add it to total
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print("Insert the value for " + i + " row " + j + " column: ");
        nums[i][j] = sc.nextInt();
        
        nums[4][5] += nums[i][j];
      }
    }
    
    // Add the value of each row
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        nums[i][5] += nums[i][j];
        
      }
    }
    
    // Add the value of each column
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 4; j++) {
        nums[4][i] += nums[j][i];
        
      }
    }
    
    // Show the user the result
    System.out.println("\n-------------------------------------------------------------------------------------------------");
    for (int i = 0; i < 5; i++) {
      System.out.print("|\t");
      for (int j = 0; j < 6; j++) {
        System.out.print(nums[i][j] + "\t|\t");
        
      }
      System.out.println("\n-------------------------------------------------------------------------------------------------");
    }
    
  }

}
