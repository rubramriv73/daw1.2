package ejercicios;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * - Crea un programa que encripte un fichero que le pasamos como parámetro 
 * y almacene el resultado en otro, que también pasamos como parámetro, de 
 * manera que:
 * 
 * Si el programa no recibe el número de parámetros adecuado termina con un 
 * error 1.
 * Si el programa recibe un solo parámetro guardará la información encriptada 
 * en el mismo archivo del que lee, pero antes advertirá al usuario de que 
 * machacará el archivo origen, dando opción a que la operación no se haga.
 * Si el fichero origen no existe (da error al abrirlo como lectura) el programa 
 * termina con un mensaje de error y código 2.
 * Si en el fichero destino no se puede escribir (da error al abrirlo como 
 * escritura) el programa termina con un mensaje de error y código 3.
 * Para encriptar usa el método César, necesitarás una clave que debes pedir 
 * al usuario.
 * 
 * @author Rubén Ramírez Rivera
 *
 */
public class Encrypt {

  private static Scanner s = new Scanner(System.in);
  private static ArrayList<Character> letters = new ArrayList<Character>();
  /**
   * @param args
   */
  public static void main(String[] args) {
    int code;
    String answer;

    if (args.length < 1 || args.length > 2) {
      System.err.println("Invalid number of arguments");
      System.exit(1);

    } 

    if (args.length == 1) {
      do {
        System.out.println("Caution your file will be overwritten. \nWan't to continue?(y/n");
        answer = s.nextLine();
        
      } while (!(answer.equalsIgnoreCase("y")) && !(answer.equalsIgnoreCase("n")));
      if (answer.equalsIgnoreCase("n")) {
        System.out.println("Exiting the program...");
        System.exit(0);
      }
    } 

    setLetters();

    try {
      code = askCode();
      encryptFile(args,code);

      System.out.println("File encrypted succesfully.");
    } catch (FileNotFoundException fnfe) {
      System.err.println("The file don't exists");
      System.exit(2);

    } catch (IOException e) {
      System.err.println("Couldn't write the file");
      System.exit(3);
    }

  }

  private static void setLetters() {
    String specialChars = "áéíóúñ";
    for (int asciiCode = 97; asciiCode <= 122; asciiCode++) {
      letters.add((char) asciiCode);

    }
    for (int i = 0; i < specialChars.length(); i++) {
      letters.add(specialChars.charAt(i));
    }
  }

  private static int askCode() {
    int code;
    do {
      try {
        System.out.println("Code to encrypt(1-28): ");
        code=Integer.parseInt(s.nextLine());
        if (code < 1 || code > (letters.size() - 1)) {
          System.out.println("Incorrect code");

        } else {
          return code;

        }

      } catch (NumberFormatException e) {
        System.out.println("Please give us a correct number");

      }

    } while (true);

  }

  private static void encryptFile(String [] files, int code) throws IOException {
    String fileToRead;
    String fileToWrite;
    


    if (files.length == 1) {
      fileToRead = files[0];
      fileToWrite = files[0];
    } else {
      fileToRead = files[0];
      fileToWrite = files[1];
    }

    List<String> lines = Files.readAllLines(Paths.get(fileToRead));
    
    var writeFile = new BufferedWriter(new FileWriter(fileToWrite));
    
    for (String line : lines) {
      writeFile.write(encryptLine(code, line));
      writeFile.newLine();
      
    }  
    writeFile.close();
  }

  private static String encryptLine(int code, String line) {    
    String encryptMsg = "";

    for (int i = 0; i < line.length(); i++) {
      char actualChar = line.toLowerCase().charAt(i);
      if (letters.contains(actualChar)) {
        actualChar = getNewLetter(actualChar, code);
      }
      encryptMsg += actualChar;
    }
    return encryptMsg;
  }

  private static char getNewLetter(char actualChar, int code) {
    int actualCharPos = letters.indexOf(actualChar);
    int nextCharPos = (actualCharPos + code) % letters.size();

    return letters.get(nextCharPos);
  }

}
