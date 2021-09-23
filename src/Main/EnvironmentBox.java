package Main;

import processing.core.PApplet;

public class EnvironmentBox {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected int color;

    private static PApplet p = Main.processing;

    public EnvironmentBox(int x, int y, int width, int height, int color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public void updateCount() {
    }

    public void draw(){
        // axis
        p.beginShape(p.LINES);
        p.stroke(255, 0, 0);
        p.vertex(-100, 0, 0);
        p.vertex(100, 0, 0);
        p.stroke(0, 255, 0);
        p.vertex(0, -100, 0);
        p.vertex(0, 100, 0);
        p.stroke(0, 0, 255);
        p.vertex(0, 0, -100);
        p.vertex(0, 0, 100);
        p.endShape();
    }
}