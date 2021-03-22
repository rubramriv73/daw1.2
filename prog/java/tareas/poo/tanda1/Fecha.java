package tanda1;

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
public class Fecha{
  
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
  public Fecha(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
    
    if(!this.fechaCorrecta()) {
      System.err.println("¡Incorrect Date!");
      return;
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
    if (!this.fechaCorrecta()) {
      System.err.println("¡Incorrect Date!");
      return;
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
    if (!this.fechaCorrecta()) {
      System.err.println("¡Incorrect Date!");
      return;
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
    if (!this.fechaCorrecta()) {
      System.err.println("¡Incorrect Date!");
      return;
    }
  }

  // Methods
  
  /*
   * fechaCorrecta Method
   * 
   * Im going to use it but we could adjust the setters to make sure every date 
   * is always correct
   * 
   * @param date date the user want to confirm if it's correct
   * or not
   * @return
   */
  public boolean fechaCorrecta() {
    if (this.year == 0) {
      return false;
      
    }
    if (this.month < 1 || this.month > 12) {
      return false;
        
    } 
    
    return (this.day < 1 || this.day > daysMonth(this.month,this.year));
      
  }
 

  /*
   * Suma un día a la fecha que se pasa como parámetro y lo devuelve.
   * 
   * @param date date the user wants to increase 1 day
   * @return
   */
  public void fechaMas1Dia() {    
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
  
  /*
   * Suma una serie de días a la fecha que se pasa como parámetro y lo devuelve.
   * 
   * @param date date the user wants to increase n days
   * @param n number of days the user want to increase the date
   * @return
   */
  public void fechaMasNDias(int n) {    
    for (int i = 0; i < n; i++) {
      this.fechaMas1Dia();
    }
    
  }
  
  /*
   * Resta un día a la fecha que se pasa como parámetro y lo devuelve.
   * 
   * @param date date the user wants to decrease 1 day
   * @return
   */
  public void fechaMenos1Dia() {    
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
  
  /*
   * Resta una serie de días a la fecha que se pasa como parámetro y lo devuelve.
   * 
   * @param date date the user wants to decrease n days
   * @param n number of days the user want to decrease the date
   * @return
   */
  public void fechaMenosNDias(int n) {
    for (int i = 0; i < n; i++) {
      this.fechaMenos1Dia();
      
    }
    
  }
  
  /*
   * Dice si la fecha que se pasa como parámetro es bisiesto.
   * 
   * @param date date the user wants to know if the year is
   * leap or not
   * @return
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
  
  public int compareDate(Fecha date) {
    return (this.day + this.month * 100 + this.year * 1000) - (date.day + date.month * 100 + date.year * 1000);
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

  
}
