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
    public int brickDiameter;
    public int brickLength;
    
    public MapGenerator (int row, int col) {
        map = new int[row][col];
        for(int k =0; k<map.length; k++) {
            for(int l =0; l<map[0].length; l++) {
                map[k][l] = 1;
            }
        }
        brickDiameter = 840/col;
        brickLength = 350/row;
    }
    
    public void draw(Graphics2D gtwo) {
        
        for(int o = 0; o<map.length; o++) {
            
            for(int p =0; p<map[0].length; p++) {
                
                if(map[o][p] > 0) {
                    
                    gtwo.setColor(Color.blue);
                    int k = 0;
                    int l = 0;
                    gtwo.fillRect(k * brickDiameter + 82, l * brickLength + 52, brickDiameter, brickLength);
                    
                    gtwo.setStroke(new BasicStroke(4));
                    gtwo.setColor(Color.yellow);
                    gtwo.drawRect(k * brickDiameter + 82, l * brickLength + 52, brickDiameter, brickLength);
                }
            }
        }
    }
    
    public void setBrickValue(int value, int row, int col) {
        
        map[row][col] = value;
    }
}
