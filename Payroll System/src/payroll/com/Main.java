package payroll.com;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileWriter;
import java.text.MessageFormat;
import java.util.Scanner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setTitle("Payroll System");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ListItem = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        TextFiled1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CheakBox = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        TextFiled2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tbxResult = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();
        calculate = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        LogOut1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TextFiled3 = new javax.swing.JTextField();
        TextFiled4 = new javax.swing.JTextField();
        TextFiled5 = new javax.swing.JTextField();
        bAdd = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Print = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        TextFiled6 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table2 = new javax.swing.JTable();
        LogOut = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tbx2 = new javax.swing.JTextField();
        tbx1 = new javax.swing.JTextField();
        btnStore = new javax.swing.JButton();
        tbxResult1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        LogOut2 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Billing System");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Hourly Rate of Pay(Taka)");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 107, -1, -1));

        ListItem.setBackground(new java.awt.Color(102, 102, 255));
        ListItem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ListItem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "100", "150", "300", "400", "800", "1000" }));
        ListItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListItemActionPerformed(evt);
            }
        });
        jPanel3.add(ListItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 149, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("No. Of Hours Worked");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        TextFiled1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFiled1ActionPerformed(evt);
            }
        });
        jPanel3.add(TextFiled1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 120, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Overtime");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        CheakBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheakBoxActionPerformed(evt);
            }
        });
        jPanel3.add(CheakBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("No. Of Hours Overtime");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        TextFiled2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFiled2ActionPerformed(evt);
            }
        });
        jPanel3.add(TextFiled2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 120, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Total Payed");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        tbxResult.setEditable(false);
        tbxResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbxResultActionPerformed(evt);
            }
        });
        jPanel3.add(tbxResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 122, -1));

        Clear.setBackground(new java.awt.Color(204, 204, 255));
        Clear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payroll/com/14017964_842199689243362_1651317290_n.png"))); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel3.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 120, 40));

        calculate.setBackground(new java.awt.Color(204, 204, 255));
        calculate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        calculate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payroll/com/calculator_48.png"))); // NOI18N
        calculate.setText("calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });
        jPanel3.add(calculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 180, 70));

        Exit.setBackground(new java.awt.Color(204, 204, 255));
        Exit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payroll/com/exit.png"))); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel3.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 100, 40));

        LogOut1.setBackground(new java.awt.Color(204, 204, 255));
        LogOut1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LogOut1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payroll/com/logout.png"))); // NOI18N
        LogOut1.setText("LogOut");
        LogOut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOut1ActionPerformed(evt);
            }
        });
        jPanel3.add(LogOut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, -1, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payroll/com/9090-an-abstract-blue-background-pv 33.jpg"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 430));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Calculate", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("ID No :");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 54, 23));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText(" Adress :");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 54, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("  Name :");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 60, -1));
        jPanel4.add(TextFiled3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 128, -1));
        jPanel4.add(TextFiled4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 128, -1));
        jPanel4.add(TextFiled5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 128, -1));

        bAdd.setBackground(new java.awt.Color(204, 204, 255));
        bAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payroll/com/add.png"))); // NOI18N
        bAdd.setText(" Add");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });
        jPanel4.add(bAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 130, 42));

        Delete.setBackground(new java.awt.Color(204, 204, 255));
        Delete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payroll/com/delete.png"))); // NOI18N
        Delete.setText("Delete ");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel4.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 130, 43));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payroll/com/14017964_842199689243362_1651317290_n.png"))); // NOI18N
        jButton1.setText(" Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 130, 43));

        Print.setBackground(new java.awt.Color(204, 204, 255));
        Print.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payroll/com/ok.png"))); // NOI18N
        Print.setText("Print");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });
        jPanel4.add(Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 130, 82));

        jScrollPane1.setViewportView(tbl1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 737, 8, 0));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText(" Phone No :");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));
        jPanel4.add(TextFiled6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 128, -1));

        Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID No", "Name", "Address", "Phone No."
            }
        ));
        jScrollPane2.setViewportView(Table2);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 380, 165));

        LogOut.setBackground(new java.awt.Color(204, 204, 255));
        LogOut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payroll/com/logout16.png"))); // NOI18N
        LogOut.setText("LogOut");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        jPanel4.add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 100, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payroll/com/alider-background-blank-2.jpg"))); // NOI18N
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 430));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 430));

        jTabbedPane1.addTab("Information", jPanel2);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Enter Your Balance :");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, 35));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Enter Payment :");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, 53));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Final Balance :");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, 38));

        tbx2.setBackground(new java.awt.Color(153, 204, 255));
        tbx2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tbx2.setForeground(new java.awt.Color(0, 51, 51));
        tbx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbx2ActionPerformed(evt);
            }
        });
        jPanel6.add(tbx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 215, 42));

        tbx1.setBackground(new java.awt.Color(153, 204, 255));
        tbx1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tbx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbx1ActionPerformed(evt);
            }
        });
        jPanel6.add(tbx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 215, 40));

        btnStore.setBackground(new java.awt.Color(204, 204, 255));
        btnStore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payroll/com/14018073_842286065901391_1860517504_n.png"))); // NOI18N
        btnStore.setText("Store");
        btnStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStoreActionPerformed(evt);
            }
        });
        jPanel6.add(btnStore, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 90, 30));

        tbxResult1.setEditable(false);
        tbxResult1.setBackground(new java.awt.Color(153, 204, 255));
        tbxResult1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbxResult1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbxResult1ActionPerformed(evt);
            }
        });
        jPanel6.add(tbxResult1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 215, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Store Into File");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 280, 50));

        LogOut2.setBackground(new java.awt.Color(204, 204, 255));
        LogOut2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LogOut2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payroll/com/logout16.png"))); // NOI18N
        LogOut2.setText("LogOut");
        LogOut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOut2ActionPerformed(evt);
            }
        });
        jPanel6.add(LogOut2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 100, 30));

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payroll/com/clearF.png"))); // NOI18N
        jButton2.setText(" Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 100, 30));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payroll/com/tab3.jpg"))); // NOI18N
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 430));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("File Store", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        
        try{
        int Hours=Integer.parseInt(TextFiled1.getText());
        int Rate=Integer.parseInt(ListItem.getSelectedItem().toString());
        int Result=Hours*Rate;
        
        tbxResult.setText(String.valueOf(Result+" Taka"));
        if (CheakBox.isSelected()){
            int over=Integer.parseInt(TextFiled2.getText());
            int OverTime=Hours+over;
            tbxResult.setText(String.valueOf(OverTime*Rate+" Taka"));
        }
        }
        catch(Exception e){
           
            tbxResult.setText("Plz enter valid input");
        }
    }//GEN-LAST:event_calculateActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        
        TextFiled1.setText("");
        TextFiled2.setText("");
        tbxResult.setText("");
        ListItem.setAction(null);
    }//GEN-LAST:event_ClearActionPerformed

    private void tbxResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxResultActionPerformed
        
    }//GEN-LAST:event_tbxResultActionPerformed

    private void TextFiled2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFiled2ActionPerformed
        
    }//GEN-LAST:event_TextFiled2ActionPerformed

    private void CheakBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheakBoxActionPerformed
       
    }//GEN-LAST:event_CheakBoxActionPerformed

    private void TextFiled1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFiled1ActionPerformed
        
    }//GEN-LAST:event_TextFiled1ActionPerformed

    private void ListItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListItemActionPerformed
        
    }//GEN-LAST:event_ListItemActionPerformed

    private void LogOut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOut1ActionPerformed
        
         try{
        Login close=new Login();
            close.setVisible(true);
            WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
            Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
         }
         catch(Exception e){
            System.err.format("Error");
        }
    }//GEN-LAST:event_LogOut1ActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        
        try{
            Login close=new Login();
            close.setVisible(true);
            WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
            Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
            
        }
        catch(Exception e){
            System.err.format("Error");
        }
        
    }//GEN-LAST:event_LogOutActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed

        MessageFormat header =new MessageFormat("Employee Information");
        MessageFormat footer =new MessageFormat("Page(0,number,integer)");
        try{
            Table2.print(JTable.PrintMode.NORMAL,header,footer);
        }
        catch(java.awt.print.PrinterException e){
            System.err.format("Conect Print %s%n",e.getMessage());
        }
    }//GEN-LAST:event_PrintActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        TextFiled3.setText("");
        TextFiled4.setText("");
        TextFiled5.setText("");
        TextFiled6.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
       
        DefaultTableModel model=(DefaultTableModel) Table2.getModel();
        
        model.removeRow(Table2.getSelectedRow());
        TextFiled3.setText("");
        TextFiled4.setText("");
        TextFiled5.setText("");
        TextFiled6.setText("");
    }//GEN-LAST:event_DeleteActionPerformed

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
      
        DefaultTableModel model=(DefaultTableModel) Table2.getModel();
       
            model.addRow(new Object[]{TextFiled3.getText(),TextFiled4.getText(),TextFiled5.getText(),TextFiled6.getText()});

            TextFiled3.setText("");
            TextFiled4.setText("");
            TextFiled5.setText("");
            TextFiled6.setText("");
    }//GEN-LAST:event_bAddActionPerformed

    private void tbx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbx2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbx2ActionPerformed

    private void tbx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbx1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbx1ActionPerformed

    private void btnStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStoreActionPerformed

        String balance = tbx1.getText()+"\n\r";

        try{
            File balan = new File ("Balan.txt");
            FileWriter fw = new FileWriter(balan);
            // System.out.println("Enter Balance");
            fw.write(balance+"\n\r");
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println("Balance File not Found");

        }

        // Scanner inputUser = new Scanner(System.in);
        Count obj = new Count ();

        try{
            File balan = new File ("Balan.txt");
            Scanner input=new Scanner(balan);
            String blnc = "";
            while(input.hasNext()){
                blnc = input.nextLine() ;
            }

            try{double pay= Double.parseDouble(tbx2.getText());
                obj.calculation(blnc,pay);}
            catch(Exception e){
                System.out.println("enter double value");
                tbxResult.setText("Cu");
            }

        }
        catch (Exception e) {
            System.out.println("Filenot Found");
            tbxResult.setText("C");
        }

       

        try{
            File fb = new File ("Final Balan.txt");
            FileWriter fw = new FileWriter(fb,true);
               fw.write("Balance is: " + String.valueOf(obj.counter)+"\n");
            tbxResult1.setText("Current Balance is: " +String.valueOf(obj.counter));
            fw.close();
        }

        catch(Exception e)
        {
            System.out.println("File Not Found");
        }

    }//GEN-LAST:event_btnStoreActionPerformed

    private void tbxResult1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbxResult1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbxResult1ActionPerformed

    private void LogOut2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOut2ActionPerformed
        // TODO add your handling code here:
         try{
            Login close=new Login();
            close.setVisible(true);
            WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
            Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
            
        }
        catch(Exception e){
            System.err.format("Error");
        }
    }//GEN-LAST:event_LogOut2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        tbx1.setText("");
        tbx2.setText("");
        tbxResult1.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheakBox;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Exit;
    private javax.swing.JComboBox ListItem;
    private javax.swing.JButton LogOut;
    private javax.swing.JButton LogOut1;
    private javax.swing.JButton LogOut2;
    private javax.swing.JButton Print;
    private javax.swing.JTable Table2;
    private javax.swing.JTextField TextFiled1;
    private javax.swing.JTextField TextFiled2;
    private javax.swing.JTextField TextFiled3;
    private javax.swing.JTextField TextFiled4;
    private javax.swing.JTextField TextFiled5;
    private javax.swing.JTextField TextFiled6;
    private javax.swing.JButton bAdd;
    private javax.swing.JButton btnStore;
    private javax.swing.JButton calculate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbl1;
    private javax.swing.JTextField tbx1;
    private javax.swing.JTextField tbx2;
    private javax.swing.JTextField tbxResult;
    private javax.swing.JTextField tbxResult1;
    // End of variables declaration//GEN-END:variables
}
