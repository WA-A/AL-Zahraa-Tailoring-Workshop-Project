/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tailoring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TestEnv
 */
public class shirttable extends javax.swing.JFrame {

    /**
     * Creates new form shirttable
     */
    public shirttable() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabledataemp = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabledataemp1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Shirts");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(17, 17, 17))
        );

        tabledataemp.setAutoCreateRowSorter(true);
        tabledataemp.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        tabledataemp.setForeground(new java.awt.Color(0, 102, 102));
        tabledataemp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Model type", "Cost"
            }
        ));
        tabledataemp.setCellSelectionEnabled(true);
        tabledataemp.setDoubleBuffered(true);
        tabledataemp.setDragEnabled(true);
        tabledataemp.setFillsViewportHeight(true);
        tabledataemp.setFocusCycleRoot(true);
        tabledataemp.setFocusTraversalPolicyProvider(true);
        tabledataemp.setInheritsPopupMenu(true);
        tabledataemp.setRowHeight(40);
        tabledataemp.setShowGrid(true);
        tabledataemp.setSurrendersFocusOnKeystroke(true);
        tabledataemp.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tabledataempMouseMoved(evt);
            }
        });
        jScrollPane1.setViewportView(tabledataemp);

        jButton3.setBackground(new java.awt.Color(255, 153, 153));
        jButton3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 102));
        jButton3.setText("Return");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        tabledataemp1.setAutoCreateRowSorter(true);
        tabledataemp1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        tabledataemp1.setForeground(new java.awt.Color(0, 102, 102));
        tabledataemp1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Model type", "Size"
            }
        ));
        tabledataemp1.setCellSelectionEnabled(true);
        tabledataemp1.setDoubleBuffered(true);
        tabledataemp1.setDragEnabled(true);
        tabledataemp1.setFillsViewportHeight(true);
        tabledataemp1.setFocusCycleRoot(true);
        tabledataemp1.setFocusTraversalPolicyProvider(true);
        tabledataemp1.setInheritsPopupMenu(true);
        tabledataemp1.setRowHeight(40);
        tabledataemp1.setShowGrid(true);
        tabledataemp1.setSurrendersFocusOnKeystroke(true);
        tabledataemp1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tabledataemp1MouseMoved(evt);
            }
        });
        jScrollPane2.setViewportView(tabledataemp1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(437, 437, 437)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
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

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
       productframe lgf = new  productframe();
        
        lgf.setVisible(true);
       
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void tabledataempMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabledataempMouseMoved
        DefaultTableModel model = (DefaultTableModel)tabledataemp.getModel();
     model.setRowCount(0);
     try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      String url ="jdbc:oracle:thin:@localhost:1521:xe";
      Connection con=DriverManager.getConnection(url,"c##batool","654321");
      String colhead[]={"MODEL_TYPE","COST"};
      model.setColumnIdentifiers(colhead);
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("select * from SHIRTS");
      ResultSetMetaData rsmd = rs.getMetaData();
      int cols = rsmd.getColumnCount();
      while(rs.next()){
          
          Object []obj = new Object[cols];
          for(int i=0;i<cols;i++){
          obj[i] = rs.getObject(i+1);
          }
          model.addRow(obj);
      
      }
      
     }
     catch(Exception ex)
     {
    
     
      JOptionPane.showMessageDialog(null,ex.toString());
     
     }
    }//GEN-LAST:event_tabledataempMouseMoved

    private void tabledataemp1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabledataemp1MouseMoved
        DefaultTableModel model = (DefaultTableModel)tabledataemp1.getModel();
     model.setRowCount(0);
     try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      String url ="jdbc:oracle:thin:@localhost:1521:xe";
      Connection con=DriverManager.getConnection(url,"c##batool","654321");
      String colhead[]={"MODEL_TYPE","SIZES"};
      model.setColumnIdentifiers(colhead);
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("select * from SHIRT_SIZE");
      ResultSetMetaData rsmd = rs.getMetaData();
      int cols = rsmd.getColumnCount();
      while(rs.next()){
          
          Object []obj = new Object[cols];
          for(int i=0;i<cols;i++){
          obj[i] = rs.getObject(i+1);
          }
          model.addRow(obj);
      
      }
      
     }
     catch(Exception ex)
     {
    
     
      JOptionPane.showMessageDialog(null,ex.toString());
     
     }
    }//GEN-LAST:event_tabledataemp1MouseMoved

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
            java.util.logging.Logger.getLogger(shirttable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(shirttable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(shirttable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(shirttable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new shirttable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabledataemp;
    private javax.swing.JTable tabledataemp1;
    // End of variables declaration//GEN-END:variables
}