package mainTanda2;

import tanda2.Cuadrado;

/**
 * Crea la clase Cuadrado partiendo de la clase Rectángulo (hereda de esta) 
 * del ejercicio anterior. Consideraciones:
 * +Un cuadrado es un rectángulo con base==altura.
 * +Modificar el lado.
 * +El constructor de la clase Cuadrado solo tendrá un parámetro, su lado.
 * +No hay que crear atributos nuevos.
 * 
 * @author Rubén Ramírez Rivera
 *
 */
public class MainCuadrado {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Cuadrado c1 = new Cuadrado(5);
    
    c1.draw();
    System.out.println(c1);
    
    Cuadrado c2 = c1.clone();
    c2.setSide(8);
    c2.draw();
   
    if (c1.compareTo(c2) > 0) {
      System.out.println(c1 + " bigger than " + c2);
    } else if (c1.compareTo(c2) < 0) {
      System.out.println(c1 + " shorter than " + c2);
    } else {
      System.out.println("Both are equal");
    }

  }

}
