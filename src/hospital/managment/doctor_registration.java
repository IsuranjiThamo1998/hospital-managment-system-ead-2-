/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.managment;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 *
 * @author Isuranji Thamosha
 */
public final class doctor_registration extends javax.swing.JFrame {

    /**
     * Creates new form doctor_registration
     */
    public doctor_registration() {
        initComponents();
        connect();
    }
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public void connect()
    {
        try {
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysQl://localhost:3306/hospital_managment?useSSL=fales","root","Thamo@9812");
           
           }
        catch(ClassNotFoundException | SQLException ex)
        {
            Logger.getLogger(doctor_registration.class.getName()).log(Level.SEVERE,null,ex);
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        d_id = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jfd_id = new javax.swing.JLabel();
        jfd_contactno = new javax.swing.JLabel();
        jfd_name = new javax.swing.JLabel();
        jfd_address = new javax.swing.JLabel();
        jfd_email = new javax.swing.JLabel();
        jfd_qualification = new javax.swing.JLabel();
        jfd_specification = new javax.swing.JLabel();
        jfd_salary = new javax.swing.JLabel();
        txtd_id = new javax.swing.JTextField();
        txtd_address = new javax.swing.JTextField();
        txtd_name = new javax.swing.JTextField();
        txtd_email = new javax.swing.JTextField();
        txtd_qulification = new javax.swing.JTextField();
        txtd_specification = new javax.swing.JTextField();
        txtd_salary = new javax.swing.JTextField();
        txtd_contactno = new javax.swing.JTextField();
        btnd_insert = new javax.swing.JButton();
        btnd_update = new javax.swing.JButton();
        btnd_exite = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btndsearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        d_id.setBackground(new java.awt.Color(102, 255, 51));

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));
        jPanel2.setForeground(new java.awt.Color(255, 0, 204));

        jLabel9.setFont(new java.awt.Font("Sitka Display", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 204));
        jLabel9.setText("DOCTOR   REGISTRATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(21, 21, 21))
        );

        jfd_id.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jfd_id.setText("Doctor ID");

        jfd_contactno.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jfd_contactno.setText("Contact No");

        jfd_name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jfd_name.setText("Doctor Name");

        jfd_address.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jfd_address.setText("Doctor Address");

        jfd_email.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jfd_email.setText("Doctor E-mail");

        jfd_qualification.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jfd_qualification.setText("Doctor Qualification");

        jfd_specification.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jfd_specification.setText("Doctor Spefication");

        jfd_salary.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jfd_salary.setText("Doctor Salary");

        txtd_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtd_nameActionPerformed(evt);
            }
        });

        btnd_insert.setBackground(new java.awt.Color(204, 204, 0));
        btnd_insert.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        btnd_insert.setText("INSERT");
        btnd_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnd_insertActionPerformed(evt);
            }
        });

        btnd_update.setBackground(new java.awt.Color(204, 204, 0));
        btnd_update.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        btnd_update.setText("UPDATE");
        btnd_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnd_updateActionPerformed(evt);
            }
        });

        btnd_exite.setBackground(new java.awt.Color(204, 204, 0));
        btnd_exite.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        btnd_exite.setText("EXITE");
        btnd_exite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnd_exiteActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "doctor_id", "doctor_name", "doctor_address", "doctor_email", "doctor_qulification", "doctor_specification", "doctor_salary", "doctor_contactno"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btndsearch.setBackground(new java.awt.Color(204, 204, 0));
        btndsearch.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        btndsearch.setText("SEARCH");
        btndsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout d_idLayout = new javax.swing.GroupLayout(d_id);
        d_id.setLayout(d_idLayout);
        d_idLayout.setHorizontalGroup(
            d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(d_idLayout.createSequentialGroup()
                .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(d_idLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jfd_id)
                            .addComponent(jfd_name)
                            .addComponent(jfd_contactno)
                            .addComponent(jfd_salary)
                            .addComponent(jfd_specification)
                            .addComponent(jfd_qualification)
                            .addComponent(jfd_address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jfd_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtd_specification)
                            .addComponent(txtd_salary)
                            .addComponent(txtd_contactno)
                            .addComponent(txtd_id, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtd_address, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(txtd_name, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtd_email)
                            .addComponent(txtd_qulification))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(d_idLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnd_insert)
                        .addGap(75, 75, 75)
                        .addComponent(btnd_update)
                        .addGap(67, 67, 67)
                        .addComponent(btnd_exite)
                        .addGap(64, 64, 64)
                        .addComponent(btndsearch)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        d_idLayout.setVerticalGroup(
            d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_idLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(d_idLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jfd_id)
                            .addComponent(txtd_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jfd_name)
                            .addComponent(txtd_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jfd_address)
                            .addComponent(txtd_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jfd_email)
                            .addComponent(txtd_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jfd_qualification)
                            .addComponent(txtd_qulification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jfd_specification)
                            .addComponent(txtd_specification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jfd_salary)
                            .addComponent(txtd_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jfd_contactno)
                            .addComponent(txtd_contactno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(d_idLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(d_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnd_insert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnd_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnd_exite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndsearch))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(d_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(d_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtd_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtd_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtd_nameActionPerformed

    private void btnd_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnd_insertActionPerformed
        try {
            // TODO add your handling code here:
            String did=txtd_id.getText();
            String dname=txtd_name.getText();
            String daddress=txtd_address.getText();
            String demail=txtd_email.getText();
            String dqulification=txtd_qulification.getText();
            String dspecification=txtd_specification.getText();
            String dsalary=txtd_salary.getText();
            String dcontactno=txtd_contactno.getText();
            
            pst=con.prepareStatement("insert into doctor_registration(,doctor_ID,doctor_name,doctor_address,doctor_email,doctor_qulification,doctor_specification,doctor_salary,doctor_contactNo)values(?,?,?,?,?,?,?,?)");
            
            pst.setString(1, did);
            pst.setString(2, dname);
            pst.setString(3, daddress);
            pst.setString(4, demail);
            pst.setString(5, dqulification);
            pst.setString(6, dspecification);
            pst.setString(7, dsalary);
            pst.setString(8, dcontactno);
            
            int d=pst.executeUpdate();
            
            if(d==1)
            {
              JOptionPane.showMessageDialog(this,"Recorded Added");
              txtd_id.setText("");
               txtd_name.setText("");
                txtd_address.setText("");
                 txtd_email.setText("");
                  txtd_qulification.setText("");
                   txtd_specification.setText("");
                    txtd_salary.setText("");
                     txtd_contactno.setText("");
            }
            else{
                JOptionPane.showMessageDialog(this,"Record insert failed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(doctor_registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
        
    }//GEN-LAST:event_btnd_insertActionPerformed

    private void btndsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndsearchActionPerformed
        // TODO add your handling code here:
        String did;
        did = txtd_id.getSelectedText();
        try {
            pst=con.prepareStatement("select*from doctor_registration where doctor_ID=?");
            pst.setString(1, did);
            rs=pst.executeQuery();
            
            if(rs.next()==true)
            {
                txtd_name.setText(rs.getString(2));
                txtd_address.setText(rs.getString(3));
                txtd_email.setText(rs.getString(4));
                txtd_qulification.setText(rs.getString(5));
                txtd_specification.setText(rs.getString(6));
                txtd_salary.setText(rs.getString(7));
                txtd_contactno.setText(rs.getString(8));
            }
            
        
        } catch (SQLException ex) {
            Logger.getLogger(doctor_registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btndsearchActionPerformed

    private void btnd_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnd_updateActionPerformed
        // TODO add your handling code here:
        
         try {
            // TODO add your handling code here:
            String did=txtd_id.getText();
            String dname=txtd_name.getText();
            String daddress=txtd_address.getText();
            String demail=txtd_email.getText();
            String dqulification=txtd_qulification.getText();
            String dspecification=txtd_specification.getText();
            String dsalary=txtd_salary.getText();
            String dcontactno=txtd_contactno.getText();
            
            pst=con.prepareStatement("update doctor_registration set doctor_name=?, doctor_address=?, doctor_email=?, doctor_qulification=?, doctor_specification=?, doctor_salary=?, doctor_contactNo=? where doctor_ID=?");
            
            pst.setString(1, did);
            pst.setString(2, dname);
            pst.setString(3, daddress);
            pst.setString(4, demail);
            pst.setString(5, dqulification);
            pst.setString(6, dspecification);
            pst.setString(7, dsalary);
            pst.setString(8, dcontactno);
            
            int d=pst.executeUpdate();
            
            if(d==1)
            {
              JOptionPane.showMessageDialog(this,"Recored Updated");
              txtd_id.setText("");
               txtd_name.setText("");
                txtd_address.setText("");
                 txtd_email.setText("");
                  txtd_qulification.setText("");
                   txtd_specification.setText("");
                    txtd_salary.setText("");
                     txtd_contactno.setText("");
            }
            else{
                JOptionPane.showMessageDialog(this,"Record update failed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(doctor_registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_btnd_updateActionPerformed

    private void btnd_exiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnd_exiteActionPerformed
        // TODO add your handling code here:
        
        doctor_information doi=new doctor_information();
                doi.show();
    }//GEN-LAST:event_btnd_exiteActionPerformed

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
            java.util.logging.Logger.getLogger(doctor_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doctor_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doctor_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doctor_registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doctor_registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnd_exite;
    private javax.swing.JButton btnd_insert;
    private javax.swing.JButton btnd_update;
    private javax.swing.JButton btndsearch;
    private javax.swing.JPanel d_id;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jfd_address;
    private javax.swing.JLabel jfd_contactno;
    private javax.swing.JLabel jfd_email;
    private javax.swing.JLabel jfd_id;
    private javax.swing.JLabel jfd_name;
    private javax.swing.JLabel jfd_qualification;
    private javax.swing.JLabel jfd_salary;
    private javax.swing.JLabel jfd_specification;
    private javax.swing.JTextField txtd_address;
    private javax.swing.JTextField txtd_contactno;
    private javax.swing.JTextField txtd_email;
    private javax.swing.JTextField txtd_id;
    private javax.swing.JTextField txtd_name;
    private javax.swing.JTextField txtd_qulification;
    private javax.swing.JTextField txtd_salary;
    private javax.swing.JTextField txtd_specification;
    // End of variables declaration//GEN-END:variables
}
