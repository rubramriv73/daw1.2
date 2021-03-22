/**
 * 
 */
package main;

import matematicas.Varias;

/**
 * @author Rubén Ramírez Rivera
 *
 *  Here we are going to test if the math functions we are creating 
 *  are working correctly or not
 *  
 */
public class MainVarias {

  /**
   * @param args
   */
  public static void main(String[] args) {
    
    int num;
    
    //Here we test if isPrime function is working
    int[] nums = {3,35,47,97};
    for (int i = 0; i < nums.length; i++) {
      if (Varias.isPrime(nums[i])) {
        System.out.println(nums[i] + " is prime");
        
      } else {
        System.out.println(nums[i] + " NOT prime");

      }
    }
    
    //Here we test if nextPrime function is working
    num = 89;
    System.out.println("\nThe next prime following " + num + " is " 
    + Varias.nextPrime(num));
    
    //Here we test if power function is working
    System.out.println("\nPOWER: 3^6= " + Varias.power(3, 6));
    
    //Here we test if digits, turnOrder and  function is working
    System.out.println("\n3456543 has " + Varias.digits(3456543)
    + " digits");
    System.out.println("2345 turned is " + Varias.turnOrder(2345));
    
    num = 2344532;
    if (Varias.isPalindromic(num)) {
      System.out.println(num +" is palindromic -> " + 
    Varias.turnOrder(num));
    } else {
      System.out.println(num + " is NOT palindromic");
    }
    
    //Here we test if digitN function is working
    System.out.println("\n4567 - pos 1 --> " + Varias.digitN(4567, 1));

    //Here we test if positionDigit function is working
    System.out.println("\n4567 - digit 5 --> " + Varias.positionDigit(4567, 5));
    System.out.println("\n4567 - digit 9 --> " + Varias.positionDigit(4567, 9));

    //Here we test if deleteBack and front are working function is working
    System.out.println("\n2344532 - delete 2 end --> " + Varias.deleteBack(2344532, 2));
    System.out.println("\n123456 - digit 1 start --> " + Varias.deleteFront(123456, 3));

    //Here we test if digitN function is working
    num = 4567;
    System.out.println("\nAdding 9 at the end of " + num + " equals " + Varias.pasteBack(num,9));
    System.out.println("Adding 7 at the start of " + num + " equals " + Varias.pasteFront(num,7));
    
    //Here we test if pieceOfNumber function is working
    num = 123456789;
    System.out.println("\nNum: " + num + " start 2 end 7 -> " + Varias.pieceOfNumber(num, 2, 7));

    //Here we test if pasteNumbers function is working
    int num1 = 123;
    int num2 = 789;
    System.out.println("\nThe result of mixing " + num1 + " and " +
    num2 + " is " + Varias.pasteNumbers(num1, num2));
  }

}
