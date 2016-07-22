/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpu.ui.common;

import java.awt.Container;
import java.awt.Toolkit;

/**
 *
 * @author gagandeep.rana
 */
public class TestListPanel extends javax.swing.JPanel {

    /**
     * Creates new form TestListPanel
     */
    Container root = null;

    public TestListPanel() {
        initComponents();
        root = listInternalFrame.getContentPane();
        listInternalFrame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listInternalFrame = new javax.swing.JInternalFrame();
        jMenuBar2 = new javax.swing.JMenuBar();
        mnuTerminal = new javax.swing.JMenu();
        mnuDivision = new javax.swing.JMenu();
        mnuZones = new javax.swing.JMenu();
        mnuCategory = new javax.swing.JMenu();
        mnuEquipment = new javax.swing.JMenu();
        mnuStandardCommodities = new javax.swing.JMenu();
        mnuPaymentTerms = new javax.swing.JMenu();
        mnuReasonCodes = new javax.swing.JMenu();
        mnuQuoteStage = new javax.swing.JMenu();
        mnuCountry = new javax.swing.JMenu();

        listInternalFrame.setVisible(true);

        mnuTerminal.setText("Terminal");
        mnuTerminal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuTerminalMouseClicked(evt);
            }
        });
        mnuTerminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTerminalActionPerformed(evt);
            }
        });
        jMenuBar2.add(mnuTerminal);

        mnuDivision.setText("Division");
        mnuDivision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuDivisionMouseClicked(evt);
            }
        });
        jMenuBar2.add(mnuDivision);

        mnuZones.setText("Zones");
        mnuZones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuZonesMouseClicked(evt);
            }
        });
        mnuZones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuZonesActionPerformed(evt);
            }
        });
        jMenuBar2.add(mnuZones);

        mnuCategory.setText("Category");
        mnuCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuCategoryMouseClicked(evt);
            }
        });
        jMenuBar2.add(mnuCategory);

        mnuEquipment.setText("Equipment");
        mnuEquipment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuEquipmentMouseClicked(evt);
            }
        });
        jMenuBar2.add(mnuEquipment);

        mnuStandardCommodities.setText("Standard Commodities");
        mnuStandardCommodities.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuStandardCommoditiesMouseClicked(evt);
            }
        });
        jMenuBar2.add(mnuStandardCommodities);

        mnuPaymentTerms.setText("Payment Terms");
        mnuPaymentTerms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuPaymentTermsMouseClicked(evt);
            }
        });
        jMenuBar2.add(mnuPaymentTerms);

        mnuReasonCodes.setText("Reason Codes");
        jMenuBar2.add(mnuReasonCodes);

        mnuQuoteStage.setText("Quote Stage");
        jMenuBar2.add(mnuQuoteStage);

        mnuCountry.setText("Country");
        mnuCountry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuCountryMouseClicked(evt);
            }
        });
        jMenuBar2.add(mnuCountry);

        listInternalFrame.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout listInternalFrameLayout = new javax.swing.GroupLayout(listInternalFrame.getContentPane());
        listInternalFrame.getContentPane().setLayout(listInternalFrameLayout);
        listInternalFrameLayout.setHorizontalGroup(
            listInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 783, Short.MAX_VALUE)
        );
        listInternalFrameLayout.setVerticalGroup(
            listInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listInternalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listInternalFrame, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mnuTerminalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuTerminalMouseClicked
        root.removeAll();
        root.setVisible(false);
        TestTerminalPanel testTerminalPanel = new TestTerminalPanel();
        testTerminalPanel.setBounds(50, 50, 1100, 700);
        root.add(testTerminalPanel);
        root.setVisible(true);
    }//GEN-LAST:event_mnuTerminalMouseClicked

    private void mnuTerminalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTerminalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuTerminalActionPerformed

    private void mnuDivisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuDivisionMouseClicked
        root.removeAll();
        root.setVisible(false);
        TestDivisionPanel testDivisionPanel = new TestDivisionPanel();
        testDivisionPanel.setBounds(50, 50, 1250, 700);
        root.add(testDivisionPanel);
        root.setVisible(true);
    }//GEN-LAST:event_mnuDivisionMouseClicked

    private void mnuZonesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuZonesMouseClicked
        
    }//GEN-LAST:event_mnuZonesMouseClicked

    private void mnuZonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuZonesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuZonesActionPerformed

    private void mnuCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuCategoryMouseClicked
        
    }//GEN-LAST:event_mnuCategoryMouseClicked

    private void mnuStandardCommoditiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuStandardCommoditiesMouseClicked
        
    }//GEN-LAST:event_mnuStandardCommoditiesMouseClicked

    private void mnuPaymentTermsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuPaymentTermsMouseClicked
       
    }//GEN-LAST:event_mnuPaymentTermsMouseClicked

    private void mnuCountryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuCountryMouseClicked
        root.removeAll();
        root.setVisible(false);
        TestCountryPanel testCountryPanel = new TestCountryPanel();
        testCountryPanel.setBounds(50, 50, 1250, 700);
        root.add(testCountryPanel);
        root.setVisible(true);
    }//GEN-LAST:event_mnuCountryMouseClicked

    private void mnuEquipmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuEquipmentMouseClicked
        root.removeAll();
        root.setVisible(false);
        TestEquipmentPanel testEquipmentPanel = new TestEquipmentPanel();
        testEquipmentPanel.setBounds(50, 50, 1250, 700);
        root.add(testEquipmentPanel);
        root.setVisible(true);
    }//GEN-LAST:event_mnuEquipmentMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JInternalFrame listInternalFrame;
    private javax.swing.JMenu mnuCategory;
    private javax.swing.JMenu mnuCountry;
    private javax.swing.JMenu mnuDivision;
    private javax.swing.JMenu mnuEquipment;
    private javax.swing.JMenu mnuPaymentTerms;
    private javax.swing.JMenu mnuQuoteStage;
    private javax.swing.JMenu mnuReasonCodes;
    private javax.swing.JMenu mnuStandardCommodities;
    private javax.swing.JMenu mnuTerminal;
    private javax.swing.JMenu mnuZones;
    // End of variables declaration//GEN-END:variables
}
