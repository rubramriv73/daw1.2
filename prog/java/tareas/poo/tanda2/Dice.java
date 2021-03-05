package tanda2;

/**
 * Clase Dado.
 * 
 * Estado: valor del dado (1 a 6).
 * Comportamiento: tirar el dado y obtener su valor.
 * 
 * @author Rubén Ramírez Rivera
 *
 */
public class Dice {
  
  // Static Variables
  private final static int DICE_FACES = 6;

  // Variables
  private int face;
  
  // Constructor
  public Dice() {
    this.rollDice();
  }
  
  // Getter
  public int getFace() {
    return this.face;
  }
  
  // Methods
  
  public void rollDice() {
    this.face = 1 + (int)(Math.random() * DICE_FACES);
  }
}
