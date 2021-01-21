package tanda1;

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
public class Tiempo {
  
  // Declare the variables of our object
  private int hour;
  private int min;
  private int sec;
  
  /**
   * Constructor method
   * 
   * @param hours
   * @param mins
   * @param secs
   */
  public Tiempo(int hours, int mins, int secs) {
    
    int totalSecs = (hours * 3600) + (mins * 60) + secs;
    
    this.hour = totalSecs / 3600;
    this.min = (totalSecs % 3600) / 60;
    this.sec = (totalSecs % 3600) % 60;
    
  }


  /**
   *  Hour getter
   *  
   * @return the hour of the time
   */
  public int getHour() {
    return hour;
  }


  /**
   * Minute getter
   * 
   * @return the minutes of the time
   */
  public int getMin() {
    return min;
  }


  /**
   * Second getter
   * @return the seconds of the time
   */
  public int getSec() {
    return sec;
  }
  
  // Methods
  
  /**
   * addTime Method
   * 
   * This method add 2s different times 
   * 
   * @param t
   * @return
   */
  public Tiempo addTime(Tiempo t) {
    
    return new Tiempo(this.hour + t.hour, this.min + t.min, this.sec + t.sec);
    
  }
  
  /**
   * subTime Method
   * 
   * This method subtract 2 different times
   * 
   * @param t
   * @return
   */
  public Tiempo subTime(Tiempo t) {
    
    return new Tiempo(this.hour - t.hour, this.min - t.min, this.sec - t.sec);
    
  }

  /**
   * addHour Method
   * 
   * This method add hours to our time
   * 
   * @param hours
   */

  public void addHour(int hours) {
    
    Tiempo aux = new Tiempo(this.hour + hours, this.min, this.sec);
    
    this.hour = aux.hour;
    this.min = aux.min;
    this.sec = aux.sec;
    
  }
  
  /**
   * addMin Method
   * 
   * This method add minutes to our time
   * 
   * @param mins
   */
  public void addMin(int mins) {
    
    Tiempo aux = new Tiempo(this.hour, this.min + mins, this.sec);
    
    this.hour = aux.hour;
    this.min = aux.min;
    this.sec = aux.sec;
    
  }
  
  /**
   * addSec Method
   * 
   * This method add seconds to our time
   * 
   * @param secs
   */
  public void addSec(int secs) {
    
    Tiempo aux = new Tiempo(this.hour, this.min, this.sec + secs);
    
    this.hour = aux.hour;
    this.min = aux.min;
    this.sec = aux.sec;
    
  }
  
  /**
   * subHour Method
   * 
   * This method subtract hours to our time
   * 
   * @param hours
   */
  public void subHour(int hours) {
    
    Tiempo aux = new Tiempo(this.hour - hours, this.min, this.sec);
    
    this.hour = aux.hour;
    this.min = aux.min;
    this.sec = aux.sec;
    
  }
  
  /**
   * subMin Method
   * 
   * This method subtract minutes to our time
   * 
   * @param mins
   */
  public void subMin(int mins) {
    
    Tiempo aux = new Tiempo(this.hour, this.min - mins, this.sec);
    
    this.hour = aux.hour;
    this.min = aux.min;
    this.sec = aux.sec;
    
  }
  
  /**
   * subSec Method
   * 
   * This method subtract seconds to our time
   * 
   * @param secs
   */
  public void subSec(int secs) {
    
    Tiempo aux = new Tiempo(this.hour, this.min, this.sec - secs);
    
    this.hour = aux.hour;
    this.min = aux.min;
    this.sec = aux.sec;
  }

  /**
   * toString Method
   * 
   * @return String with the correct format of the time
   */
  @Override
  public String toString() {
    
    return hour + "H:" + min + "M:" + sec + "S";
    
  }
  
  
 
}
