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
public class TestCompanyPanel extends javax.swing.JPanel {

    /**
     * Creates new form TestCompanyPanel
     */
    public TestCompanyPanel() {
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

        btnAddManageCompany = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCompanySearch = new javax.swing.JTextField();
        btnClearManageCompany = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCompany = new javax.swing.JTable();

        btnAddManageCompany.setText("+");
        btnAddManageCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddManageCompanyActionPerformed(evt);
            }
        });

        jLabel3.setText("Search");

        txtCompanySearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCompanySearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCompanySearchKeyTyped(evt);
            }
        });

        btnClearManageCompany.setText("Clear");
        btnClearManageCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearManageCompanyActionPerformed(evt);
            }
        });

        tblCompany.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tblCompany);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddManageCompany)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCompanySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClearManageCompany))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddManageCompany)
                    .addComponent(jLabel3)
                    .addComponent(btnClearManageCompany)
                    .addComponent(txtCompanySearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddManageCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddManageCompanyActionPerformed
        // TODO add your handling code here:
//        companyUI.disable(false);
//        AddCompanyFrame addCompanyFrame = new AddCompanyFrame();
//        addCompanyFrame.setVisible(true);
    }//GEN-LAST:event_btnAddManageCompanyActionPerformed

    private void txtCompanySearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCompanySearchKeyReleased
        // TODO add your handling code here:
//        companyUI.generateTable();
    }//GEN-LAST:event_txtCompanySearchKeyReleased

    private void txtCompanySearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCompanySearchKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompanySearchKeyTyped

    private void btnClearManageCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearManageCompanyActionPerformed
        // TODO add your handling code here:
//        txtCompanySearch.setText("");
//        companyUI.generateTable();
    }//GEN-LAST:event_btnClearManageCompanyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAddManageCompany;
    public static javax.swing.JButton btnClearManageCompany;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JTable tblCompany;
    public static javax.swing.JTextField txtCompanySearch;
    // End of variables declaration//GEN-END:variables
}
