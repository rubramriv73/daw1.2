package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

/**
 * Ejercicio 3: Escribe un programa que guarde en un fichero el contenido de otros 
 * dos ficheros, de tal forma que en el fichero resultante aparezcan las líneas de 
 * los primeros dos ficheros mezcladas, es decir, la primera línea será del primer 
 * fichero, la segunda será del segundo fichero, la tercera será la siguiente del
 * primer fichero, etc. Los nombres de los dos ficheros origen y el nombre del fichero 
 * destino se deben pasar como argumentos en la línea de comandos. Hay que tener en 
 * cuenta que los ficheros de donde se van cogiendo las líneas pueden tener tamaños 
 * diferentes.
 * 
 * @author Rubén Ramírez Rivera
 *
 */
public class Ejercicio3 {

  public static void main(String[] args) {
    if (args.length != 3) {
      System.out.println("Invalid number of arguments");
      System.exit(2);
      
    }
    
    try {
      var file1 = new Scanner(new BufferedReader(new FileReader(args[0])));
      var file2 = new Scanner(new BufferedReader(new FileReader(args[1])));
      var file3 = new BufferedWriter(new FileWriter(args[2]));
      
      while (file1.hasNextLine() || file2.hasNextLine()) {
        if (file1.hasNextLine()) {
          file3.write(file1.nextLine());
          file3.newLine();
        }
        if (file2.hasNextLine()) {
          file3.write(file2.nextLine());
          file3.newLine();
        }
        
      }
      file1.close();
      file2.close();
      file3.close();
      System.out.println("Your file has been written");
      
    } catch (FileNotFoundException e) {
      System.out.println("Couldn't find your file");
      
    }catch (IOException e) {
      System.out.println("Couldn't write the file");
      
    } 
  }
}
