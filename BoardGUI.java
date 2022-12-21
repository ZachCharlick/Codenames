import javax.swing.*;
import java.awt.*;

public class BoardGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("5x5 Grid Test");
        frame.setLayout(new GridLayout(5,5));

        //panel set
        JPanel panel = new JPanel();

        //25 buttons
        for (int i = 0; i < 25; i++) {
            JButton button = new JButton("Button " + (i+1));
            button.setText("" + (i+1));
            button.setFont(new Font("Arial", Font.BOLD, 16));
            panel.add(button);
        }

        //add panel
        frame.add(panel);
        frame.setSize(400,1000);
        frame.setVisible(true);
        
    }
    
}
