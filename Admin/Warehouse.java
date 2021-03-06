package Admin;

import Admin.AdminPage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fatih
 */
public class Warehouse extends javax.swing.JFrame {
   

    /**
     * Creates new form GUIShow
     */
    public Warehouse() {
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

        ScrollPanel = new javax.swing.JScrollPane();
        WarehouseTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        iconWarehouse = new javax.swing.JLabel();
        LabelWarehouse = new javax.swing.JLabel();
        BackPage = new javax.swing.JButton();
        ChooseFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setSize(new java.awt.Dimension(500, 450));

        WarehouseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Jenis", "Detail", "Date"
            }
        ));
        ScrollPanel.setViewportView(WarehouseTable);
        if (WarehouseTable.getColumnModel().getColumnCount() > 0) {
            WarehouseTable.getColumnModel().getColumn(0).setMinWidth(80);
            WarehouseTable.getColumnModel().getColumn(0).setMaxWidth(80);
            WarehouseTable.getColumnModel().getColumn(1).setMaxWidth(100);
            WarehouseTable.getColumnModel().getColumn(2).setMinWidth(100);
            WarehouseTable.getColumnModel().getColumn(2).setMaxWidth(100);
            WarehouseTable.getColumnModel().getColumn(3).setMaxWidth(200);
            WarehouseTable.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        iconWarehouse.setIcon(new javax.swing.ImageIcon("D:\\belajar\\GUIDemo\\src\\asset\\data.png")); // NOI18N

        LabelWarehouse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelWarehouse.setText("Warehouse");

        BackPage.setText("Back");
        BackPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackPageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(iconWarehouse)
                .addGap(144, 144, 144)
                .addComponent(LabelWarehouse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackPage)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelWarehouse)
                        .addComponent(BackPage))
                    .addComponent(iconWarehouse))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ChooseFile.setText("Choose File");
        ChooseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(ChooseFile, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(ChooseFile)
                .addGap(18, 18, 18)
                .addComponent(ScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackPageActionPerformed
        // TODO add your handling code here:
        dispose();
        AdminPage backPage = new AdminPage();
        backPage.setVisible(true);
    }//GEN-LAST:event_BackPageActionPerformed

    private void ChooseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseFileActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify to open");
        int userSelection = fileChooser.showSaveDialog(this);
        if(userSelection == JFileChooser.APPROVE_OPTION){
        File fileToOpen = fileChooser.getSelectedFile();
        
        try{
            FileReader filereader = new FileReader(fileToOpen);
             BufferedReader bufferedReader = new BufferedReader(filereader);
             
             DefaultTableModel model = (DefaultTableModel)WarehouseTable.getModel();
             Object[] tableLine = bufferedReader.lines().toArray();
             
            for (Object tableLine1 : tableLine) {
                String[] dataRow = tableLine1.toString().split(" ");
                model.addRow(dataRow);
            }
        }catch(IOException e){
             JOptionPane.showMessageDialog(this, "ERROR","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
        }
       }
    }//GEN-LAST:event_ChooseFileActionPerformed

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
            java.util.logging.Logger.getLogger(Warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Warehouse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackPage;
    private javax.swing.JButton ChooseFile;
    private javax.swing.JLabel LabelWarehouse;
    private javax.swing.JScrollPane ScrollPanel;
    private javax.swing.JTable WarehouseTable;
    private javax.swing.JLabel iconWarehouse;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
