package repetitivas;

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 * 
 *  Ejercicio 7:    Realiza el control de acceso a una caja fuerte. La combinación será un
 *                  número de 4 cifras. El programa nos pedirá la combinación para abrirla. 
 *                  Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la 
 *                  combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto 
 *                  satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte.

 *
 */
public class Ej07CajaFuerte {

  /**
   * Main method
   */
  public static void main(String[] args) {
    
    // Declare our variables
    int trysLeft = 4;
    int userCode;
    final int BOX_CODE = 1713;
    
    // Our Scanner variable to read text from the user
    Scanner sc = new Scanner(System.in);
    
    // Presentation
    System.out.println("\n\t*** OPEN THE BOX ***\t\n");

    // Ask the user the code
    while (trysLeft > 0) {
      System.out.println("You have " + trysLeft + " chance to open de box");
      System.out.println("What's the code of the box?? ");
      userCode = sc.nextInt();
      
      if (userCode != BOX_CODE) {
        System.out.println("Sorry, wrong code");
        trysLeft -= 1;
      } else {
        System.out.println("The box is open");
        break;
        
      }
    }   
    
    
  }

}
