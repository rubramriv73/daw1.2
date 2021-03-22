package ejercicios;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;


/**
 * Ejercicio 4: Realiza un programa que sea capaz de ordenar alfabéticamente 
 * las palabras contenidas en un fichero de texto. El nombre del fichero que 
 * contiene las palabras se debe pasar como argumento en la línea de comandos. 
 * El nombre del fichero resultado debe ser el mismo que el original añadiendo 
 * la coletilla sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra 
 * ocupa una línea.
 * 
 * @author Rubén Ramírez Rivera
 *
 */
public class Ejercicio4 {
  public static void main(String[] args) {
    try (var file = new BufferedWriter(new FileWriter("ficheros/files/palabras_sort.txt"))){
      List<String> lines = Files.readAllLines(Paths.get(args[0]));
      
      Collections.sort(lines);
      
      for (String line : lines) {
        file.write(line);
        file.newLine();
      }
      
      System.out.println("File sorted");
      
    } catch (FileNotFoundException e) {
      System.out.println("Couldn't find your file");
      
    } catch (IOException e) {
      System.out.println("Couldn't write the file");
      
    } 
  }
}
