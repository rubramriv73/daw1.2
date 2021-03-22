package main;

import java.util.Scanner;
import funciones.Examen;

/**
 * @author Rubén Ramírez Rivera
 *
 */
public class mainExamen {
  
  final static int NUMBER_STUDENTS = 15;
  final static int EXERS = 5;

  /**
   * @param args
   */
  public static void main(String[] args) {
    
    //Declare our scanner variable
    Scanner sc = new Scanner(System.in);
    
    // Declare the variables we are going to use for the program
    int option;
    int student;
    int exercise;
    boolean notGenerated = false; 
    String [] names = Examen.students();
    int [][] grades = new int[NUMBER_STUDENTS][EXERS];
    
    do {      
      
      option = Examen.menu();      
      switch (option) {
        case 1:
          grades=Examen.generatedGrades();
          notGenerated = true;
          System.out.println("\nGrades generated correctly \n");
          break;
          
        case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
          if (notGenerated) {
            switch (option) {
              case 2:
                System.out.print("\nWhich student?? (Select from 1 to 15):  ");
                student = sc.nextInt();
                if (student < 1 || student > 15) {
                  System.out.println("Wrong student. Back to menu...");
                  break;
                  
                } else {
                  System.out.println("\n" + student + ". " + names[student-1] + " has presented " + 
                      Examen.exercisePresented(grades, student) + " exercises\n");
                }
                break;
                
              case 3:
                System.out.print("Which student?? (Select from 1 to 15):  ");
                student = sc.nextInt();
                if (student < 1 || student > 15) {
                  System.out.println("Wrong student. Back to menu...");
                  break;
                  
                } else {
                  System.out.println("\n" + student + ". " + names[student-1] + " average is " + 
                      Examen.avgGrades(grades, student) + "\n");
                }
                
                break;
                
              case 4:
                System.out.println("\n" + Examen.goodStudents(grades) + " students have presented all exercises "
                    + "and their average is 5 or more \n");
                break;
                
              case 5:
                System.out.print("Which exercise?? (Select from 1 to 5):  ");
                exercise = sc.nextInt();
                if (exercise < 1 || exercise > 5) {
                  System.out.println("Wrong exercise. Back to menu...");
                  break;
                  
                } else {
                  System.out.println("\n" + Examen.exerciseDone(grades, exercise)+ " students have presented exercise "
                      + exercise + "\n");
                }
                break;
                
              case 6:
                System.out.print("Which exercise?? (Select from 1 to 5):  ");
                exercise = sc.nextInt();
                if (exercise < 1 || exercise > 5) {
                  System.out.println("Wrong exercise. Back to menu...");
                  break;
                  
                } else {
                  System.out.println("\nThe average formed by the students that presented exercise " +
                      exercise + " is " + Examen.avgExercise(grades, exercise) + "\n");
                }
                break;
                
              case 7:
                System.out.print("Which exercise?? (Select from 1 to 5):  ");
                exercise = sc.nextInt();
                if (exercise < 1 || exercise > 5) {
                  System.out.println("Wrong exercise. Back to menu...");
                  break;
                  
                } else {
                  System.out.println("\nThe highest grade for exercise " + exercise + " is " + Examen.highestGrade(grades, exercise)+ "\n");
                }
                break;
                
              case 8:
                System.out.print("Which exercise?? (Select from 1 to 5):  ");
                exercise = sc.nextInt();
                if (exercise < 1 || exercise > 5) {
                  System.out.println("Wrong exercise. Back to menu...");
                  break;
                  
                } else {
                  System.out.println("\nThe lowest grade for exercise " + exercise + " is " + Examen.lowestGrade(grades, exercise)+ "\n");
                }
                break;
                
              case 9:
                System.out.println("Showing the students and their grades:\n\n" + Examen.showData(names, grades) + "\n");
                break;
            }
          } else {
            System.err.println("\nYou have to generate the array with the grades first\n");
            
          }
          break;
           
        case 10:
          System.out.println("Thanks for using the program. Have a nice day.");
          break;
          
        // CASE of wrong option
        default:
          System.err.println("Wrong option. Try again with the correct number\n");
          break;
      }
    } while (option != 10);

  }

}
