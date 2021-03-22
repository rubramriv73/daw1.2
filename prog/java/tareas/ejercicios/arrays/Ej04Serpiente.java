package arrays;

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 * 
 *  Ejercicio 4:    Realiza un programa que pinte por pantalla una serpiente con un “serpenteo” aleatorio. 
 *                  La cabeza se representará con el carácter @ y se debe colocar  exactamente en la 
 *                  posición 13 (con 12 espacios delante). A partir de ahí, el cuerpo irá serpenteando de 
 *                  la siguiente manera: se generará de forma aleatoria un valor entre tres posibles que 
 *                  hará que el siguiente carácter se  coloque una posición a la izquierda del anterior,
 *                  alineado con el anterior o una posición a la derecha del anterior. La longitud de la 
 *                  serpiente se pedirá por teclado y se supone que el usuario introducirá un dato correcto.
 *
 */
public class Ej04Serpiente {

  /**
   * Main method
   * @throws InterruptedException 
   */
  public static void main(String[] args) throws InterruptedException {
    
    // Declare the variable for the length of the snake and it's movement
    int movement;
    int snakeLength;

    // Our Scanner variable to read text from the user
    Scanner sc = new Scanner(System.in);
    
    // Presentation
    System.out.println("\n\t*** SNEAKY SNAKEY ***\t\n");
    
    // Ask the user for the length of the snake
    System.out.print("Insert the length of your snake: ");
    snakeLength = sc.nextInt();
    
    System.out.println("\n            @");
    for (int i = 1; i < snakeLength; i++) {
      movement = (int)(Math.random() * 3);
      
      if (movement == 0) {
        System.out.println("           *");
        Thread.sleep(1000);
        
      }else if (movement == 1) {
        System.out.println("            *");
        Thread.sleep(1000);
        
      } else {
        System.out.println("             *");
        Thread.sleep(1000);
        
      }
    }
    
    

  }

}
