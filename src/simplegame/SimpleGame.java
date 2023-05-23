/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplegame;

import processing.core.*;

/**
 *
 * @author Hanvy
 */
public class SimpleGame extends PApplet {

    // default
    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;
    public static final int FPS = 60;

    // untuk animasi | processing grafik
    PImage bg;
    Pokemon p;
    Castle c;
    Bakugan b;
    int f = 0;
    private boolean idle = true;
    private boolean running = false;
    private boolean left = false, right = false, up = false, down = false;

    public static void main(String[] args) {
        // TODO code application logic here
        PApplet.main("simplegame.SimpleGame");
    }

    public void settings() {
        size(WIDTH, HEIGHT);
    }

    public void setup() {
        // inisialisasi objek
        running = false;
        bg = loadImage("src/assets/background/forest.jpg");
        PImage[] temp = new PImage[2];
        frameRate(FPS);
        temp[0] = loadImage("src/assets/player/cartoon-game-characters-11549893427ws4wn4t2sc-removebg-preview (2).png");
        p = new Pokemon(temp, 100, 100);
        temp[1] = loadImage("src/assets/castle/castle.png");
        c = new Castle(temp, 500, 500);
    }

    public void draw() {
        background(bg);
        p.update(left, right, up, down);
        p.drawIdle(this, f);
        f++;
    }

    public void keyPressed() {
        if (key == 'w') {
            p.setY(p.getY() - 5);
        }
        if (key == 's') {
            p.setY(p.getY() + 5);
        }
        if (key == 'a') {
            p.setX(p.getX() - 5);
        }
        if (key == 'd') {
            p.setX(p.getX() + 5);
        }
    }

    public void keyRelease() {
//        f = -1;
        if (key == 'w') {
            up = false;
            running = false;
            idle = true;
        }
        if (key == 's') {
            down = false;
            running = false;
            idle = true;
        }
        if (key == 'a') {
            left = false;
            running = false;
            idle = true;
        }
        if (key == 'd') {
            right = false;
            running = false;
            idle = true;
        }
    }

}
