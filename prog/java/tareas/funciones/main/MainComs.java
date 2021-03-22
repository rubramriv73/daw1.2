package main;

import comunicaciones.Coms;
/**
 * @author Rubén Ramírez Rivera
 * 
 * 
 *
 */
public class MainComs {

  /**
   * @param args
   */
  public static void main(String[] args) {
    
    int num1 = 6596;
    int num2 = 198;
    
    // Translate into sticks
    System.out.println("Number: " + num1);
    System.out.println("Translation into sticks: " + Coms.sticks(num1));
    
    // Translate into morse
    System.out.println("Number: " + num2);
    System.out.println("Translation into morse: " + Coms.morse(num2));
    
  }

}
