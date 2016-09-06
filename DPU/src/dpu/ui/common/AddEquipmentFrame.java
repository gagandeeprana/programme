/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpu.ui.common;

import dpu.ui.common.helper.EquipmentUIHelper;
import dpu.Validations;
import dpu.beans.admin.EquipmentBean;
import dpu.dao.admin.EquipmentDAO;
import dpu.dao.admin.impl.EquipmentDAOImpl;
import java.util.List;
import javax.swing.JOptionPane;

public class AddEquipmentFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddEquipment
     */
    String msg = "";
    EquipmentUIHelper equipmentUI = null;
    String addUpdateFlag = "";
    EquipmentBean equipmentBean;

    public AddEquipmentFrame() {
        initComponents();
        setLocationRelativeTo(null);
        equipmentUI = new EquipmentUIHelper();
        btnSaveAddEquipment.setEnabled(false);
    }

    public AddEquipmentFrame(EquipmentBean equipmentBean) {
        initComponents();
        equipmentUI = new EquipmentUIHelper();
        this.equipmentBean = equipmentBean;
        setLocationRelativeTo(null);
        addUpdateFlag = "update";
        showRecord(equipmentBean);
        btnSaveAddEquipment.setText("Update");
        btnSaveAddEquipment.setEnabled(true);
    }
    
    private void fillLabel() {
        lblEquipmentIdAddEquipmentFrameValidation.setText(" ");
        lblEquipmentNameAddEquipmentFrameValidation.setText(" ");
    }

    public boolean validateEquipmentId(String str) {
        if (Validations.isEmpty(str)) {
            msg = "Left Empty..!";
            return false;
        }
        if (Validations.hasNumerals(str)) {
            msg = "Only Numerics Allowed..!";
            return false;
        }
        if (Validations.hasSpace(str)) {
            msg = "Space Not Allowed..!";
            return false;
        }
        return true;
    }

    public boolean validateEquipmentName(String str) {
        if (Validations.isEmpty(str)) {
            msg = "Left Empty..!";
            return false;
        }
        if (Validations.hasAlphabets(str)) {
            msg = "Only Alphabets Allowed..!";
            return false;
        }
        if (Validations.hasSpace(str)) {
            msg = "Space Not Allowed..!";
            return false;
        }
        return true;
    }

    public void showRecord(EquipmentBean equipmentBean) {
        txtEquipmentIdAddEquipment.setText(String.valueOf(equipmentBean.getEquipmentId()));
        txtEquipmentNameAddEquipment.setText(equipmentBean.getEquipmentName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtEquipmentIdAddEquipment = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEquipmentNameAddEquipment = new javax.swing.JTextField();
        btnSaveAddEquipment = new javax.swing.JButton();
        btnCancelAddEquipment = new javax.swing.JButton();
        lblEquipmentIdAddEquipmentFrameValidation = new javax.swing.JLabel();
        lblEquipmentNameAddEquipmentFrameValidation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Equipment Id");

        txtEquipmentIdAddEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEquipmentIdAddEquipmentActionPerformed(evt);
            }
        });
        txtEquipmentIdAddEquipment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEquipmentIdAddEquipmentKeyReleased(evt);
            }
        });

        jLabel8.setText("Equipment Name");

        txtEquipmentNameAddEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEquipmentNameAddEquipmentActionPerformed(evt);
            }
        });
        txtEquipmentNameAddEquipment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEquipmentNameAddEquipmentKeyReleased(evt);
            }
        });

        btnSaveAddEquipment.setText("Save");
        btnSaveAddEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAddEquipmentActionPerformed(evt);
            }
        });

        btnCancelAddEquipment.setText("Cancel");
        btnCancelAddEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelAddEquipmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSaveAddEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelAddEquipment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEquipmentNameAddEquipment)
                            .addComponent(txtEquipmentIdAddEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEquipmentIdAddEquipmentFrameValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEquipmentNameAddEquipmentFrameValidation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelAddEquipment, btnSaveAddEquipment});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEquipmentIdAddEquipmentFrameValidation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtEquipmentIdAddEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtEquipmentNameAddEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEquipmentNameAddEquipmentFrameValidation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveAddEquipment)
                    .addComponent(btnCancelAddEquipment))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEquipmentIdAddEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEquipmentIdAddEquipmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEquipmentIdAddEquipmentActionPerformed

    private void btnCancelAddEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelAddEquipmentActionPerformed
        dispose();
        equipmentUI.disable(true);
    }//GEN-LAST:event_btnCancelAddEquipmentActionPerformed

    private void btnSaveAddEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAddEquipmentActionPerformed
        String msg = "";
        if (addUpdateFlag.equals("update")) {
            equipmentBean = new EquipmentBean();
            equipmentBean.setEquipmentId(Integer.parseInt(txtEquipmentIdAddEquipment.getText()));
            equipmentBean.setEquipmentName(txtEquipmentNameAddEquipment.getText());
            msg = equipmentUI.update(equipmentBean);
        } else {
            msg = equipmentUI.save();
        }
        JOptionPane.showMessageDialog(null, msg);
        dispose();
    }//GEN-LAST:event_btnSaveAddEquipmentActionPerformed

    private void txtEquipmentIdAddEquipmentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEquipmentIdAddEquipmentKeyReleased
        EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
        List<EquipmentBean> lstEquipments = equipmentDAO.getAllEquipments("");
        try {
            if (validateEquipmentId(txtEquipmentIdAddEquipment.getText())) {
                lblEquipmentIdAddEquipmentFrameValidation.setText("");
                for (EquipmentBean equipmentBean : lstEquipments) {
                    if (equipmentBean.getEquipmentId() == Integer.parseInt(txtEquipmentIdAddEquipment.getText().trim())) {
                        lblEquipmentIdAddEquipmentFrameValidation.setText("Already Taken");
                        btnSaveAddEquipment.setEnabled(false);
                    }
                }
            } else {
                lblEquipmentIdAddEquipmentFrameValidation.setText(msg);
                btnSaveAddEquipment.setEnabled(false);
            }
            if (lblEquipmentIdAddEquipmentFrameValidation.getText().equals("") && lblEquipmentNameAddEquipmentFrameValidation.getText().equals("")) {
                btnSaveAddEquipment.setEnabled(true);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_txtEquipmentIdAddEquipmentKeyReleased

    private void txtEquipmentNameAddEquipmentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEquipmentNameAddEquipmentKeyReleased
        EquipmentDAO equipmentDAO = new EquipmentDAOImpl();
        List<EquipmentBean> lstEquipments = equipmentDAO.getAllEquipments("");
        try {
            if (validateEquipmentName(txtEquipmentNameAddEquipment.getText())) {
                lblEquipmentNameAddEquipmentFrameValidation.setText("");
                for (EquipmentBean equipmentBean : lstEquipments) {
                    if (equipmentBean.getEquipmentName().equals(txtEquipmentNameAddEquipment.getText().trim())) {
                        lblEquipmentNameAddEquipmentFrameValidation.setText("Already Taken");
                        btnSaveAddEquipment.setEnabled(false);
                    }
                }
            } else {
                lblEquipmentNameAddEquipmentFrameValidation.setText(msg);
                btnSaveAddEquipment.setEnabled(false);
            }
            if (lblEquipmentIdAddEquipmentFrameValidation.getText().equals("") && lblEquipmentNameAddEquipmentFrameValidation.getText().equals("")) {
                btnSaveAddEquipment.setEnabled(true);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_txtEquipmentNameAddEquipmentKeyReleased

    private void txtEquipmentNameAddEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEquipmentNameAddEquipmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEquipmentNameAddEquipmentActionPerformed

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
            java.util.logging.Logger.getLogger(AddEquipmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEquipmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEquipmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEquipmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEquipmentFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnCancelAddEquipment;
    public static javax.swing.JButton btnSaveAddEquipment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblEquipmentIdAddEquipmentFrameValidation;
    private javax.swing.JLabel lblEquipmentNameAddEquipmentFrameValidation;
    public static javax.swing.JTextField txtEquipmentIdAddEquipment;
    public static javax.swing.JTextField txtEquipmentNameAddEquipment;
    // End of variables declaration//GEN-END:variables
}
