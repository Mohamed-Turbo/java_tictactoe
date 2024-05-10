/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_tictactoe;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java_tictactoe.try3Online;

/**
 *
 * @author TURBO
 */
public class fserver extends javax.swing.JFrame {
    
    public boolean serv=false;
    private String ip = "localhost";
    private int port = 22222;
    private boolean yourTurn = false;
    private boolean circle = true;
    private ServerSocket serverSocket;
    private Socket socket;



    /**
     * Creates new form f_server
     */
    public fserver() {
        initComponents();
    }

    private void initializeServer() {
        try {
                serverSocket = new ServerSocket(port, 8, InetAddress.getByName(ip));
        } catch (Exception e) {
                e.printStackTrace();
                System.out.println("error in server.");
        }
        System.out.println("Successfully created server.");
        serv = true;
        yourTurn = true;
        circle = false;
    }
    private boolean connect() {
        try {
            socket = new Socket(ip, port);
//            dos = new DataOutputStream(socket.getOutputStream());
//            dis = new DataInputStream(socket.getInputStream());
//            accepted = true;
        } catch (IOException e) {
            System.out.println("Unable to connect to the address: " + ip + ":" + port + " | Starting a server");
            return false;
        }
            System.out.println("Successfully connected to the server.");
        return true;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void close()
    {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1400, 800));
        setPreferredSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(104, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel2.setText("Tic Tac Toe Online");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 1330, 110));

        jPanel7.setBackground(new java.awt.Color(104, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel3.setText("Port");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel4.setText("Your ip");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 470, 50));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 470, 50));

        jButton3.setBackground(java.awt.Color.lightGray);
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton3.setText("Play");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 380, 70));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 1330, 560));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String text;
        ip = jTextField1.getText();
        
        text = jTextField2.getText();
        port = Integer.parseInt(text);
        try3Online py = new try3Online(ip,port);
        close();
        
//        if (!connect()) initializeServer();
//        if(!serv){
//            play_online py = new play_online(ip,port,circle, yourTurn);
//            py.setVisible(true);
//        }else{
//            play_online py = new play_online(ip,port,circle, yourTurn);
//            py.setVisible(true);
//        }
        
//        try {
//            Runtime.getRuntime().exec("try3Online.java");
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }

//    ProcessBuilder pb = new ProcessBuilder("cmd");
//    pb.directory(new File("C:\\Users\\TURBO\\Documents\\NetBeansProjects\\java_tictactoe\\src\\java_tictactoe\\try3Online.java"));
//    Process process;
//    try {
//        process = pb.start();
//        process.waitFor();
//    } catch (Exception e) {
//        e.printStackTrace();
//    }

//        py.getClass();

//        try3Online customerPage = new try3Online(ip,port);
//        customerPage.setVisible(true);
//        this.setVisible(true);

//        try3Online myRunnable = new try3Online();
//        Thread thread = new Thread(myRunnable);
//        thread.start();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(fserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fserver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}




