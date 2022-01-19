/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posbackend;

/**
 *
 * @author nickjackson
 */
public class NewOrderPanel extends javax.swing.JPanel {

    private MainFrame mainFrame;
    private POSbackend posBackEnd;
    private NewOrder newOrder = new NewOrder();
    
    public NewOrderPanel() {
        initComponents();
    }
    
    public void setMainFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        posBackEnd = mainFrame.getPosBackEndMain();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textArea1 = new java.awt.TextArea();
        jPanel1 = new javax.swing.JPanel();
        addSodaButton = new javax.swing.JButton();
        addBurgerButton = new javax.swing.JButton();
        addFriesButton = new javax.swing.JButton();
        addPizzaButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        displayTaxField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        displayTotalField = new javax.swing.JTextField();
        finishOrderButton = new javax.swing.JButton();
        orderDisplay = new java.awt.TextArea();
        jPanel3 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        resetOrderButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu"));
        jPanel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        addSodaButton.setText("Soda");
        addSodaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSodaButtonActionPerformed(evt);
            }
        });

        addBurgerButton.setText("Burger");
        addBurgerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBurgerButtonActionPerformed(evt);
            }
        });

        addFriesButton.setText("Fries");
        addFriesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFriesButtonActionPerformed(evt);
            }
        });

        addPizzaButton.setText("Pizza");
        addPizzaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPizzaButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Avenir Next", 3, 18)); // NOI18N
        jLabel5.setText("Entrées");

        jLabel6.setFont(new java.awt.Font("Avenir Next", 3, 18)); // NOI18N
        jLabel6.setText("Sides");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(addFriesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addSodaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBurgerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPizzaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addBurgerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addPizzaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addFriesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addSodaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Checkout"));

        jLabel7.setFont(new java.awt.Font("Avenir Next", 3, 18)); // NOI18N
        jLabel7.setText("Receipt");

        jLabel8.setText("Tax:");

        displayTaxField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayTaxFieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setText("Total:");

        displayTotalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayTotalFieldActionPerformed(evt);
            }
        });

        finishOrderButton.setText("Finish Order");
        finishOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishOrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(displayTotalField, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(displayTaxField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(finishOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(orderDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(displayTaxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(displayTotalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4))
                    .addComponent(finishOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(24, Short.MAX_VALUE)
                    .addComponent(orderDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(63, Short.MAX_VALUE)))
        );

        add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Program Options"));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        resetOrderButton.setText("Reset Order");
        resetOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetOrderButtonActionPerformed(evt);
            }
        });

        returnButton.setText("<- Back");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resetOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(returnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(418, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(resetOrderButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(returnButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2))
                .addContainerGap())
        );

        add(jPanel3, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void addSodaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSodaButtonActionPerformed
        String item = "Beverage";
        newOrder.addItem(item);
        orderDisplay.append(item + "\n");
        displayTotalField.setText(""+ newOrder.getTotal());
        displayTaxField.setText("" + (newOrder.getTotal() * .2));
    }//GEN-LAST:event_addSodaButtonActionPerformed

    private void displayTaxFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayTaxFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayTaxFieldActionPerformed

    private void displayTotalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayTotalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayTotalFieldActionPerformed

    private void addBurgerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBurgerButtonActionPerformed
        String item = "Burger";
        newOrder.addItem(item);
        orderDisplay.append(item + "\n");
        displayTotalField.setText(""+ newOrder.getTotal());
        displayTaxField.setText("" + (newOrder.getTotal() * .2));
    }//GEN-LAST:event_addBurgerButtonActionPerformed

    
    private void addFriesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFriesButtonActionPerformed
        String item = "Fry";
        newOrder.addItem(item);
        orderDisplay.append(item+"\n");
        displayTotalField.setText(""+ newOrder.getTotal());
         displayTaxField.setText("" + (newOrder.getTotal() * .2));
    }//GEN-LAST:event_addFriesButtonActionPerformed

    private void resetOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetOrderButtonActionPerformed
        newOrder.reset();
        orderDisplay.setText("");
        displayTotalField.setText(""+ newOrder.getTotal());
        displayTaxField.setText("" + (newOrder.getTotal() * .2));
    }//GEN-LAST:event_resetOrderButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        mainFrame.newOrderBack();
    }//GEN-LAST:event_returnButtonActionPerformed

    private void addPizzaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPizzaButtonActionPerformed
        String item = "Pizza";
        newOrder.addItem(item);
        orderDisplay.append(item + "\n");
        displayTotalField.setText(""+ newOrder.getTotal());
        displayTaxField.setText("" + (newOrder.getTotal() * .2));
    }//GEN-LAST:event_addPizzaButtonActionPerformed

    private void finishOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishOrderButtonActionPerformed
        posBackEnd.setDailyTotal(newOrder.getTotal());
        posBackEnd.setViewOrders(newOrder.getCurrentOrder()+ newOrder.getTotal() + "\n\n\n");
        mainFrame.newOrderBack();
    }//GEN-LAST:event_finishOrderButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBurgerButton;
    private javax.swing.JButton addFriesButton;
    private javax.swing.JButton addPizzaButton;
    private javax.swing.JButton addSodaButton;
    private javax.swing.JTextField displayTaxField;
    private javax.swing.JTextField displayTotalField;
    private javax.swing.JButton finishOrderButton;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private java.awt.TextArea orderDisplay;
    private javax.swing.JButton resetOrderButton;
    private javax.swing.JButton returnButton;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
