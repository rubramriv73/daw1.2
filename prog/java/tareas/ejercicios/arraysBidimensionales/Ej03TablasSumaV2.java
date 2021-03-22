package arraysBidimensionales;

/**
 * @author Rubén Ramírez Rivera
 * 
 *  Ejercicio 3: Modifica el programa anterior de tal forma que los números que 
 *               se introducen en el array se generen de forma aleatoria (valores 
 *               entre 100 y 999).
 *
 */
public class Ej03TablasSumaV2 {

  /**
   * Main method
   * @throws InterruptedException 
   */
  public static void main(String[] args) throws InterruptedException {
    
    int [][] nums = new int[5][6];
    
    // Ask the user numbers to generate our array and add it to total
    System.out.println("Autogenerating numbers for the array...");
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        nums[i][j] = 3 + (int)(Math.random() * 7); 
        
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
    /*
    System.out.println("\n-------------------------------------------------------------------------------------------------");
    for (int i = 0; i < 4; i++) {
      System.out.print("|\t");
      for (int j = 0; j < 5; j++) {
        System.out.print(nums[i][j] + "\t|\t");
        
      }
      System.out.println("\n-------------------------------------------------------------------------------------------------");
    }
    Thread.sleep(1000);
    System.out.print(String.format("\033[2J")); // Clear screen
    System.out.print(String.format("\033[%dA",9)); // Move up
    System.out.print("\033[2K"); // Erase line content
    */
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
