package main;

import array.ArrayUnidimensionales;

/**
 * @author Rubén Ramírez Rivera
 *
 */
public class MainArray {
  
  final static int SIZE = 5;

  /**
   * @param args
   */
  public static void main(String[] args) {
    
    // Generate the array and print the array
    int [] example = ArrayUnidimensionales.generateArrayInt(SIZE, 0, 10);
    System.out.print("Array generated: ");
    for (int i : example) {
      System.out.print(i + " ");
    }
    
    // Get the min and max int in the array
    System.out.println("\n\nMax: " + ArrayUnidimensionales.maxArrayInt(example)
    + "\nMin: " + ArrayUnidimensionales.minArrayInt(example));
    
    // Get the average of the array
    System.out.println("Average: " + ArrayUnidimensionales.avgArrayInt(example));
    
    // Is 4 in the array and where
    if (ArrayUnidimensionales.isInArrayInt(example, 4)) {
      System.out.println("\n4 is in the array");
      System.out.println("The position of 4 is " + ArrayUnidimensionales.positionArrayInt(example, 4));
    } else {
      System.out.println("\n4 is not in the array");
    }
    
    // Turn array
    System.out.println("\nTurning the order of the array:");
    ArrayUnidimensionales.turnOrderArrayInt(example);
    for (int i : example) {
      System.out.print(i + " ");
    }
    // Move the array to the right
    ArrayUnidimensionales.moveRightArrayInt(example, 3);
    System.out.print("\nArray move 3 to the right: ");
    for (int i : example) {
      System.out.print(i + " ");
    }
    
    // Move the array to the left
    ArrayUnidimensionales.moveLeftArrayInt(example, 3);
    System.out.print("\nArray move 3 to the left: ");
    for (int i : example) {
      System.out.print(i + " ");
    }
  }
}
  