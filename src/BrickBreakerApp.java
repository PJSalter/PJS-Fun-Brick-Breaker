import java.awt.Component;

import javax.swing.JFrame;

// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, JAVA World!");
//     }
// }


// first initial class writing for writing java for the game.
public class BrickBreakerApp {
    // private static final Component GamePlay = null;

    public static void main(String[] args){
        JFrame obj = new JFrame();
        GamePlay gameplay = new GamePlay();
        // defining the bounding rectangle of a component of position and size.
        obj.setBounds(10, 10, 700, 600);
        // setting the title of the project.
        obj.setTitle("pjs Fun Brick Breaker");
        // setting resizable to false first.
        obj.setResizable(false);
        // having the game show it's visibility to Boolean true.
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // adding and passing through the game play.
        obj.add(gameplay);
    }
}


