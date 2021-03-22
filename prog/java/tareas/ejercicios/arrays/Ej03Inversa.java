package arrays;

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 * 
 *  Ejercicio 3:  Escribe un programa que lea 10 números por teclado y que luego 
 *                los muestre en orden inverso, es decir, el primero que se introduce 
 *                es el último en mostrarse y viceversa.

 *
 */
public class Ej03Inversa {

  /**
   * Main method 
   */
  public static void main(String[] args) {
    
    // Declare our array
    int[] num = new int[10];
    
    // Declare our scanner variable
    Scanner sc = new Scanner(System.in);
    
    // Ask the user to give 10 numbers
    System.out.println("Insert 10 numbers");
    for (int i = 0; i < num.length; i++) {
      System.out.print("Number " + (i+1) + ": ");
      num[i] = sc.nextInt();
      
    }
    
    // Show the user's numbers in in the order they were inserted
    System.out.println("\nNumbers in order: ");
    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i] + " ");
      
    }
    
    // Show the user's numbers backwars
    System.out.println("\nNumbers backwars: ");
    for (int i = num.length - 1; i >= 0; i--) {
      System.out.print(num[i] + " ");
      
    }
  }

}
