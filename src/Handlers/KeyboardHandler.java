package Handlers;

import Main.Main;

import java.awt.event.KeyEvent;

public class KeyboardHandler {
    public static void handleKeyboard() {
        float[] look_at = Main.peasyCam.getRotations();
        if(Main.processing.keyPressed && Main.processing.keyCode == KeyEvent.VK_X) {
            System.out.println("active" + Main.processing.keyCode);
            Main.peasyCam.lookAt(0, look_at[1], look_at[2]);
        }

    }
}
