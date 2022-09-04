package com.mycompany.app.pjsFunBrickBreaker;
// import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Font;


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

        // creating a variable and constructor for map.

        public GamePlay(){
            map = new MapGenerator(3, 7);
             // key this listener method
                addKeyListener(this);
                setFocusable(true);
                setFocusTraversalKeysEnabled(false);
                timer = new Timer(delay, this);
                timer.start();
        }

        public void paint(Graphics g){
            g.setColor(Color.black);
            g.fillRect(1, 1, 692, 592);
            map.draw((Graphics2D) g);
            g.setColor(Color.yellow);
            g.fillRect(0, 0, 3, 592);
            g.fillRect(0, 0, 692, 3);
            g.fillRect(691, 0, 3, 592);

            g.setColor(Color.white);
            g.setFont(new Font("serif", Font.BOLD,25));
            g.drawString(""+score, 590, 30);

            g.setColor(Color.yellow);
            g.fillRect(playerX, 550, 100, 8);

            // setting the color for the ball.
            g.setColor(Color.GREEN);
            // creating the circle for the ball.
            g.fillOval(ballposX, ballposY, 20, 20);

            if(ballposY > 570){
                play = false;
                ballXDir = 0;
                ballYDir = 0;
                g.setColor(Color.red);
                // displaying message as game over. with font size 30 and bold
                g.setFont(new Font("serif", Font.BOLD, 30));
                // then I will display the string of text for the message that will show.
                g.drawString("Game Over Score : "+score, 190, 300);

                g.setFont(new Font("serif", Font.BOLD, 30));
                g.drawString("Press Enter to Restart Game ", 190, 340);
            }
            // checking if thd total bricks is equal to zero.
            if(totalBricks == 0){
                // this will then mean that the player has managed to break all the bricks.
                play = false;
                ballYDir = -2;
                ballXDir = -1;
                g.setColor(Color.red);
                g.setFont(new Font("serif", Font.BOLD, 30)); 
                
                g.drawString("Game Over Score : "+score, 190, 300);

                g.setFont(new Font("serif", Font.BOLD, 30));
                g.drawString("Press Enter to Restart Game ", 190, 340);
            }

            g.dispose();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // throw new UnsupportedOperationException("Not Supported Yet.");
            // starting the timer first.
            timer.start();
            // now I will check if the game is being run to start.
            if(play){
                if(new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerX, 550, 100, 8))){
                    ballYDir = -ballYDir;
                }
                A:
                for(int i = 0; i < map.map.length; i++) {
                        for(int j = 0; j < map.map[0].length; j++) {
                            if(map.map[i][j] > 0) {
                                int brickX = j*map.brickWidth + 80;
                                int brickY = i*map.brickHeight + 50;
                                int bricksWidth = map.brickWidth;
                                int bricksHeight = map.brickHeight;

                                Rectangle rect = new Rectangle(brickX, brickY, bricksWidth, bricksHeight);
                                Rectangle ballrect = new Rectangle(ballposX, ballposY, 20, 20);
                                Rectangle brickrect = rect;
                                if(ballrect.intersects(brickrect)) {
                                            map.setBrickValue(0, i, j);
                                            totalBricks--;
                                            score += 5;
                                            if(ballposX + 19 <= brickrect.x || ballposX + 1 >= brickrect.x + bricksWidth){
                                                ballXDir =- ballXDir;
                                            } else {
                                                ballYDir = -ballYDir;
                                            }
                                            break A;
                                }
                            }
                        }
                }
                ballposX += ballXDir;
                ballposY += ballYDir;
                if(ballposX < 0) {
                    ballXDir = -ballXDir;
                }
            }
            
        }
        @Override
        public void keyTyped(KeyEvent e) {}

        @Override
        public void keyPressed(KeyEvent e) {
            throw new UnsupportedOperationException("Not Supported Yet.");
            }
            
        @Override
        public void keyReleased(KeyEvent e) {}

        public void moveRight(){
            play = true;
            playerX += 20;
        }

        public void moveLeft(){
            play = true;
            playerX -= 20;
        }

}
