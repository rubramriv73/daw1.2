package tanda1;

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
    if (this.month < 1 || this.month > 12) {
      return false;
        
    } 
    
    if (this.day < 1 || this.day > this.daysMonth()){
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
  public void fechaMas1Dia() {    
    if ((this.day + 1) > this.daysMonth()) {
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
      this.day = daysMonth();
      
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
  public boolean isLeap() {
    
    return (this.year % 4 == 0 && (this.year % 100 != 0 || this.year % 400 == 0));
    
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
  public int compareDates(Fecha date) {
    String date1 = "" + this.day + this.month + this.year;
    String date2 = "" + date.day + date.month + date.year;
    
    return date1.compareTo(date2);
    
  }
  
  /*
   * Recibe un fecha y devuelve una cadena con el formato:
   * DD de {MES} de AAAA     (Ejemplo: "15 de Diciembre de 2019")
   * 
   * @param date date the user wants to give format to show it
   * @return formated date to show it
   */
  public  String toString() {
    
    return nameMonth() + " the " + this.day + " of " + this.year; 
  }
  
  /*
   * Recibe un fecha y devuelve esos valores.
   * 
   * @param date date the user wants to obtain the year
   * @return name of the month
   */
  public String nameMonth() {
    
    return MONTHS[this.month - 1];
    
  }
  
  /*
   * This methods returns the days a month has in within being leap or not
   * 
   * @param date user's date
   * @return day of the month from the user's date
   */
  public int daysMonth() {
    
    int [] days = { 31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 };
    
    if (isLeap()) {
      days[1]++;
      
    } 
    
    return days[this.month - 1];
    
  }
  
  
}
