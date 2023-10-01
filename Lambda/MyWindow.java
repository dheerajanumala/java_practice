package Lambda;

import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow {
  public static void main(String[] args) {
    JFrame jframe = new JFrame("My window");

    JButton jButton = new JButton("My window");
    jframe.setSize(400,400);
    jframe.setLayout(new LayoutManager() {
      
    });
    jframe.add(jButton);
    
    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    jframe.setVisible(true);


  }
  
}
