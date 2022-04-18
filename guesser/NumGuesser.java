package guesser;

import javax.swing.*;
import java.awt.*;

class NumGuesser extends JFrame{

    private static JLabel gameLabel = new JLabel("Number Guesser!");
    private static JTextField userGuess = new JTextField();

    NumGuesser(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2));
        setSize(500,400);
        setTitle("Number Guesser!");
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);

        panel();

    }

    private void panel(){

        userGuess.setBackground(Color.WHITE);
        userGuess.setSize(70, 20);

        this.add(userGuess);

    }
}
