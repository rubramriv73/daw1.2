package comunicaciones;

/**
 * @author Rubén Ramírez Rivera
 * 
 * Two systems of communications:
 *  1. convert numbers into sticks
 *  2. convert numbers into morse code
 *
 */
public class Coms {

  // Constant size of the auxiliar arrays we are going to generate
  final static int SIZE = 10;
  /*
   * Esta función convierte el número n al sistema de palotes y lo devuelve en una
   * cadena de caracteres. Por ejemplo:
   * 470213 en decimal es el | | | | - | | | | | | | - - | | - | - | | | en el 
   * sistema de palotes. 
   * Utiliza esta función en un programa para comprobar que funciona bien. Desde la 
   * función no se debe mostrar nadapor pantalla, solo se debe usar print desde el 
   * programa principal.
   * 
   * @param num number we want to convert into sticks
   * @return the sticks translating the number
   * 
   */
  public static String sticks(int num) {
    
    // Declare our sticks array
    String [] sticks = {" ", "|", "||", "|||", "||||", "|||||", "||||||", "|||||||", "||||||||", "|||||||||"};
    String code = "";
    String number = Integer.toString(num);
    
    for (int i = 0; i < number.length(); i++) {
      int c = Integer.parseInt(String.valueOf(number.charAt(i)));
      
      code += sticks[c];
      
      if (!((i+1) == number.length())) {
        code += " - ";
      }
    }
    
    return code;
  }
  
  /*
   * Esta función convierte el número n al sistema Morse y lo devuelve en una
   * cadena de caracteres. Por ejemplo:
   * 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en Morse. 
   * Utiliza esta función en un programa para comprobar que funciona bien.
   * Desde la función no se debe mostrar nada por pantalla, solo se debe usar 
   * print desde el programa principal.
   * 
   * @param num number we want to convert into morse code
   * @return the number translated into morse code
   * 
   */
  public static String morse(int num) {
    
    // Declare our morse array
    String [] morse = {"_ _ _ _ _", ". _ _ _ _", ". . _ _ _", ". . . _ _", ". . . . _", ". . . . .", "_ . . . .", 
        "_ _ . . .", "_ _ _ . .", "_ _ _ _ ."};
    String code = "";
    String number = Integer.toString(num);
    
    for (int i = 0; i < number.length(); i++) {
      int c = Integer.parseInt(String.valueOf(number.charAt(i)));
      
      code += morse[c] + " ";

    }
    
    return code;
  }
}
