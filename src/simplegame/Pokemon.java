/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplegame;

import processing.core.PApplet;
import processing.core.PImage;

/**
 *
 * @author Hanvy
 */
public class Pokemon {
    
    private PImage[] idle;
    private int width, height, x, y;
    private int t = 0;

    public Pokemon(PImage[] idle, int width, int height) {
        this.idle = idle;
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int vx, vy;

    public void update(boolean left, boolean right, boolean up, boolean down) {
//        vx = vy = 0;
//        if (left) {
//            vx = -5;
//        }
//        if (right) {
//            vx = 5;
//        }
//        if (up) {
//            vy = -5;
//        }
//        if (down) {
//            vy = 5;
//        }
//        if (up && down) {
//            vy = 0;
//        }
//        if (left && right) {
//            vx = 0;
//        }
//        x += vx;
//        y += vy;

        if(up){
            y -= 5;
        }
        if(down){
            y += 5;
        }
        if(left){
            x -= 5;
        }
        if(right){
            x += 5;
        }
    }


    public void drawIdle(PApplet app, int f) {
        if (f == -1) {
            t = 0;
            f = 0;
        }
        if (f % 10 == 0) {
            t++;
        }
        if (t >= 1) {
            t = 0;
        }
        app.image(idle[t], x, y, width, height);
    }

}
