package tanda2;

import java.util.HashMap;

/**
 * @author Rubén Ramírez Rivera
 *
 */
public class TrickedDice extends Dice{

  // Static Variables
  private final static int DICE_FACES = 6;
  
  // Variables
  private int face;
  private HashMap<Integer,Double> trickedFaces;
  
  // Methods
  public boolean trick(int face, double probability) {
    if(!correctValue(face) && correctProbability(probability)) {
      return false;
    }
    if (!createdTrickFaces()) {
      this.trickedFaces = new HashMap<>();
    }
    return true;
  }
  
  public boolean createdTrickFaces() {
    return this.trickedFaces == null;
  }
  
  // Static methods
  public static boolean correctValue(int face) {
    return face > 0 || face <= DICE_FACES;
  }
  
  public static boolean correctProbability(double probability) {
    return probability > 0 || probability < 1;
  }
}
