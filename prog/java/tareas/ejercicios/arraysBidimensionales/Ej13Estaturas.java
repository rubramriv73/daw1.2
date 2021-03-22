package arraysBidimensionales;

/**
 * @author Rubén Ramírez Rivera
 * 
 * Ejercicio 13: Realiza un programa que calcule la estatura media, mínima y máxima 
 *               en centímetros de personas de diferentes países. El array que contiene 
 *               los nombres de los paises es el siguiente: pais = {“España”, “Rusia”, 
 *               “Japón”, “Australia”}. Los datos sobre las estaturas se deben simular 
 *               mediante un array de 4 filas por 10 columnas con números aleatorios 
 *               generados al azar entre 140 y 210. Los decimales de la media se pueden 
 *               despreciar. Los nombres de los países se deben mostrar utilizando el 
 *               array de países (no se pueden escribir directamente).
 *
 */
public class Ej13Estaturas {

  /**
   * Main method
   */
  public static void main(String[] args) {
    
    // Declare the arrays for the countries and their values
    String[] country = {"Spain", "Russia", "Japan", "Australia"};
    int [][] heights = new int[4][13];
    
    // Variables for our calculus
    int add = 0;
    int max = 139;
    int min = 211;
    
    // Generate the array
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 10; j++) {
        
        // Initialize for each row our variables
        if (j == 0) {
          add = 0;
          max = 139;
          min = 211;
        }
        heights[i][j] = 140 + (int)(Math.random() * 70);
        
        // Add the values to get the avg
        add += heights[i][j];
        
        // Compare if the number is bigger than the max
        if (heights[i][j] > max) {
          max = heights[i][j];
          
        }
        
        // Compare if the number is lower than the min
        if (heights[i][j] < min) {
          min = heights[i][j];
          
        }
      }
      
      heights[i][10] = add / 10;
      heights[i][11] = max;
      heights[i][12] = min;
    }
    
    // Show the results
    System.out.println("COUNTRY\t\t\tMEASURES\t\t\t  AVG MAX MIN");
    for (int i = 0; i < 4; i++) {
      System.out.print(country[i] + "-->  \t");
      for (int j = 0; j < 13; j++) {
        if (j == 10) {
          System.out.print("| " + heights[i][j] + " ");
          
        } else {
          System.out.print(heights[i][j] + " ");
          
        }
      }
      System.out.println("");
    }

  }

}
