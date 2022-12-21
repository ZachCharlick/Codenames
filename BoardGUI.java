import javax.swing.*;
import java.awt.*;

public class BoardGUI {

    private JFrame frame;
    private JPanel panel;
    private JButton[][] buttons;

    public BoardGUI(){

    //test values
    Wordbank bank = new Wordbank("data.csv");
    String colorFirst = "red";


    //idk if this is the best way to do this but it's my impulse, but i think
    //eventually we should make a board driver 

    Board obj = new Board(bank, colorFirst);

    this.frame = new JFrame("Codenames Board");
    this.panel = new JPanel(new GridLayout(5,5));
    this.buttons = new JButton[5][5];

    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            JButton button = new JButton();
            button.setOpaque(true);
            button.setBorderPainted(false);
            buttons[i][j] = button;

            //Color of buttons
            //NB: playing with decoding vs getcolor, 
            //might be better to store these as hex codes later on.

            Color color = Board.getJavaColor(obj.getColor(i, j));
            System.out.println(color);

            buttons[i][j].setBackground(color);
            
            if (color.equals(Color.BLACK)|| color.equals(Color.BLUE)) {
                buttons[i][j].setForeground(Color.WHITE);
            } else {
                buttons[i][j].setForeground(Color.BLACK);
            }                
        
            buttons[i][j].setText(obj.getWord(i,j));
            buttons[i][j].setFont(new Font("Arial", Font.BOLD, 16));
            panel.add(buttons[i][j]);   
        }
    }

   
    //screen size
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (int)(screenSize.getWidth()/2)-500;
    int y = (int)(screenSize.getHeight()/2)-200;

    //frame setup
    frame.add(panel);
    frame.setLocation(x,y);;
    frame.setSize(1000, 400);
    frame.setVisible(true);
    
    }
    

    public static void main(String args[]) {
        BoardGUI test = new BoardGUI();
        
    }
}
