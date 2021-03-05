package tanda2;

/**
 * Usando la clase anterior como superclase crea una clase que represente 
 * una estructura de datos tipo pila y otra tipo cola.
 * 
 * La pila y la cola permitirán estas operaciones:
 * -Crear la pila o la cola con o sin valores iniciales.
 * -Obtener el número de elementos almacenados (tamaño).
 * Saber si la pila o la cola está llena o vacía.
 * Modificar la capacidad máxima de almacenamiento de la pila o la cola.
 * Vaciar completamente la pila o la cola.
 * 
 * Para el caso de la pila:
 * Apilar (push): se añade un elemento a la pila. Se añade al principio de esta.
 * Desapilar (pop): se saca (debe devolverse) un elemento de la pila y se elimina. 
 * Leer el elemento superior de la pila sin retirarlo (top).
 * 
 * Para el caso de la cola:
 * Encolar (push): se añade un elemento a la cola. Se añade al final de esta.
 * Desencolar (pop): se saca (debe devolverse) y se elimina el elemento frontal de 
 * la cola, es decir, el primer elemento que entró.
 * Leer el elemento frontal de la cola, es decir, el primer elemento que entró, sin 
 * retirarlo (front).
 * 
 * 
 * @author Rubén Ramírez Rivera
 *
 */
public class Cola extends IntegerList{

  // Constructors
  public Cola() {
    super();
    
  }
  
  public Cola(int ... content) {
    super(content);
    
  }
  
  
  // Methods
  /**
   * Encolar (push): se añade un elemento a la cola. 
   * Se añade al final de esta.
   * 
   * @param element
   * @return exito de la operacion
   */
  public boolean push(int element) {
    if (this.isFull()) {
      return false;
      
    }
    
    return this.insert(element);
 
  }
  
  @Override
  /**
   * Desencolar (pop): se saca (debe devolverse) y se elimina el elemento frontal de 
   * la cola, es decir, el primer elemento que entró.
   */
  public int pop() {
    
    return super.pop(0);
  }
  
  /**
   * Leer el elemento frontal de la cola, es decir, el primer elemento que entró, sin 
   * retirarlo (front).
   * 
   * @return Elemento al frente de la cola
   */
  public int front() {
    if (this.isEmpty()) {
      return 0;
    }
    
    return this.content[0];
  }
}
