/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_tictactoe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author TURBO
 */
public class java_tictactoe extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker,winner =false;
    
    public java_tictactoe() {
        initComponents();
    }
    private void gameScore()
    {
        jlblplayerX.setText(String.valueOf(xCount));
        jlblplayerO.setText(String.valueOf(oCount));
    }
    
    private void choose_a_player()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame="O";
        }
        else
        {
            startGame="X";
        }
    }
    
    private void winningGame()
    {
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();
        
        if(b1 == "X" && b2 == "X" && b3 == "X")
        {
            JOptionPane.showConfirmDialog(this,"Player X wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton1.setBackground(Color.RED);
            jButton2.setBackground(Color.RED);
            jButton3.setBackground(Color.RED);
            xCount++;
            winner = true;
            gameScore();
        }
        
        if(b4 == "X" && b5 == "X" && b6 == "X")
        {
            JOptionPane.showConfirmDialog(this,"Player X wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton4.setBackground(Color.RED);
            jButton5.setBackground(Color.RED);
            jButton6.setBackground(Color.RED);
            xCount++;
            winner = true;
            gameScore();
        }
        
        if(b7 == "X" && b8 == "X" && b9 == "X")
        {
            JOptionPane.showConfirmDialog(this,"Player X wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton7.setBackground(Color.RED);
            jButton8.setBackground(Color.RED);
            jButton9.setBackground(Color.RED);
            xCount++;
            winner = true;
            gameScore();
        }
        
        if(b1 == "X" && b4 == "X" && b7 == "X")
        {
            JOptionPane.showConfirmDialog(this,"Player X wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton1.setBackground(Color.RED);
            jButton4.setBackground(Color.RED);
            jButton7.setBackground(Color.RED);
            xCount++;
            winner = true;
            gameScore();
        }
        
        if(b2 == "X" && b5 == "X" && b8 == "X")
        {
            JOptionPane.showConfirmDialog(this,"Player X wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton2.setBackground(Color.RED);
            jButton5.setBackground(Color.RED);
            jButton8.setBackground(Color.RED);
            xCount++;
            winner = true;
            gameScore();
        }
        
        if(b3 == "X" && b6 == "X" && b9 == "X")
        {
            JOptionPane.showConfirmDialog(this,"Player X wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton3.setBackground(Color.RED);
            jButton6.setBackground(Color.RED);
            jButton9.setBackground(Color.RED);
            xCount++;
            winner = true;
            gameScore();
        }
        
        if(b1 == "X" && b5 == "X" && b9 == "X")
        {
            JOptionPane.showConfirmDialog(this,"Player X wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton1.setBackground(Color.RED);
            jButton5.setBackground(Color.RED);
            jButton9.setBackground(Color.RED);
            xCount++;
            winner = true;
            gameScore();
        }
        
        if(b3 == "X" && b5 == "X" && b7 == "X")
        {
            JOptionPane.showConfirmDialog(this,"Player X wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton3.setBackground(Color.RED);
            jButton5.setBackground(Color.RED);
            jButton7.setBackground(Color.RED);
            xCount++;
            winner = true;
            gameScore();
        }
        
        
        if(b1 == "O" && b2 == "O" && b3 == "O")
        {
            JOptionPane.showConfirmDialog(this,"Player O wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton1.setBackground(Color.RED);
            jButton2.setBackground(Color.RED);
            jButton3.setBackground(Color.RED);
            xCount++;
            winner = true;
            gameScore();
        }
        
        if(b4 == "O" && b5 == "O" && b6 == "O")
        {
            JOptionPane.showConfirmDialog(this,"Player O wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton4.setBackground(Color.RED);
            jButton5.setBackground(Color.RED);
            jButton6.setBackground(Color.RED);
            xCount++;
            winner = true;
            gameScore();
        }
        
        if(b7 == "O" && b8 == "O" && b9 == "O")
        {
            JOptionPane.showConfirmDialog(this,"Player O wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton7.setBackground(Color.RED);
            jButton8.setBackground(Color.RED);
            jButton9.setBackground(Color.RED);
            xCount++;
            winner = true;
            gameScore();
        }
        
        if(b1 == "O" && b4 == "O" && b7 == "O")
        {
            JOptionPane.showConfirmDialog(this,"Player O wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton1.setBackground(Color.RED);
            jButton4.setBackground(Color.RED);
            jButton7.setBackground(Color.RED);
            xCount++;
            winner = true;
            gameScore();
        }
        
        if(b2 == "O" && b5 == "O" && b8 == "O")
        {
            JOptionPane.showConfirmDialog(this,"Player O wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton2.setBackground(Color.RED);
            jButton5.setBackground(Color.RED);
            jButton8.setBackground(Color.RED);
            xCount++;
            winner = true;
            gameScore();
        }
        
        if(b3 == "O" && b6 == "O" && b9 == "O")
        {
            JOptionPane.showConfirmDialog(this,"Player O wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton3.setBackground(Color.RED);
            jButton6.setBackground(Color.RED);
            jButton9.setBackground(Color.RED);
            xCount++;
            winner = true;
            gameScore();
        }
        
        if(b1 == "O" && b5 == "O" && b9 == "O")
        {
            JOptionPane.showConfirmDialog(this,"Player O wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton1.setBackground(Color.RED);
            jButton5.setBackground(Color.RED);
            jButton9.setBackground(Color.RED);
            xCount++;
            winner = true;
            gameScore();
        }
        
        if(b3 == "O" && b5 == "O" && b7 == "O")
        {
            JOptionPane.showConfirmDialog(this,"Player O wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton3.setBackground(Color.RED);
            jButton5.setBackground(Color.RED);
            jButton7.setBackground(Color.RED);
            xCount++;
            winner = true;
            gameScore();
        }
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
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jlblplayerO = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlblplayerX = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(95, 158, 160));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(java.awt.Color.lightGray);
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton1.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton1.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton1.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jButton2.setBackground(java.awt.Color.lightGray);
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton2.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton2.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton2.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jButton3.setBackground(java.awt.Color.lightGray);
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton3.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton3.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton3.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        jButton4.setBackground(java.awt.Color.lightGray);
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton4.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton4.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton4.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jButton5.setBackground(java.awt.Color.lightGray);
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton5.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton5.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton5.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        jButton6.setBackground(java.awt.Color.lightGray);
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton6.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton6.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton6.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, -1));

        jButton7.setBackground(java.awt.Color.lightGray);
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton7.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton7.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton7.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jButton8.setBackground(java.awt.Color.lightGray);
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton8.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton8.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton8.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        jButton9.setBackground(java.awt.Color.lightGray);
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton9.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton9.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton9.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 660, 660));

        jPanel3.setBackground(new java.awt.Color(95, 158, 160));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(95, 158, 160));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblplayerO.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jlblplayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblplayerO.setText("0");
        jlblplayerO.setOpaque(true);
        jPanel4.add(jlblplayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 280, 80));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel3.setText("player O:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jlblplayerX.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jlblplayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblplayerX.setText("0");
        jlblplayerX.setOpaque(true);
        jPanel4.add(jlblplayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 280, 80));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel4.setText("player X:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 620, 270));

        jPanel5.setBackground(new java.awt.Color(95, 158, 160));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setBackground(java.awt.Color.lightGray);
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton10.setText("New Game");
        jButton10.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton10.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton10.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 140));

        jButton11.setBackground(java.awt.Color.lightGray);
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton11.setText("Reset");
        jButton11.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton11.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton11.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 158, 310, 140));

        jButton12.setBackground(java.awt.Color.lightGray);
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton12.setText("Exit");
        jButton12.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton12.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton12.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 270, 140));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 620, 310));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 660, 660));

        jPanel6.setBackground(new java.awt.Color(95, 158, 160));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel2.setText("Tic Tac Toe");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 1330, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        //new game
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        jlblplayerX.setText("0");
        jlblplayerO.setText("0");
        
        xCount=0;
        oCount=0;
        winner =false;
        
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        //reset        
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        winner =false;
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        
        jButton1.setForeground(Color.BLACK);
        jButton2.setForeground(Color.BLACK);
        jButton3.setForeground(Color.BLACK);
        jButton4.setForeground(Color.BLACK);
        jButton5.setForeground(Color.BLACK);
        jButton6.setForeground(Color.BLACK);
        jButton7.setForeground(Color.BLACK);
        jButton8.setForeground(Color.BLACK);
        jButton9.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        //exit
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"confirm if you want to exit", "Tic Tac Toe", 
               JOptionPane.YES_NO_OPTION )== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(!winner)
        {
            jButton6.setText(startGame);
            if(startGame == "X")
            {
                jButton6.setForeground(Color.PINK);
            }
            else if(startGame == "O")
            {
                jButton6.setForeground(Color.YELLOW);
            }
            checker = !startGame.equalsIgnoreCase("X");
            choose_a_player();
            winningGame();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!winner && jButton1.getText()!="X" && jButton1.getText()!="O")
        {
            jButton1.setText(startGame);
            if(startGame == "X")
            {
                jButton1.setForeground(Color.PINK);
            }
            else if(startGame == "O")
            {
                jButton1.setForeground(Color.YELLOW);
            }
            checker = !startGame.equalsIgnoreCase("X");
            choose_a_player();
            winningGame();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(!winner && jButton2.getText()!="X" && jButton2.getText()!="O")
        {
            jButton2.setText(startGame);
            if(startGame == "X")
            {
                jButton2.setForeground(Color.PINK);
            }
            else if(startGame == "O")
            {
                jButton2.setForeground(Color.YELLOW);
            }
            checker = !startGame.equalsIgnoreCase("X");
            choose_a_player();
            winningGame();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(!winner && jButton3.getText()!="X" && jButton3.getText()!="O")
        {
            jButton3.setText(startGame);
            if(startGame == "X")
            {
                jButton3.setForeground(Color.PINK);
            }
            else if(startGame == "O")
            {
                jButton3.setForeground(Color.YELLOW);
            }
            checker = !startGame.equalsIgnoreCase("X");
            choose_a_player();
            winningGame();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(!winner && jButton4.getText()!="X" && jButton4.getText()!="O")
        {
            jButton4.setText(startGame);
            if(startGame == "X")
            {
                jButton4.setForeground(Color.PINK);
            }
            else if(startGame == "O")
            {
                jButton4.setForeground(Color.YELLOW);
            }
            checker = !startGame.equalsIgnoreCase("X");
            choose_a_player();
            winningGame();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(!winner && jButton5.getText()!="X" && jButton5.getText()!="O")
        {
            jButton5.setText(startGame);
            if(startGame == "X")
            {
                jButton5.setForeground(Color.PINK);
            }
            else if(startGame == "O")
            {
                jButton5.setForeground(Color.YELLOW);
            }
            checker = !startGame.equalsIgnoreCase("X");
            choose_a_player();
            winningGame();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(!winner && jButton7.getText()!="X" && jButton7.getText()!="O")
        {
            jButton7.setText(startGame);
            if(startGame == "X")
            {
                jButton7.setForeground(Color.PINK);
            }
            else if(startGame == "O")
            {
                jButton7.setForeground(Color.YELLOW);
            }
            checker = !startGame.equalsIgnoreCase("X");
            choose_a_player();
            winningGame();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(!winner && jButton8.getText()!="X" && jButton8.getText()!="O")
        {
            jButton8.setText(startGame);
            if(startGame == "X")
            {
                jButton8.setForeground(Color.PINK);
            }
            else if(startGame == "O")
            {
                jButton8.setForeground(Color.YELLOW);
            }
            checker = !startGame.equalsIgnoreCase("X");
            choose_a_player();
            winningGame();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(!winner && jButton9.getText()!="X" && jButton9.getText()!="O")
        {
            jButton9.setText(startGame);
            if(startGame == "X")
            {
                jButton9.setForeground(Color.PINK);
            }
            else if(startGame == "O")
            {
                jButton9.setForeground(Color.YELLOW);
            }
            checker = !startGame.equalsIgnoreCase("X");
            choose_a_player();
            winningGame();
        }
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(java_tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(java_tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(java_tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(java_tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new java_tictactoe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jlblplayerO;
    private javax.swing.JLabel jlblplayerX;
    // End of variables declaration//GEN-END:variables
}
