package arrays;

/**
 * @author Rubén Ramírez Rivera
 * 
 * Ejercicio 10: Escribe un programa que genere 20 números enteros aleatorios 
 *               entre 0 y 100 y que los almacene en un array. El programa debe 
 *               ser capaz de pasar todos los números pares a las primeras 
 *               posiciones del array (del 0 en adelante) y todos los números 
 *               impares a las celdas restantes. Utiliza arrays auxiliares si es
 *               necesario.    
 *
 */
public class Ej10ParesImpares {

  /**
   * Main Method
   */
  public static void main(String[] args) {
    
    // Declare our arrays
    int[] nums = new int[20];
    int[] sortedNums = new int[20];
    int pos = 0;

    // Generate our num array random
    for (int i = 0; i < nums.length; i++) {
      nums[i] = (int) (Math.random() * 101);
      
    }
   
    
    // Save the even numbers in the sorted array
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 == 0) {
        sortedNums[pos] = nums[i];
        pos++;
      }
    }
    
    // Save the odd numbers following the evens we already save
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 != 0) {
        sortedNums[pos] = nums[i];
        pos++;
      }
    }
    
    // Show both arrays
    System.out.print("\nNumbers: ");
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
    System.out.print("\nSorted: ");
    for (int i = 0; i < sortedNums.length; i++) {
      System.out.print(sortedNums[i] + " ");
    }
    
    

  }

}
