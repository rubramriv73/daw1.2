package arrays;

/**
 * @author Rubén Ramírez Rivera
 * 
 *  Ejercicio 2:    Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 
 *                  y que no termine de generar números hasta que no saque el 24. El  programa deberá 
 *                  decir al final cuántos números se han generado
 *
 */
public class Ej02NumerosPares {

  /**
   * Main method
   */
  public static void main(String[] args) {
    
    // Declare the variable for the numbers we are going to generate and our counter
    int num;
    int countEvens = 0;
    int countTotal = 0;
    
    // Presentation
    System.out.println("\n\t*** EVEN NUMBERS GENERATOR ***\t\n");
    
    // We will generate numbers while it is different to 24 and we will show the even 
    // numbers and how many of them we have shown
    System.out.print("Numbers : ");
    do {
      num = (int)(Math.random() * 101);
      countTotal++;
      
      if (num == 24) {
        System.out.print(num + " ");
        countEvens++;
        
      } else if (num % 2 == 0) {
        System.out.print(num + " ");
        countEvens++;
        
      } 
      
    } while (num != 24);
    System.out.println("\nTotal even numbers: " + countEvens);
    System.out.println("Total numbers generated: " + countTotal);
  }

}
