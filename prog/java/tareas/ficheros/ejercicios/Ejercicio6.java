package ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Ejercicio 6: Realiza un programa que diga cuántas ocurrencias de una palabra 
 * hay en un fichero. Tanto el nombre del fichero como la palabra se deben pasar 
 * como argumentos en la línea de comandos.
 * 
 * @author Rubén Ramírez Rivera
 *
 */
public class Ejercicio6 {
  public static void main(String[] args) {
    int count = 0;
    
    if (args.length != 2) {
      System.out.println("Invalid number of arguments");
      System.exit(2);
      
    }
    try (var file = new Scanner(new BufferedReader(new FileReader(args[0])))){
      while (file.hasNextLine()) {
        if(file.next().equalsIgnoreCase(args[1])) {
          count++;
          
        }
      }
      
      System.out.println(args[1] + " appears " + count + " times in the file");
      
    } catch (FileNotFoundException e) {
      System.out.println("Couldn't find your file");
      
    }
  }
}
