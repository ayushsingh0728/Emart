/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emart.gui;

import emart.dao.EmployeeDAO;
import emart.pojo.EmployeePojo;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ayushsingh
 */
public class RemoveEmployeesFrame extends javax.swing.JFrame {

    /**
     * Creates new form RemoveEmployeesFrame
     */
    private List<String> allEmployeeIds;
    
    public RemoveEmployeesFrame() {
        initComponents();
        this.setLocationRelativeTo(this);
        loadEmployeeIds();
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
        jPanel2 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcEmployeeId = new javax.swing.JComboBox<>();
        txtEmployeeName = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        jcJob = new javax.swing.JComboBox<>();
        btnRemove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Remove employees Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 22), new java.awt.Color(255, 255, 255))); // NOI18N

        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(398, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout)
                    .addComponent(btnBack))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emart/images/WhatsApp Image 2024-04-17 at 02.20.39.jpeg"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Employee Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 22), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee Id");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Employee Name");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Job");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Salary");

        jcEmployeeId.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jcEmployeeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEmployeeIdActionPerformed(evt);
            }
        });

        txtEmployeeName.setEditable(false);
        txtEmployeeName.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        txtSalary.setEditable(false);
        txtSalary.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        jcJob.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jcJob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Manager", "Receptionist", "Watchman", "Helper", "Cleaner" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcEmployeeId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmployeeName)
                    .addComponent(jcJob, 0, 172, Short.MAX_VALUE)
                    .addComponent(txtSalary))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        btnRemove.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(btnRemove)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemove)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        String empId = jcEmployeeId.getSelectedItem().toString();
        removeEmployee(empId);
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void jcEmployeeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEmployeeIdActionPerformed

            String empId = jcEmployeeId.getSelectedItem().toString();
            displayEmployeeData(empId);
        
    }//GEN-LAST:event_jcEmployeeIdActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ManageEmployeesFrame memp= new ManageEmployeesFrame();
        memp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LoginFrame login= new LoginFrame();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(RemoveEmployeesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveEmployeesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveEmployeesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveEmployeesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveEmployeesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> jcEmployeeId;
    private javax.swing.JComboBox<String> jcJob;
    private javax.swing.JTextField txtEmployeeName;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables

    private void loadEmployeeIds() {
        try {
            allEmployeeIds = EmployeeDAO.getAllEmpId();
            for (String empId : allEmployeeIds) {
                jcEmployeeId.addItem(empId);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error loading employee IDs: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void displayEmployeeData(String empId) {
        try {
            EmployeePojo emp = EmployeeDAO.findEmpById(empId);
            txtEmployeeName.setText(emp.getEmpname());
            jcJob.setSelectedItem(emp.getJob());
            txtSalary.setText(String.valueOf(emp.getSalary()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error fetching employee data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void removeEmployee(String empId) {
        try {
            boolean success = EmployeeDAO.deleteEmployee(empId);
            if (success) {
                JOptionPane.showMessageDialog(null, "Employee removed successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                jcEmployeeId.removeItem(empId);
                clearFields();
            } else {
                JOptionPane.showMessageDialog(null, "Failed to remove employee.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error removing employee: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void clearFields() {
        txtEmployeeName.setText("");
        jcJob.setSelectedIndex(0);
        txtSalary.setText("");
    }
}
