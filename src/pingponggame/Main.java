/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingponggame;

import javax.swing.JFrame;
import pingponggame.game.GamePanel;

/**
 *
 * @author Filippo-TheAppExpert
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame gameFrame = new JFrame("Ping Pong");
        gameFrame.add(new GamePanel());
        gameFrame.pack();
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setVisible(true);
    }
}
