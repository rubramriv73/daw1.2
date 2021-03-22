package arrays;

/**
 * @author Rubén Ramírez Rivera
 * 
 *  Ejericio 1:     Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 
 *                  14 partidos y el pleno al quince (15 filas) de forma que la probabilidad de que salga 
 *                  un 1 sea  de 1/2, la probabilidad de que salga X sea de 1/3 y la probabilidad de que 
 *                  salga 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 *
 */
public class Ej01Quiniela {

  /**
   * Main method
   */
  public static void main(String[] args) {
    
    // Declare the variable to save the bet we are going to generate
    int bet;

    // Presentation
    System.out.println("\n\t*** QUINIELA ***\t\n");
    
    // We divide the bets in 3 to get 3 different bets
    for (int i = 1; i <= 3; i++) {
      System.out.println("\n\t\t\tBET Nº " + i + "\n");
      System.out.println("MATCHES\t\tHome Team Wins   Tie Game   Away Team Wins");
      System.out.println("---------\t--------------   ---------  ---------------");
      
      // With this loop we get a different bet for each match
      for (int j = 1; j <= 15; j++) {
        bet = 1 + (int)(Math.random() * 6);
        
        if (bet == 1 || bet == 2 || bet ==3) {
          System.out.println("Match nº" + j +"\t      1");
          System.out.println("---------\t--------------   ---------  ---------------");
          
        } else if (bet == 4 || bet == 5) {
          System.out.println("Match nº" + j +"\t\t\t     X");
          System.out.println("---------\t--------------   ---------  ---------------");
          
        } else {
          System.out.println("Match nº" + j +"\t\t\t\t\t   2");
          System.out.println("---------\t--------------   ---------  ---------------");

          

        }
        
      } 
    }
    
  }

}
