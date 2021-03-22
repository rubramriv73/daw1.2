package matematicas;

/**
 * @author Rubén Ramírez Rivera
 *  
 *  Pack of mathematical functions
 *  
 */
public class Varias {
  
  /*
   * Devuelve verdadero si el número que se pasa como parámetro 
   * es primo y falso en caso contrario
   * 
   * @param n number we are going to compare if it's prime or not
   * @return true if it's prime, false if it ins't a prime
   */
  public static boolean isPrime(int n) {
    
    // Declare a variable to set if the number is prime or not
    boolean prime = true;
    
    // Compare if it's even, so we set the prime to false
    if ((n % 2) == 0) {
      prime = false;
      
    } else {
      // Calculate if the number is prime or not
      for (int i = 3; i < n; i += 2) {
        if ((n % i) == 0) {
          prime = false;
          
        }
      }
    }
    
    return prime;
    
  }
  
  /*
   * Devuelve el menor primo que es mayor al número que
   * se pasa como parámetro.
   * 
   * @param n number that we want to know what's the next prime number
   * @return next prime number
   */
  public static int nextPrime(int n) {
    
    int nextNumber;
    
    if (n % 2 == 0) {
      nextNumber = n + 1;
      
    } else {
      nextNumber = n + 2;

    }
    
    while (!isPrime(nextNumber)) {
      nextNumber += 2;
      
    }
    
    return nextNumber;
    
  }
  
  /*
   * Dada una base y un exponente devuelve la potencia.
   * 
   * @param base base of the power
   * @param exp exponent of the power
   * @return the result of the power
   * 
   */
  public static long power(int base , int exp) {
    
    return (long)Math.pow(base, exp);
    
  }

  /*
   * Cuenta el número de dígitos de un número entero.

   */
  public static int digits(int n) {
    int count = 0;
    int aux = n;
    
    do {
      aux /= 10;
      count++;
      
    } while (aux > 0);
    
    return count;
  }
  
  /*
   * Le da la vuelta a un número.
   * 
   * @param n number we want to turn the order
   * @return the number turned
   */
  public static int turnOrder(int n) {
    String number;
    String turn = "";
    
    number = Integer.toString(n);
    for (int i = number.length() - 1; i >= 0 ; i--) {
      turn += number.charAt(i);
      
    }
    
    return Integer.parseInt(turn);
    
  }
  
  /*
   * Devuelve verdadero si el número que se pasa como parámetro 
   * es capicúa y falso en caso contrario.
   * 
   * @param n number we want to know if its palindromic
   * @return true if it's palindromic, false if isnt palindromic
   */
  public static boolean isPalindromic(int n) {
    
    return (n == turnOrder(n));
    
  }
  
  /*
   * Devuelve el dígito que está en la posición n de un número entero.
   * Se empieza contando por el 0 y de izquierda a derecha.
   * 
   * @param number number we are going to take the digit of
   * @param pos position of the digit we want to get
   * @return digit in the position the user gives
   */
  public static int digitN(int number, int pos) {
    int aux = turnOrder(number);
    int digit = 0;
    
    for (int i = 0; i <= pos; i++) {
      digit = aux % 10;
      aux /= 10;
      
    }
    
    return digit;
  }
  
  /*
   * Da la posición de la primera ocurrencia de un dígito
   * dentro de un número entero. Si no se encuentra, devuelve -1.
   * 
   * @param number number we want to get the position of a digit
   * @param digit digit we want to know the position
   * @return position where the digit is
   */
  public static int positionDigit(int number, int digit) {
    
    int aux = turnOrder(number);
    
    for (int i = 0; i < digits(number); i++) {
      if (digit == (aux % 10)) {
        return i;
      }
      aux /= 10;
      
    }
    
    return -1;
    
  }
  
  /*
   * Le quita a un número n dígitos por detrás (por la derecha).
   * 
   * @param number number we want to modify it's length
   * @param pos positions we want to modify the length
   * @return number modified
   */
  public static int deleteBack(int number, int pos) {
    int aux = number;
    
    if (pos >= digits(number)) {
      return 0;
      
    } else {
      for (int i = 0; i < pos; i++) {
        aux /= 10;
        
      }
      return aux;
      
    }
  }
  
  /*
   * Le quita a un número n dígitos por delante (por la izquierda).
   * 
   * @param number number we want to modify it's length
   * @param pos positions we want to modify the length
   * @return number modified
   */
  public static int deleteFront(int number, int pos) {
    int aux = turnOrder(number);
    
    if (pos >= digits(number)) {
      return 0;
      
    } else {
      for (int i = 0; i < pos; i++) {
        aux /= 10;
        
      }
      return turnOrder(aux);
      
    }
  }
  
  /*
   * Añade un dígito a un número por detrás.
   * 
   * @param number number we want to modify
   * @param digit digit we want to add to the number from the back
   * @return number modified
   */
  public static int pasteBack(int number, int digit) {
    return ((number * 10) + digit);
  }
  
  /*
   * Añade un dígito a un número por delante.
   * 
   * @param number number we want to modify
   * @param digit digit we want to add to the number from the back
   * @return number modified
   */
  public static int pasteFront(int number, int digit) {
    digit *= power(10, digits(number));
    
    return digit + number;
  }
  
  /*
   * Toma como parámetros las posiciones inicial y final
   * dentro de un número y devuelve el trozo correspondiente.
   * 
   * @param number number we are going to take a piece
   * @param start start position for the piece we are going to form
   * @param end end position for the piece we are going to form
   * @return the piece of the number
   */
  public static int pieceOfNumber(int number, int start, int end) {
    int piece;
    
    piece = deleteFront(number, start);
    
    piece = deleteBack(piece, digits(number) - end - 1);
    
    return piece;
  }
  
  /*
   * Pega dos números para formar uno.
   * 
   * @param num1 number we adding to the left
   * @param num2 number we adding to the right
   * @return number formed by num1-num2
   */
  public static int pasteNumbers(int num1, int num2) {
    return(((num1 * (int)(power(10, digits(num2))) + num2)));
  }
}
