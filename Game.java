/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.Vector;
import java.util.stream.Collectors;
import javax.swing.*;

/**
 * @author alahm
 */
public class Game extends javax.swing.JFrame {

    String name;
    String difficultyLevelChosen;
    String word;
    String starsWord;
    DifficultyLevel difficultyLevelObject;
    static String oldWord;
    static int correctTry;
    static int wrongTry;
    static Vector<Character> usedLetters = new Vector<>();

    /**
     * Creates new form Game
     */
    public Game() {
        initComponents();
        setIcon();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        enter = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HangMan");
        setMinimumSize(new java.awt.Dimension(840, 450));
        setPreferredSize(new java.awt.Dimension(840, 490));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(37, 48, 52));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/icons/user_male_26px.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/icons/rating_26px.png"))); // NOI18N

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Score");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/icons/brain_32px.png"))); // NOI18N

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(difficultyLevelChosen);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(name);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(215, 215, 215)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3))))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 840, 60);

        jPanel2.setBackground(new java.awt.Color(56, 72, 78));
        jPanel2.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("The word is :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 70, 120, 37);

        jTextField1.setBackground(new java.awt.Color(56, 72, 78));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(10, 230, 240, 30);

        jLabel9.setBackground(new java.awt.Color(255, 204, 0));
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel9);
        jLabel9.setBounds(600, 190, 220, 170);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(word);
        jPanel2.add(jLabel10);
        jLabel10.setBounds(20, 120, 390, 100);

        enter.setBackground(new java.awt.Color(56, 72, 78));
        enter.setForeground(new java.awt.Color(255, 255, 255));
        enter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/icons/enter_24px.png"))); // NOI18N
        enter.setText("Enter");
        enter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterMouseClicked(evt);
            }
        });
        jPanel2.add(enter);
        enter.setBounds(130, 290, 100, 40);

        clear.setBackground(new java.awt.Color(56, 72, 78));
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman/icons/clear_symbol_26px.png"))); // NOI18N
        clear.setText("Clear");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });
        jPanel2.add(clear);
        clear.setBounds(20, 290, 100, 40);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(10, 260, 240, 10);

        jLabel11.setBackground(new java.awt.Color(204, 102, 0));
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel11);
        jLabel11.setBounds(600, 10, 220, 170);

        jLabel12.setForeground(new java.awt.Color(51, 255, 153));
        jLabel12.setText("Correct Trying");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(490, 80, 90, 14);

        jLabel13.setForeground(new java.awt.Color(51, 255, 153));
        jPanel2.add(jLabel13);
        jLabel13.setBounds(500, 100, 60, 40);

        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(jLabel14);
        jLabel14.setBounds(500, 280, 50, 30);

        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("Wrong Trying");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(490, 250, 90, 14);

        jLabel16.setFont(new java.awt.Font("Jokerman", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(82, 200, 62));
        jLabel16.setText("Help the alien eat the pizza, before human desstroy the Spaceship.");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(10, 10, 590, 70);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 840, 370);

        jPanel3.setBackground(new java.awt.Color(51, 255, 153));

        jLabel1.setText("This game created by AhmedRiyadh ©");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(346, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 430, 840, 20);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        // TODO add your handling code here:
        jTextField1.setText("");
    }//GEN-LAST:event_clearMouseClicked

    private void enterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterMouseClicked
        // TODO add your handling code here:
        checkInput(getInput());
    }//GEN-LAST:event_enterMouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            checkInput(getInput());
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton enter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private static javax.swing.JLabel jLabel6;
    private static javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    public Game(String name, String difficultyLevelChosen) {
        this.name = name;
        this.difficultyLevelChosen = difficultyLevelChosen;
        initComponents();
        setIcon();
        run();
        buildGame();
        usedLetters.add(' ');
        System.out.println(word);
    }

    private void putWrongTtyImage(int trying) {
        String path = "src\\hangman\\icons\\";
        String exs = ".png";
        ImageIcon image = new ImageIcon(path + Integer.toString(trying) + exs);
        Image img = image.getImage();
        Image imgFit = img.getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon fit = new ImageIcon(imgFit);
        jLabel9.setIcon(fit);

    }

    private void putCorrectTtyImage(int trying, String level) {
        String path = "src\\hangman\\icons\\p";
        String exs = ".png";
        if (level.equals("Easy")) {
            setScores(trying * 50);
            trying *= 3;
        } else if (level.equals("Medium")) {
            setScores(trying * 100);
            trying *= 1.5;

        } else {
            setScores(trying * 150);

        }

        ImageIcon image = new ImageIcon(path + Integer.toString(trying) + exs);
        Image img = image.getImage();
        Image imgFit = img.getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon fit = new ImageIcon(imgFit);
        jLabel11.setIcon(fit);
        
         if (trying == 12 || trying > 12) {
            displayTying();
            JOptionPane.showMessageDialog(null, "You win\nYour Scored => "+jLabel4.getText());
            setVisible(false);
            System.exit(2);
        }

    }

    private void renameLabels(String name, String difLev) {
        jLabel7.setText(name);
        jLabel6.setText(difLev);
    }

    private void setWordBoard(String cover) {
        jLabel10.setText(cover);
    }

    private String getInput() {
        return jTextField1.getText().toLowerCase();
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icons/icon.png")));
    }

    private void setScores(int score) {
        String i = String.valueOf(score);
        jLabel4.setText(i);
    }

    private void run() {
        renameLabels(this.name, this.difficultyLevelChosen);
        difficultyLevelObject = DifficultyLevel.getInstance();
        displayTying();
    }

    private void buildGame() {
        this.word = difficultyLevelObject.getWord(difficultyLevelChosen);
        this.starsWord = difficultyLevelObject.changToStars(word);
        setWordBoard(starsWord);
    }

    private void keepStars(Vector<Character> userInput) {
        setOldWord(jLabel10.getText());
        String newWord = difficultyLevelObject.comparing(userInput, difficultyLevelObject.reVectoring(word));
        Vector<Character> last = new Vector<>();
        Vector<Character> old = new Vector<>(difficultyLevelObject.reVectoring(getOldWord()));
        Vector<Character> newOne = new Vector<>(difficultyLevelObject.reVectoring(newWord));
        for (int i = 0; i < newOne.size(); i++) {
            if (old.elementAt(i) != newOne.elementAt(i) && old.elementAt(i) == '*') {
                last.add(i, newOne.elementAt(i));
            } else {
                last.add(i, old.elementAt(i));
            }
        }
        setWordBoard(difficultyLevelObject.convertToString(last));
        jTextField1.setText("");
        last.clear();
        setCorrectTry(DifficultyLevel.getCorrectLetters());
        setWrongTry(DifficultyLevel.getWrongLetters());
        putWrongTtyImage(getWrongTry());
        declaringWinner();
        putCorrectTtyImage(getCorrectTry(), difficultyLevelChosen);
        displayTying();
    }

    private static void setOldWord(String oldWord) {
        Game.oldWord = oldWord;
    }

    private static String getOldWord() {
        return oldWord;
    }

    private static int getCorrectTry() {
        return correctTry;
    }

    private static void setCorrectTry(int correctTry) {
        Game.correctTry += correctTry;
    }

    private static int getWrongTry() {
        return wrongTry;
    }

    private static void setWrongTry(int wrongTry) {
        Game.wrongTry += wrongTry;
    }

    private void checkInput(String input) {
//string to vector of char
        Vector<Character> hold = new Vector<>(difficultyLevelObject.reVectoring(input));
        //delete the duplicate letters
        hold = hold.stream().distinct().collect(Collectors.toCollection(Vector::new));
        // cheack if there used letters
        for (int i = 0; i < hold.size(); i++) {
            int temp = 0;
            for (int j = 0; j < usedLetters.size(); j++) {
                if (hold.elementAt(i).equals(usedLetters.elementAt(j))) {
                    hold.remove(i);
                    temp++;
                    break;
                }
            }
            if (temp == 0) {
                usedLetters.add(hold.elementAt(i));
            }
        }
        if (hold.isEmpty()) {
            JOptionPane.showMessageDialog(null, "You have already Entered This Letter/s\n" + "Try With different Letter/s");
            jTextField1.setText("");
        } else {
            keepStars(hold);
        }
    }

    private void displayTying() {
        jLabel13.setText(Integer.toString(correctTry));
        jLabel14.setText(Integer.toString(wrongTry));
    }

    private void declaringWinner() {
        if (getWrongTry() == 6 || getWrongTry() > 6) {
            displayTying();
            JOptionPane.showMessageDialog(null, "Try again, you lost ");
            System.exit(3);
        } 
    }
}
