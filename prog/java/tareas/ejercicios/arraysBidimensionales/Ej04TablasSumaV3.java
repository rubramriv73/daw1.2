package arraysBidimensionales;

/**
 * @author Rubén Ramírez Rivera
 * 
 * Ejercicio 4: Modifica el programa anterior de tal forma que las sumas parciales 
 *              y la suma total aparezcan en la pantalla con un pequeño retardo, 
 *              dando la impresión de que el ordenador se queda “pensando” antes de 
 *              mostrar los números.
 *
 */
public class Ej04TablasSumaV3 {

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
        nums[i][j] = 100 + (int)(Math.random() * 899); 
        
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
    
    // Show the user the result the array
    System.out.println("\n-------------------------------------------------------------------------------------------------");
    for (int i = 0; i < 5; i++) {
      System.out.print("|\t");
      for (int j = 0; j < 6; j++) {
        if (j == 5 || i == 4) {
          Thread.sleep(1500);
        }
        System.out.print(nums[i][j] + "\t|\t");
        
      }
      System.out.println("\n-------------------------------------------------------------------------------------------------");
    }
    
  }

}
