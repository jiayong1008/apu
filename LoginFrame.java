import java.util.ArrayList;


public class LoginFrame extends javax.swing.JFrame {

    // Creates new Login form
    public LoginFrame() {
        initComponents();
    }

    // AUTO-GENERATED CODE
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        lblLoginAlert = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        passLogin = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frameLogin"); // NOI18N

        panelLogin.setBackground(new java.awt.Color(153, 255, 204));

        lblLoginAlert.setBackground(new java.awt.Color(255, 204, 204));
        lblLoginAlert.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        lblLoginAlert.setForeground(new java.awt.Color(102, 102, 102));
        lblLoginAlert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginAlert.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));

        lblLogin.setBackground(new java.awt.Color(245, 245, 245));
        lblLogin.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(51, 51, 51));
        lblLogin.setText("Login");

        lblUsername.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(102, 102, 102));
        lblUsername.setText("Username");

        txtUsername.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtUsername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUsername.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        lblPass.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        lblPass.setForeground(new java.awt.Color(102, 102, 102));
        lblPass.setText("Password");

        passLogin.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        passLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));

        btnLogin.setBackground(new java.awt.Color(0, 153, 153));
        btnLogin.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUsername)
                    .addComponent(lblPass)
                    .addComponent(txtUsername)
                    .addComponent(passLogin)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLoginAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(156, 156, 156))
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(lblLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLoginAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(lblPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnLogin)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {   
        String username = txtUsername.getText().trim().toLowerCase();
        String password = new String(passLogin.getPassword());

        // Check staff credentials
        if (checkCredentials(username, password)) {
            MainFrame mainf = new MainFrame(); // Call main page frame
            mainf.setVisible(true);            
            this.setVisible(false); // Close login frame
        } else { // Wrong credentials
            lblLoginAlert.setOpaque(true);
            lblLoginAlert.setText("Invalid staff credentials.");
        }
    }                                        

    public boolean checkCredentials(String username, String password) {
        ArrayList<Staff> staffs = ResortBooking.getStaffs();
        for (Staff staff : staffs) {
            if (username.equals(staff.getUsername()) && password.equals(staff.getPassword()))
                return true;
        }
        return false;
    }
    
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLoginAlert;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPasswordField passLogin;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration                 
}
