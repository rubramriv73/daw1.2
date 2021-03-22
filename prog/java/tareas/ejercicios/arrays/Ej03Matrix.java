package arrays;

/**
 * @author Rubén Ramírez Rivera
 * 
 *  Ejercicio 3:    Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) 
 *                  con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para  
 *                  convertir un entero en un carácter.
 *
 */
public class Ej03Matrix {

  /**
   * Main method
   * @throws InterruptedException 
   */
  public static void main(String[] args) throws InterruptedException {
    
    // Declare our variable to save the numbers we generate
    int num;
    
    // A variable thats prints the secuence in the next line when it reachs 10000 characters
    int nextLineCounter = 0;
    
    // We generate an infinite loop to show the random characters
    while (true) {
      num = 32 + (int)(Math.random() * 94);
      
      System.out.print((char)num + " ");
      nextLineCounter++;
      
      if (nextLineCounter == 10000) {
        System.out.println("");
        nextLineCounter = 0;
        Thread.sleep(500);
        
      }
    }

  }

}
