*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.brickbreaker;

/**
 *
 * @author luthf
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator {
    
    public int map[][];
    public int brickWidth;
    public int brickHeight;
    
    public MapGenerator (int row, int col) {
        map = new int[row][col];
        for(int o =0; o<map.length; o++) {
            for(int p =0; p<map[0].length; p++) 
            {
                map[o][p] = 1;
            }
        }
        brickWidth = 550/col;
        brickHeight = 80/row;
    }
    
    public void draw(Graphics2D g) {
        
        for(int o = 0; o<map.length; o++) {
            
            for(int p =0; p<map[0].length; p++) {
                
                if(map[o][p] > 0) {
                    
                    g.setColor(Color.blue);
                    g.fillRect(p * brickWidth + 65, o * brickHeight + 70, brickWidth, brickHeight);
                    
                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(p * brickWidth + 65, o * brickHeight + 70, brickWidth, brickHeight);
                }
            }
        }
    }
    
    public void setBrickValue(int value, int row, int col) {
        
        map[row][col] = value;
    }
}

