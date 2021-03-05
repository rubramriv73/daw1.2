package tanda2;

import java.util.Arrays;

/**
 * Esta clase implementará una estructura de datos tipo lista de números enteros.
 * 
 * Estado de los objetos:
 * 
 * - content: array de enteros donde guardaremos los elementos de la lista.
 * - size: número de elementos guardados en la lista.
 * 
 * Comportamiento:
 * 
 * - ListInteger(): crea una lista vacía cuyo tamaño máximo va a estar determinado por una constante 
 *  de la clase (10).
 *  
 * - ListInteger(ele1, ..., eleN): crea una lista con los elementos ele1 ... eleN.
 * 
 * - pop(): me devuelve el último elemento de la lista y lo saca de la lista.
 * 
 * - pop(posición): me devuelve el elemento que está en "posición" y lo saca de la lista.- 
 * 
 * - remove(elemento): borra la primera ocurrencia de "elemento" en la lista. Devolverá true o false
 *  en función del éxito de la operación.
 * 
 * - insert(elemento): añadir "elemento" al final de la lista. 
 *  Devolveremos true o false en función del éxito de la operación.
 * 
 * - insert(elemento, posición): añadir "elemento" en la posición "posición" de la lista.
 *  Devolveremos true o false en función del éxito de la operación.
 * 
 * - clear(): vacía la lista.
 * 
 * - isFull(): me dice si la lista está llena.
 * 
 * - isEmpty(): me dice si la lista está vacía.
 * 
 * - resize(): cambia el tamaño máximo de la lista si el nuevo tamaño máximo no es menor que
 *  el número de elementos que tiene. Devolveremos true o false en función del éxito de la operación. 
 *  
 * - size(): nos devuelve el número de elementos que hay en la lista.
 * 
 * - maxSize(): tamaño máximo de la lista.
 * 
 * 
 * @author Rafael del Castillo Gomariz
 *
 */

public class IntegerList {

  // variables de clase

  private static final int DEFAULT_SIZE = 10;

  // variables de instancia

  protected int[] content;
  protected int contentSize;

  // Comportamiento

  // Constructores

  public IntegerList() {
    this.contentSize = 0;
    this.content = new int[DEFAULT_SIZE];
  }

  public IntegerList(int ... content) {
    /*
     * Código para que:
     * 
     * 1. Comprobar si el número de parámetros que llegan es mayor que DEFAULT_SIZE, si lo es el tamaño
     * máximo de mi array aumenta a esta cantidad.
     * 
     * 2. Crear el nuevo array con el tamaño máximo y asignarle los elementos recibidos como parámetro.
     * 
     * 3. Poner el valor correcto de size.
     */

    if (content.length > DEFAULT_SIZE) {
      this.content = new int[content.length];
      
    } else {
      this.content = new int[DEFAULT_SIZE];
      
    }
    
    this.contentSize = content.length;
    
    for (int i = 0; i < content.length; i++) {
      this.content[i] = content[i];
      
    }
  }
      
  //resto métodos

  /**
   * Añade un elemento al final de la lista. 
   * 
   * @param element
   * @return éxito de la operación
   */
  public boolean insert(int element) {
    if (this.isFull()) {
      return false;
    }
    this.content[this.contentSize] = element;
    this.contentSize++;
    return true;
  }
  
  /**
   * Añade un elemento en la posición indicada de la lista.
   * @param element
   * @param pos
   * @return éxito de la operación
   */
  public boolean insert(int element, int pos) {
    if (this.isFull() || pos < 0) {
      return false;
    }

    if (this.isEmpty()) {
      this.content[0] = element;
      this.contentSize = 1;
      return true;
    }

    if (pos >= this.getContentSize()) {
      return this.insert(element);

    }
    for (int i = this.getContentSize() - 1; i >= pos; i--) {
      this.content[i+1] = this.content[i];
    }
    this.content[pos] = element;
    this.contentSize++;

    return true;
  }
  
 
  /**
   * Devuelve el último elemento de la lista y lo elimina.
   * @return último elemento de la lista
   */
  public int pop() {
    if (this.isEmpty()) {
      return 0;
    }
    
    this.contentSize--;
    return this.content[this.getContentSize()];
  }
  
  /**
   * Devuelve el elemento que está en "posición" y lo saca de la lista
   */
  public int pop(int pos) {
    if (this.isEmpty() || pos >= this.getContentSize() || pos < 0) {
      return 0;
    }
    int element = this.content[pos];
    this.contentSize--;
    for (int i = pos; i < this.getContentSize(); i++) {
      this.content[i] = this.content[i+1];
    }
    return element;
  }
  
  /**
   * Borra la primera ocurrencia de un elemento en la lista.
   * 
   * @param element
   * @return éxito de la operación.
   */
  public boolean remove(int element) {
    if (this.isEmpty()) {
      return false;
    }
    for (int i = 0; i < this.getContentSize(); i++) {
      if (this.content[i] == element) {
        this.contentSize--;
        for (int j = i; j < this.getContentSize(); j++) {
          this.content[j] = this.content[j+1];
        }
        return true;
      }
    }
    return false;
  }
  
  /**
   * Vacía la lista.
   */
  public void clear() {
    this.contentSize = 0;
  }
  
  /**
   * 
   * @return si la lista está llena.
   */
  public boolean isFull() {
    return this.contentSize == this.content.length;
    
  }
  
  /**
   * 
   * @return devuelve si la lista está vacía.
   */
  public boolean isEmpty() {
    return this.contentSize == 0;
  }
  
  /**
   * Cambia el tamaño máximo de la lista si el nuevo tamaño máximo no es menor que el número de elementos que tiene. 
   *  
   * @return éxito de la operación.
   */
  public boolean resize(int newSize) {
    if (newSize < this.getContentSize()) {
      return false;
      
    }
    int[] l = new int[newSize];
    for (int i = 0; i < this.getContentSize(); i++) {
      l[i] = this.content[i];
    }
    
    this.content = l;
    return true;
  }
  
  /**
   * 
   * @return número de elementos que hay en la lista.
   */
  public int getContentSize() {
    return this.contentSize;
  }
  
  /**
   * 
   * @return máximo número de elementos que caben en la lista.
   */
  public int maxSize() {
    return this.content.length;
  }

  @Override
  public String toString() {
    int[] str = new int[this.getContentSize()];
    for (int i = 0; i < this.getContentSize(); i++) {
      str[i] = this.content[i];
    }
    return Arrays.toString(str);
  }

  
  
}
