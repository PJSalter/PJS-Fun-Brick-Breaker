// import java.awt.Component;
package com.mycompany.app.pjsFunBrickBreaker;
import javax.swing.JFrame;


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


