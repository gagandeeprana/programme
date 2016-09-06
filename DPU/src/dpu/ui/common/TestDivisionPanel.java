/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpu.ui.common;

import dpu.ui.common.helper.DivisionUIHelper;

/**
 *
 * @author gagandeep.rana
 */
public class TestDivisionPanel extends javax.swing.JPanel {

    /**
     * Creates new form TestDivisionPanel
     */
    DivisionUIHelper divisionUI = null;

    public TestDivisionPanel() {
        initComponents();
        divisionUI = new DivisionUIHelper();
        divisionUI.generateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddManageDivision = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtDivisionSearch = new javax.swing.JTextField();
        btnClearManageDivision = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDivision = new javax.swing.JTable();

        btnAddManageDivision.setText("+");
        btnAddManageDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddManageDivisionActionPerformed(evt);
            }
        });

        jLabel8.setText("Search");

        txtDivisionSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDivisionSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDivisionSearchKeyTyped(evt);
            }
        });

        btnClearManageDivision.setText("Clear");
        btnClearManageDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearManageDivisionActionPerformed(evt);
            }
        });

        tblDivision.setAutoCreateRowSorter(true);
        tblDivision.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Division Id", "Title"
            }
        ));
        tblDivision.setRowHeight(18);
        jScrollPane2.setViewportView(tblDivision);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddManageDivision)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDivisionSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClearManageDivision)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDivisionSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(btnClearManageDivision)
                    .addComponent(btnAddManageDivision))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddManageDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddManageDivisionActionPerformed
        divisionUI.disable(false);
        AddDivisionFrame addDivisionFrame = new AddDivisionFrame();
        addDivisionFrame.setVisible(true);
    }//GEN-LAST:event_btnAddManageDivisionActionPerformed

    private void txtDivisionSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDivisionSearchKeyReleased
        divisionUI.generateTable();
    }//GEN-LAST:event_txtDivisionSearchKeyReleased

    private void txtDivisionSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDivisionSearchKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDivisionSearchKeyTyped

    private void btnClearManageDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearManageDivisionActionPerformed
        txtDivisionSearch.setText("");
        divisionUI.generateTable();
    }//GEN-LAST:event_btnClearManageDivisionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAddManageDivision;
    public static javax.swing.JButton btnClearManageDivision;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tblDivision;
    public static javax.swing.JTextField txtDivisionSearch;
    // End of variables declaration//GEN-END:variables
}
