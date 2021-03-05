package tanda2;

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
 * Modifica la clase Fracción y Fecha de la tanda de ejercicios anterior para que 
 * implementen equals() y las interfaces Comparable y Cloneable.
 * 
 * @author Rubén Ramírez Rivera
 *
 */

public class FraccionV2 implements Comparable<FraccionV2>, Cloneable{
  
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
  public FraccionV2(int num, int den) {
    this.num = num;
    setDen(den);

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
  public FraccionV2 multiplyByNumber(int n) {
    FraccionV2 f = new FraccionV2(this.num * n, this.den);
    f.simplify();
    
    return f;
    
  }
  
  public FraccionV2 multiplyByFraction(FraccionV2 n) {
    FraccionV2 f = new FraccionV2(this.num * n.num,this.den * n.den);
    f.simplify();
    
    return f;
  }
  
  public FraccionV2 addAFraction(FraccionV2 n) {
    FraccionV2 f = new FraccionV2(this.num * n.den + n.num * this.den, this.den * n.den);
    f.simplify();
    
    return f;
    
  }
  
  public FraccionV2 subAFraction(FraccionV2 n) {
    FraccionV2 f = new FraccionV2(this.num * n.den - n.num * this.den, this.den * n.den);
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
  
  public static int mcd(int num, int den) {
    int aux;
    
    while (den != 0) {
      aux = num % den;
      num = den;
      den = aux;
      
    }
    
    return num;
    
  }

  /*
   * Method to compare 2 fractions
   * 
   * @param f Fraction to compare with the actual one we are using
   * @return  Negative value if the actual fraction is lower, Positive 
   * if its bigger or 0 if it's the same.
   */
  @Override
  public int compareTo(FraccionV2 f) {
    return (int)(this.result() - f.result());
  }
  
  /*
   * Methods that clone a fraction
   * 
   * @return a new fraction with the same values a the actual one
   */
  @Override
  public FraccionV2 clone() {
    return new FraccionV2(this.num, this.den);
  }

  /**
   * Method that generates the hash of an object
   * 
   * @return result the hash code generated
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + den;
    result = prime * result + num;
    return result;
  }

  /**
   * Method that controls if 2 fractions are equal or not
   * 
   * @param obj
   * @return true if it's equal or false if not 
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    FraccionV2 other = (FraccionV2) obj;
    if (this.result() != other.result()) {
      return false;
    }
    return true;
  }
  
  
}
