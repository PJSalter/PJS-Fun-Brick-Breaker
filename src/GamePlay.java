import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.Timer;

// implementing this with a keylist listener and extending the gameplay class with JPanel
public class GamePlay extends JPanel implements KeyListener, ActionListener{
    // creating a boolean variable firstly
        private boolean play = false;
        private int score = 0;
        private int totalBricks = 21;
        private Timer timer;
        private int delay = 8;
        private int playerX = 310;
        // specifying the ball position.
        private int ballposX = 120;
        // ball position for y
        private int ballposY = 350;
        // ball x direction and ball y direction.
        private int ballXDir = -1;
        private int ballYDir = -2;

        // then call the map generator class which i already created.

        private MapGenerator map;

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            
        }
        @Override
        public void keyTyped(KeyEvent e) {
            // TODO Auto-generated method stub
            
        }
        @Override
        public void keyPressed(KeyEvent e) {
            // TODO Auto-generated method stub
            
        }
        @Override
        public void keyReleased(KeyEvent e) {
            // TODO Auto-generated method stub
            
        }
}
