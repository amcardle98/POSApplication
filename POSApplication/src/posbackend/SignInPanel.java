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
public class SignInPanel extends javax.swing.JPanel {

    private MainFrame mainFrame;
    private String tempPin="";
    private POSbackend posBackEnd;
    
    public SignInPanel() {
        initComponents();
        
    }

    public void setMainFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        posBackEnd = mainFrame.getPosBackEndMain();
    }
    public void resetTempPinSignIn(){
        tempPin="";
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pinField = new javax.swing.JPasswordField();
        signInButton = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(5, 1));

        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        jLabel2.setFont(new java.awt.Font("Avenir", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Point of Sale System");
        jPanel1.add(jLabel2);

        add(jPanel1);

        jLabel1.setBackground(new java.awt.Color(200, 200, 200));
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please enter a valid employee or manager PIN to sign in.");
        add(jLabel1);

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel5);

        pinField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinFieldActionPerformed(evt);
            }
        });
        add(pinField);

        signInButton.setText("Sign In");
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });
        add(signInButton);
    }// </editor-fold>//GEN-END:initComponents

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        tempPin = pinField.getText();
        if(posBackEnd.signIn(tempPin)){
            mainFrame.signInUser();
        }
        else{
            jLabel5.setText("Invalid pin entered, try again.");
            jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        }
    }//GEN-LAST:event_signInButtonActionPerformed

    private void pinFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pinField;
    private javax.swing.JButton signInButton;
    // End of variables declaration//GEN-END:variables
}