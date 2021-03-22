package arrays;

/**
 * @author Rubén Ramírez Rivera
 * 
 *  Ejercicio 1 :   Define un array de 12 números enteros con nombre num y asigna los valores
 *                  según la tabla que se muestra a continuación. Muestra el contenido de todos
 *                  los elementos del array. ¿Qué sucede con los valores de los elementos que no
 *                  han sido inicializados?
 *
 */
public class Ej01Numeros {

  /**
   * Main method
   */
  public static void main(String[] args) {
    
    // Declare our array called num with 12 numbers
    int[] num = new int[12];
    
    // Give the values of the table to the array
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;
    
    // Show the array
    System.out.println("Array: ");
    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i] + " ");
      
    }
    
    // Explanation
    System.out.println("\n The values we didn't insert in the array"
        + "as default they are set to 0");
  }

}
