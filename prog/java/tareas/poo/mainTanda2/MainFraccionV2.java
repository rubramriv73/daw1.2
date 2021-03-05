package mainTanda2;

import java.util.Scanner;
import tanda2.FraccionV2;


/**
 * 2. Crea una clase Fraccion de forma que podamos hacer las siguientes operaciones:
 * 
 * Contruir un objeto Fraccion pasándole el numerador y el denominador.
 * Obtener la fracción como cadena de caracteres.
 * Obtener y modificar numerador y denominador. No se puede dividir por cero.
 * Obtener resultado de la fracción (número real).
 * Multiplicar la fracción por un número (el resultado es otro objeto fracción).
 * Multiplicar, sumar y restar fracciones (el resultado es otro objeto fracción).
 * Simplificar la fracción (cambia el objeto actual).
 * 
 * Modifica la clase Fracción y Fecha de la tanda de ejercicios anterior para que 
 * implementen equals() y las interfaces Comparable y Cloneable.
 * 
 * @author Rubén Ramírez Rivera
 *
 */
public class MainFraccionV2 {

  /**
   * @param args
   */
  public static void main(String[] args) {
    
    // Declare a scanner variable
    Scanner s = new Scanner(System.in);
    
    // Declare the variables to save the values of the numerator and denominator
    int n;
    int d;
    
    // Read the values the user want
    System.out.print("Insert a numerator: ");
    n = s.nextInt();
    System.out.print("Insert a denominator: ");
    d = s.nextInt();
    
    // Generate the fraction and show it
    FraccionV2 f1 = new FraccionV2(n,d);
    FraccionV2 f2 = new FraccionV2(8,10);
    System.out.println("Fraction --> " + f1);
    
    // Test. Calculate the fraction
    System.out.println("Result --> " + f1 + " = " + f1.result());
    
    // Get and Set a numerator or denominator from a fraction
    System.out.println("Denominator of the secret fraction is " + f2.getDen());
    System.out.print("which value you want to set this denominator: ");
    f2.setDen(s.nextInt());
    
    // Test. Multiply a fraction by a number
    int num;
    System.out.println("Number to multiply your fraction: ");
    num = s.nextInt();
    System.out.println(f1 + " * " + num + " = " + f1.multiplyByNumber(num));
    
    // Test. Operations
    System.out.println(f1 + " * " + f2 + " = " + f1.multiplyByFraction(f2));
    System.out.println(f1 + " + " + f2 + " = " + f1.addAFraction(f2));
    System.out.println(f1 + " - " + f2 + " = " + f1.subAFraction(f2));
    
    // Test. Compare
    FraccionV2 f3 = new FraccionV2(8,16);
    FraccionV2 f4 = new FraccionV2(5,2);
    FraccionV2 f5 = new FraccionV2(3,4);
    
    System.out.println("\nF3 -> " + f3);
    System.out.println("F4 -> " + f4);
    if (f3.compareTo(f4) < 0) {
      System.out.println("F3 is lower than F4");
      
    } else if (f3.compareTo(f4) > 0) {
      System.out.println("F3 is bigger than F4");
      
    } else {
      System.out.println("Both fractions are the same");
      
    }
    
    System.out.println("\nF3 -> " + f3);
    System.out.println("F5 -> " + f5);
    if (f3.compareTo(f5) < 0) {
      System.out.println("F3 is lower than F5");
      
    } else if (f3.compareTo(f5) > 0) {
      System.out.println("F3 is bigger than F5");
      
    } else {
      System.out.println("Both fractions are the same");
      
    }
    
    // Test. Equals and Clone
    FraccionV2 f6 = new FraccionV2(4,8);
    FraccionV2 f7 = f6.clone();
    FraccionV2 f8 = new FraccionV2(3,2);
    
    System.out.println("\nIs " + f6 + " the same as " + f7 + " ?");
    if (f6.equals(f7)) {
      System.out.println("Both are the same fractions");
      
    } else {
      System.out.println("Different fractions");
      
    }
    System.out.println("\nIs " + f6 + " the same as " + f8 + " ?");
    if (f6.equals(f8)) {
      System.out.println("Both are the same fractions");
      
    } else {
      System.out.println("Different fractions");
      
    }
    
  }

}
