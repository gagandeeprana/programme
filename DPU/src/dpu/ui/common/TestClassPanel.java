/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpu.ui.common;

import dpu.ui.helper.common.ClassUIHelper;

/**
 *
 * @author gagandeep.rana
 */
public class TestClassPanel extends javax.swing.JPanel {

    /**
     * Creates new form TestClassPanel
     */
    ClassUIHelper classUIHelper = null;

    public TestClassPanel() {
        initComponents();
        classUIHelper = new ClassUIHelper();
        classUIHelper.generateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddManageClass = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtClassSearch = new javax.swing.JTextField();
        btnClearManageClass = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblClass = new javax.swing.JTable();

        btnAddManageClass.setText("+");
        btnAddManageClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddManageClassActionPerformed(evt);
            }
        });

        jLabel2.setText("Search");

        txtClassSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClassSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClassSearchKeyTyped(evt);
            }
        });

        btnClearManageClass.setText("Clear");
        btnClearManageClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearManageClassActionPerformed(evt);
            }
        });

        tblClass.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblClass);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddManageClass)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClassSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClearManageClass))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddManageClass)
                    .addComponent(jLabel2)
                    .addComponent(btnClearManageClass)
                    .addComponent(txtClassSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddManageClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddManageClassActionPerformed
        classUIHelper.disable(false);
        AddClassFrame addClassFrame = new AddClassFrame();
        addClassFrame.setVisible(true);
    }//GEN-LAST:event_btnAddManageClassActionPerformed

    private void txtClassSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClassSearchKeyReleased
        classUIHelper.generateTable();
    }//GEN-LAST:event_txtClassSearchKeyReleased

    private void txtClassSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClassSearchKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClassSearchKeyTyped

    private void btnClearManageClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearManageClassActionPerformed
        txtClassSearch.setText("");
        classUIHelper.generateTable();
    }//GEN-LAST:event_btnClearManageClassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAddManageClass;
    public static javax.swing.JButton btnClearManageClass;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTable tblClass;
    public static javax.swing.JTextField txtClassSearch;
    // End of variables declaration//GEN-END:variables
}
