package tanda2;

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
public class Rectangulo implements Comparable<Rectangulo>,Cloneable{

  // Attributes
  private int base;
  private int height;
  
  //Constructor
  /**
   * @param base
   * @param height
   */
  public Rectangulo(int base, int height) {
    this.base = base;
    this.height = height;
    
  }
  
  // Getters & Setters
  /**
   * @return the base
   */
  public int getBase() {
    return base;
  }

  /**
   * @param base the base to set
   */
  public void setBase(int base) {
    this.base = base;
  }

  /**
   * @return the height
   */
  public int getHeight() {
    return height;
  }

  /**
   * @param height the height to set
   */
  public void setHeight(int height) {
    this.height = height;
  }
  
  // Methods
  /**
   * perimeter Method
   * 
   * This method calculates the perimeter of the rectangle
   * 
   * @return value of the perimeter
   */
  public int perimeter() {
    return (2*this.base + 2*this.height);
  }
  
  /**
   * area Method
   * 
   * This method calculates the area of the rectangle
   * 
   * @param base base of the rectangle
   * @param height height of the rectangle
   * @return value of the area
   */
  public int area() {
    return (this.base * this.height);
  }
  
  public void draw() {
    for (int i = 0; i < this.height; i++) {
      for (int j = 0; j < this.base; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  @Override
  /**
   * compareTo Method
   * 
   * @param rect Rectangle to compare with the actual rec
   * @return Negative if actual rectangle is shorter, Positive if
   * it's bigger or 0 if both are equal
   */
  public int compareTo(Rectangulo rect) {
    return this.area() - rect.area();
  }
  
  @Override
  /**
   * clone Method
   * 
   */
  public Rectangulo clone() {
    return new Rectangulo(this.base, this.height);
  }
  
  @Override
  /**
   * toString Method
   * 
   * @return String with the values of the attributes of the rectangle
   */
  public String toString() {
    return "RECTANGLE -> Base: " + this.base + " Height: " + this.height;
  }
}
