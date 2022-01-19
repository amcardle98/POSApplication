/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posbackend;

/**
 *
 * @author Tylar
 */
public class OptionsPanel extends javax.swing.JPanel {

    private MainFrame mainFrame;
    private POSbackend posBackEnd;
    
    public OptionsPanel() {
        initComponents();
    }
    
    public void setMainFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        this.posBackEnd = mainFrame.getPosBackEndMain();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        newOrderButton = new javax.swing.JButton();
        managerButton = new javax.swing.JButton();
        viewOrdersButton = new javax.swing.JButton();
        clockInOutButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(3, 1));

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Avenir", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("What would you like to do?");
        jPanel2.add(jLabel1, java.awt.BorderLayout.CENTER);
        jPanel2.add(jLabel2, java.awt.BorderLayout.PAGE_END);

        add(jPanel2);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Options"));
        jPanel1.setLayout(new java.awt.GridLayout(2, 2));

        newOrderButton.setText("Create New Order");
        newOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOrderButtonActionPerformed(evt);
            }
        });
        jPanel1.add(newOrderButton);

        managerButton.setText("Manager's Section");
        managerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(managerButton);

        viewOrdersButton.setText("View Orders");
        viewOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrdersButtonActionPerformed(evt);
            }
        });
        jPanel1.add(viewOrdersButton);

        clockInOutButton.setText("Clock In/Out");
        clockInOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clockInOutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(clockInOutButton);

        add(jPanel1);

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel4);
    }// </editor-fold>//GEN-END:initComponents

    private void newOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOrderButtonActionPerformed
        this.mainFrame.newOrder();
    }//GEN-LAST:event_newOrderButtonActionPerformed

    private void clockInOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clockInOutButtonActionPerformed
        this.mainFrame.clockInOut();
    }//GEN-LAST:event_clockInOutButtonActionPerformed

    private void managerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerButtonActionPerformed
        if(posBackEnd.managerSignIn()){
           this.mainFrame.manager();
        }
        else{
            jLabel2.setText("Manager login required to access this page.");
            jLabel2.setForeground(new java.awt.Color(255, 0, 0));
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        }
    }//GEN-LAST:event_managerButtonActionPerformed

    private void viewOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrdersButtonActionPerformed
        this.mainFrame.viewOrders();
    }//GEN-LAST:event_viewOrdersButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        mainFrame.optionsPanelBack();
        mainFrame.resetTempPinMainFrame();
    }//GEN-LAST:event_logoutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clockInOutButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton managerButton;
    private javax.swing.JButton newOrderButton;
    private javax.swing.JButton viewOrdersButton;
    // End of variables declaration//GEN-END:variables
}
