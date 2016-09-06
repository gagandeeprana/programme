/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpu.ui.common;

import dpu.ui.common.helper.EquipmentUIHelper;

/**
 *
 * @author gagandeep.rana
 */
public class TestEquipmentPanel extends javax.swing.JPanel {

    /**
     * Creates new form TestEquipmentPanel
     */
    EquipmentUIHelper equipmentUI = null;

    public TestEquipmentPanel() {
        initComponents();
        equipmentUI = new EquipmentUIHelper();
        equipmentUI.generateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddManageEquipment = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtEquipmentSearch = new javax.swing.JTextField();
        btnClearManageEquipment = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblEquipment = new javax.swing.JTable();

        btnAddManageEquipment.setText("+");
        btnAddManageEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddManageEquipmentActionPerformed(evt);
            }
        });

        jLabel4.setText("Search");

        txtEquipmentSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEquipmentSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEquipmentSearchKeyTyped(evt);
            }
        });

        btnClearManageEquipment.setText("Clear");
        btnClearManageEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearManageEquipmentActionPerformed(evt);
            }
        });

        tblEquipment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Title"
            }
        ));
        jScrollPane5.setViewportView(tblEquipment);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddManageEquipment)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEquipmentSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClearManageEquipment))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddManageEquipment)
                    .addComponent(jLabel4)
                    .addComponent(btnClearManageEquipment)
                    .addComponent(txtEquipmentSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddManageEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddManageEquipmentActionPerformed
        equipmentUI.disable(false);
        AddEquipmentFrame addEquipmentFrame = new AddEquipmentFrame();
        addEquipmentFrame.setVisible(true);
    }//GEN-LAST:event_btnAddManageEquipmentActionPerformed

    private void txtEquipmentSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEquipmentSearchKeyReleased
        equipmentUI.generateTable();
    }//GEN-LAST:event_txtEquipmentSearchKeyReleased

    private void txtEquipmentSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEquipmentSearchKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEquipmentSearchKeyTyped

    private void btnClearManageEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearManageEquipmentActionPerformed
        txtEquipmentSearch.setText("");
        equipmentUI.generateTable();
    }//GEN-LAST:event_btnClearManageEquipmentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAddManageEquipment;
    public static javax.swing.JButton btnClearManageEquipment;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JScrollPane jScrollPane5;
    public static javax.swing.JTable tblEquipment;
    public static javax.swing.JTextField txtEquipmentSearch;
    // End of variables declaration//GEN-END:variables
}
