package ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Ejercicio 2: Realiza un programa que lea el fichero creado en el ejercicio 
 * anterior y que muestre los números por pantalla.
 * 
 * @author Rubén Ramírez Rivera
 *
 */
public class Ejercicio2 {

  public static void main(String[] args) {
    try (var file = new Scanner(new BufferedReader(new FileReader("ficheros/files/primos.dat")))){
      while (file.hasNextLine()) {
        System.out.println(file.nextLine());
        
      }
      
    } catch (FileNotFoundException e) {
      System.out.println("Couldn't find your file");
    }
  }
}
