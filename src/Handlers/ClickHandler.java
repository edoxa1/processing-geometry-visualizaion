package Handlers;

import Main.*;
import processing.core.PApplet;

import java.awt.event.KeyEvent;

public class ClickHandler {
    private static final PApplet processing = Main.processing;
    public static int oldX;
    public static int oldY;
    public static boolean clickedFlag = true;

    public static void handleClick() {
        if (processing.mousePressed && clickedFlag) {
            Main.peasyCam.setActive(true);
            saveOldPosition();
            clickedFlag = false;

        }
        if (processing.mousePressed && processing.mouseButton == 37 && processing.keyCode == KeyEvent.VK_SHIFT) {
            processing.stroke(255);
            processing.line(oldX, oldY, processing.mouseX, processing.mouseY);
           // Main.peasyCam.setActive(false);
        }
        if (!Main.processing.mousePressed) {
            clickedFlag = true;
        }
    }

    private static void saveOldPosition() {
        oldX = Main.processing.mouseX;
        oldY = Main.processing.mouseY;
        System.out.println(oldX + " " + oldY);
    }
}
