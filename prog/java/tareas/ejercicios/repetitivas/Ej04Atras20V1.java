package repetitivas;

/**
 * @author Rubén Ramírez Rivera
 * 
 *  Ejercicio 4:    Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás 
 *                  utilizando un bucle for.
 *
 */
public class Ej04Atras20V1 {

  /**
   * Main method
   */
  public static void main(String[] args) {
    
    // Presentation
    System.out.println("\n\t*** NUMBERS BETWEEN 320 & 160 ***\t\n");
    
    for (int i = 320; i >= 160; i-=20) {
        System.out.print (i +" ");
    }

  }

}
