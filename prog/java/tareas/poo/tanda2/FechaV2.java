package tanda2;

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

public class FechaV2 implements Comparable<FechaV2>, Cloneable {
  
  // Declare a constant array with the name of the months
  final static String [] MONTHS = {"January" , "February", "March" , "April" , "May"
      ,"June", "July", "August", "September", "October", "November"
      , "December"};
  
  // Declare the variables of the object Fecha
  private int day;
  private int month;
  private int year;
    
  /**
   * Fecha Constructor
   * 
   * @param day
   * @param month
   * @param year
   */
  public FechaV2(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
    if (!correctDate()) {
      System.err.println("Wrong date!! Some option might not work.");
    }
  }
  
  // Getter & Setters
  /**
   * @return the day
   */
  public int getDay() {
    return day;
  }

  /**
   * @param day the day to set
   */
  public void setDay(int day) {
    this.day = day;
    if (!correctDate()) {
      System.err.println("Wrong date!! Some option might not work.");
    }
  }

  /**
   * @return the month
   */
  public int getMonth() {
    return month;
  }

  /**
   * @param month the month to set
   */
  public void setMonth(int month) {
    this.month = month;
    if (!correctDate()) {
      System.err.println("Wrong date!! Some option might not work.");
    }
  }

  /**
   * @return the year
   */
  public int getYear() {
    return year;
  }

  /**
   * @param year the year to set
   */
  public void setYear(int year) {
    this.year = year;
    if (!correctDate()) {
      System.err.println("Wrong date!! Some option might not work.");
    }
  }

  // Methods
  
  /*
   * correctDate Method
   * 
   * Im going to use it but we could adjust the setters to make sure every date 
   * is always correct
   * 
   * @param date date the user want to confirm if it's correct
   * or not
   * @return
   */
  public boolean correctDate() {
    if (this.year == 0) {
      return false;
      
    }
    if (this.month < 1 || this.month > 12) {
      return false;
        
    } 
    
    return (this.day < 1 || this.day > daysMonth(this.month,this.year));
      
  }
 

  /**
   * datePlus1Day Method
   * 
   * Add a day to the actual date.
   * 
   */
  public void datePlus1Day() {  
    if (!correctDate()) {
      System.err.println("Wrong date!! Some option might not work.");
      return;
    }
    if ((this.day + 1) > daysMonth(this.month, this.year)) {
      this.day = 1;
      this.month += 1;
      
      if (this.month > MONTHS.length) {
        this.month = 1;
        this.year += 1;
        
      }
    } else {
      this.day += 1;
      
    }
    
  }
  
  /**
   * datePlusNDays Method
   * 
   * Add a number of days to the actual date
   * 
   * @param n number of days the user want to increase the date
   */
  public void datePlusNDays(int n) {   
    if (!correctDate()) {
      System.err.println("Wrong date!! Some option might not work.");
      return;
    }
    for (int i = 0; i < n; i++) {
      this.datePlus1Day();
    }
    
  }
  
  /**
   * datePlus1Day Method
   * 
   * Add a day to the actual date.
   * 
   */
  public void dateMinus1Day() {    
    if (!correctDate()) {
      System.err.println("Wrong date!! Some option might not work.");
      return;
    }
    if ((this.day - 1) < 1) {
      this.month -= 1;

      if (this.month < 1) {
        this.month = 12;
        this.year -= 1;
        this.day = 31;
        
      }
      this.day = daysMonth(this.month, this.year);
      
    } 
    
  }
  
  /**
   * dateMinusNDays Method
   * 
   * Subtract a number of days to the actual date
   * 
   * @param n number of days the user want to decrease a date
   */
  public void dateMinusNDays(int n) {
    if (!correctDate()) {
      System.err.println("Wrong date!! Some option might not work.");
      return;
    }
    for (int i = 0; i < n; i++) {
      this.dateMinus1Day();
      
    }
    
  }
  
  /**
   * isLeap Method
   * 
   * Method that calculates if it's a leap year or not
   * 
   * @param date date the user wants to know if the year is
   * leap or not
   * @return true if leap, false if not leap
   */
  public static boolean isLeap(int year) {
    
    return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    
  }

  /*
   * Recibe una fecha y devuelve un valor negativo si la 1ª es anterior a la
   * segunda, cero si son iguales, y un valor positivo si la 1ª es posterior a 
   * la segunda.
   * 
   * @param date A date to compare
   * @return Negative if date is after this date Positive if date is before this date and
   *         0 if both are the same dates
   */
  @Override
  public int compareTo(FechaV2 date) {
    return (this.day + this.month * 100 + this.year * 1000) - (date.day + date.month * 100 + date.year * 1000);
  }
  
  /*
   * Method that clone a date
   * 
   * @return A new date with the same values from the current date we are using
   */
  @Override
  public FechaV2 clone() {
    return new FechaV2(this.day, this.month, this.year);
  }
  
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + day;
    result = prime * result + month;
    result = prime * result + year;
    return result;
  }

  /**
   * Method that compares if 2 dates are the same
   * 
   * @param obj
   * @return true if the same date, false if different
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    FechaV2 other = (FechaV2) obj;
    if (day != other.day || month != other.month || year != other.year)
      return false;
    return true;
  }

  /*
   * Recibe un fecha y devuelve una cadena con el formato:
   * DD de {MES} de AAAA     (Ejemplo: "15 de Diciembre de 2019")
   * 
   * @param date date the user wants to give format to show it
   * @return formated date to show it
   */
  public  String toString() {
    
    return nameMonth(this.month) + " the " + this.day + " of " + this.year; 
  }
  
  /*
   * Recibe un fecha y devuelve esos valores.
   * 
   * @param date date the user wants to obtain the year
   * @return name of the month
   */
  public static String nameMonth(int month) {
    
    return MONTHS[month - 1];
    
  }
  
  /*
   * This methods returns the days a month has in within being leap or not
   * 
   * @param date user's date
   * @return day of the month from the user's date
   */
  public static int daysMonth(int m , int y) {
    
    int [] days = { 31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 };
    
    if (isLeap(y)) {
      days[1]++;
      
    } 
    
    return days[m - 1];
    
  }
  
  
  /**
   * Method that gives the days between 2 dates
   * 
   * @param f1 Date 1
   * @param f2 Date 2
   * @return The days between both date
   */
  public static int daysBetweenDates(FechaV2 f1, FechaV2 f2) {
    FechaV2 date = f1.clone();
    int daysBetween = 0;
    
    if (date.compareTo(f2) < 0) {
      while (!date.equals(f2)) {
        daysBetween++;
        date.datePlus1Day();
      }
      
    } else if (date.compareTo(f2) > 0) {
      while (!date.equals(f2)) {
        daysBetween++;
        date.dateMinus1Day();
      }
      
    }
    return daysBetween;
  }  
}
