package graphen;

import graphen.gui.test;


import javax.swing.*;
import java.awt.*;

/**
 * Created by By_if1_08 on 08.06.2016.
 */
public class main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new test();
            frame.setVisible(true);
            frame.setSize(600, 800);

            //Display the window.
            frame.pack();
            frame.setVisible(true);
        });
    }

}


