/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

/**
 *
 * @author Keerththan
 */
import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    private String user;
    private String pass;

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null) ;
       //this.setIconImage(new ImageIcon(getClass().getResource("\\fantasy-4765877_960_720.jpg")).getImage());
       // scaleImage();
    }
//
//    public void scaleImage() {
//        //ImageIcon icon = new ImageIcon("C:\\Users\\Keerththan\\Desktop\\OOP_Project - Copy\\src\\main\\java\\Image\\fantasy-4765877_960_720");
//        
//        Image img = lable5.getImage();
//        Image imgScale = img.getScaledInstance(lable5.getWidth(), lable5.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scalIcon = new ImageIcon(imgScale);
//
//        lable5.setIcon(scalIcon);
////
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        PassTxt = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        UserTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(20, 50));
        jPanel1.setLayout(null);

        label1.setFont(new java.awt.Font("Chiller", 0, 48)); // NOI18N
        label1.setPreferredSize(new java.awt.Dimension(100, 20));
        label1.setText("RustRepaire");
        jPanel1.add(label1);
        label1.setBounds(1475, 10, 273, 83);
        jPanel1.add(PassTxt);
        PassTxt.setBounds(220, 300, 390, 60);

        loginBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        loginBtn.setText("login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginBtn);
        loginBtn.setBounds(360, 430, 180, 70);
        jPanel1.add(UserTxt);
        UserTxt.setBounds(220, 199, 390, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sakthimicro\\OneDrive\\Desktop\\OOP_Project_Random Errors\\OOP_Project\\src\\main\\java\\Image\\Logi.jpg")); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-140, -20, 1000, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        if (UserTxt.getText().equalsIgnoreCase("sliit")) {
            if (PassTxt.getText().equalsIgnoreCase("uob")) {
                try {
                    new Menu().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Incorret Password");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Enter the valid Use Name");
        }
    }//GEN-LAST:event_loginBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PassTxt;
    private javax.swing.JTextField UserTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private java.awt.Label label1;
    private javax.swing.JButton loginBtn;
    // End of variables declaration//GEN-END:variables
}
