package mainTanda2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tanda2.IntegerList;

/**
 * Test Clase Lista
 * 
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
class TestLista {

  private IntegerList emptyList;
  private IntegerList halfList;
  private IntegerList fullList;
  
  @BeforeEach
  void setUp() throws Exception {
    emptyList = new IntegerList();
    halfList = new IntegerList(1,2,3,4,5);
    fullList = new IntegerList(1,2,3,4,5,6,7,8,9,10);
  }
  
  
  @Test
  void testIntegerList() {
    IntegerList l = new IntegerList();
    Assertions.assertEquals(0, l.getContentSize());
  }

  @Test
  void testIntegerListIntArray() {
    IntegerList l = new IntegerList(1,2,3,4,5);
    System.out.println(l);
    Assertions.assertEquals("[1, 2, 3, 4, 5]", l.toString());
  }

  @Test
  void testInsert() {
    assertTrue(emptyList.insert(77));
    assertTrue(halfList.insert(77));
    assertFalse(fullList.insert(77));
  }

  @Test
  void testInsertPos() {
    emptyList.insert(1,1);
    System.out.println(emptyList);
    halfList.insert(6,11);
    assertEquals("[1]",emptyList.toString());
    assertEquals("[1, 2, 3, 4, 5, 6]",halfList.toString());
    halfList.insert(3,2);
    assertEquals("[1, 2, 3, 3, 4, 5, 6]", halfList.toString());
    assertFalse(fullList.insert(11,2));
  }

  @Test
  void testPop() {
    assertEquals(5,halfList.pop());
    assertEquals(5,fullList.pop(4));
    System.out.println(fullList);
  }

  @Test
  void testRemove() {
    assertTrue(fullList.remove(10));
    System.out.println(fullList);
    assertFalse(emptyList.remove(3));
    assertFalse(halfList.remove(6));
  }

  @Test
  void testResize() {
    fullList.resize(15);
    assertEquals(15,fullList.maxSize());
    assertEquals(10,fullList.getContentSize());
    fullList.insert(11);
    System.out.println(fullList);
    
  }

}
