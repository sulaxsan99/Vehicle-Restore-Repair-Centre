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
import java.awt.HeadlessException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Date;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
// ... other imports as needed


public class SpareParts extends javax.swing.JFrame {

    private static String pBill;
    private static String sID;
    private static String pId;
    private static String pName;
    private static String gDate;
    private static double uPrice;
    private static double pDiscount;
    private static int pQuantity;
    private static double discountedUnitPrice;
    private static double pTotal;
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement stm = null;

    /**
     * Creates new form SpareParts
     *
     * @throws java.sql.SQLException
     */
    public SpareParts() throws SQLException {
        initComponents();
        con = DBConnection.conntion();

        Date date = new Date();
        jDateChooser1.setDate(date);
        tableload();
        loadComboBoxx();
        PartsQuantityTableload();
        this.setLocationRelativeTo(null) ;

    }

    public void tableload() {
        String sql = "SELECT `BillNo`, `SupplierID`, `ProductID`, `ProductName`, `addDate`, `UnitPrice`, `Discount`, `Quantity`, `DiscountedPrice`, `Total` FROM `managepartst`";
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
        rs = stm.executeQuery("SELECT `SupID` FROM `suppliert` ");
        while (rs.next()) {
            String name = rs.getString("SupID");
            SupIDcomboBox.addItem(name);
        }

    }

    public void PartsQuantityTableload() {
        String sql = "SELECT `ProductID`,`ProductName`,SUM(`Quantity`) FROM managepartst GROUP BY `ProductID` ";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            partsQuantityTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }

    }

    public SpareParts(String Bname, String ID) throws SQLException {

        initComponents();

        SupIDTxtjTextPane1.setText(ID);
        SupIDTxtjTextPane1.setEditable(false);
        BnameTextPane1.setText(Bname);
        BnameTextPane1.setEditable(false);

        SupIDcomboBox.setVisible(false);
        Date date = new Date();
        jDateChooser1.setDate(date);
        con = DBConnection.conntion();
        tableload();
        PartsQuantityTableload();

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
        SaveExitBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PIDTxt = new javax.swing.JTextField();
        PNameTxt = new javax.swing.JTextField();
        PPriceTx = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        DiscountedUnitPriceLbl = new javax.swing.JLabel();
        calculateBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        PdisTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        PQuantityTxt = new javax.swing.JTextField();
        pTotalLbl = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        billTxt = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        partsTable = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        partsQuantityTable = new javax.swing.JTable();
        SupIDcomboBox = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        BnameTextPane1 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        SupIDTxtjTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        load = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(null);

        SaveExitBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SaveExitBtn.setText("Exit");
        SaveExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveExitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SaveExitBtn);
        SaveExitBtn.setBounds(940, 653, 109, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Business Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(270, 160, 120, 17);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(327, 317, 0, 0);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(321, 148, 0, 14);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Product ID");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(270, 250, 90, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Product Name");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(270, 290, 110, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Unit  price");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(270, 380, 90, 19);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("discounted Unit  price");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(240, 550, 170, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(240, 600, 36, 17);
        jPanel1.add(PIDTxt);
        PIDTxt.setBounds(430, 240, 150, 30);
        jPanel1.add(PNameTxt);
        PNameTxt.setBounds(430, 280, 150, 30);
        jPanel1.add(PPriceTx);
        PPriceTx.setBounds(430, 370, 150, 30);

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn);
        addBtn.setBounds(240, 650, 73, 34);

        DiscountedUnitPriceLbl.setBackground(new java.awt.Color(255, 255, 255));
        DiscountedUnitPriceLbl.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(DiscountedUnitPriceLbl);
        DiscountedUnitPriceLbl.setBounds(410, 550, 146, 21);

        calculateBtn.setText("Calculate");
        calculateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(calculateBtn);
        calculateBtn.setBounds(370, 490, 100, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("discount");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(270, 420, 90, 17);
        jPanel1.add(PdisTxt);
        PdisTxt.setBounds(430, 410, 150, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Quantity");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(270, 450, 86, 17);

        PQuantityTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PQuantityTxtActionPerformed(evt);
            }
        });
        jPanel1.add(PQuantityTxt);
        PQuantityTxt.setBounds(430, 450, 150, 30);

        pTotalLbl.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(pTotalLbl);
        pTotalLbl.setBounds(410, 590, 146, 25);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Date");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(270, 340, 36, 17);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Sup ID");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(270, 120, 80, 17);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Bill no");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(270, 210, 60, 17);

        billTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billTxtActionPerformed(evt);
            }
        });
        jPanel1.add(billTxt);
        billTxt.setBounds(430, 200, 150, 30);
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(430, 330, 150, 30);

        partsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Bill No", "Supplier ID", "Product ID", "Product Name", "Date", "Unit Price", "Discount ", "Quantity", "Discount Price", "Total"
            }
        ));
        partsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                partsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(partsTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(610, 50, 590, 219);

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn);
        deleteBtn.setBounds(510, 650, 73, 34);

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateBtn);
        updateBtn.setBounds(370, 650, 73, 34);

        partsQuantityTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product ID", "Parts Name", "Quantity"
            }
        ));
        jScrollPane2.setViewportView(partsQuantityTable);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(620, 310, 590, 251);

        SupIDcomboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupIDcomboBoxMouseClicked(evt);
            }
        });
        SupIDcomboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupIDcomboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(SupIDcomboBox);
        SupIDcomboBox.setBounds(430, 50, 145, 21);

        jScrollPane3.setViewportView(BnameTextPane1);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(430, 150, 150, 30);

        jScrollPane5.setViewportView(SupIDTxtjTextPane1);

        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(430, 110, 150, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Choose ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(270, 50, 80, 17);

        jLabel18.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 48)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Manage ");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(30, 330, 130, 30);

        jLabel19.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText(" Spare Parts");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(30, 380, 130, 30);

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sakthimicro\\OneDrive\\Desktop\\OOP_Project_Random Errors\\OOP_Project\\src\\main\\java\\Image\\MenuSide.jpg")); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(0, 0, 190, 730);

        load.setText("Load");
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });
        jPanel1.add(load);
        load.setBounds(480, 80, 55, 21);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sakthimicro\\OneDrive\\Desktop\\OOP_Project_Random Errors\\OOP_Project\\src\\main\\java\\Image\\rolls-royce-wraith-eagle-viii.jpg")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(190, 0, 1070, 730);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:

        try {
            pBill = billTxt.getText();
            sID = SupIDTxtjTextPane1.getText();
            pId = PIDTxt.getText();
            pName = PNameTxt.getText();
            uPrice = Double.parseDouble(PPriceTx.getText());
            pDiscount = Double.parseDouble(PdisTxt.getText());
            pQuantity = Integer.parseInt(PQuantityTxt.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
            gDate = sdf.format(jDateChooser1.getDate());
            //Calcuate discounted Unti price
            discountedUnitPrice = (uPrice - ((uPrice * pDiscount) / 100));
            DiscountedUnitPriceLbl.setText(discountedUnitPrice + "");
            pTotal = discountedUnitPrice * pQuantity;
            pTotalLbl.setText(pTotal + "");

            try {
                String q;

                q = "INSERT INTO `managepartst`(`BillNo`, `SupplierID`, `ProductID`, `ProductName`, `addDate`, `UnitPrice`, `Discount`, `Quantity`, `DiscountedPrice`, `Total`) VALUES ('" + pBill + "','" + sID + "','" + pId + "','" + pName + "','" + gDate + "','" + uPrice + "','" + pDiscount + "','" + pQuantity + "','" + discountedUnitPrice + "' ,'" + pTotal + "' )";
                pst = con.prepareStatement(q);
                pst.execute();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
        
        
        
        tableload();
        PartsQuantityTableload();

        billTxt.setText("");
        SupIDTxtjTextPane1.setText("");
        PIDTxt.setText("");
        PNameTxt.setText("");
        PPriceTx.setText("");
        PdisTxt.setText("");
        PQuantityTxt.setText("");
        DiscountedUnitPriceLbl.setText("");
        pTotalLbl.setText("");
    }//GEN-LAST:event_addBtnActionPerformed

    private void SaveExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveExitBtnActionPerformed
        try {
            // TODO add your handling code here:
            new Menu().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(SpareParts.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_SaveExitBtnActionPerformed

    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed
        // TODO add your handling code here:

        uPrice = Double.parseDouble(PPriceTx.getText());
        pDiscount = Double.parseDouble(PdisTxt.getText());
        pQuantity = Integer.parseInt(PQuantityTxt.getText());

        //Calcuate discounted Unti price
        discountedUnitPrice = (uPrice - ((uPrice * pDiscount) / 100));
        DiscountedUnitPriceLbl.setText(discountedUnitPrice + "");
        pTotal = discountedUnitPrice * pQuantity;
        pTotalLbl.setText(pTotal + "");

    }//GEN-LAST:event_calculateBtnActionPerformed

    private void billTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billTxtActionPerformed

    private void partsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_partsTableMouseClicked
        // TODO add your handling code here:
        int r = partsTable.getSelectedRow();

        pBill = partsTable.getValueAt(r, 0).toString();
        sID = partsTable.getValueAt(r, 1).toString();
        pId = partsTable.getValueAt(r, 2).toString();
        pName = partsTable.getValueAt(r, 3).toString();

        gDate = partsTable.getValueAt(r, 4).toString();

        String uPriceStr = partsTable.getValueAt(r, 5).toString();
        String pDiscountStr = partsTable.getValueAt(r, 6).toString();
        String pQuantityStr = partsTable.getValueAt(r, 7).toString();
        String discountedUnitPriceStr = partsTable.getValueAt(r, 8).toString();
        String pTotalStr = partsTable.getValueAt(r, 9).toString();

        billTxt.setText(pBill);
        billTxt.setEditable(false);
        SupIDTxtjTextPane1.setText(sID);
        PIDTxt.setText(pId);
        PNameTxt.setText(pName);
        jDateChooser1.setDateFormatString(gDate);

        PPriceTx.setText(uPriceStr);
        PdisTxt.setText(pDiscountStr);
        PQuantityTxt.setText(pQuantityStr);
        DiscountedUnitPriceLbl.setText(discountedUnitPriceStr);
        pTotalLbl.setText(pTotalStr);
    }//GEN-LAST:event_partsTableMouseClicked

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        pBill = billTxt.getText();
        
        String sql = "DELETE  FROM `managepartst` WHERE `BillNo`='" + pBill + "'";
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
                    PartsQuantityTableload();
      


    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        int r = JOptionPane.showConfirmDialog(rootPane, "Do you really want to update..?");
        if (r == 0) {
            pBill = billTxt.getText();
            sID = SupIDTxtjTextPane1.getText();
            pId = PIDTxt.getText();
            pName = PNameTxt.getText();
            uPrice = Double.parseDouble(PPriceTx.getText());
            pDiscount = Double.parseDouble(PdisTxt.getText());
            pQuantity = Integer.parseInt(PQuantityTxt.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
            gDate = sdf.format(jDateChooser1.getDate());
            //Calcuate discounted Unti price
            discountedUnitPrice = (uPrice - ((uPrice * pDiscount) / 100));
            DiscountedUnitPriceLbl.setText(discountedUnitPrice + "");
            pTotal = discountedUnitPrice * pQuantity;
            pTotalLbl.setText(pTotal + "");

            String sql = "UPDATE `managepartst` SET `BillNo`='" + pBill + "',`SupplierID`='" + sID + "',`ProductID`='" + pId + "',`ProductName`='" + pName + "',`addDate`='" + gDate + "',`UnitPrice`='" + uPrice + "',`Discount`='" + pDiscount + "',`Quantity`='" + pQuantity + "',`DiscountedPrice`='" + discountedUnitPrice + "',`Total`='" + pTotal + "'  WHERE `BillNo`='" + pBill + "'";
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
            PartsQuantityTableload();

        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        billTxt.setText("");

        PIDTxt.setText("");
        PNameTxt.setText("");
        PPriceTx.setText("");
        PdisTxt.setText("");
        PQuantityTxt.setText("");
        DiscountedUnitPriceLbl.setText("");
        pTotalLbl.setText("");

    }//GEN-LAST:event_jPanel1MouseClicked

    private void SupIDcomboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupIDcomboBoxMouseClicked
        // TODO add your handling code here:
        

    }//GEN-LAST:event_SupIDcomboBoxMouseClicked

    private void SupIDcomboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupIDcomboBoxActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_SupIDcomboBoxActionPerformed

    private void PQuantityTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PQuantityTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PQuantityTxtActionPerformed

    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        // TODO add your handling code here:
        String item = SupIDcomboBox.getSelectedItem().toString();
        SupIDTxtjTextPane1.setText(item);
        String n = SupIDcomboBox.getSelectedItem().toString();
        String sql = "SELECT `SupBName` FROM `suppliert` WHERE `SupID` = '" + n + "'";
        try {

            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();
            while (rs.next()) {

                BnameTextPane1.setText(rs.getString(1));
                //JOptionPane.showMessageDialog(rootPane, rs.getInt(1));

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_loadActionPerformed

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
            java.util.logging.Logger.getLogger(SpareParts.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpareParts.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpareParts.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpareParts.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SpareParts().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(SpareParts.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane BnameTextPane1;
    private javax.swing.JLabel DiscountedUnitPriceLbl;
    private javax.swing.JTextField PIDTxt;
    private javax.swing.JTextField PNameTxt;
    private javax.swing.JTextField PPriceTx;
    private javax.swing.JTextField PQuantityTxt;
    private javax.swing.JTextField PdisTxt;
    private javax.swing.JButton SaveExitBtn;
    private javax.swing.JTextPane SupIDTxtjTextPane1;
    private javax.swing.JComboBox<String> SupIDcomboBox;
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField billTxt;
    private javax.swing.JButton calculateBtn;
    private javax.swing.JButton deleteBtn;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton load;
    private javax.swing.JLabel pTotalLbl;
    private javax.swing.JTable partsQuantityTable;
    private javax.swing.JTable partsTable;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
