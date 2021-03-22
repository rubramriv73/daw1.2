package arrays;

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 * 
 * Ejercicio 5: Escribe un programa que pida 10 números por teclado y que luego muestre 
 *              los números introducidos junto con las palabras “máximo” y “mínimo” al 
 *              lado del máximo y del mínimo respectivamente.
 *
 */
public class Ej05MinYMax {

  /**
   * Main method
   */
  public static void main(String[] args) {
    
    // Declare our array and our max and min variables
    int[] num = new int[10];
    int min;
    int max;
    
    // Declare our scanner variable
    Scanner sc = new Scanner(System.in);
    
    // Ask the user to give 10 numbers
    System.out.println("Insert 10 numbers");
    
    // Ask the first number to assign the max and the min
    System.out.print("Number 1: ");
    num[0] = sc.nextInt();
    min = num[0];
    max = num[0];
    
    // We go through the array inserting the number the user's gives to see which is the min and max
    for (int i = 1; i < num.length; i++) {
      System.out.print("Number " + (i+1) + ": ");
      num[i] = sc.nextInt();
      
      if (num[i] > max) {
        max = num[i];
        
      } else if (num[i] < min) {
        min = num[i];
        
      }
      
    }
    
    
    // Show the user the results
    System.out.print("\nNumbers: \n\n");
    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i] + " ");
      if (num[i] == max) {
        System.out.print(" MAX\n");
        
      } else if (num[i] == min) {
        System.out.print(" MIN\n");
        
      } else {
        System.out.println("");
        
      }
      
    }

  }

}
