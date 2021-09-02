
package payroll.com;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setTitle("Payroll System");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        tbx1 = new javax.swing.JTextField();
        tbx2 = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Payroll System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 33, -1, 23));

        a.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        a.setForeground(new java.awt.Color(204, 204, 204));
        a.setText("User Name");
        jPanel1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 95, 95, -1));

        b.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b.setForeground(new java.awt.Color(204, 204, 204));
        b.setText("Password");
        jPanel1.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 137, 81, -1));
        jPanel1.add(tbx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 99, 121, -1));
        jPanel1.add(tbx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 141, 121, -1));

        login.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 90, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 90, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payroll/com/Black_background-2.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        String us = tbx1.getText();
        String ps = tbx2.getText();
        if(us.contains("java")&&ps.contains("007")){
            tbx1.setText(null);
            tbx2.setText(null);
            Main info=new Main();
            info.setVisible(true);
            WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
            Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
        }
        else{
            tbx1.setText("");
            tbx2.setText("");
            JOptionPane.showMessageDialog(null,"Wrong Input Again try");
        }
    }//GEN-LAST:event_loginActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        tbx1.setText("");
        tbx2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JLabel b;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JTextField tbx1;
    private javax.swing.JPasswordField tbx2;
    // End of variables declaration//GEN-END:variables
}
