package repetitivas;

/**
 * @author Rubén Ramírez Rivera
 * 
 *  Ejercicio 5:    Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás 
 *                  utilizando un bucle while.
 *
 */
public class Ej05Atras20V2 {

  /**
   * Main method
   */
  public static void main(String[] args) {
    
    // Presentation
    System.out.println("\n\t*** NUMBERS BETWEEN 320 & 160 ***\t\n");
    
    int i = 320;
    
    while (i >= 160) {
        System.out.print(i + " ");
        i-=20;
        
    }

  }

}
