package UI;

import Main.*;
import controlP5.*;

public class MainUI {
    public static void launchUI() {
//        Main.gui = new ControlP5(Main.processing);
//        Main.gui.setFont(Main.processing.createFont("Ubuntu", 12));
    }
    public static void drawUI() {
        float[] look_at = Main.peasyCam.getRotations();
        Main.peasyCam.beginHUD();
        Main.processing.fill(255);
        Main.processing.text(Main.processing.mouseX + " " + Main.processing.mouseY, 10, 10);
        Main.processing.text(look_at[0] + " " + look_at[1] + " " + look_at[2], 10, 30);
        Main.peasyCam.endHUD();
    }
}
