import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener {
   private int clicks = 0;
   private JLabel label = new JLabel("number of clicks: 0");
   private JFrame frame = new JFrame();

   /* This is the constructor for GUI */
   public GUI() {
      // The clickable button
      JButton button = new JButton("Click Me");
      button.addActionListener(this);

      // This is the panel with button and text
      JPanel panel = new JPanel();
      panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
      panel.setLayout(new GridLayout(0, 1));
      panel.add(button);
      panel.add(label);

      //set up the frame and display it
      frame.add(panel, BorderLayout.CENTER);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setTitle("GUI");
      frame.pack();
      frame.setVisible(true);
   }

   // Process the button clicks
   public void actionPerformed(ActionEvent e) {
      clicks++;
      label.setText("Number of clicks: " + clicks);
   }

   // Main method creates new GUI object
   public static void main(String[] args) {
      new GUI();
   }
}
