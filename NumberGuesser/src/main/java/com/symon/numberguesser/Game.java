package NumberGuesser.src.main.java.com.symon.numberguesser;

import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author symon
 */
public class Game extends javax.swing.JFrame {
    final static String[] path = {
        "NumberGuesser\\src\\main\\java\\com\\symon\\numberguesser\\Image0.png",
        "NumberGuesser\\src\\main\\java\\com\\symon\\numberguesser\\Image1.png",
        "NumberGuesser\\src\\main\\java\\com\\symon\\numberguesser\\Image2.png",
        "NumberGuesser\\src\\main\\java\\com\\symon\\numberguesser\\Image3.png",
        "NumberGuesser\\src\\main\\java\\com\\symon\\numberguesser\\Image4.png"};
    static int randNumber;
    static int randLimit = 100;
    static int tries;

    private static ImageIcon loadImage(String status) {
        ImageIcon guessStatus = new ImageIcon();
        switch (status) {
            case "begin":
                guessStatus = new ImageIcon(path[0]);
                break;
            case "thinking":
                guessStatus = new ImageIcon(path[1]);
                break;
            case "smile":
                guessStatus = new ImageIcon(path[2]);
                break;
            case "frown":
                guessStatus = new ImageIcon(path[3]);
                break;
            case "party":
                guessStatus = new ImageIcon(path[4]);
                break;
        }

        Image img = guessStatus.getImage();
        Image newImg = img.getScaledInstance(277, 277, java.awt.Image.SCALE_SMOOTH);
        ImageIcon newGuessStatus = new ImageIcon(newImg);

        return newGuessStatus;
    }

    /**
     * Creates new form Game
     */
    public Game() {
        initComponents();
        Random rand = new Random();

        randNumber = rand.nextInt(randLimit);
    }

private void initComponents() {

        emojiIcon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        userGuess = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        guess = new javax.swing.JButton();
        computerHint = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        emojiIcon.setIcon(loadImage("begin"));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setText("Can you guess the number I am thinking?");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Enter Your Guess Below");

        guess.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        guess.setText("Submit Guess!");
        guess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessActionPerformed(evt);
            }
        });

        computerHint.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        computerHint.setForeground(java.awt.Color.red);
        computerHint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(emojiIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator1)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(userGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(guess, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(computerHint, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(userGuess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(computerHint, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guess, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(emojiIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void guessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessActionPerformed
        int numberGuessed = Integer.parseInt(userGuess.getText());
        int distance = Math.abs(numberGuessed - randNumber);

        tries++;

        if(numberGuessed >= randLimit-1){
            JOptionPane.showMessageDialog(null, "The number to be guessed is between 0 and 99");
            return;
        }
        if (numberGuessed < randNumber || numberGuessed > randNumber) {
            if (distance >= 50) {
                computerHint.setText("You are a freezing cold! Your last Guess was: " + numberGuessed);
                emojiIcon.setIcon(loadImage("frown"));
            } else if (distance >= 25 && distance < 50) {
                computerHint.setText("You are a cold! Your last Guess was: " + numberGuessed);
                emojiIcon.setIcon(loadImage("frown"));
            } else if (distance < 25 && distance >= 10) {
                computerHint.setText("You are a getting warmer! Your last Guess was: " + numberGuessed);
                emojiIcon.setIcon(loadImage("smile"));
            } else if (distance < 10 && distance >= 5) {
                computerHint.setText("You are a really hot! Your last Guess was: " + numberGuessed);
            } else if (distance < 5 && distance >= 1) {
                computerHint.setText("You are on Fire! Your last Guess was: " + numberGuessed);
            }
        } else if (numberGuessed == randNumber) {
            computerHint.setText("CONGRATULATIONS! It took you " + tries + " tries to guess correctly!");
            emojiIcon.setIcon(loadImage("party"));
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaun(ltstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    
    private javax.swing.JLabel computerHint;
    private javax.swing.JLabel emojiIcon;
    private javax.swing.JButton guess;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField userGuess;
    
}
