/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import Src.DBConnection;
import java.sql.*;
import Src.Customer;
import java.awt.HeadlessException;
import java.sql.SQLException;
//import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import org.apache.commons.dbutils.QueryRunner;
//import org.apache.commons.dbutils.ResultSetHandler;
//import org.apache.commons.dbutils.handlers.BeanListHandler;
//import org.apache.commons.dbutils.handlers.BeanHandler;
//import org.apache.commons.dbutils.handlers.MapListHandler;
// ... other imports as needed


/**
 *
 * @author Keerththan
 */
public class RestoreJobs extends javax.swing.JFrame {

    Customer Cus1 = new Customer();
    Connection con = null;
    PreparedStatement pst = null;

    ResultSet rs = null;
    Statement stm = null;
    static String vNo;
    static String part;
    static double quantity;
    static double costS;

    /**
     * Creates new form Restore
     *
     * @throws java.sql.SQLException
     */
    public RestoreJobs() throws SQLException {
        initComponents();
        con = DBConnection.conntion();
        repVNumLbl.setText(Customer.VehNo);
        loadComboBoxx();
        tableload();
        AvailablepartsTable();
        this.setLocationRelativeTo(null) ;
        

    }

    public RestoreJobs(String vNo) throws SQLException {
        initComponents();
        con = DBConnection.conntion();
        repVNumLbl.setText(vNo);
        loadComboBoxx();
        tableload();
        AvailablepartsTable();
        this.setLocationRelativeTo(null) ;
        
    }

    public void AvailablepartsTable() {
       // String sql = "SELECT `ProductID`,`ProductName`,SUM(`Quantity`),UnitPrice FROM managepartst GROUP BY `ProductID` ";
       String sql = "SELECT * FROM `avilableparts` ";
       
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            AvailablepartsTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    public void tableload() {

        String sql = "SELECT `FK_VehicleNO`, `FK_PartsID`, `PartsName`, `Quantity`, `Selling Cost`,`Payment` FROM `restorejobs`  where `FK_VehicleNO`='" + repVNumLbl.getText() + "'";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            partsTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    public void loadComboBoxx() throws SQLException {
        stm = con.createStatement();
        rs = stm.executeQuery("SELECT DISTINCT`ProductName` FROM managepartst group by `ProductID`");
        while (rs.next()) {
            String name = rs.getString("ProductName");
            partsCombo.addItem(name);
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
        BackBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CHIYLTRAPbtn = new javax.swing.JButton();
        SBtn = new javax.swing.JButton();
        canvas1 = new java.awt.Canvas();
        calculateBtn = new javax.swing.JButton();
        repVNumLbl = new javax.swing.JLabel();
        partsCombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        quanTxt = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        updatBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        partsTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        sellCostTxt = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        AvailablepartsTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        BackBtn.setText("cancel");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BackBtn);
        BackBtn.setBounds(830, 500, 80, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vehicle No");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(260, 100, 90, 15);

        CHIYLTRAPbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CHIYLTRAPbtn.setText("Click here if you like to Repair  Any Parts");
        CHIYLTRAPbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHIYLTRAPbtnActionPerformed(evt);
            }
        });
        jPanel1.add(CHIYLTRAPbtn);
        CHIYLTRAPbtn.setBounds(380, 500, 290, 30);

        SBtn.setText("Save");
        jPanel1.add(SBtn);
        SBtn.setBounds(1330, 707, 55, 21);
        jPanel1.add(canvas1);
        canvas1.setBounds(614, 529, 0, 0);

        calculateBtn.setText("Calculate");
        calculateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(calculateBtn);
        calculateBtn.setBounds(1082, 674, 75, 21);

        repVNumLbl.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(repVNumLbl);
        repVNumLbl.setBounds(380, 100, 120, 25);

        partsCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partsComboActionPerformed(evt);
            }
        });
        jPanel1.add(partsCombo);
        partsCombo.setBounds(380, 151, 120, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Choose Part");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(260, 160, 80, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantity");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(260, 210, 53, 15);

        quanTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanTxtActionPerformed(evt);
            }
        });
        jPanel1.add(quanTxt);
        quanTxt.setBounds(380, 199, 119, 30);

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn);
        addBtn.setBounds(260, 341, 60, 30);

        updatBtn.setText("Update");
        updatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updatBtn);
        updatBtn.setBounds(340, 341, 70, 30);

        removeBtn.setText("Remove");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(removeBtn);
        removeBtn.setBounds(430, 341, 80, 30);

        partsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Vehicle No", "Parts", "Quantity "
            }
        ));
        partsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                partsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(partsTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(570, 60, 350, 180);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Selling Cost");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(260, 280, 90, 15);

        sellCostTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellCostTxtActionPerformed(evt);
            }
        });
        jPanel1.add(sellCostTxt);
        sellCostTxt.setBounds(380, 270, 119, 30);

        AvailablepartsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(AvailablepartsTable);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(570, 280, 350, 194);

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Restore Jobs");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 200, 140, 39);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sakthimicro\\OneDrive\\Desktop\\OOP_Project_Random Errors\\OOP_Project\\src\\main\\java\\Image\\add SIde.jpg")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 160, 580);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sakthimicro\\OneDrive\\Desktop\\OOP_Project_Random Errors\\OOP_Project\\src\\main\\java\\Image\\Merhnu.jpg")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(160, 0, 790, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 949, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CHIYLTRAPbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHIYLTRAPbtnActionPerformed
      String vNO=repVNumLbl.getText();
        try {
            new RepairJobs(vNO).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(RestoreJobs.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_CHIYLTRAPbtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        try {
            // TODO add your handling code here:
            new Menu().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(RestoreJobs.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calculateBtnActionPerformed

    private void quanTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quanTxtActionPerformed

    private void partsComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partsComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_partsComboActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        String i = null;
        String sql;
        double tot;
        try {
            vNo = repVNumLbl.getText();
            part = partsCombo.getSelectedItem().toString();
            quantity = Double.parseDouble(quanTxt.getText());          
            costS = Double.parseDouble(sellCostTxt.getText());
            tot = quantity * costS;

            try {

                 sql = "SELECT `ProductID` FROM managepartst WHERE `ProductName`= '" + part + "'";
                try {

                    pst = con.prepareStatement(sql);

                    rs = pst.executeQuery();
                    while (rs.next()) {

                        i = rs.getString(1);
                        //JOptionPane.showMessageDialog(rootPane, rs.getInt(1));

                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                String q;
                q = "INSERT INTO `restorejobs`(`FK_VehicleNo`, `FK_PartsId`, `PartsName`, `Quantity`, `Selling Cost`,`Payment`) VALUES('" + vNo + "','" + i + "','" + part + "','" + quantity + "','" + costS + "','" + tot + "')";
                pst = con.prepareStatement(q);
                pst.execute();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        sql="update";
        AvailablepartsTable();
        tableload();


    }//GEN-LAST:event_addBtnActionPerformed

    private void sellCostTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellCostTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellCostTxtActionPerformed

    private void partsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_partsTableMouseClicked
        // TODO add your handling code here:
        int r = partsTable.getSelectedRow();

        vNo = partsTable.getValueAt(r, 0).toString();
        part = partsTable.getValueAt(r, 2).toString();
        String q = partsTable.getValueAt(r, 3).toString();
        //String s = partsTable.getValueAt(r, 4).toString();
        String c = partsTable.getValueAt(r, 4).toString();

        repVNumLbl.setText(vNo);

        partsCombo.addItem(part);
        quanTxt.setText(q);
        //sellCostTxt.setText(s);
//        totalCostTextAPne.setText(c);


    }//GEN-LAST:event_partsTableMouseClicked

    private void updatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatBtnActionPerformed
        // TODO add your handling code here:
        int r = JOptionPane.showConfirmDialog(rootPane, "Do you really want to update..?");
        if (r == 0) {

            vNo = repVNumLbl.getText();
            part = partsCombo.getSelectedItem().toString();
            quantity = Double.parseDouble(quanTxt.getText());
            costS = Double.parseDouble(sellCostTxt.getText());
            String sql = "UPDATE `restorejobs` SET `PartsName`='" + part + "',`Quantity`='" + quantity + "',`Selling Cost`='" + costS + "' WHERE `FK_VehicleNO`='" + vNo + "'";
            try {
                pst = con.prepareStatement(sql);
            } catch (SQLException ex) {
                Logger.getLogger(SpareParts.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                pst.execute();
            } catch (SQLException ex) {
                Logger.getLogger(SpareParts.class.getName()).log(Level.SEVERE, null, ex);
            }
            tableload();

        }

    }//GEN-LAST:event_updatBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        // TODO add your handling code here:

        //JOptionPane.showMessageDialog(rootPane, "Please Choose the Billing statement which you want to \"DELETE\"");
        int r = JOptionPane.showConfirmDialog(rootPane, "Do you really want to delete..?");
        vNo = repVNumLbl.getText();
        do {

            if (r == 0) {

                String sql = "DELETE  FROM `restorejobs` WHERE `FK_VehicleNO`='" + vNo + "'";
                try {
                    pst = con.prepareStatement(sql);
                } catch (SQLException ex) {
                    Logger.getLogger(SpareParts.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    pst.execute();
                } catch (SQLException ex) {
                    Logger.getLogger(SpareParts.class.getName()).log(Level.SEVERE, null, ex);
                }
                tableload();

                r = JOptionPane.showConfirmDialog(rootPane, "Do you really want to delete more..?");
                if (r == 0) {
                    JOptionPane.showMessageDialog(rootPane, "Select the Restore Statement  Statement");
                }
            }
        } while (r != 0);


    }//GEN-LAST:event_removeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(RestoreJobs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestoreJobs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestoreJobs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestoreJobs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new RestoreJobs().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(RestoreJobs.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AvailablepartsTable;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton CHIYLTRAPbtn;
    private javax.swing.JButton SBtn;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton calculateBtn;
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox<String> partsCombo;
    private javax.swing.JTable partsTable;
    private javax.swing.JTextField quanTxt;
    private javax.swing.JButton removeBtn;
    private javax.swing.JLabel repVNumLbl;
    private javax.swing.JTextField sellCostTxt;
    private javax.swing.JButton updatBtn;
    // End of variables declaration//GEN-END:variables
}
