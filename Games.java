import org.code.theater.*;
import org.code.media.*;
/**
 * Represents a Game with a name and score
 */
public class Games {

  private String name;     // title of game
  private int score;         // score given to the game out of 10

  /** Constructor */
  public Games(String name, int score) {
    this.name = name;
    this.score = score;
  }

  /** Accessor Method for name */
  public String getName() {
    return name;
  }
  
  /** Accessor Method for age */
  public int getScore() {
    return score;
  }
  
  /** toString Method override */
  public String toString() {
    return name + " (" + score + " out of 10)";
  }
  
}