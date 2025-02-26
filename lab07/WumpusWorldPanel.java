package lab07;

import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class WumpusWorldPanel extends JPanel {
    public static final int SIZE = 64;	  	// Tile size (one side)
    public static final int OFFSET = 30;	// Offset on top to draw score, #golds, and #arrows.
    private WumpusWorld gameEngine;		// Wumpus game engine
	
    //constructor method
    WumpusWorldPanel() {
        //TOO: add code below
    }

    //this method draws the wumpus board game on the panel
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //TOO: add code below
    }

    //the program entry point which creates the window with the game panel
    public static void main(String[] args) { 
        JFrame frame = new JFrame("Wumpus World Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//press x on window -> exit application
        WumpusWorldPanel gamePanel = new WumpusWorldPanel();	//create the game panel
        gamePanel.setFocusable(true);				//allow it to receive events (keys)
        frame.add(gamePanel);					//add it to the frame window
        frame.setSize(WumpusWorld.COLS * SIZE + 16, WumpusWorld.ROWS * SIZE + 68); // Adjust frame size
        frame.setResizable(false);				//fix window size
        frame.setLocationRelativeTo(null);			//make window appear on the center screen
        frame.setVisible(true);					//display the frame window
    }
}
  
