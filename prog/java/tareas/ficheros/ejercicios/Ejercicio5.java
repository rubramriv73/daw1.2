package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Ejercicio 5: Escribe un programa capaz de quitar los comentarios de un 
 * programa de Java.Se utilizaría de la siguiente manera:
 * quita_commentarios PROGRAMA_ORIGINAL PROGRAMA_LIMPIO
 * Por ejemplo: quita_comentarios hola.java holav2.java crea un fichero con 
 * nombre holav2.java que contiene el código de hola.java pero sin los 
 * comentarios.
 * 
 * @author Rubén Ramírez Rivera
 *
 */
public class Ejercicio5 {

  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("Invalid number of arguments");
      System.exit(1);
    }
    try {
      var file1 = new Scanner(new BufferedReader(new FileReader(args[0])));
      var file2 = new BufferedWriter(new FileWriter(args[1]));
      String line;
      int beginIndex;
      int endIndex;

      while (file1.hasNextLine()) {
        beginIndex = 0;
        line = file1.nextLine();
        if (line.contains("/*")) {
          while (!(line.contains("*/")) && file1.hasNextLine()) {
            line = file1.next();

          } 
          beginIndex = line.indexOf(file1.next());
          line = file1.nextLine().substring(beginIndex);
        }
        
        if (line.contains("//")) {
          endIndex = line.indexOf("//");
          line = file1.nextLine().substring(0, endIndex);
          
        } else {
          line = file1.nextLine();
        }

        file2.write(line);
        file2.newLine();
      }

      file1.close();
      file2.close();
      System.out.println("Comments deleted from the file");

    } catch (FileNotFoundException e) {
      System.out.println("Couldn't find your file");

    } catch (IOException e) {
      System.out.println("Couldn't write the file");

    } 
  }

  //public static String getNewName(String name) {

  //}
}
