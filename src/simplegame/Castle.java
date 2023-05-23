package simplegame;

import processing.core.PApplet;
import processing.core.PImage;

/**
 *
 * @author Hanvy
 */
public class Castle {

    private PImage[] idle;
    private int width, height;
    private int t = 0;

    public Castle(PImage[] idle, int width, int height) {
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
        app.image(idle[t], width, height);
    }
}
