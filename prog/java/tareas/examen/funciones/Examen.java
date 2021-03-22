/**
 * 
 */
package funciones;

import java.util.Scanner;

/**
 * @author Rubén Ramírez Rivera
 *
 * Funciones a emplear en el examen:
 * 
 * 1. Generar aleatoriamente las calificaciones (enteros entre -1 y 10).
 * 2. Mostrar el número de ejercicios entregados por un estudiante.
 * 3. Mostrar la media de los ejercicios entregados por un estudiante (si los 
 *    entregó todos; en caso contrario, la media es 0).
 * 4. Mostrar la cantidad de estudiantes que han entregado todos los ejercicios
 *    y tienen una media superior o igual a un 5.
 * 5. Mostrar el número de estudiantes que han presentado un ejercicio dado.
 * 6. Dado el número de un ejercicio, mostrar la nota media obtenida por los 
 *    estudiantes que lo presentaron.
 * 7. Dado el número de un ejercicio, mostrar la nota más alta obtenida.
 * 8. Dado el número de un ejercicio, mostrar la nota más baja obtenida.
 * 9. Mostrar la relación de estudiantes y sus notas.
 * 10. Finalizar.
 * 
 */
public class Examen {
  
  final static int NUMBER_STUDENTS = 15;
  final static int EXERS = 5;
  final static int MIN_GRADE = -1;
  final static int MAX_GRADE = 10;

  /*
   * Menu we're going to use to execute the exam
   * 
   * @return option the user wants to execute
   * 
   */
  public static int menu() {
    
    // Declare our variable scanner
    Scanner sc = new Scanner(System.in);
    
    // Show options available
    System.out.println("Menu Moodle I.E.S. Gran Capitan");
    System.out.println("-------------------------------");
    System.out.println("\tOptions Available:");
    System.out.println("\n 1. Generate grades for the students:");
    System.out.println(" 2. Show how many exercises a student has presented:");
    System.out.println(" 3. Show the average of the exercises presented by a student:");
    System.out.println(" 4. Show how many students presented all the exercises and their average is 5+:");
    System.out.println(" 5. Show how many students presented and exercise:");
    System.out.println(" 6. Giving an exercise, show the average grade of the students who presented it:");
    System.out.println(" 7. Giving an exercise, show the highest grade:");
    System.out.println(" 8. Giving an exercise, show the lowest grade:");
    System.out.println(" 9. Show students and their grades:");
    System.out.println(" 10. Exit the program:");
    System.out.print("\nINSERT YOUR OPTION: ");
    
    return sc.nextInt();   

  }
  
  /*
   * Function that generates the names for the students
   * 
   * @return an array with the names of the students
   * 
   */
  public static String [] students() {
    
    // Declare our array for the names
    String [] names = new String[NUMBER_STUDENTS];
    
    // Go through the array inserting the names
    for (int i = 0; i < names.length; i++) {
      names[i] = "Student " + (i+1);
    }
    
    return names;
  }
  
  /*
   * FUNCTION 1
   * Function that generates the value of the grades of each student
   * 
   * @return an array with the grades of each student
   */
  public static int [][] generatedGrades() {
    // Declare our array for the grades of every student
    int [][] grades = new int[NUMBER_STUDENTS][EXERS];
    
    // Go through  the array generating grades
    for (int i = 0; i < NUMBER_STUDENTS; i++) {
      for (int j = 0; j < EXERS; j++) {
        grades[i][j] = MIN_GRADE + (int)(Math.random() * (MAX_GRADE - MIN_GRADE + 1));
        
      }
    }
    
    return grades;
    
  }
  
  /*
   * FUNCTION 2
   * Function that shows the user how many exercises are 
   * presented by a student
   * 
   * @param grades array with the grades of each student
   * @param student student we want to show his presented exercises
   * @return number of exercise presented by a student
   * 
   */
  public static int exercisePresented(int[][] grades, int student) {
    
    // Declare our counter variable
    int countPresented = 0;
    
    // Go through the array to compare the grades
    for (int i = 0; i < EXERS; i++) {
      if (grades[student-1][i] != -1) {
        countPresented++;
        
      }
    }
    
    return countPresented;
  }
  
  /*
   * FUNCTION 3
   * Function that returns the average of a student in case he 
   * has presented all the exercises
   * 
   * @param grades array with the grades of each student
   * @param student student we want to the average of his exercises
   * @return average of the exercises by a student
   */
  public static double avgGrades(int[][] grades, int student) {
    
    // Declare our counter variable
    int addGrades = 0;
    
    if (exercisePresented(grades, student) != 5) {
      return 0;
      
    } else {
      for (int i = 0; i < EXERS; i++) {
        addGrades += grades[student-1][i]; 
        
      }
    }
    
    return (double)addGrades / EXERS;
    
  }
  
  /*
   * FUNCTION 4
   * Function that returns the students that presented all the exercises
   * and their average is bigger or equals 5
   * 
   * @param grades array with the grades of each student
   * @return total students with the characteristics showed above
   */
  public static int goodStudents(int[][] grades) {
    
    // Declare our counter variable
    int listStudents = 0;
    
    // Go through the array
    for (int i = 0; i < NUMBER_STUDENTS; i++) {
      if ((exercisePresented(grades, i+1) == 5) && (avgGrades(grades, i+1) > 4)) {
          listStudents++;
      }
    }
    
    return listStudents;   
    
  }
  
  /*
   * FUNCTION 5
   * Function that returns the number of students that presented an exercise
   * 
   * @param grades array with the grades of each student
   * @param exercise exercise we want to see how many students have done it
   * @return total students that presented the exercise
   */
  public static int exerciseDone(int[][] grades, int exercise) {
    
    // Declare our counter variable
    int listStudents = 0;
    
    // Go through the array
    for (int i = 0; i < NUMBER_STUDENTS; i++) {
      if (grades[i][exercise-1] != -1) {
        listStudents++;
      }
    }
    
    return listStudents;
  }
  
  /*
   * FUNCTION 6
   * Function that return the average formed by the students that 
   * presented it
   * 
   * @param grades array with the grades of each student
   * @param exercise exercise we are going to calculate the average
   *                 by the students that presented it
   * @return average by the students that presented the exercise
   * 
   */
  public static double avgExercise(int[][] grades, int exercise) {
    
    // Variable for the addition of each grade
    int addStudents = 0;
    
    // Go through the array 
    for (int i = 0; i < NUMBER_STUDENTS; i++) {
      if (grades[i][exercise-1] != -1) {
        addStudents += grades[i][exercise-1];
        
      }
    }
    
    return (double)addStudents/exerciseDone(grades, exercise);
    
  }
  
  /*
   * FUNTION 7
   * Function that shows the highest grade of an exercise
   * 
   * @param grades array with the grades of each student
   * @param exercise exercise that we want to know its highest grade
   * @return highest grade of the exercise
   */
  public static int highestGrade(int[][] grades, int exercise) {
    
    // Declare our variable to save the highest grade
    int highest = MIN_GRADE;
    
    // Go through the array
    for (int i = 0; i < NUMBER_STUDENTS; i++) {
      if (grades[i][exercise-1] > highest) {
        highest = grades[i][exercise-1];
        
      }
    }
    
    return highest;
    
  }
  
  /*
   * FUNTION 8
   * Function that shows the highest grade of an exercise
   * 
   * @param grades array with the grades of each student
   * @param exercise exercise that we want to know its highest grade
   * @return highest grade of the exercise
   */
  public static int lowestGrade(int[][] grades, int exercise) {
    
    // Declare our variable to save the highest grade
    int lowest = MAX_GRADE;
    
    // Go through the array
    for (int i = 0; i < NUMBER_STUDENTS; i++) {
      if (grades[i][exercise-1] < lowest) {
        lowest = grades[i][exercise-1];
        
      }
    }
    
    return lowest;
    
  }
  
  /*
   * FUNCTION 9
   * Function to print the data we generated
   * 
   * @param students array with the name of the students
   * @param grades array with the grades of each student
   * @return a string with the info to show
   */
  public static String showData(String [] students, int [][] grades) {
    
    // Declare our variables 
    String data = "";
    
    // Go throgh the arrays to show the data
    for (int i = 0; i < NUMBER_STUDENTS; i++) {
      if (i < 9) {
        data += (i+1) + ". " + students[i] + "            ";
        
      } else {
        data += (i+1) + ". " + students[i] + "          ";
        
      }

      
      for (int j = 0; j < EXERS; j++) {
        data += grades[i][j] + "  ";
        
      }
      data += "\n";
      
    }
    
    return data;
  }
  

  
}
