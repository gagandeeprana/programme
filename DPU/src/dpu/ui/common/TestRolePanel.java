/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpu.ui.common;

/**
 *
 * @author gagandeep.rana
 */
public class TestRolePanel extends javax.swing.JPanel {

    /**
     * Creates new form TestRolePanel
     */
    public TestRolePanel() {
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

        btnAddManageRole = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtRoleSearch = new javax.swing.JTextField();
        btnClearManageRole = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblRole = new javax.swing.JTable();

        btnAddManageRole.setText("+");
        btnAddManageRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddManageRoleActionPerformed(evt);
            }
        });

        jLabel5.setText("Search");

        txtRoleSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRoleSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRoleSearchKeyTyped(evt);
            }
        });

        btnClearManageRole.setText("Clear");
        btnClearManageRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearManageRoleActionPerformed(evt);
            }
        });

        tblRole.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(tblRole);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddManageRole)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRoleSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClearManageRole))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddManageRole)
                    .addComponent(jLabel5)
                    .addComponent(btnClearManageRole)
                    .addComponent(txtRoleSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddManageRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddManageRoleActionPerformed
//        roleUI.disable(false);
//        AddRoleFrame addRoleFrame = new AddRoleFrame();
//        addRoleFrame.setVisible(true);
    }//GEN-LAST:event_btnAddManageRoleActionPerformed

    private void txtRoleSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRoleSearchKeyReleased
//        roleUI.generateTable();
    }//GEN-LAST:event_txtRoleSearchKeyReleased

    private void txtRoleSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRoleSearchKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoleSearchKeyTyped

    private void btnClearManageRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearManageRoleActionPerformed
//        txtRoleSearch.setText("");
//        roleUI.generateTable();
    }//GEN-LAST:event_btnClearManageRoleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAddManageRole;
    public static javax.swing.JButton btnClearManageRole;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JScrollPane jScrollPane6;
    public static javax.swing.JTable tblRole;
    public static javax.swing.JTextField txtRoleSearch;
    // End of variables declaration//GEN-END:variables
}
