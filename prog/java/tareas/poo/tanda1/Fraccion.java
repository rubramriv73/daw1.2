package tanda1;

/**
 * 2. Crea una clase Fraccion de forma que podamos hacer las siguientes operaciones:
 * 
 * Contruir un objeto Fraccion pasándole el numerador y el denominador.
 * Obtener la fracción como cadena de caracteres.
 * Obtener y modificar numerador y denominador. No se puede dividir por cero.
 * Obtener resultado de la fracción (número real).
 * Multiplicar la fracción por un número (el resultado es otro objeto fracción).
 * Multiplicar, sumar y restar fracciones (el resultado es otro objeto fracción).
 * Simplificar la fracción (cambia el objeto actual).
 * 
 * @author Rubén Ramírez Rivera
 *
 */

public class Fraccion {
  
  // Declare the variables of our object
  private int num;
  private int den;
  
  
  /**
   * Constructor Method
   * 
   * This method forms a fraction when the denominator isn't 0
   * 
   * @param num
   * @param den
   */
  public Fraccion(int num, int den) {
    if (den == 0) {
      System.err.println("Error. Denominator can't be 0");
      System.exit(1);
      
    } else {
      this.num = num;
      this.den = den;
    }

  }

  // Getters & Setters
  
  /**
   * @return The numerator
   */
  public int getNum() {
    return num;
  }
  
  /**
   * @param num The numerator to set
   */
  public void setNum(int num) {
    this.num = num;
  }
  
  /**
   * @return The denominator
   */
  public int getDen() {
    return den;
  }
  
  /**
   * @param den The denominator to set. It can't be zero
   */
  public void setDen(int den) {
    if (den == 0) {
      System.err.println("Error. Denominator can't be 0");
      System.exit(1);
      
    } else {
      this.den = den;
      
    }
    
  }

  // Methods
  
  /**
   * toString Method
   * 
   * @return String A correct form to show the fraction
   */
  @Override
  public String toString() {
    return this.num + " / " + this.den;
  }
  
  
  /**
   * result Method
   * 
   * This method calculates the result of the fraction
   * 
   * @return result Result of the fraction
   */
  public double result() {
    return (double) this.num / (double) this.den;
  }
  
  /**
   * multiplyByNumber Method
   * 
   * This method multiplies a fraction by a number
   * 
   * @param n
   * @return fraction New fraction the we get from multiplying it by a number
   */
  public Fraccion multiplyByNumber(int n) {
    Fraccion f = new Fraccion(this.num * n, this.den);
    f.simplify();
    
    return f;
    
  }
  
  public Fraccion multiplyByFraction(Fraccion n) {
    Fraccion f = new Fraccion(this.num * n.num,this.den * n.den);
    f.simplify();
    
    return f;
  }
  
  public Fraccion addAFraction(Fraccion n) {
    Fraccion f = new Fraccion(this.num * n.den + n.num * this.den, this.den * n.den);
    f.simplify();
    
    return f;
    
  }
  
  public Fraccion subAFraction(Fraccion n) {
    Fraccion f = new Fraccion(this.num * n.den - n.num * this.den, this.den * n.den);
    f.simplify();
    
    return f;
  }
  
  /**
   * simplify Method
   * 
   * This method simplifies a fraction
   * 
   */
  public void simplify() {
    int div = mcd(this.num,this.den);
    this.num /= div;
    this.den /= div;
    
  }
  
  public int mcd(int num, int den) {
    int aux;
    
    while (den != 0) {
      aux = num % den;
      num = den;
      den = aux;
      
    }
    
    return num;
    
  }
  

}
