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
public class ClockInOutPanel extends javax.swing.JPanel {

    private MainFrame mainFrame;
    private POSbackend posBackEnd;
    private Employee employee;
    
    public ClockInOutPanel() {
        initComponents();
    }
    
    public void setMainFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        posBackEnd = this.mainFrame.getPosBackEndMain();
        employee = posBackEnd.getCurrentEmployee();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        clockInButton = new javax.swing.JButton();
        clockOutButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        displayShiftStarted = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        displayShiftEnded = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        returnButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setLayout(new java.awt.GridLayout(5, 1));

        titlePanel.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Avenir", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clock In / Out");
        titlePanel.add(jLabel1);

        add(titlePanel);

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Reminder: Always remember to clock in and out of your shift!");
        add(jLabel2);

        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        clockInButton.setText("Clock In");
        clockInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clockInButtonActionPerformed(evt);
            }
        });
        jPanel1.add(clockInButton);

        clockOutButton.setText("Clock Out");
        clockOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clockOutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(clockOutButton);

        add(jPanel1);

        jPanel2.setLayout(new java.awt.GridLayout(2, 2));

        jLabel3.setText("Shift Started:");
        jPanel2.add(jLabel3);
        jPanel2.add(displayShiftStarted);

        jLabel4.setText("Shift Ended: ");
        jPanel2.add(jLabel4);
        jPanel2.add(displayShiftEnded);

        add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(1, 4));

        returnButton.setText("<- Back");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });
        jPanel3.add(returnButton);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel6);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4);

        add(jPanel3);
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        this.mainFrame.clockInOutBack();
    }//GEN-LAST:event_returnButtonActionPerformed

    private void clockInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clockInButtonActionPerformed
        if(!employee.getClockedIn()){
            employee.setClockTime();
            employee.setClockedIn(Boolean.TRUE);
        }
        else{
            jLabel2.setText("You are already clocked in.");
            jLabel2.setForeground(new java.awt.Color(255, 0, 0));
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        }

//        posBackEnd.clockFunction();
    }//GEN-LAST:event_clockInButtonActionPerformed

    private void clockOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clockOutButtonActionPerformed
        if(employee.getClockedIn()){
            employee.setClockTime();
            employee.setClockedIn(Boolean.FALSE);
        }
        else{
            jLabel2.setText("You are not clocked in.");
            jLabel2.setForeground(new java.awt.Color(255, 0, 0));
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        }
    }//GEN-LAST:event_clockOutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clockInButton;
    private javax.swing.JButton clockOutButton;
    private javax.swing.JLabel displayShiftEnded;
    private javax.swing.JLabel displayShiftStarted;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton returnButton;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}