/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.AddItems;
import Model.DeleteItem;
import Model.GetMedicine;
import Model.UpdateItems;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Medicince extends javax.swing.JFrame {

    /**
     * 
     */
    public Medicince() {
        initComponents();
        //Connect();
        Load();
        Loadeq();
        Loadhp();
    }
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    /*public void Connect(){
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost/pharmacy","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Medicince.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Medicince.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }*/
    
    public void Load(){
        try {
            
            rs = new GetMedicine().getMedicine();
            
            DefaultTableModel d=(DefaultTableModel)jTable1.getModel();
            d.setRowCount(0);
            
            while(rs.next()){
                Vector v2 = new Vector();
    
                v2.add(rs.getString("ItamNumber"));
                v2.add(rs.getString("ItamName"));
                v2.add(rs.getString("qty"));
                v2.add(rs.getString("status"));
                v2.add(rs.getString("onePrice"));
                d.addRow(v2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Medicince.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
            
    public void Loadeq(){
        
        try {
            rs = new GetMedicine().getEquipment();
            
            
            
            DefaultTableModel d=(DefaultTableModel)jTable2.getModel();
            d.setRowCount(0);
            
            while(rs.next()){
                Vector v2 = new Vector();
                
                v2.add(rs.getString("ItamID"));
                v2.add(rs.getString("ItamName"));
                v2.add(rs.getString("qty"));
                v2.add(rs.getString("Status"));
                v2.add(rs.getString("onePrice"));
                
                d.addRow(v2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Medicince.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void Loadhp(){
        try {
            
            rs = new GetMedicine().getHealthyProducts();
            
            DefaultTableModel d=(DefaultTableModel)jTable3.getModel();
            d.setRowCount(0);
            
            while(rs.next()){
                Vector v2 = new Vector();

                v2.add(rs.getString("ItamID"));
                v2.add(rs.getString("ItamName"));
                v2.add(rs.getString("qty"));
                v2.add(rs.getString("Status"));
                v2.add(rs.getString("onePrice"));
                d.addRow(v2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Medicince.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtqty = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        goback = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtstatus = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnameME = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtqtyME = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtstatusME = new javax.swing.JComboBox<>();
        add1ME = new javax.swing.JButton();
        update1ME = new javax.swing.JButton();
        deleteME = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txtnamehp = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtqtyhp = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtstatushp = new javax.swing.JComboBox<>();
        addhp = new javax.swing.JButton();
        updatehp = new javax.swing.JButton();
        deletehp = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtonpc = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt2pc = new javax.swing.JTextField();
        txt3pc = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(207, 247, 247));
        jPanel1.setToolTipText("");

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Medicine");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Itam name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Quantity");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Item status");

        txtname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtqty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        goback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        goback.setText("GO BACK");
        goback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobackActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Itam Number", "Item Name", "Qty", "Item status", "One price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        txtstatus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Disactive" }));

        jPanel6.setBackground(new java.awt.Color(0, 153, 204));

        jLabel7.setBackground(new java.awt.Color(0, 153, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Medical Equipment");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Itam name");

        txtnameME.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Quantity");

        txtqtyME.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Item status");

        txtstatusME.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtstatusME.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Disactive" }));

        add1ME.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add1ME.setText("ADD");
        add1ME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1MEActionPerformed(evt);
            }
        });

        update1ME.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update1ME.setText("UPDATE");
        update1ME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1MEActionPerformed(evt);
            }
        });

        deleteME.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteME.setText("DELETE");
        deleteME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMEActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Itam ID", "Itam Name", "Qty", "Status", "One price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel7.setBackground(new java.awt.Color(0, 153, 204));

        jLabel11.setBackground(new java.awt.Color(0, 153, 204));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Helthy products");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Itam ID", "Itam Name", "Qty", "Status", "one price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Itam name");

        txtnamehp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Quantity");

        txtqtyhp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Item status");

        txtstatushp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtstatushp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Disactive" }));

        addhp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addhp.setText("ADD");
        addhp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addhpActionPerformed(evt);
            }
        });

        updatehp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updatehp.setText("UPDATE");
        updatehp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatehpActionPerformed(evt);
            }
        });

        deletehp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletehp.setText("DELETE");
        deletehp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletehpActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("One price");

        txtonpc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("One price");

        txt2pc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txt3pc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("One price");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add1ME, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addhp, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(goback)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtqtyME)
                                    .addComponent(txtname)
                                    .addComponent(txtqty)
                                    .addComponent(txtstatus, 0, 189, Short.MAX_VALUE)
                                    .addComponent(txtstatusME, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtnameME)
                                    .addComponent(txtonpc, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt2pc)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(update1ME, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(deleteME, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(updatehp, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(deletehp, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt3pc, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtnamehp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(txtqtyhp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(txtstatushp, javax.swing.GroupLayout.Alignment.TRAILING, 0, 186, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goback, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtonpc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(add1ME, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(update1ME, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deleteME, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtnameME, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtqtyME, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtstatusME, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt2pc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtnamehp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtqtyhp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtstatushp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt3pc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addhp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updatehp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletehp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
    String iname = txtname.getText();
    String qty = txtqty.getText();
    String status = txtstatus.getSelectedItem().toString();
    String onePrice = txtonpc.getText();
    
    

    try {

        new AddItems().addMedicine(iname, qty, status, onePrice);
        JOptionPane.showMessageDialog(this, "Item is Added");
        txtname.setText("");
        txtqty.setText("");
        txtstatus.setSelectedIndex(-1);
        txtname.requestFocus();
        txtonpc.setText("");
        Load();
        
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error");
    }
    }//GEN-LAST:event_addActionPerformed

    private void gobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobackActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_gobackActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel d1=(DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
        
        int id= Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
            txtname.setText(d1.getValueAt(selectIndex, 1).toString());
            txtqty.setText(d1.getValueAt(selectIndex, 2).toString());
            txtstatus.setSelectedItem(d1.getValueAt(selectIndex, 3).toString());
            txtonpc.setText(d1.getValueAt(selectIndex, 4).toString());
            
            add.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
    DefaultTableModel d1 = (DefaultTableModel) jTable1.getModel();
    int selectIndex = jTable1.getSelectedRow();
    
    int ItamNumber = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());  
    
    String iname = txtname.getText();
    String qty = txtqty.getText();
    String status = txtstatus.getSelectedItem().toString();
    String onePrice=txtonpc.getText();

    try {
        
        new UpdateItems().updateMedicine(ItamNumber, iname, qty, status, onePrice);
   

         JOptionPane.showMessageDialog(this, "Item is Updated");
            txtname.setText("");
            txtqty.setText("");
            txtonpc.setText("");
            txtstatus.setSelectedIndex(-1);
            txtname.requestFocus();

            Load();
            
            add.setEnabled(true);
    }catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error");
    }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
     DefaultTableModel d1 = (DefaultTableModel) jTable1.getModel();
    int selectIndex = jTable1.getSelectedRow();
    
    int ItamNumber = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());  

    try {
        // Use correct column name for deletion
        
        new DeleteItem().deleteMedicine(ItamNumber);
        
        JOptionPane.showMessageDialog(this, "Item is Deleted");
        txtname.setText("");
        txtqty.setText("");
        txtstatus.setSelectedIndex(-1);
        txtname.requestFocus();
        txtonpc.setText("");
        Load();
            
        add.setEnabled(true);
        
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error");
    }
    }//GEN-LAST:event_deleteActionPerformed

    private void add1MEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1MEActionPerformed
       
        String iname = txtnameME.getText();
        String qty = txtqtyME.getText();
        String status = txtstatusME.getSelectedItem().toString();
        String onePrice = txt2pc.getText();
    
    

    try {
        // Use correct column names without spaces
        new AddItems().addEquipment(iname, qty, status, onePrice);

            JOptionPane.showMessageDialog(this, "Item is Added");
            txtnameME.setText("");
            txtqtyME.setText("");
            txt2pc.setText("");
            txtstatusME.setSelectedIndex(-1);
            txtnameME.requestFocus();
            Loadeq();
        
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error");
    }
        
    }//GEN-LAST:event_add1MEActionPerformed

    private void update1MEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1MEActionPerformed
        // TODO add your handling code here:
         DefaultTableModel d1 = (DefaultTableModel) jTable2.getModel();
    int selectIndex = jTable2.getSelectedRow();
    
    int ItamID = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());  
    
    String iname = txtnameME.getText();
    String qty = txtqtyME.getText();
    String status = txtstatusME.getSelectedItem().toString();
    String onePrice = txt2pc.getText();

    try {
        
        new UpdateItems().updateEquipment(ItamID, iname, qty, status, onePrice);

            JOptionPane.showMessageDialog(this, "Item is Updated");
            txtnameME.setText("");
            txtqtyME.setText("");
            txt2pc.setText("");
            txtstatusME.setSelectedIndex(-1);
            txtnameME.requestFocus();
            
            Loadeq();
            
            add.setEnabled(true);
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error");
    }
        
    }//GEN-LAST:event_update1MEActionPerformed

    private void deleteMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMEActionPerformed
        // TODO add your handling code here:
           
     DefaultTableModel d1 = (DefaultTableModel) jTable2.getModel();
    int selectIndex = jTable2.getSelectedRow();
    
    int ItamID = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());  

    try {
        // Use correct column name for deletion
        new DeleteItem().deleteEquipment(ItamID);

            JOptionPane.showMessageDialog(this, "Item is Deleted");
            txtnameME.setText("");
            txtqtyME.setText("");
            txt2pc.setText("");
            txtstatusME.setSelectedIndex(-1);
            txtnameME.requestFocus();
            
            Loadeq();
            
            add.setEnabled(true);
        
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error");
    }
        
    }//GEN-LAST:event_deleteMEActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        
        DefaultTableModel d1=(DefaultTableModel)jTable2.getModel();
        int selectIndex = jTable2.getSelectedRow();
        
        int id= Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
            txtnameME.setText(d1.getValueAt(selectIndex, 1).toString());
            txtqtyME.setText(d1.getValueAt(selectIndex, 2).toString());
            txtstatusME.setSelectedItem(d1.getValueAt(selectIndex, 3).toString());
             txt2pc.setText(d1.getValueAt(selectIndex, 4).toString());
            
            add.setEnabled(false);
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        
         DefaultTableModel d1=(DefaultTableModel)jTable3.getModel();
        int selectIndex = jTable3.getSelectedRow();
        
        int id= Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
            txtnamehp.setText(d1.getValueAt(selectIndex, 1).toString());
            txtqtyhp.setText(d1.getValueAt(selectIndex, 2).toString());
            txtstatushp.setSelectedItem(d1.getValueAt(selectIndex, 3).toString());
            txt3pc.setText(d1.getValueAt(selectIndex, 4).toString());
            
            add.setEnabled(false);
        
    }//GEN-LAST:event_jTable3MouseClicked

    private void addhpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addhpActionPerformed
        
        String iname = txtnamehp.getText();
        String qty = txtqtyhp.getText();
        String status = txtstatushp.getSelectedItem().toString();
        String onePrice = txt3pc.getText();

    try {
        // Use correct column names without spaces
        new AddItems().addHealthyProducts(iname, qty, status, onePrice);

            JOptionPane.showMessageDialog(this, "Item is Added");
            txtnamehp.setText("");
            txtqtyhp.setText("");
            txt3pc.setText("");
            txtstatushp.setSelectedIndex(-1);
            txtnamehp.requestFocus();
            Loadhp();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error");
    }
        
    }//GEN-LAST:event_addhpActionPerformed

    private void updatehpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatehpActionPerformed
       
    DefaultTableModel d1 = (DefaultTableModel) jTable3.getModel();
    int selectIndex = jTable3.getSelectedRow();
    
    int ItamID = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());  
    
    String iname = txtnamehp.getText();
    String qty = txtqtyhp.getText();
    String status = txtstatushp.getSelectedItem().toString();
    String onePrice = txt3pc.getText();

    try {
        
        new UpdateItems().updateHealthyProducts(ItamID, iname, qty, status, onePrice);

            JOptionPane.showMessageDialog(this, "Item is Updated");
            txtnamehp.setText("");
            txtqtyhp.setText("");
            txt3pc.setText("");
            txtstatushp.setSelectedIndex(-1);
            txtnamehp.requestFocus();
            
            Loadhp();
            
            add.setEnabled(true);
        
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error");
    }
        
    }//GEN-LAST:event_updatehpActionPerformed

    private void deletehpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletehpActionPerformed
        // TODO add your handling code here:
         DefaultTableModel d1 = (DefaultTableModel) jTable3.getModel();
    int selectIndex = jTable3.getSelectedRow();
    
    int ItamID = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());  

    try {
        // Use correct column name for deletion
        new DeleteItem().deleteHealthyProducts(ItamID);

            JOptionPane.showMessageDialog(this, "Item is Deleted");
            txtnamehp.setText("");
            txtqtyhp.setText("");
            txt3pc.setText("");
            txtstatushp.setSelectedIndex(-1);
            txtnamehp.requestFocus();
            Loadhp();
            
            add.setEnabled(true);
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error");
    }
        
    }//GEN-LAST:event_deletehpActionPerformed

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
            java.util.logging.Logger.getLogger(Medicince.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medicince.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medicince.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medicince.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medicince().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton add1ME;
    private javax.swing.JButton addhp;
    private javax.swing.JButton delete;
    private javax.swing.JButton deleteME;
    private javax.swing.JButton deletehp;
    private javax.swing.JButton goback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField txt2pc;
    private javax.swing.JTextField txt3pc;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnameME;
    private javax.swing.JTextField txtnamehp;
    private javax.swing.JTextField txtonpc;
    private javax.swing.JTextField txtqty;
    private javax.swing.JTextField txtqtyME;
    private javax.swing.JTextField txtqtyhp;
    private javax.swing.JComboBox<String> txtstatus;
    private javax.swing.JComboBox<String> txtstatusME;
    private javax.swing.JComboBox<String> txtstatushp;
    private javax.swing.JButton update;
    private javax.swing.JButton update1ME;
    private javax.swing.JButton updatehp;
    // End of variables declaration//GEN-END:variables
}
