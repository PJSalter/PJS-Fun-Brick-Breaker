package com.mycompany.app.pjsFunBrickBreaker;
import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.Graphics2D;


public class MapGenerator {
    // this will be size and mapping generatorated for the board of the game.
    //test refactor
    // first step I will be creating the map.
    public int map[][];
    // creating sizes for brick width and brick height diameters.
    public int brickWidth;
    public int brickHeight;
    // specifying the row and column.
    public MapGenerator(int row, int col){
        map = new int[row][col];
        for (int []map1 : map){
            for(int j=0; j<map[0].length; j++){
                map1[j] = 1;
            }
        }
        // then I need to specify the brick width with the brick height.
        brickWidth = 540/col;
        brickHeight = 150/row;
    }
    // creating a seperate method to draw the bricks and specifying it's parameter.
    public void draw(Graphics2D g){
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[0].length; j++){
                if(map[i][j]>0){
                    // if it's greater than zero then I will set color to red.
                    g.setColor(Color.red);
                    g.fillRect(j*brickWidth+80, i*brickHeight+50, brickWidth, brickHeight);
                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    // draw the table.
                    g.drawRect(j*brickWidth+80, i*brickHeight+50, brickWidth, brickHeight);
                }
            }
        }
    }
    public void setBrickValue(int value, int row, int col){
        map[row][col] = value;
    }
    
}
