package arrays;

/**
 * @author Rubén Ramírez Rivera
 * 
 *  Ejercicio 2: Define un array de 10 caracteres con nombre simbolo y asigna valores
 *               a los elementos según la tabla que se muestra a continuación. Muestra 
 *               el contenido de todos los elementos del array. ¿Qué sucede con los 
 *               valores de los elementos que no han sido inicializados?
 *
 */
public class Ej02Caracteres {

  /**
   * Main method
   */
  public static void main(String[] args) {
    
    // Declare our array called num with 12 numbers
    char[] simbol = new char[10];
    
    // Give the values of the table to the array
    simbol[0] = 'a';
    simbol[1] = 'x';
    simbol[4] = '@';
    simbol[6] = ' ';
    simbol[7] = '+';
    simbol[8] = 'Q';
    
    // Show the array
    for (int i = 0; i < simbol.length; i++) {
      System.out.println("simbol[" + i + "]: " + simbol[i]);
      
    }
    
    // Explanation
    System.out.println("\n The values we didn't insert in the array"
        + "as default they are set to the blank char");
  }

}
