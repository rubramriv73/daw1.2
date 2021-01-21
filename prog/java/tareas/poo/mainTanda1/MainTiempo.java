package mainTanda1;

import java.util.Scanner;
import tanda1.Tiempo;

/**
 * @author Rubén Ramírez Rivera
 *
 * 1. Crea la clase Tiempo. Los objetos de la clase Tiempo son intervalos de tiempo y se crean de la forma:
 * 
 * t = Tiempo(1, 20, 30)
 * 
 * donde los parámetros que se le pasan al constructor son las horas, los minutos y los segundos respectivamente. 
 * 
 * Crea métodos para:
 * 
 * Sumar y restar otro objeto de la clase Tiempo (el resultado es otro objeto).
 * Sumar y restar segundos, minutos y/o horas (se cambia el objeto actual).
 * Devolver una cadena con el tiempo almacenado, de forma que si lo que hay es (10 35 5) la cadena sea 10h 35m 5s.
 * Realiza un programa de prueba para comprobar que la clase funciona bien.
 * 
 */

public class MainTiempo {
  public static void main(String[] args) {
    
    Tiempo t1 = new Tiempo(11,111,111);
    Tiempo t2 = new Tiempo(3,7,12);
    
    // Test if toString Works
    System.out.println("Tiempo 1 es " + t1);
    System.out.println("Tiempo 1 es " + t2 + "\n");
    
    // Test if Add and Subtract methods work
    System.out.println("Adding times --> " + t1.addTime(t2));
    System.out.println("Subtracting times --> " + t1.subTime(t2) + "\n");
    
    // Test if add and subtract hours, minutes or seconds work
    System.out.print(t1 + " ");
    t1.addHour(3);
    System.out.println("plus 3 hours is " + t1 + "\n");
    
    System.out.print(t1 + " ");
    t1.addMin(40);
    System.out.println("plus 40 minutes is " + t1 + "\n");
    
    System.out.print(t1 + " ");
    t1.addSec(240);
    System.out.println("plus 240 seconds is " + t1 + "\n");
    
    System.out.print(t1 + " ");
    t1.subHour(6);
    System.out.println("minus 6 hours is " + t1 + "\n");
    
    System.out.print(t1 + " ");
    t1.subMin(82);
    System.out.println("minus 82 minutes is " + t1 + "\n");
    
    System.out.print(t1 + " ");
    t1.subSec(70);
    System.out.println("minus 70 seconds is " + t1 + "\n");
    
  }
}
