package pruebaExamen;

/** 
 * Colección de funciones para manejar fechas en cadenas de caracteres.
 *
 * El formato de la cadena es: AAAAMMDD.
 * Ejemplo: El 15 de diciembre de 2019 sería: "20191215"
 * 
 * Colección de funciones:
 * 
 * 1. fechaCorrecta: dice si la fecha que se pasa como parámetro es correcta.
 * 
 * 2. fechaMas1Dia: suma un día a la fecha que se pasa como parámetro y lo devuelve.
 * 
 * 3. fechaMasNDias: suma una serie de días a la fecha que se pasa como parámetro y lo devuelve.
 * 
 * 4. fechaMenos1Dia: resta un día a la fecha que se pasa como parámetro y lo devuelve.
 * 
 * 5. fechaMenosNDias: resta una serie de días a la fecha que se pasa como parámetro y lo devuelve.
 * 
 * 6. esBisiesto: dice si la fecha que se pasa como parámetro es bisiesto.
 * 
 * 7. comparaFechas: recibe dos fechas y devuelve un valor negativo si la 1ª es anterior a la
 *    segunda, cero si son iguales, y un valor positivo si la 1ª es posterior a la segunda.
 * 
 * 8. fechaFormateada: recibe un fecha y devuelve una cadena con el formato:
 *    DD de {MES} de AAAA     (Ejemplo: "15 de Diciembre de 2019")
 *     
 * 9. anyo, mes, dia, nombreMes: recibe un fecha y devuelve esos valores.
 * 
 * @author Rubén Ramírez Rivera
 *
 */
public class Fecha {
  
  // Declare a constant array with the name of the months
  final static String [] MONTHS = {"January" , "February", "March" , "April" , "May"
      ,"June", "July", "August", "September", "October", "November"
      , "December"};

  /*
   * Dice si la fecha que se pasa como parámetro es correcta.
   * 
   * @param date date the user want to confirm if it's correct
   * or not
   * @return
   */
  public static boolean fechaCorrecta(String date) {
    if (date.length() != 8) {
      return false;
      
    }  
    
    for (int i = 0; i < date.length(); i++) {
      if (date.charAt(i) < '0' || date.charAt(i) > '9')  {
        return false;
        
      }
    }
    
    if (month(date) < 1 || month(date) > 12) {
      return false;
        
    } 
    
    if (day(date) < 1 || day(date) > daysMonth(date)) {
      return false;
      
    }
    
    return true;
  }
  
  /*
   * Suma un día a la fecha que se pasa como parámetro y lo devuelve.
   * 
   * @param date date the user wants to increase 1 day
   * @return
   */
  public static String fechaMas1Dia(String date) {
    
    int resultYear = year(date);
    int resultMonth = month(date);
    int resultDay = day(date) + 1;
    
    if (resultDay > daysMonth(correctDate(resultYear, resultMonth, resultDay))) {
      resultDay = 1;
      resultMonth += 1;
      
      if (resultMonth > MONTHS.length) {
        resultMonth = 1;
        resultYear += 1;
        
      }
    }
    
    return correctDate(resultYear, resultMonth, resultDay);
    
  }
  
  /*
   * Suma una serie de días a la fecha que se pasa como parámetro y lo devuelve.
   * 
   * @param date date the user wants to increase n days
   * @param n number of days the user want to increase the date
   * @return
   */
  public static String fechaMasNDias(String date, int n) {
    
    String aux = date;
    
    for (int i = 0; i < n; i++) {
      aux = fechaMas1Dia(aux);
    }
    
    return aux;
    
  }
  
  /*
   * Resta un día a la fecha que se pasa como parámetro y lo devuelve.
   * 
   * @param date date the user wants to decrease 1 day
   * @return
   */
  public static String fechaMenos1Dia(String date) {
    
    int resultYear = year(date);
    int resultMonth = month(date);
    int resultDay = day(date) - 1;
    
    if (resultDay < 1) {
      resultMonth -= 1;

      if (resultMonth < 1) {
        resultMonth = 12;
        resultYear -= 1;
        resultDay = 31;
        
      }
      
      resultDay = daysMonth(correctDate(resultYear, resultMonth, day(date)));
      
    }
    
    if (resultDay > daysMonth(correctDate(resultYear, resultMonth, resultDay))) {
      resultDay = daysMonth(correctDate(resultYear, resultMonth, resultDay));
      
    } 
    
    return correctDate(resultYear, resultMonth, resultDay);
    
  }
  
  /*
   * Resta una serie de días a la fecha que se pasa como parámetro y lo devuelve.
   * 
   * @param date date the user wants to decrease n days
   * @param n number of days the user want to decrease the date
   * @return
   */
  public static String fechaMenosNDias(String date, int n) {
    
    String aux = date;
    
    for (int i = 0; i < n; i++) {
      aux = fechaMenos1Dia(aux);
    }
    
    return aux;
    
  }
  
  /*
   * Dice si la fecha que se pasa como parámetro es bisiesto.
   * 
   * @param date date the user wants to know if the year is
   * leap or not
   * @return
   */
  public static boolean isLeap(String date) {
    
    return (year(date) % 4 == 0 && (year(date) % 100 != 0 || year(date) % 400 == 0));
    
  }
  
  /*
   * Recibe dos fechas y devuelve un valor negativo si la 1ª es anterior a la
   * segunda, cero si son iguales, y un valor positivo si la 1ª es posterior a 
   * la segunda.
   * 
   * @param date1 A date to compare
   * @param date2 Another date to compare
   * @return
   */
  public static int compareDates(String date1, String date2) {
    
    return date1.compareTo(date2);
    
  }
  
  /*
   * Recibe un fecha y devuelve una cadena con el formato:
   * DD de {MES} de AAAA     (Ejemplo: "15 de Diciembre de 2019")
   * 
   * @param date date the user wants to give format to show it
   * @return formated date to show it
   */
  public static String formatDate(String date) {
    
    return nameMonth(date) + " the " + Integer.toString(day(date)) + " of " + Integer.toString(year(date)); 
  }
  
  /*
   * Recibe un fecha y devuelve esos valores.
   * 
   * @param date date the user wants to obtain the year
   * @return year of the date
   */
  public static int year(String date) {
    
    return Integer.parseInt(date.substring(0,4));
    
  }
  
  /*
   * Recibe un fecha y devuelve esos valores.
   * 
   * @param date date the user wants to obtain the year
   * @return month of the date
   */
  public static int month(String date) {
    
    return Integer.parseInt(date.substring(4,6));
    
  }
  
  /*
   * Recibe un fecha y devuelve esos valores.
   * 
   * @param date date the user wants to obtain the year
   * @return day of the date
   */
  public static int day(String date) {
    
    return Integer.parseInt(date.substring(6,8));

  }
  
  /*
   * Recibe un fecha y devuelve esos valores.
   * 
   * @param date date the user wants to obtain the year
   * @return name of the month
   */
  public static String nameMonth(String date) {
    
    return MONTHS[month(date) - 1];
    
  }
  
  /*
   * This methods returns the days a month has in within being leap or not
   * 
   * @param date user's date
   * @return day of the month from the user's date
   */
  public static int daysMonth(String date) {
    
    int [] days = { 31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 };
    
    if (isLeap(date)) {
      days[month(date) - 1]++;
      
    } 
    
    return days[month(date)-1];
    
  }
  
  public static String correctDate(int year, int month, int day) {
    
    String yearStr = Integer.toString(year);
    String monthStr;
    String dayStr;
    
    if (month > 0 && month <= 9) {
      monthStr = "0" + month;
      
    } else {
      monthStr = Integer.toString(month);
    }
    
    if (day > 0 && day <= 9) {
      dayStr = "0" + day;
      
    } else {
      dayStr = Integer.toString(day);
    }
    
    return yearStr+monthStr+dayStr;
  }
  
}
