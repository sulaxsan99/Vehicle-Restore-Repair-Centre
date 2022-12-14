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
import Src.DBConnection;
import Src.SupplierSrc;
import java.awt.HeadlessException;
import java.sql.*;


import javax.swing.JOptionPane;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AddEmployee extends javax.swing.JFrame {

    SupplierSrc sup1;
    Connection con = null;
    PreparedStatement pst = null;

    /**
     * Creates new form AddEmployee
     */
    public AddEmployee() throws SQLException {
        initComponents();
        con = DBConnection.conntion();
        this.setLocationRelativeTo(null) ;
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
        jLabel1 = new javax.swing.JLabel();
        empIDTxt = new java.awt.TextField();
        empNameTxt = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        empNumTxt = new java.awt.TextField();
        EmpMailTxt = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        empSalTxt = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DeletBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Employee ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));
        jPanel1.add(empIDTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 190, 30));
        jPanel1.add(empNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 190, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Employee Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Contatct No");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 74, -1));
        jPanel1.add(empNumTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 190, 30));
        jPanel1.add(EmpMailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 190, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("E-mail");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Salary");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        empSalTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empSalTxtActionPerformed(evt);
            }
        });
        jPanel1.add(empSalTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 190, 30));

        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        jPanel1.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 60, 30));

        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 80, 30));

        DeletBtn.setText("Delete");
        DeletBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DeletBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 70, 30));

        BackBtn.setText("Exit");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 60, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sakthimicro\\OneDrive\\Desktop\\OOP_Project_Random Errors\\OOP_Project\\src\\main\\java\\Image\\Employee.jpg")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 560, 350));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Employee");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 130, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sakthimicro\\OneDrive\\Desktop\\OOP_Project_Random Errors\\OOP_Project\\src\\main\\java\\Image\\EmpSide.jpg")); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        try {
            // TODO add your handling code here:
            new Menu().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void DeletBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletBtnActionPerformed
        // TODO add your handling code here:
        try {
            String empId = empIDTxt.getText();

            String q;
            q = "DELETE FROM `employeet` WHERE `EmployeeID`='"+empId+"'";
            pst = con.prepareStatement(q);
            pst.execute();
            JOptionPane.showMessageDialog(rootPane, "Employee Id "+ empId +" id deleted sucessfully");
        } catch (HeadlessException e) {
            System.out.println(e);
        } catch (SQLException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DeletBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
        try {
            String empId = empIDTxt.getText();
            String empName = empNameTxt.getText();
            String empConNo = empNumTxt.getText();
            String empEmail = EmpMailTxt.getText();
            double empSal = Double.parseDouble(empSalTxt.getText());

            String q;
            q="UPDATE `employeet` SET `EmployeeID`='" + empId + "',`EmployeeName`='" + empName + "',`EmployeePNum`='" + empConNo + "',,`EmployeeEmail`='" + empEmail + "',`Salary`='" + empSal + "'";
            pst = con.prepareStatement(q);
            pst.execute();
            JOptionPane.showMessageDialog(rootPane, "Employee Id "+ empId +"is added Sucessfully");

        } catch (HeadlessException e) {
            System.out.println(e);
        } catch (SQLException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        empIDTxt.setText("");
        empNameTxt.setText("");
        empNumTxt.setText("");
        EmpMailTxt.setText("");
        empSalTxt.setText(null);
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:

        try {
            String empId = empIDTxt.getText();
            String empName = empNameTxt.getText();
            String empConNo = empNumTxt.getText();
            String empEmail = EmpMailTxt.getText();
            double empSal = Double.parseDouble(empSalTxt.getText());

            String q;

            q = "INSERT INTO `employeet`(`EmployeeID`, `EmployeeName`, `EmployeePNum`, `EmployeeEmail`, `Salary`) VALUES  ('" + empId + "','" + empName + "','" + empConNo + "','" + empEmail + "','" + empSal + "')";
            pst = con.prepareStatement(q);
            pst.execute();
            JOptionPane.showMessageDialog(rootPane, "Employee Id "+ empId +"is added Sucessfully");

        } catch (HeadlessException e) {
            System.out.println(e);
        } catch (SQLException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        empIDTxt.setText("");
        empNameTxt.setText("");
        empNumTxt.setText("");
        EmpMailTxt.setText("");
        empSalTxt.setText(null);
    }//GEN-LAST:event_AddBtnActionPerformed

    private void empSalTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empSalTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empSalTxtActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AddEmployee().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DeletBtn;
    private java.awt.TextField EmpMailTxt;
    private javax.swing.JButton UpdateBtn;
    private java.awt.TextField empIDTxt;
    private java.awt.TextField empNameTxt;
    private java.awt.TextField empNumTxt;
    private javax.swing.JTextField empSalTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
