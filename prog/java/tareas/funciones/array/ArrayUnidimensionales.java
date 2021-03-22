package array;

/**
 * @author Rubén Ramírez Rivera
 * 
 * Group of functions using arrays
 * 
 */
public class ArrayUnidimensionales {

  /*
   * Genera un array de tamaño n con números aleatorios
   * cuyo intervalo (mínimo y máximo) se indica como parámetro.
   * 
   * @param size the size the user want for the array
   * @param numMin minimum number generated in the array
   * @param numMin minimum number generated in the array
   * @return the array generated
   */
  public static int[] generateArrayInt(int size, int numMin, int numMax) {
    int [] v = new int[size];
    
    for (int i = 0; i < v.length; i++) {
      v[i] = numMin + (int)(Math.random() * numMax - numMin + 1);

    }
    
    return v;
    
  }
  
  /*
   * Devuelve el mínimo del array que se pasa como parámetro.
   * 
   * @param v array we want to know his lowest number
   * @return lowest number in the array
   * 
   */
  public static int minArrayInt(int [] v)  {
    int min = v[0];
    
    for (int i : v) {
      if (i < min) {
        min = i;
      }
    }
    
    return min;
    
  }
  
  /*
   * Devuelve el máximo del array que se pasa como parámetro.
   * 
   * @param v array we want to know his biggest number
   * @return biggest number in the array
   * 
   */
  public static int maxArrayInt(int [] v)  {
    int max = v[0];
    
    for (int i : v) {
      if (i > max) {
        max = i;
      }
    }
    
    return max;
    
  }
  
  /*
   * Devuelve la media del array que se pasa como parámetro.
   * 
   * @param v array we want to obtain the average
   * @return value of the average
   */
  public static double avgArrayInt(int [] v) {
    int add = 0;
    
    for (int i : v) {
      add += i;
      
    }
    
    return (double)add / v.length;
    
  }
  
  /*
   * Dice si un número está o no dentro de un array.
   * 
   * @param v array we are using
   * @param num number we want to know if exist in the array
   * @return true if found, false if don't
   * 
   */
  public static boolean isInArrayInt(int [] v, int num) {
    for (int i : v) {
      if (num == i) {
        return true;
      }
    }
    
    return false;
    
  }
  
  /*
   * Busca un número en un array y devuelve la posición
   * (el índice) en la que se encuentra.
   * 
   * @param v array we are using
   * @param num number we want to know the position in the array
   * @return position of the number
   */
  public static int positionArrayInt(int [] v, int num) {
    if (isInArrayInt(v, num)) {
      for (int i = 0; i < v.length; i++) {
        if (num == v[i]) {
          return i;
          
        }
        
      }
      
    } 
    
    return -1;
    
  }
  
  /*
   * Le da la vuelta a un array
   *    
   * @param v array we are using
   */
  public static void turnOrderArrayInt(int [] v) {
    int [] turnV = new int [v.length];
    int pos = 0;
    
    for (int i = v.length - 1; i >= 0; i--) {
      turnV[pos] = v[i];
      pos++;
      
    }
    
    for (int i = 0; i < turnV.length; i++) {
      v[i] = turnV[i];
      
    }

  }
  
  /*
   *  Rota n posiciones a la derecha los números de un
   *  array.
   *  
   *  @param v array we are using
   *  @param n positions we are moving to the right
   *
   */
  public static void moveRightArrayInt(int [] v, int n) {
    int [] aux = new int[v.length];
    int times = 0;
    
    while (times != n) {
      for (int i = 0; i < v.length; i++) {
        if ((i+1) < v.length) {
          aux[i+1] = v[i];
          
        } else {
          aux[0] = v[i];
          
        }
      }
      
      for (int i = 0; i < aux.length; i++) {
        v[i] = aux[i];
        
      }
      
      times++;
      
    }
    
  }
  
  /*
   *  Rota n posiciones a la izquierda los números de un
   *  array.
   *  
   *  @param v array we are using
   *  @param n positions we are moving to the left
   *
   */
  public static void moveLeftArrayInt(int [] v, int n) {
    int [] aux = new int[v.length];
    int times = 0;
    
    while (times != n) {
      for (int i = v.length - 1; i >= 0; i--) {
        if ((i-1) >= 0) {
          aux[i-1] = v[i];
          
        } else {
          aux[aux.length-1] = v[i];
          
        }
      }
      
      for (int i = 0; i < aux.length; i++) {
        v[i] = aux[i];
        
      }
      
      times++;
      
    }
  }
  
}
