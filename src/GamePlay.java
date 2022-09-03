
import java.awt.event.*;
import javax.swing.JPanel;
// import javax.swing.event.AncestorListener;
import javax.swing.Timer;

// implementing this with a keylist listener and extending the gameplay class with JPanel
public class GamePlay extends JPanel implements KeyListener, ActionListener{
    // creating a boolean variable firstly
        private boolean play = false;
        private int score = 0;
        private int totalBricks = 21;
        private Timer timer;
        private int delay = 8;
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
