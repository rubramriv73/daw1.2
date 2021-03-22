package mainTanda1;

import java.util.Scanner;
import tanda1.Fecha;

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
 * @author Rubén Ramírez Rivera
 *
 */

public class MainFecha {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Testeamos funciones fecha correcta
    Fecha[] fechas = new Fecha[5];
    fechas[0] = new Fecha(15,12,2019); //correct
    fechas[1] = new Fecha(11,11,2018); // correct
    fechas[2] = new Fecha(42,12,2020); // incorrect
    fechas[3] = new Fecha(29,2,2001); // incorrect
    fechas[4] = new Fecha(29,2,2000);// correct
                        
    for (Fecha f:fechas) {
      System.out.print(f + " tiene un formato ");
      if (f.fechaCorrecta()) {
        System.out.println("CORRECTO");
      } else {
        System.out.println("INCORRECTO");
      }
    }  
    System.out.println();
          
    // Testeamos suma y resta de días
    Fecha fecha1 = new Fecha(4,1,2016);
    Fecha fecha2 = new Fecha(1,3,2016);
    Fecha fecha3 = new Fecha(28,2,2017);
    Fecha fecha4 = new Fecha(1,3,2017);
    
    System.out.print("Si sumamos un día a '" + fecha1 + "' obtenemos: ");
    fecha1.fechaMas1Dia();
    System.out.println(fecha1);
    
    System.out.print("Si restamos un día a '" + fecha2 + "' obtenemos: ");
    fecha2.fechaMenos1Dia();
    System.out.println(fecha2);
    
    System.out.print("Si sumamos un día a '" + fecha3 + "' obtenemos: ");
    fecha3.fechaMas1Dia();
    System.out.println(fecha3);
    
    System.out.print("Si restamos un día a '" + fecha4 + "' obtenemos: ");
    fecha4.fechaMenos1Dia();
    System.out.println(fecha4);
    System.out.println();
    
    System.out.print("¿Cuantos días quieres sumar a " + fecha1 + " ? ");
    fecha1.fechaMasNDias(s.nextInt());
    System.out.println("La fecha resultante es " + fecha1);
    System.out.println();
    
    System.out.print("¿Cuantos días quieres restar a " + fecha1 + " ? ");
    fecha1.fechaMenosNDias(s.nextInt());
    System.out.println("La fecha resultante es " + fecha1);
    System.out.println();
    
    // Testeamos comparaciones de fechas
    Fecha f1 = new Fecha(20,1,2016);
    Fecha f2 = new Fecha(20,1,2016);
    Fecha f3 = new Fecha(21,1,2016);
    if (f1.compareDate(f2) < 0) {
      System.out.println(f1 + " happened earlier than " + f2);
      
    } else if (f1.compareDate(f2) > 0) {
      System.out.println(f2 + " happened earlier than " + f1);
      
    } else {
      System.out.println(f1 + " and " + f2 + " are the same date");
      
    }
    
    if (f1.compareDate(f3) < 0) {
      System.out.println(f1 + " happened earlier than " + f3);
      
    } else if (f1.compareDate(f3) > 0) {
      System.out.println(f3 + " happened earlier than " + f1);
      
    } else {
      System.out.println(f1 + " and " + f3 + " are the same date");
    }
  }
  
}
