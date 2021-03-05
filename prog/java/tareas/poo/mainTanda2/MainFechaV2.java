package mainTanda2;

import java.util.Scanner;
import tanda2.FechaV2;

/** 
 * 3. Crea una clase Fecha. Los objetos de la clase Fecha son fechas de tiempo 
 * y se crean de la forma:
 * 
 * Fecha f = Fecha(1, 10, 2020);
 * 
 * donde los parámetros que se le pasan al constructor son el día, el mes y el 
 * año respectivamente. Si la fecha creada es incorrecta mostraremos un mensaje 
 * de error en la salida estándar de errores (lo ideal sería lanzar una excepción, 
 * ya lo haremos cuando se vea en clase).
 * 
 * Crea métodos para:
 * 
 * Saber si la fecha almacenada es correcta.
 * Sumar y restar días a la fecha. 
 * Comparar la fecha almacenada con otra, el método devolverá un valor negativo si 
 * la fecha almacenada es ANTERIOR a la otra, 0 si son IGUALES y un valor positivo 
 * si es POSTERIOR.
 * Saber si el año de la fecha almacenada es bisiesto.
 * El método toString() devuelve una cadena con el formato "<día del mes> de <nombre 
 * del mes> de <año>".
 * 
 * Las opciones a partir de la segunda, solo se realizarán si la fecha almacenada es correcta, 
 * en caso de no serlo, se dará un aviso, por la salida estándar de errores, de que la operación 
 * no se puede realizar.
 * 
 * Puedes usar una variable de clase para almacenar el número de días de cada mes del año (que 
 * no sea bisiesto).
 * 
 * Modifica la clase Fracción y Fecha de la tanda de ejercicios anterior para que implementen 
 * equals() y las interfaces Comparable y Cloneable.
 * 
 * Modifica la clase Fecha para que proporcione un método estático que reste dos fechas y nos 
 * devuelva el número de días comprendidos entre las dos.
 * 
 * @author Rubén Ramírez Rivera
 *
 */

public class MainFechaV2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Test. Correct Dates
    FechaV2[] fechas = new FechaV2[5];
    fechas[0] = new FechaV2(15,12,2019); //correct
    fechas[1] = new FechaV2(11,11,2018); // correct
    fechas[2] = new FechaV2(42,12,2020); // incorrect
    fechas[3] = new FechaV2(29,2,2001); // incorrect
    fechas[4] = new FechaV2(29,2,2000);// correct
                        
    for (FechaV2 f:fechas) {
      System.out.print(f + " format ");
      if (f.correctDate()) {
        System.out.println("is CORRECT");
      } else {
        System.out.println("is WRONG");
      }
    }  
    System.out.println();
          
    // Test. Add and subtract dates
    FechaV2 fecha1 = new FechaV2(4,1,2016);
    FechaV2 fecha2 = new FechaV2(1,3,2016);
    FechaV2 fecha3 = new FechaV2(28,2,2017);
    FechaV2 fecha4 = new FechaV2(1,3,2017);
    
    System.out.print("Si sumamos un día a '" + fecha1 + "' obtenemos: ");
    fecha1.datePlus1Day();
    System.out.println(fecha1);
    
    System.out.print("Si restamos un día a '" + fecha2 + "' obtenemos: ");
    fecha2.dateMinus1Day();
    System.out.println(fecha2);
    
    System.out.print("Si sumamos un día a '" + fecha3 + "' obtenemos: ");
    fecha3.datePlus1Day();
    System.out.println(fecha3);
    
    System.out.print("Si restamos un día a '" + fecha4 + "' obtenemos: ");
    fecha4.dateMinus1Day();
    System.out.println(fecha4);
    System.out.println();
    
    System.out.print("¿Cuantos días quieres sumar a " + fecha1 + " ? ");
    fecha1.datePlusNDays(s.nextInt());
    System.out.println("La fecha resultante es " + fecha1);
    System.out.println();
    
    System.out.print("¿Cuantos días quieres restar a " + fecha1 + " ? ");
    fecha1.dateMinusNDays(s.nextInt());
    System.out.println("La fecha resultante es " + fecha1);
    System.out.println();
    
    // Testeamos comparaciones de fechas y clonamos una de ellas
    FechaV2 f1 = new FechaV2(20,1,2016);
    FechaV2 f2 = f1.clone();
    FechaV2 f3 = new FechaV2(2,2,2021);
    if (f1.compareTo(f2) < 0) {
      System.out.println(f1 + " happened earlier than " + f2);
      
    } else if (f1.compareTo(f2) > 0) {
      System.out.println(f2 + " happened earlier than " + f1);
      
    } else {
      System.out.println(f1 + " and " + f2 + " are the same date");
      
    }
    
    if (f1.compareTo(f3) < 0) {
      System.out.println(f1 + " happened earlier than " + f3);
      
    } else if (f1.compareTo(f3) > 0) {
      System.out.println(f3 + " happened earlier than " + f1);
      
    } else {
      System.out.println(f1 + " and " + f3 + " are the same date");
    }

    // Test. Days between 2 dates
    System.out.println("\nDate 1 -> " + f1);
    System.out.println("Date 2 -> " + f2);
    System.out.println("Date 3 -> " + f3);
    
    System.out.println("Days between date 1 and date 2: " + FechaV2.daysBetweenDates(f1, f2));
    System.out.println("Days between date 1 and date 3: " + FechaV2.daysBetweenDates(f1, f3));
  }
  
}
