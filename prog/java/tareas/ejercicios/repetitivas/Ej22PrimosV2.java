package repetitivas;

/**
 * @author Rubén Ramírez Rivera
 * 
 *  Ejercicio 22:   Muestra por pantalla todos los números primos entre 
 *                  2 y 100, ambos incluidos.
 *
 */
public class Ej22PrimosV2 {

  /**
   * Main method
   */
  public static void main(String[] args) {
        
    // Declare our variables to compare if its prime or not
    Boolean isPrime;
        
    // Presentation
    System.out.println("\n\t*** PRIME, NOT AMAZON, BETWEEN 2-100 ***\t\n");

    System.out.println("Primes:");
    System.out.print("2 ");
    
    for (int num = 3; num <= 100; num+=2) {
      isPrime = true;
      for (int i = 3; i < num; i += 2) {
        if ((num % i) == 0) {
          isPrime = false;
          
        }
      }

      if (isPrime) {
        System.out.print(num + " ");
        
      }

    }

  }

}

