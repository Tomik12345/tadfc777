/**
 * *************************************************************
 * file: Main.java
 * author: Diaz Disciples (Group name)
 * class: Computer Programming
 * Graphical User Interfaces - CS245
 * purpose: Main, initiates program
 * **************************************************************
 *
 */
package cs245quarterproject.src;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

import javax.swing.WindowConstants;

/*
 */
public class Main {

    public static void main(String[] args) {
        //1) Create JFrame
        JFrame frame = new JFrame("The Gauntlet");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        //2) Start "TitleScreen"
        TitleScreen title = new TitleScreen();
        frame.add(title);
        frame.setVisible(true);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        //Add 3 second delay
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        //3) Start "Menu"
        frame.remove(title);
        frame.setVisible(false);

        Menu menu = new Menu();
        frame.add(menu);
        frame.setVisible(true);

        KeyAdapter listener = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()== KeyEvent.VK_ESCAPE) {
                    frame.dispose();
                }
            }
        };

        frame.addKeyListener(listener);
    }

}
