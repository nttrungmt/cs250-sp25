package lab10;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class InsertionSortVizPanel extends JPanel {
    public static final int SIZE = 20;                  //array size
    private int[] array;                                //the array to be sorted
    private int keyIdx=-1, curIdx=-1, swapIdx=-1;       //locations of elements changing in the visualization
    private int delay = 500;                            //default delay time in milliseconds
    //constructor method
    public InsertionSortVizPanel() {
        initialize();
        this.setPreferredSize(new Dimension(800, 600));
        this.setLayout(null);
        JSlider speedSlider = new JSlider(0, 1000, delay);
        speedSlider.setMajorTickSpacing(100);
        speedSlider.setPaintTicks(true);
        speedSlider.setPaintLabels(true);
        speedSlider.setBounds(5, 600-70, 800-10, 70);
        this.add(speedSlider);
        speedSlider.addChangeListener(e -> delay = speedSlider.getValue());
        //register the key event handler to this panel
        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                panel_KeyPressed(e);
            }
        });
    }

    //initialize data
    private void initialize() {
        Random random = new Random();
        array = new int[SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(500) + 20; // Ensure values are visible
        }
        keyIdx=-1; curIdx=-1; swapIdx=-1;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int barWidth = getWidth() / array.length;
        FontMetrics fmt = g.getFontMetrics();
        int textHeight = fmt.getHeight();
        for (int i = 0; i < array.length; i++) {
            int barHeight = array[i];
            int x = i * barWidth+2;
            int y = getHeight() - 80 - barHeight;
            Color color;
            if(i != curIdx) {
                color = (i == keyIdx) ? Color.red : (i == swapIdx) ? Color.green : Color.BLACK;
            } else {
                color = Color.blue;
            }
            g.setColor(color);
            g.fillRect(x, y, barWidth-4, barHeight-10);
            int textWidth = fmt.stringWidth(array[i]+"");
            g.drawString(array[i]+"", x+(barWidth-textWidth)/2, y+barHeight+(18-textHeight)/2);
        }
    }
    
    //this method handle key pressed event on the panel
    private void panel_KeyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        //restart the game if key = R
        if(key == KeyEvent.VK_S) {              //start animation
            new Thread(() -> insertionSort(array)).start();
        } else if(key == KeyEvent.VK_R) {       //reset
            initialize();
            repaint();
        }
    }

    //implement and visualize insertion sort here
    private void insertionSort(int[] arr) {
        //TODO: add code below
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Insertion Sort Visualization");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        InsertionSortVizPanel panel = new InsertionSortVizPanel();
        panel.setFocusable(true);
        frame.add(panel);        
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
