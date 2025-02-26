package lab07;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class WumpusWorld {
	public static final int ROWS = 8;	  	  //How many rows in the grid
	public static final int COLS = 10;	      //How many columns in the grid
	public static final int NUM_WUMPUS = 4;  //# wumpus to be generated
	public static final int NUM_PITS = 4;    //# pits to be generated
	public static final int NUM_GOLDS = 4;   //# golds to be generated
	public static final int LEFT = 0, UP=1, RIGHT=2, DOWN=3;    //moving direction

	private String[][]  gameBoard;		 //2D array to store the game state
	private boolean[][] opened;			 //2D array to store which tiles have been opened

	private int state;				 		//0: running, 1: won, 2: lose
	private int score, arrows, nGolds;      //store current score, #arrows, #gold left
	private int agentR, agentC;				//current location of the agent - start at (0,0)
	private int dir;  					    //the current direction of the agent: LEFT, UP, RIGHT, or DOWN	

	private BufferedImage spritesImg; 		// the full sprite image
	private BufferedImage[] objSprites; 	// the sub-images for background tile and objects
	private BufferedImage[] agentSprites; 	// the sub-images for agents
	
	//get methods for score, arrows, golds, and state properties	
	public int getScore() 	{ return score; 	}
	public int getArrows() 	{ return arrows; 	}
	public int getGolds() 	{ return nGolds; 	}
	public int getState()	{ return state;		}
	
	//constructor method
	public WumpusWorld() {
		loadImage();
	}

	//this method returns the cloned copy of a given image
	public static BufferedImage copyImage(BufferedImage source){
	    BufferedImage b = new BufferedImage(source.getWidth(), source.getHeight(), source.getType());
	    Graphics g = b.getGraphics();
	    g.drawImage(source, 0, 0, null);
	    g.dispose();
	    return b;
	}
	
	//this method will load the full sprite image and extract the sub-images and put them into 
	// faceSprites (containing 5 face sub-images) and mwSprites (containing 2x8 other sub-images)
	private void loadImage() {
		try {
			spritesImg = ImageIO.read(this.getClass().getResource("/images/wumpus_sprites.png"));
			//TODO: load the image for background tiles, gold, and wumpus
			
			//TODO: load different images for the agents
			
		} catch (IOException e) {
			System.err.println("Error loading the wumpus sprite image");
			System.exit(-1);
		}
	}
	
	public void initialize() {
		//1. TODO: Initialize gameBoard 2D array with all empty strings "".
		
		//2. TODO: Generate NUM_WUMPUS Wumpus objects using a while loop. Each time,
		//generate a random x between 0 and NUM_ROWS-1 and a random y between 0 and
		//NUM_COLS-1. Repeat until x!=0,1 and y!=0,1 (the top four cells are safe for the Agent)
		//and gameBoard[x][y] is empty (not occupied by any objects).
		
		//3. TODO: Similarly, generate NUM_PITS objects on the gameBoard array.
		
		//4. TODO: Similarly, generate NUM_GOLDs objects on the gameBoard array (only need
		//to avoid the top left (0,0) and other Wumpus or pits.
		
		//5. TODO: Use nested for loop to update the remaining cells' status. If any cell has "W" or "P", update its
		//neighbor cells by calling the method updateNeighbors() with "S" or "B".		
		
		//6. TODO: Initialize the remaining game state
		
	}
	
	//this method updates neighbors of wumpus with "stench" or neighbors of pits with "breeze"
	public void updateNeighbors(int r, int c, String pattern) {
		//TODO: add code below
	}
		
	/* This method returns the image resource according to the input settings */
	public Image getImage(int r, int c) throws IOException {		
		//TODO: add code below 
	}
	
	public void update(KeyEvent e) {
		//TODO: add code below
	}
	
	/* This method validates the game state if the agent moves to (x,y) */
	public boolean moveAgent(int r, int c, int direction) {
		//TODO: add code below
	}
}
