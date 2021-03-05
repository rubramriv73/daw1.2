package mainTanda2;

import tanda2.Rectangulo;

/**
 * Crea una clase que represente objetos de tipo Rectángulo, de forma que:
 * 
 * +En el estado de cada objeto guardemos el ancho y el alto del mismo. 
 * Usaremos estos datos para construirlo.
 * +Las acciones que podemos realizar con objetos de esta clase son: 
 *      +Cálculo del perímetro.
 *      +Cálculo del área.
 *      +Modificar alto y ancho.
 *      +Dibujarlo (con *).
 *      +Compararlo con otros.
 *      +Devolver una copia del mismo en otro objeto (clonarlo).
 *      +Transformar su estado a una cadena (toString()).
 *      
 * @author Rubén Ramírez Rivera
 *
 */
public class MainRectangulo {

  /**
   * @param args
   */
  public static void main(String[] args) {
    
    Rectangulo r = new Rectangulo(5,10);
    
    r.draw();

  }

}
