package ejercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import matematicas.Varias;

/**
 * Ejercicio 1: Escribe un programa que guarde en un fichero con nombre 
 * primos.dat los números primos que hay entre 1 y 500.

 * 
 * @author Rubén Ramírez Rivera
 *
 */
public class Ejercicio1 {

  public static void main(String[] args) {
    try (var file = new BufferedWriter(new FileWriter("ficheros/files/primos.dat"))) {
      file.write("2");
      file.newLine();
      for (int i = 3; i <= 500; i += 2) {
        if(Varias.isPrime(i)) {
          file.write(String.valueOf(i));
          file.newLine();
        }
      }
      System.out.println("Numbers have been written");
      
    } catch (IOException e) {
      System.out.println("Not able to write in the file");
      
    }
  }
}
