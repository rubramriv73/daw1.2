package mainTanda1;

import java.util.Scanner;
import tanda1.Fraccion;

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
 * @author Rubén Ramírez Rivera
 *
 */
public class MainFraccion {

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
    Fraccion f1 = new Fraccion(n,d);
    Fraccion f2 = new Fraccion(8,10);
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
    
  }

}
