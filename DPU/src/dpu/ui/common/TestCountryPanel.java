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
public class TestCountryPanel extends javax.swing.JPanel {

    /**
     * Creates new form TestCountryPanel
     */
    public TestCountryPanel() {
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

        btnAddManageCountry = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtCountrySearch = new javax.swing.JTextField();
        btnClearManageCountry = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblCountry = new javax.swing.JTable();

        btnAddManageCountry.setText("+");
        btnAddManageCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddManageCountryActionPerformed(evt);
            }
        });

        jLabel12.setText("Search");

        txtCountrySearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCountrySearchActionPerformed(evt);
            }
        });
        txtCountrySearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCountrySearchKeyReleased(evt);
            }
        });

        btnClearManageCountry.setText("Clear");
        btnClearManageCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearManageCountryActionPerformed(evt);
            }
        });

        tblCountry.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane11.setViewportView(tblCountry);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddManageCountry)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCountrySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClearManageCountry)))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCountrySearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearManageCountry)
                    .addComponent(btnAddManageCountry))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddManageCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddManageCountryActionPerformed
        // TODO add your handling code here:
//        countryUIHelper.disable(false);
//        AddCountryFrame addCountryFrame = new AddCountryFrame();
//        addCountryFrame.setVisible(true);
    }//GEN-LAST:event_btnAddManageCountryActionPerformed

    private void txtCountrySearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCountrySearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountrySearchActionPerformed

    private void txtCountrySearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCountrySearchKeyReleased
//        countryUIHelper.generateTable();
    }//GEN-LAST:event_txtCountrySearchKeyReleased

    private void btnClearManageCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearManageCountryActionPerformed
//        txtCountrySearch.setText("");
//        countryUIHelper.generateTable();
    }//GEN-LAST:event_btnClearManageCountryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAddManageCountry;
    public static javax.swing.JButton btnClearManageCountry;
    private javax.swing.JLabel jLabel12;
    public static javax.swing.JScrollPane jScrollPane11;
    public static javax.swing.JTable tblCountry;
    public static javax.swing.JTextField txtCountrySearch;
    // End of variables declaration//GEN-END:variables
}
