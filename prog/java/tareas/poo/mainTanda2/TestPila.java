package mainTanda2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tanda2.Pila;

/**
 * Test Clase Pila
 * 
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
class TestPila {

  private Pila half;
  private Pila full;
  
  @BeforeEach
  void setUp() throws Exception {
    half = new Pila(1,2,3,4,5);
    full = new Pila(1,2,3,4,5,6,7,8,9,10);
  }
  

  @Test
  void testPush() {
    assertTrue(half.push(6));
    assertFalse(full.push(11));
  }
  
  @Test
  void testPop() {
    System.out.println("TEST POP");
    System.out.println(full);
    assertEquals(10,full.pop());
    assertEquals(9,full.getContentSize());
    System.out.println(full);
    assertEquals(9,full.top());
  }

  @Test
  void testTop() {
    System.out.println("TEST TOP");
    assertEquals(5,half.top());
    System.out.println(half);
  }



}
