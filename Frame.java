package BB;

import javax.swing.*;

public class Frame extends JFrame {
               public Frame() {
                   setTitle("Brick Breaker");
                   setSize(700, 600);
                   setLocationRelativeTo(null);
                   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                   setVisible(true);
                   setResizable(false);
                   GamePlay gamePlay = new GamePlay();
                   add(gamePlay);
                  // this.dispose();
               }
}
