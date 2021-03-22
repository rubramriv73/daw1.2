package arrays;

/**
 * @author Rubén Ramírez Rivera
 * 
 *  Ejericio 4: Define tres arrays de 20 números enteros cada una, con nombres numero, 
 *              cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 
 *              y 100. En el array cuadrado se deben almacenar los cuadrados de los 
 *              valores que hay en el array numero. En el array cubo se deben almacenar 
 *              los cubos de los valores que hay en numero. A continuación, muestra el 
 *              contenido de los tres arrays dispuesto en tres columnas.
 *
 */
public class Ej04CuadradosCubos {

  /**
   * Main method
   */
  public static void main(String[] args) {
    
    // Declare our 3 arrays
    int size = 20;
    int[] num = new int[size];
    int[] square = new int[size];
    int[] cube = new int[size];
    
    for (int i = 0; i < size; i++) {
      num[i] = (int) (Math.random() * 11);
      
      square[i] = (int) Math.pow(num[i], 2);
      
      cube[i] = (int) Math.pow(num[i], 3);
    }
    
    // Show the result of the 3 arrays
    System.out.print("Numbers: ");
    for (int i = 0; i < size; i++) {
      System.out.print(num[i] + " | ");
      
    }
    
    System.out.print("\nSquares: ");
    for (int i = 0; i < size; i++) {
      System.out.print(square[i] + " | ");
      
    }
    
    System.out.print("\nCubes: ");
    for (int i = 0; i < size; i++) {
      System.out.print(cube[i] + " | ");
      
    }
  }

}
