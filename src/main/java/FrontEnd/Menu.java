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
import Src.Customer;
import Src.DBConnection;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    Customer cus1 = null;
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form Menu
     */
    public Menu() throws SQLException {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cusNameTxt = new java.awt.TextField();
        vehicleNoTxt = new java.awt.TextField();
        cusMailTxt = new java.awt.TextField();
        cusPNumTxt = new java.awt.TextField();
        jLabel5 = new javax.swing.JLabel();
        managePartsBtn = new javax.swing.JButton();
        supBtn = new javax.swing.JButton();
        JobAllocationBtn = new javax.swing.JButton();
        MonthlyReportBtn = new javax.swing.JButton();
        employeeBtn = new javax.swing.JButton();
        resJobBtn = new javax.swing.JButton();
        RepJobBtn = new javax.swing.JButton();
        sMailBtn = new javax.swing.JButton();
        cMailBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        teamBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vehicle No");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(240, 70, 80, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(240, 120, 100, 21);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("E-mail");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(240, 160, 81, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contact Number");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(240, 210, 100, 20);

        cusNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusNameTxtActionPerformed(evt);
            }
        });
        jPanel1.add(cusNameTxt);
        cusNameTxt.setBounds(370, 120, 190, 30);
        jPanel1.add(vehicleNoTxt);
        vehicleNoTxt.setBounds(370, 70, 190, 30);
        jPanel1.add(cusMailTxt);
        cusMailTxt.setBounds(370, 160, 210, 30);
        jPanel1.add(cusPNumTxt);
        cusPNumTxt.setBounds(370, 210, 200, 30);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Details");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 160, 140, 29);

        managePartsBtn.setText("Manage Parts");
        managePartsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePartsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(managePartsBtn);
        managePartsBtn.setBounds(670, 270, 120, 30);

        supBtn.setText("Supplier");
        supBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supBtnActionPerformed(evt);
            }
        });
        jPanel1.add(supBtn);
        supBtn.setBounds(520, 270, 110, 30);

        JobAllocationBtn.setText("Job Allocation");
        JobAllocationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JobAllocationBtnActionPerformed(evt);
            }
        });
        jPanel1.add(JobAllocationBtn);
        JobAllocationBtn.setBounds(310, 340, 110, 30);

        MonthlyReportBtn.setText("Monthly Repost");
        MonthlyReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthlyReportBtnActionPerformed(evt);
            }
        });
        jPanel1.add(MonthlyReportBtn);
        MonthlyReportBtn.setBounds(450, 340, 110, 30);

        employeeBtn.setText("Employee");
        employeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(employeeBtn);
        employeeBtn.setBounds(590, 340, 110, 30);

        resJobBtn.setText("Restore Jobs");
        resJobBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resJobBtnActionPerformed(evt);
            }
        });
        jPanel1.add(resJobBtn);
        resJobBtn.setBounds(380, 270, 110, 30);

        RepJobBtn.setText("Repair Jobs");
        RepJobBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepJobBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RepJobBtn);
        RepJobBtn.setBounds(240, 270, 110, 30);

        sMailBtn.setText("Supplier Mail");
        sMailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sMailBtnActionPerformed(evt);
            }
        });
        jPanel1.add(sMailBtn);
        sMailBtn.setBounds(380, 400, 110, 30);

        cMailBtn.setText("Customer Mail");
        cMailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cMailBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cMailBtn);
        cMailBtn.setBounds(520, 400, 110, 30);

        jButton2.setText("Status");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(610, 70, 70, 30);

        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(logoutBtn);
        logoutBtn.setBounds(750, 490, 80, 30);

        teamBtn.setText("Team");
        teamBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamBtnActionPerformed(evt);
            }
        });
        jPanel1.add(teamBtn);
        teamBtn.setBounds(210, 490, 80, 30);

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Customer ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 120, 130, 29);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sakthimicro\\OneDrive\\Desktop\\OOP_Project_Random Errors\\OOP_Project\\src\\main\\java\\Image\\MenuSide.jpg")); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 150, 550);

        jButton1.setText("Final View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(460, 490, 90, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sakthimicro\\OneDrive\\Desktop\\OOP_Project_Random Errors\\OOP_Project\\src\\main\\java\\Image\\Menu.jpg")); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(150, 0, 740, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cusNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusNameTxtActionPerformed

    private void managePartsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePartsBtnActionPerformed
        // TODO add your handling code here:
        try {
            new SpareParts().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_managePartsBtnActionPerformed

    private void supBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supBtnActionPerformed
        try {
            // TODO add your handling code here:
            new Supplier().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_supBtnActionPerformed

    private void resJobBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resJobBtnActionPerformed
        // TODO add your handling code here:
        if (vehicleNoTxt.getText().isEmpty() || cusNameTxt.getText().isEmpty() || cusMailTxt.getText().isEmpty() || cusPNumTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter the Details");
        } else {

            String Vnum = vehicleNoTxt.getText().toLowerCase();
            String name = cusNameTxt.getText().toLowerCase();
            String mail = cusMailTxt.getText().toLowerCase();

            String pNum = cusPNumTxt.getText();

            try {
                String sql;
                sql = "INSERT INTO `customert`(`CusVehicleNO`, `CusName`, `CusEmail`, `CusPNumber`) VALUES('" + Vnum + "','" + name + "','" + mail + "','" + pNum + "')";

                pst = con.prepareStatement(sql);
                pst.execute();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
            try {
                new RestoreJobs(Vnum).setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }

            this.setVisible(false);
        }

    }//GEN-LAST:event_resJobBtnActionPerformed

    private void RepJobBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepJobBtnActionPerformed
        if (vehicleNoTxt.getText().isEmpty() || cusNameTxt.getText().isEmpty() || cusMailTxt.getText().isEmpty() || cusPNumTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter the Details");
        } else {
            String Vnum = vehicleNoTxt.getText().toLowerCase();
            String name = cusNameTxt.getText().toLowerCase();
            String mail = cusMailTxt.getText().toLowerCase();

            String  pNum = cusPNumTxt.getText();

            try {
                String sql;
                sql = "INSERT INTO `customert`(`CusVehicleNO`, `CusName`, `CusEmail`, `CusPNumber`) VALUES('" + Vnum + "','" + name + "','" + mail + "','" + pNum + "')";

                pst = con.prepareStatement(sql);
                pst.execute();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
            try {
                // TODO add your handling code here:
                String VNO = vehicleNoTxt.getText();
                new RepairJobs(VNO).setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setVisible(false);
        }

    }//GEN-LAST:event_RepJobBtnActionPerformed

    private void JobAllocationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JobAllocationBtnActionPerformed
        // TODO add your handling code here:
        
          try {
            // TODO add your handling code here:
            new JobAllocation().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_JobAllocationBtnActionPerformed

    private void employeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeBtnActionPerformed
        try {
            // TODO add your handling code here:
            new AddEmployee().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_employeeBtnActionPerformed

    private void cMailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cMailBtnActionPerformed
        // TODO add your handling code here:
        String VNO = vehicleNoTxt.getText();

        try {
            new CustormerEmail(VNO).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);

    }//GEN-LAST:event_cMailBtnActionPerformed

    private void sMailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sMailBtnActionPerformed
        try {
            // TODO add your handling code here:
            new SupplierMail().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);

    }//GEN-LAST:event_sMailBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (vehicleNoTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "enter the  vehicleNuber");
        } else {
            String in = vehicleNoTxt.getText();
            String sql = " SELECT FK_EmployeeID FROM  joballocation WHERE FK_CusVehicleNO='" + in + "'";
            try {
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();

                while (rs.next()) {

                    String s = rs.getString(1);
                    if (s.isEmpty()) {
                        JOptionPane.showMessageDialog(rootPane, "your work is finished");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, rs.getString(1) + "Still processing ");
                    }

                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void teamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new TeamDetails().setVisible(true);
    }//GEN-LAST:event_teamBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        try {
            new FinalJobView().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MonthlyReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthlyReportBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            new IncomeAndExpenses().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MonthlyReportBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Menu().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JobAllocationBtn;
    private javax.swing.JButton MonthlyReportBtn;
    private javax.swing.JButton RepJobBtn;
    private javax.swing.JButton cMailBtn;
    private java.awt.TextField cusMailTxt;
    private java.awt.TextField cusNameTxt;
    private java.awt.TextField cusPNumTxt;
    private javax.swing.JButton employeeBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton managePartsBtn;
    private javax.swing.JButton resJobBtn;
    private javax.swing.JButton sMailBtn;
    private javax.swing.JButton supBtn;
    private javax.swing.JButton teamBtn;
    private java.awt.TextField vehicleNoTxt;
    // End of variables declaration//GEN-END:variables

}
