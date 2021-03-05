package tanda2;

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
public class Cuadrado extends Rectangulo{

  // Constructor
  public Cuadrado(int side) {
    super(side, side);
    
  }

  // Getter & Setter
  public int getSide() {
    return this.getBase();
  }
  
  public void setSide(int side) {
    super.setBase(side);
    super.setHeight(side);
  }

  // Override Methods
  
  @Override
  public void setHeight(int side) {
    this.setSide(side);
  }
  
  @Override
  public void setBase(int side) {
    this.setSide(side);
  }
  
  @Override
  public String toString() {
    return "SQUARE-> side: " + this.getSide();
  }
    
  @Override
  public Cuadrado clone() {
    return new Cuadrado(this.getSide());
  }
}
