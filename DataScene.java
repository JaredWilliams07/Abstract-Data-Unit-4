import org.code.theater.*;
import org.code.media.*;
import java.util.Scanner;
import java.util.Arrays;

public class DataScene extends Scene {

  private Games[] games;

  /** Constructor */
  public DataScene() {
    games = createGame();
  }

  /** Returns a 1D array of Game objects using the txt files in this project */
  public Games[] createGame() {
    String[] namesArray = FileReader.toStringArray("names.txt");
    int[] scoreArray = FileReader.toIntArray("score.txt");
    
    Games[] gameArray = new Games[namesArray.length];
    for (int i = 0; i < gameArray.length; i++) {
      gameArray[i] = new Games(namesArray[i], scoreArray[i]);
    }

    return gameArray;
  }
  public Games[] getGoodScored(){
    int count = 0;
    for(int i = 0; i < games.length; i++){
      if(games[i].getScore() == 9){
        count++;
      }
    }
    int[] gameIndex = new int[count];
    int index = 0;
    Games[] goodScored = new Games[count];
      for(int i = 0; i <= count; i++){
        if(games[i].getScore() == 9){
      goodScored[index] = games[i];
      index++;
        }
    }
    
    return goodScored;
  }
  
  
  public void drawScene() {
    Games game = games[0];
    Games game2 = games[7];
    clear("black");

    pause(2.0);
    
    clear("white");

    drawImage("cross-platform.jpg", 0, 0, 200);

    

    // drawImage("game.jpg", 125, 25, 150);
    setTextStyle(Font.SANS, FontStyle.BOLD);
    setTextHeight(20);

    drawText("These are some games and their ratings.", 20, 200);

    pause(2.0);
    clear("white");
    drawImage("cross-platform.jpg", 40, 40, 200);    

    drawText("Title: " + game.getName(), 20, 200);
    drawText("Score: " + game.getScore(), 20, 230);

        pause(2.0);
    clear("white");
    drawImage("cross-platform.jpg", 40, 40, 200);    

    drawText("Title: " + game2.getName(), 20, 200);
    drawText("Score: " + game2.getScore(), 20, 230);

    pause(2.0);
    clear("white");
    drawImage("cross-platform.jpg", 40, 40, 200);    
    // after I completed tests initially I made the program dislay random games from the array
    for(int i = 0; i < 23; i++){
      Games test = games[(int)(Math.random() * 100) + 1];
              pause(2.0);
    clear("white");
    drawImage("cross-platform.jpg", 40, 40, 200);
      

    drawText("Title: " + test.getName(), 20, 200);
    drawText("Score: " + test.getScore(), 20, 230);
    }

    
  }
}
