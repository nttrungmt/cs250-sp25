package lab05;
import javax.swing.*;
import java.awt.*;
public class EightPuzzleFrame extends JFrame {
  private int[][] puzzle = {{1, 0, 3}, {4,5,6}, {7,8,2}}; //initial state
  private JLabel lblStatus;      //show game status, progress 
  private JPabel gamePanel;      //show the button grid 
  private JButton[][] btnGrid;   //2D grid of buttons showing the tiles
  private boolean bFinished;     //whether the game is finished or not

  //The application entry point 
  public static void main(String[] args) {
	EightPuzzleFrame frame = new EightPuzzleFrame();
	frame.setVisible(true);
  }

  //Constructor method
  public EightPuzzleFrame() {
	  //Add code for this constructor method below
  }

  //This method handles the click event on the button on the grid
  // r,c: the row and column indexes of the button on the grid
  public void btnGrid_Clicked(int r, int c) {
	  //Add code for this btnGrid_Clicked method below
  }

  //This method checks if the game is finished or not.
  public void checkWin() {
  	//Add code for this checkWin method below
  }

  //This method resets the game to play a new game
  public void btnNewGame_Clicked() {
  	//Add code for this btnNewGame_Clicked method below
  }
}
