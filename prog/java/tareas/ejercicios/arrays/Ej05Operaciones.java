package arrays;

import java.util.Arrays;

/**
 * @author Rubén Ramírez Rivera
 * 
 *  Ejericio 5:     Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados 
 *                  por espacios. Muestra también el máximo, el mínimo, la moda, la media, la mediana 
 *                  y la desviación típica de esos números.
 *
 */
public class Ej05Operaciones {

  /**
   * Main method
   */
  public static void main(String[] args) {
    
    //Declaration of the array we are going to use to save the random numbers
    int[] numbers = new int[50];
    
    //Declaration of our operations variables
    int max = 99; 
    int min = 200;
    int mostRepeatedNumber = 0;
    int addNumbers = 0;
    double addVariance = 0;
    double variance;
    double avg;
    double median;
    double standardDeviation;
    
    // We generate numbers for the array and compare it with max and min to set those values
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = 100 + (int)(Math.random() * 99);
      
      // We add the numbers to later calculate the average
      addNumbers += numbers[i];
      
      // Compare if it's bigger than the max number
      if (numbers[i] > max) {
        max = numbers[i];
      }
      
      // Compare if it's lower than the min number
      if (numbers[i] < min) {
        min = numbers[i];
      }
    }
    
    // Calculate the average
    avg = (double)addNumbers / numbers.length;  
    
    // This method sorts the array
    Arrays.sort(numbers);
    
    // Array sorted
    System.out.println("Array: ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
    
    // We generate a loop to get what's the most repeated number
    int maxReps = 0;
    int j;
    for (int i = 0; i < numbers.length - 1; i++) {
      int count = 0;      
      
      for (j = i + 1; j < numbers.length; j++) {
        if (numbers[i] == numbers[j]) {
          count++;
          
        } else {
          break;
        }
      }
      
      if (count > maxReps) {
        maxReps = count;
        mostRepeatedNumber = numbers[i];
        
      }
    }
    
    // Being an even group of numbers we have to pick both mid numbers and 
    // divide them between 2 to calculate the median
    median = (double)(numbers[4] + numbers[5]) / 2;
    
    // Go throw the group of number to calculate the variance
    for (int i = 0; i < numbers.length; i++) {
      addVariance += Math.pow(((double)numbers[i] - avg), 2);
      
    }
    
    variance = addVariance / (numbers.length - 1);
    standardDeviation = Math.sqrt(variance);
    
    // Results 
    System.out.println("\n\nMin number: " + min);
    System.out.println("Max number: " + max);
    System.out.println("Average: " + avg);
    if (mostRepeatedNumber == 0) {
      System.out.println("Most repeated number: none");
    } else {
      System.out.println("Most repeated number: " + mostRepeatedNumber);
    }
    System.out.println("Median: " + median);
    System.out.println("Standar Deviation: " + standardDeviation);

  }

}
