package arraysBidimensionales;

/**
 * @author Rubén Ramírez Rivera
 * 
 * Ejercicio 6: Modifica el programa anterior de tal forma que no se repita 
 *              ningún número en el array.
 *
 */
public class Ej06MaxMinV2 {

  /**
   * Main method
   */
  public static void main(String[] args) {
    
    // Declare our array and our variables for the max and the min
    int [][] nums = new int [6][10];
    int max = -1;
    int maxPosI = -1;
    int maxPosJ = -1;
    int minPosI = -1;
    int minPosJ = -1;
    int min = 1001;
    boolean repeatedNumber;
    
    // We generate the array and compare the numbers with the max and the min
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 10; j++) {
        
        // Generate numbers while them are repeated
        do {
          nums[i][j] = (int)(Math.random() * 1001);
          
          repeatedNumber = false;
          for (int k = 0; k < 10 * i + j; k++) {
            if (nums[i][j] == nums[k / 10][k % 10]) {
              repeatedNumber = true;
            }
          }
        } while (repeatedNumber);
        
        // Compare if the number is bigger than the max
        if (nums[i][j] > max) {
          max = nums[i][j];
          maxPosI = i;
          maxPosJ = j;
          
        }
        
        // Compare if the number is lower than the min
        if (nums[i][j] < min) {
          min = nums[i][j];
          minPosI = i;
          minPosJ = j;
          
        }
      }
    }
    
    System.out.println("Max:\nNumber: " + max 
        + "\nPosition: [" + (maxPosI + 1) + "][" + (maxPosJ + 1) + "]");
    System.out.println("Min:\nNumber: " + min 
        + "\nPosition: [" + (minPosI + 1) + "][" + (minPosJ + 1) + "]");
    
    // Show the user the result the array
    System.out.println("\n");
    for (int i = 0; i < 6; i++) {
      System.out.print("|\t");
      for (int j = 0; j < 10; j++) {
        if ((i == maxPosI && j == maxPosJ) || (i == minPosI && j == minPosJ)) {
          System.err.print(nums[i][j]);
          System.out.print("\t|\t");
          
        } else {
          System.out.print(nums[i][j] + "\t|\t");
          
        }
        
      }
      System.out.println("");
    }
  }

}