package Main;

import Handlers.ClickHandler;
import Handlers.KeyboardHandler;
import peasy.PeasyCam;
import processing.core.PApplet;
import controlP5.ControlP5;

import UI.*;

public class Main extends PApplet {
    public static PApplet processing;
    public static EnvironmentBox environmentBox;
    public static PeasyCam peasyCam;
    public static ControlP5 gui;

    public static void main(String[] args) {
        PApplet.main(new String[] { Main.class.getName() });
    }

    @Override
    public void settings() {
        processing = this;
        environmentBox = new EnvironmentBox(0, 0, 800, 600, 10);
        size(800, 600, P3D);
    }

    @Override
    public void setup() {
        peasyCam = new PeasyCam(this, 100);
        MainUI.launchUI();
    }

    @Override
    public void draw() {
        background(0);
        ClickHandler.handleClick();
        KeyboardHandler.handleKeyboard();
        stroke(255);
        noFill();
        box(10);
        environmentBox.draw();
        MainUI.drawUI();

    }

    @Override
    public void mouseClicked() {

    }
}
