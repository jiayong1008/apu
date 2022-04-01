import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MainFrame extends javax.swing.JFrame {

    private String chkInDate = ""; // Selected check in date
    private String chkOutDate = ""; // Selected check out date
    private String bookRoomID = ""; // ??
    private int daysOfStay;
    private int guestID; // The guest that will be booking a room (userID)
    private int receiptID; // Current booking ID of receipt
    private final SimpleDateFormat datef = new SimpleDateFormat("dd-MM-yyyy");
    DefaultListModel lm = new DefaultListModel();
    Object[] row = new Object[8]; // Objects to be filled in table later on
    
    public MainFrame() {
        initComponents();
        listAvailableRooms.setModel(lm);
        // Load first 8 guests, bookings, and users to the respective tables
        loadGuest();
        loadBookings();
        loadUsers();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        bg = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        lblSkyResort = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlBookRoom = new javax.swing.JPanel();
        tabBookRoom = new javax.swing.JTabbedPane();
        pnlBookRoom1 = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        btnChkIn = new javax.swing.JButton();
        txtChkIn = new javax.swing.JTextField();
        txtChkOut = new javax.swing.JTextField();
        btnChkOut = new javax.swing.JButton();
        btnSearchRoom = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAvailableRooms = new javax.swing.JList<>();
        btnProceedGuest = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        pnlBookRoom2 = new javax.swing.JPanel();
        formBook1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtGuestName = new javax.swing.JTextField();
        btnSearchGuest = new javax.swing.JButton();
        btnConfirmBook = new javax.swing.JButton();
        lblChkIn = new javax.swing.JLabel();
        lblChkOut = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lblNights = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        lblServiceTax = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        lblTourismTax = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblTotal = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lblRoomID = new javax.swing.JLabel();
        btnSelectGuest = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableBookRoomGuest = new javax.swing.JTable();
        tabManageBookings = new javax.swing.JPanel();
        formBook2 = new javax.swing.JPanel();
        btnBookingsSearch = new javax.swing.JButton();
        btnBookingsEdit = new javax.swing.JButton();
        btnBookingsDelete = new javax.swing.JButton();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        btnMngCheckIn = new javax.swing.JButton();
        txtMngCheckIn = new javax.swing.JTextField();
        btnMngCheckOut = new javax.swing.JButton();
        txtMngCheckOut = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtBookedGuestName = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        lblMngBookingID = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableBookings = new javax.swing.JTable();
        tabManageUsers = new javax.swing.JPanel();
        formBook = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comRole = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        btnUserSearch = new javax.swing.JButton();
        txtUserFullName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comGender = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNric = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnUserAdd = new javax.swing.JButton();
        btnUserEdit = new javax.swing.JButton();
        btnUserDelete = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableUsers = new javax.swing.JTable();
        tabReceipts = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAreaReceipt = new javax.swing.JTextArea();
        jLabel43 = new javax.swing.JLabel();
        txtBookIdReceipt = new javax.swing.JTextField();
        btnNextReceipt = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        btnPrintReceipt = new javax.swing.JButton();
        btnSearchReceipt = new javax.swing.JButton();
        btnFirstReceipt = new javax.swing.JButton();
        btnPreviousReceipt = new javax.swing.JButton();
        btnLastReceipt = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(240, 255, 240));

        pnlHeader.setBackground(new java.awt.Color(102, 255, 204));

        lblSkyResort.setBackground(new java.awt.Color(0, 0, 0));
        lblSkyResort.setFont(new java.awt.Font("Poppins Medium", 3, 24)); // NOI18N
        lblSkyResort.setText("SkyResort");

        btnLogout.setBackground(new java.awt.Color(0, 153, 153));
        btnLogout.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblSkyResort, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(55, 55, 55))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSkyResort)
                    .addComponent(btnLogout))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jTabbedPane1.setBackground(new java.awt.Color(204, 255, 204));

        pnlBookRoom.setBackground(new java.awt.Color(240, 240, 240));

        pnlBookRoom1.setBackground(new java.awt.Color(235, 235, 235));

        jCalendar1.setBackground(new java.awt.Color(153, 255, 204));

        btnChkIn.setBackground(new java.awt.Color(0, 153, 153));
        btnChkIn.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnChkIn.setForeground(new java.awt.Color(255, 255, 255));
        btnChkIn.setText("Check In Date");
        btnChkIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChkInActionPerformed(evt);
            }
        });

        txtChkIn.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtChkIn.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtChkIn.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        txtChkIn.setPreferredSize(new java.awt.Dimension(21, 28));
        txtChkIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChkInActionPerformed(evt);
            }
        });

        txtChkOut.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtChkOut.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtChkOut.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        txtChkOut.setPreferredSize(new java.awt.Dimension(21, 28));
        txtChkOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChkOutActionPerformed(evt);
            }
        });

        btnChkOut.setBackground(new java.awt.Color(0, 153, 153));
        btnChkOut.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnChkOut.setForeground(new java.awt.Color(255, 255, 255));
        btnChkOut.setText("Check Out Date");
        btnChkOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChkOutActionPerformed(evt);
            }
        });

        btnSearchRoom.setBackground(new java.awt.Color(0, 153, 153));
        btnSearchRoom.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnSearchRoom.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchRoom.setText("Search");
        btnSearchRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchRoomActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Available Rooms");

        listAvailableRooms.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        listAvailableRooms.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "N/A", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listAvailableRooms.setLayoutOrientation(javax.swing.JList.VERTICAL_WRAP);
        listAvailableRooms.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listAvailableRoomsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listAvailableRooms);

        btnProceedGuest.setBackground(new java.awt.Color(0, 153, 153));
        btnProceedGuest.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnProceedGuest.setForeground(new java.awt.Color(255, 255, 255));
        btnProceedGuest.setText("Proceed >>");
        btnProceedGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProceedGuestActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(153, 255, 204));

        jLabel35.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 51, 51));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("* Note: S000 - Sea View,");

        jLabel36.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(51, 51, 51));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("J000 - Jungle View");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addGap(0, 0, 0)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlBookRoom1Layout = new javax.swing.GroupLayout(pnlBookRoom1);
        pnlBookRoom1.setLayout(pnlBookRoom1Layout);
        pnlBookRoom1Layout.setHorizontalGroup(
            pnlBookRoom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBookRoom1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pnlBookRoom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBookRoom1Layout.createSequentialGroup()
                        .addGroup(pnlBookRoom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnChkIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnChkOut, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtChkIn, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBookRoom1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addGroup(pnlBookRoom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearchRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtChkOut, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(pnlBookRoom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProceedGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBookRoom1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
        );
        pnlBookRoom1Layout.setVerticalGroup(
            pnlBookRoom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBookRoom1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlBookRoom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlBookRoom1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnProceedGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBookRoom1Layout.createSequentialGroup()
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBookRoom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnChkIn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtChkIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBookRoom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnChkOut, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtChkOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearchRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tabBookRoom.addTab("1 - Select Date", pnlBookRoom1);

        pnlBookRoom2.setBackground(new java.awt.Color(235, 235, 235));

        formBook1.setBackground(new java.awt.Color(235, 235, 235));

        jLabel16.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Summary");

        jLabel17.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Check In Date");

        jLabel18.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Check Out Date");

        jLabel20.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Service Tax (10%)");

        jLabel21.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Total");

        jLabel12.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Guest Name");

        txtGuestName.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtGuestName.setForeground(new java.awt.Color(102, 102, 102));
        txtGuestName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtGuestName.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        txtGuestName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuestNameActionPerformed(evt);
            }
        });

        btnSearchGuest.setBackground(new java.awt.Color(0, 153, 153));
        btnSearchGuest.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnSearchGuest.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchGuest.setText("Search");
        btnSearchGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchGuestActionPerformed(evt);
            }
        });

        btnConfirmBook.setBackground(new java.awt.Color(0, 153, 153));
        btnConfirmBook.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnConfirmBook.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmBook.setText("Confirm Booking >>");
        btnConfirmBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmBookActionPerformed(evt);
            }
        });

        lblChkIn.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        lblChkIn.setForeground(new java.awt.Color(102, 102, 102));
        lblChkIn.setText("N/A");

        lblChkOut.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        lblChkOut.setForeground(new java.awt.Color(102, 102, 102));
        lblChkOut.setText("N/A");
        lblChkOut.setToolTipText("");

        jLabel24.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Nights");

        jLabel25.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("Subtotal");

        lblNights.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        lblNights.setForeground(new java.awt.Color(102, 102, 102));
        lblNights.setText("0");

        lblSubtotal.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        lblSubtotal.setForeground(new java.awt.Color(102, 102, 102));
        lblSubtotal.setText("RM0.00");

        lblServiceTax.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        lblServiceTax.setForeground(new java.awt.Color(102, 102, 102));
        lblServiceTax.setText("RM0.00");

        jLabel29.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setText("Tourism Tax");

        lblTourismTax.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        lblTourismTax.setForeground(new java.awt.Color(102, 102, 102));
        lblTourismTax.setText("RM0.00");

        lblTotal.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(102, 102, 102));
        lblTotal.setText("RM0.00");

        jPanel6.setBackground(new java.awt.Color(153, 255, 204));

        jLabel33.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 51));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("* Note: Please select guest and proceed.");

        jLabel34.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 51));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("   (Register guest first if haven't already)");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addGap(0, 0, 0)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel26.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("Room ID");

        lblRoomID.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        lblRoomID.setForeground(new java.awt.Color(102, 102, 102));
        lblRoomID.setText("N/A");

        btnSelectGuest.setBackground(new java.awt.Color(0, 153, 153));
        btnSelectGuest.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnSelectGuest.setForeground(new java.awt.Color(255, 255, 255));
        btnSelectGuest.setText("Select as Guest");
        btnSelectGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectGuestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formBook1Layout = new javax.swing.GroupLayout(formBook1);
        formBook1.setLayout(formBook1Layout);
        formBook1Layout.setHorizontalGroup(
            formBook1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formBook1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(formBook1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formBook1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formBook1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(formBook1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formBook1Layout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addComponent(jLabel29)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblTourismTax)))
                            .addGroup(formBook1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(lblServiceTax))
                            .addGroup(formBook1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(formBook1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25))
                                .addGap(18, 18, 18)
                                .addGroup(formBook1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNights)
                                    .addComponent(lblSubtotal)))
                            .addGroup(formBook1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(formBook1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))
                                .addGap(18, 18, 18)
                                .addGroup(formBook1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblChkIn)
                                    .addComponent(lblChkOut)
                                    .addComponent(lblRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(formBook1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTotal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(formBook1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfirmBook, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formBook1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnSearchGuest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtGuestName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSelectGuest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(56, 56, 56))
        );
        formBook1Layout.setVerticalGroup(
            formBook1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formBook1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGuestName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearchGuest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSelectGuest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfirmBook)
                .addGap(18, 18, 18))
            .addGroup(formBook1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formBook1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lblChkIn))
                .addGap(2, 2, 2)
                .addGroup(formBook1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lblChkOut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formBook1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(lblRoomID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formBook1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(lblNights))
                .addGap(1, 1, 1)
                .addGroup(formBook1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(lblSubtotal))
                .addGap(4, 4, 4)
                .addGroup(formBook1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(lblServiceTax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formBook1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(lblTourismTax))
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formBook1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(lblTotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableBookRoomGuest.setBackground(new java.awt.Color(204, 255, 255));
        tableBookRoomGuest.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableBookRoomGuest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Name", "Gender", "Contact No.", "Email", "NRIC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableBookRoomGuest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBookRoomGuestMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableBookRoomGuest);

        javax.swing.GroupLayout pnlBookRoom2Layout = new javax.swing.GroupLayout(pnlBookRoom2);
        pnlBookRoom2.setLayout(pnlBookRoom2Layout);
        pnlBookRoom2Layout.setHorizontalGroup(
            pnlBookRoom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBookRoom2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formBook1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlBookRoom2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pnlBookRoom2Layout.setVerticalGroup(
            pnlBookRoom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBookRoom2Layout.createSequentialGroup()
                .addComponent(formBook1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        tabBookRoom.addTab("2 - Select Guest", pnlBookRoom2);

        javax.swing.GroupLayout pnlBookRoomLayout = new javax.swing.GroupLayout(pnlBookRoom);
        pnlBookRoom.setLayout(pnlBookRoomLayout);
        pnlBookRoomLayout.setHorizontalGroup(
            pnlBookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBookRoomLayout.createSequentialGroup()
                .addComponent(tabBookRoom)
                .addContainerGap())
        );
        pnlBookRoomLayout.setVerticalGroup(
            pnlBookRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBookRoomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabBookRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Book Room", pnlBookRoom);

        tabManageBookings.setBackground(new java.awt.Color(240, 240, 240));

        formBook2.setBackground(new java.awt.Color(204, 255, 204));

        btnBookingsSearch.setBackground(new java.awt.Color(0, 153, 153));
        btnBookingsSearch.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnBookingsSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnBookingsSearch.setText("Search");
        btnBookingsSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingsSearchActionPerformed(evt);
            }
        });

        btnBookingsEdit.setBackground(new java.awt.Color(0, 153, 153));
        btnBookingsEdit.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnBookingsEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnBookingsEdit.setText("Edit");
        btnBookingsEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingsEditActionPerformed(evt);
            }
        });

        btnBookingsDelete.setBackground(new java.awt.Color(0, 153, 153));
        btnBookingsDelete.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnBookingsDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnBookingsDelete.setText("Delete");
        btnBookingsDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingsDeleteActionPerformed(evt);
            }
        });

        jCalendar2.setBackground(new java.awt.Color(153, 255, 204));

        btnMngCheckIn.setBackground(new java.awt.Color(0, 153, 153));
        btnMngCheckIn.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnMngCheckIn.setForeground(new java.awt.Color(255, 255, 255));
        btnMngCheckIn.setText("Check In");
        btnMngCheckIn.setMaximumSize(new java.awt.Dimension(105, 34));
        btnMngCheckIn.setMinimumSize(new java.awt.Dimension(105, 34));
        btnMngCheckIn.setPreferredSize(new java.awt.Dimension(105, 34));
        btnMngCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMngCheckInActionPerformed(evt);
            }
        });

        txtMngCheckIn.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtMngCheckIn.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtMngCheckIn.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        txtMngCheckIn.setPreferredSize(new java.awt.Dimension(21, 28));
        txtMngCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMngCheckInActionPerformed(evt);
            }
        });

        btnMngCheckOut.setBackground(new java.awt.Color(0, 153, 153));
        btnMngCheckOut.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnMngCheckOut.setForeground(new java.awt.Color(255, 255, 255));
        btnMngCheckOut.setText("Check Out");
        btnMngCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMngCheckOutActionPerformed(evt);
            }
        });

        txtMngCheckOut.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtMngCheckOut.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtMngCheckOut.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        txtMngCheckOut.setPreferredSize(new java.awt.Dimension(21, 28));
        txtMngCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMngCheckOutActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel41.setText("Booking ID");

        txtBookedGuestName.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtBookedGuestName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtBookedGuestName.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        txtBookedGuestName.setPreferredSize(new java.awt.Dimension(21, 28));
        txtBookedGuestName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookedGuestNameActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel42.setText("Guest Name");

        lblMngBookingID.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lblMngBookingID.setForeground(new java.awt.Color(51, 51, 51));
        lblMngBookingID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMngBookingID.setText("N/A");

        javax.swing.GroupLayout formBook2Layout = new javax.swing.GroupLayout(formBook2);
        formBook2.setLayout(formBook2Layout);
        formBook2Layout.setHorizontalGroup(
            formBook2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formBook2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(formBook2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formBook2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnBookingsSearch)
                        .addGap(18, 18, 18)
                        .addComponent(btnBookingsEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(btnBookingsDelete)
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formBook2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(formBook2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel42)
                            .addComponent(btnMngCheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMngCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41))
                        .addGap(18, 18, 18)
                        .addGroup(formBook2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMngCheckOut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMngCheckIn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBookedGuestName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMngBookingID, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))))
        );
        formBook2Layout.setVerticalGroup(
            formBook2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formBook2Layout.createSequentialGroup()
                .addGroup(formBook2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(formBook2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(formBook2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(lblMngBookingID))
                        .addGap(25, 25, 25)
                        .addGroup(formBook2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formBook2Layout.createSequentialGroup()
                                .addGroup(formBook2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel42)
                                    .addComponent(txtBookedGuestName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMngCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(btnMngCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(formBook2Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(txtMngCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMngCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(formBook2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBookingsSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBookingsEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBookingsDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formBook2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        tableBookings.setBackground(new java.awt.Color(204, 255, 255));
        tableBookings.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableBookings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Booking ID", "Room ID", "User ID", "Guest Name", "Check In", "Check Out", "Booking Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableBookings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBookingsMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableBookings);

        javax.swing.GroupLayout tabManageBookingsLayout = new javax.swing.GroupLayout(tabManageBookings);
        tabManageBookings.setLayout(tabManageBookingsLayout);
        tabManageBookingsLayout.setHorizontalGroup(
            tabManageBookingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabManageBookingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabManageBookingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formBook2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        tabManageBookingsLayout.setVerticalGroup(
            tabManageBookingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabManageBookingsLayout.createSequentialGroup()
                .addComponent(formBook2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Manage Bookings", tabManageBookings);

        tabManageUsers.setBackground(new java.awt.Color(240, 240, 240));

        formBook.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel2.setText("Full Name");

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel3.setText("User Role");

        comRole.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        comRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Staff" }));
        comRole.setMinimumSize(new java.awt.Dimension(100, 28));
        comRole.setPreferredSize(new java.awt.Dimension(100, 28));

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel4.setText("Contact no.");

        txtContact.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtContact.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtContact.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });

        btnUserSearch.setBackground(new java.awt.Color(0, 153, 153));
        btnUserSearch.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnUserSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnUserSearch.setText("Search");
        btnUserSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserSearchActionPerformed(evt);
            }
        });

        txtUserFullName.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtUserFullName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUserFullName.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        txtUserFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserFullNameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel6.setText("Gender");

        comGender.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        comGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel7.setText("Email");

        txtEmail.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel8.setText("NRIC");

        txtNric.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtNric.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNric.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        txtNric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNricActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel9.setText("Username");

        txtUsername.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtUsername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUsername.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        pass.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        pass.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));

        jLabel13.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("*");

        jLabel14.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 51));
        jLabel14.setText("*");

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel10.setText("Password");

        btnUserAdd.setBackground(new java.awt.Color(0, 153, 153));
        btnUserAdd.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnUserAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnUserAdd.setText("Add");
        btnUserAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserAddActionPerformed(evt);
            }
        });

        btnUserEdit.setBackground(new java.awt.Color(0, 153, 153));
        btnUserEdit.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnUserEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnUserEdit.setText("Edit");
        btnUserEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserEditActionPerformed(evt);
            }
        });

        btnUserDelete.setBackground(new java.awt.Color(0, 153, 153));
        btnUserDelete.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnUserDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnUserDelete.setText("Delete");
        btnUserDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserDeleteActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        jLabel11.setText("Only required for 'staff' role");

        jLabel15.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 51));
        jLabel15.setText("*");

        javax.swing.GroupLayout formBookLayout = new javax.swing.GroupLayout(formBook);
        formBook.setLayout(formBookLayout);
        formBookLayout.setHorizontalGroup(
            formBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formBookLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(formBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formBookLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(425, 425, 425))
                    .addGroup(formBookLayout.createSequentialGroup()
                        .addGroup(formBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formBookLayout.createSequentialGroup()
                                .addGroup(formBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(formBookLayout.createSequentialGroup()
                                        .addGroup(formBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(formBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtUserFullName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comRole, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(formBookLayout.createSequentialGroup()
                                        .addGroup(formBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel4))
                                        .addGroup(formBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(formBookLayout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(comGender, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(formBookLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(60, 60, 60)
                                .addGroup(formBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)))
                            .addGroup(formBookLayout.createSequentialGroup()
                                .addComponent(btnUserAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnUserSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(formBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(formBookLayout.createSequentialGroup()
                                .addComponent(btnUserEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUserDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(formBookLayout.createSequentialGroup()
                                .addGroup(formBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addGroup(formBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(formBookLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(formBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtNric, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1))
                                    .addGroup(formBookLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(formBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGap(266, 266, 266))
        );
        formBookLayout.setVerticalGroup(
            formBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formBookLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(formBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formBookLayout.createSequentialGroup()
                        .addGroup(formBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(formBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtNric, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(formBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(formBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel14)))
                        .addGap(18, 18, 18)
                        .addGroup(formBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel10))
                        .addGap(7, 7, 7))
                    .addGroup(formBookLayout.createSequentialGroup()
                        .addGroup(formBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUserFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(formBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comRole, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(formBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(comGender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(formBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(formBookLayout.createSequentialGroup()
                                .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addGroup(formBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUserSearch)
                    .addComponent(btnUserAdd)
                    .addComponent(btnUserEdit)
                    .addComponent(btnUserDelete))
                .addGap(10, 10, 10))
        );

        tableUsers.setBackground(new java.awt.Color(204, 255, 255));
        tableUsers.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Name", "Role", "Gender", "Contact No.", "Email", "NRIC", "* Username"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUsersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableUsers);
        if (tableUsers.getColumnModel().getColumnCount() > 0) {
            tableUsers.getColumnModel().getColumn(3).setHeaderValue("Gender");
            tableUsers.getColumnModel().getColumn(7).setHeaderValue("* Username");
        }

        javax.swing.GroupLayout tabManageUsersLayout = new javax.swing.GroupLayout(tabManageUsers);
        tabManageUsers.setLayout(tabManageUsersLayout);
        tabManageUsersLayout.setHorizontalGroup(
            tabManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabManageUsersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formBook, javax.swing.GroupLayout.PREFERRED_SIZE, 749, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE))
                .addContainerGap())
        );
        tabManageUsersLayout.setVerticalGroup(
            tabManageUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabManageUsersLayout.createSequentialGroup()
                .addComponent(formBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Manage Users", tabManageUsers);

        tabReceipts.setBackground(new java.awt.Color(204, 255, 204));

        txtAreaReceipt.setColumns(20);
        txtAreaReceipt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtAreaReceipt.setRows(5);
        jScrollPane5.setViewportView(txtAreaReceipt);

        jLabel43.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel43.setText("Booking ID");

        txtBookIdReceipt.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtBookIdReceipt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtBookIdReceipt.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        txtBookIdReceipt.setPreferredSize(new java.awt.Dimension(21, 28));
        txtBookIdReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookIdReceiptActionPerformed(evt);
            }
        });

        btnNextReceipt.setBackground(new java.awt.Color(0, 153, 153));
        btnNextReceipt.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnNextReceipt.setForeground(new java.awt.Color(255, 255, 255));
        btnNextReceipt.setText(">");
        btnNextReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextReceiptActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Poppins Medium", 1, 20)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Receipt");

        btnPrintReceipt.setBackground(new java.awt.Color(0, 153, 153));
        btnPrintReceipt.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnPrintReceipt.setForeground(new java.awt.Color(255, 255, 255));
        btnPrintReceipt.setText("Print Receipt");
        btnPrintReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintReceiptActionPerformed(evt);
            }
        });

        btnSearchReceipt.setBackground(new java.awt.Color(0, 153, 153));
        btnSearchReceipt.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnSearchReceipt.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchReceipt.setText("Search");
        btnSearchReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchReceiptActionPerformed(evt);
            }
        });

        btnFirstReceipt.setBackground(new java.awt.Color(0, 153, 153));
        btnFirstReceipt.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnFirstReceipt.setForeground(new java.awt.Color(255, 255, 255));
        btnFirstReceipt.setText("<< First");
        btnFirstReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstReceiptActionPerformed(evt);
            }
        });

        btnPreviousReceipt.setBackground(new java.awt.Color(0, 153, 153));
        btnPreviousReceipt.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnPreviousReceipt.setForeground(new java.awt.Color(255, 255, 255));
        btnPreviousReceipt.setText("<");
        btnPreviousReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousReceiptActionPerformed(evt);
            }
        });

        btnLastReceipt.setBackground(new java.awt.Color(0, 153, 153));
        btnLastReceipt.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnLastReceipt.setForeground(new java.awt.Color(255, 255, 255));
        btnLastReceipt.setText("Last >>");
        btnLastReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastReceiptActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(153, 255, 204));

        jLabel37.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(51, 51, 51));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("* Tip: Search for booking ID in 'Manage");

        jLabel38.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Bookings' tab to get Booking ID.");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addGap(0, 0, 0)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tabReceiptsLayout = new javax.swing.GroupLayout(tabReceipts);
        tabReceipts.setLayout(tabReceiptsLayout);
        tabReceiptsLayout.setHorizontalGroup(
            tabReceiptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabReceiptsLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(tabReceiptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tabReceiptsLayout.createSequentialGroup()
                        .addGroup(tabReceiptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFirstReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPreviousReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(tabReceiptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLastReceipt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(btnNextReceipt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(tabReceiptsLayout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addGap(39, 39, 39)
                        .addGroup(tabReceiptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPrintReceipt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearchReceipt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBookIdReceipt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(43, 43, 43)
                .addGroup(tabReceiptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        tabReceiptsLayout.setVerticalGroup(
            tabReceiptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabReceiptsLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(tabReceiptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabReceiptsLayout.createSequentialGroup()
                        .addGroup(tabReceiptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabReceiptsLayout.createSequentialGroup()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtBookIdReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabReceiptsLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel43)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearchReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPrintReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addGroup(tabReceiptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPreviousReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNextReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabReceiptsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFirstReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLastReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))
                    .addGroup(tabReceiptsLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Receipts", tabReceipts);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    
    // ====================== HELPER FUNCTIONS   ===============================

    // Populate user record to table
    public void addTableRow(DefaultTableModel model, User user, String type) {
        if (type.equals("simple")) {
            // Book room user table
            row[0]= user.getUserID();
            row[1]= user.getName();
            row[2]= user.getGender();
            row[3]= user.getContact();
            row[4]= user.getEmail();
            row[5]= user.getIC();
            model.addRow(row);
        } else { // Manage user table
            row[0] = user.getUserID();
            row[1] = user.getName();
            row[2] = user.getRole();
            row[3] = user.getGender();
            row[4] = user.getContact();
            row[5] = user.getEmail();
            row[6] = user.getIC();
            row[7] = user.getUsername();
            model.addRow(row);
        }
    }

    // Populate booking record to table - Overloading
    private void addTableRow(DefaultTableModel model, Booking booking) {
        row[0] = booking.getBookingID();
        row[1] = booking.getRoomID();
        row[2] = booking.getUserID();
        row[3] = User.getCustName(booking.getUserID());
        row[4] = booking.getCheckInDate();
        row[5] = booking.getCheckOutDate();
        model.addRow(row);
    }

    // Load first 8 users in 'book room' table
    private void loadGuest() {
        ArrayList<User> customers = ResortBooking.getCusts();
        DefaultTableModel tableModel = (DefaultTableModel) tableBookRoomGuest.getModel();
        tableModel.setRowCount(0);
        int index = (customers.size() >= 8) ? 8 : customers.size();
        
        for (int i = 0; i < index; i++) {
            addTableRow(tableModel, customers.get(i), "simple");
        }
    }
    
    //  Load first 8 bookings in 'Manage Bookings' table
    private void loadBookings() {
        ArrayList<Booking> bookings = ResortBooking.getBookings();
        DefaultTableModel tableModel = (DefaultTableModel) tableBookings.getModel();
        tableModel.setRowCount(0);
        int index = (bookings.size() >= 8) ? 8 : bookings.size();
        Booking booking;
        
        for (int i = 0; i < index; i++) {
            booking = bookings.get(i);
            row[0]= booking.getBookingID();
            row[1]= booking.getRoomID();
            row[2]= booking.getUserID();
            row[3]= User.getCustName(booking.getUserID());
            row[4]= booking.getCheckInDate();
            row[5]= booking.getCheckOutDate();
            row[6] = booking.getBookingDate();
            tableModel.addRow(row);
        }
    }
    
    //  Load first 8 users in 'Manage Users' table
    private void loadUsers() {
        DefaultTableModel tableModel = (DefaultTableModel) tableUsers.getModel();
        tableModel.setRowCount(0);
        
        // Load staffs in the first few rows first
        ArrayList<Staff> staffs = ResortBooking.getStaffs();
        int index = (staffs.size() >= 4) ? 4: staffs.size();
        for (int i = 0; i < index; i++) {
            addTableRow(tableModel, staffs.get(i), "complex");
        }

        // Load few customers in the next couple of rows
        ArrayList<User> customers = ResortBooking.getCusts();
        index = (customers.size() >= 4) ? 4 : customers.size();
        for (int i = 0; i < index; i++) {
            addTableRow(tableModel, customers.get(i), "complex");
        }
    }
    
    // Ensure check in date is tomorrow or later
    private boolean validateToday() {
        try {
            Date chkIn = datef.parse(chkInDate);
            Calendar calendar = Calendar.getInstance();
            Date today = calendar.getTime();
            
            if (chkIn.compareTo(today) < 0) { 
                // Attempting to check in today or before today
                JOptionPane.showMessageDialog(this, "Earliest check in date is tomorrow.");
                chkInDate = "";
                txtChkIn.setText("");
                txtMngCheckIn.setText("");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    // Validate booking dates are logical
    private boolean validateBookingDates() {
        try {
            Date chkIn = datef.parse(chkInDate);
            Date chkOut = datef.parse(chkOutDate);
            
            // Logical validation
            if (!validateToday()) {
                return false;
            } else if (chkIn.compareTo(chkOut) >= 0) {
                // check in date > check out date - illogical
                JOptionPane.showMessageDialog(this, "Check in date must be before check out date.");
                chkInDate = "";
                chkOutDate = "";
                lblNights.setText("0");
                txtChkIn.setText("");
                txtChkOut.setText("");
                txtMngCheckIn.setText("");
                txtMngCheckOut.setText("");
                return false;
            }

            // Duration validation (max 7 days per booking)
            long timeDiff = chkOut.getTime() - chkIn.getTime();
            int duration = (int) TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);
            if (duration > 7) {
                JOptionPane.showMessageDialog(this, "Maximum of 7 days per booking.");
                chkInDate = "";
                chkOutDate = "";
                lblNights.setText("0");
                txtChkIn.setText("");
                txtChkOut.setText("");
                return false;
            }
            daysOfStay = duration;
            lblNights.setText(String.valueOf(daysOfStay));
            setBookingPrice();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }         
    }
    
    private Booking validateBookingID() {
        try {
            int bookingID = Integer.parseInt(txtBookIdReceipt.getText().trim());
            Booking booking = Booking.getBooking(bookingID);
            if (booking != null)
                return booking;
            else
                return null;
        } catch (Exception e) {
            return null;
        }
    }
    
    private void loadReceipt(Booking booking) {
        receiptID = booking.getBookingID();
        float subtotal = (float) ResortBooking.getPrice() * booking.getDaysOfStay();
        float serviceTax = subtotal * ResortBooking.getServiceTax();
        float total = booking.getRoomPrice();

        txtAreaReceipt.setText("  *******************************************\n");
        txtAreaReceipt.setText(txtAreaReceipt.getText() + String.format("  *                  BOOKING #%d RECEIPT              *\n", booking.getBookingID()));
        txtAreaReceipt.setText(txtAreaReceipt.getText() + "  *******************************************\n");
        txtAreaReceipt.setText(txtAreaReceipt.getText() + String.format("\t %s \n\n", booking.getBookingDate()));

        txtAreaReceipt.setText(txtAreaReceipt.getText() + String.format("  Guest Name:\t\t%s\n", User.getCustName(booking.getUserID())));
        txtAreaReceipt.setText(txtAreaReceipt.getText() + String.format("  Guest ID:\t\t%d\n", booking.getUserID()));
        txtAreaReceipt.setText(txtAreaReceipt.getText() + String.format("  Room ID:\t\t%s\n", booking.getRoomID()));
        txtAreaReceipt.setText(txtAreaReceipt.getText() + String.format("  Check In Date:\t%s\n", booking.getCheckInDate()));
        txtAreaReceipt.setText(txtAreaReceipt.getText() + String.format("  Check Out Date:\t%s\n", booking.getCheckOutDate()));
        txtAreaReceipt.setText(txtAreaReceipt.getText() + String.format("  Days of Stay:\t\t%s\n", booking.getRoomID()));
        txtAreaReceipt.setText(txtAreaReceipt.getText() + String.format("  Price per Night:\tRM%d.00\n", ResortBooking.getPrice()));
        txtAreaReceipt.setText(txtAreaReceipt.getText() + String.format("  Subtotal:\t\tRM%.2f\n", subtotal));
        txtAreaReceipt.setText(txtAreaReceipt.getText() + String.format("  Service Tax (10%%):\tRM%.2f\n", serviceTax));
        txtAreaReceipt.setText(txtAreaReceipt.getText() + String.format("  Tourism Tax:\t\tRM%d.00\n", ResortBooking.getTourismTax()));

        txtAreaReceipt.setText(txtAreaReceipt.getText() + "  ___________________________________________\n");
        txtAreaReceipt.setText(txtAreaReceipt.getText() + String.format("   TOTAL:\t\tRM%.2f\n", total));
    }
    
    // Populate summary of room booking in 'book room' tab
    private void setBookingPrice() {
        float subtotal = (float) ResortBooking.getPrice() * daysOfStay;
        float serviceTax = subtotal * ResortBooking.getServiceTax();
        float total = subtotal + serviceTax + ResortBooking.getTourismTax();
        lblSubtotal.setText(String.format("RM%.2f", subtotal));
        lblServiceTax.setText(String.format("RM%.2f", serviceTax));
        lblTourismTax.setText(String.format("RM%.2f", (float) ResortBooking.getTourismTax()));
        lblTotal.setText(String.format("RM%.2f", total));
    }
    
    private ArrayList<String> getAvailableRooms() {
        // Deepcopy rooms arraylist
        ArrayList<String> rooms = ResortBooking.getRooms();
        ArrayList<String> availableRooms = new ArrayList<String>();
        ArrayList<Booking> bookings = ResortBooking.getBookings();
        for (String room : rooms) {
            availableRooms.add(room);
        }
        
        // Iterate bookings 1 by 1 and check if its available,  
        // remove from the copied arraylist if not available
        for (Booking booking : bookings) {
            try {
                Date checkIn = datef.parse(booking.getCheckInDate());
                Date checkOut = datef.parse(booking.getCheckOutDate());
                Date reqCheckIn = datef.parse(chkInDate); // requested check in date
                Date reqCheckOut = datef.parse(chkOutDate); // requested check out date
                
                if (!availableRooms.contains(booking.getRoomID()) || reqCheckIn.compareTo(checkOut) >= 0 ||
                    reqCheckOut.compareTo(checkIn) <= 0) // Last 2 conditions denote room is still available
                    continue;
                else if (reqCheckIn.compareTo(checkOut) < 0 && reqCheckOut.compareTo(checkIn) >= 0)
                    availableRooms.remove(booking.getRoomID());

            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return availableRooms;
    }
    
    // =================   END OF HELPER FUNCTIONS   ==========================
    
    
    // ================== UI INTERACTIONS  ==========================
    private void btnChkInActionPerformed(java.awt.event.ActionEvent evt) {                                         
        chkInDate = datef.format(jCalendar1.getDate());
        txtChkIn.setText(chkInDate);
        lblChkIn.setText(chkInDate);
        validateToday();
        if (!chkOutDate.isEmpty()) {
            validateBookingDates();   
        } 
        bookRoomID = "";
        lblRoomID.setText("N/A");
    }                                        

    private void txtChkInActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void txtChkOutActionPerformed(java.awt.event.ActionEvent evt) {                                          

    }                                         

    private void btnChkOutActionPerformed(java.awt.event.ActionEvent evt) {                                          
        chkOutDate = datef.format(jCalendar1.getDate());
        txtChkOut.setText(chkOutDate);
        lblChkOut.setText(chkOutDate);
        if (!chkInDate.isEmpty()) {
            validateBookingDates();   
        }
        bookRoomID = "";
        lblRoomID.setText("N/A");
    }                                         

    private void btnSearchRoomActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if (chkInDate.isEmpty() || chkOutDate.isEmpty()) { // Validation
            JOptionPane.showMessageDialog(this, "Please fill in the dates first.");
        } else if (validateBookingDates()) { // Add all available rooms to list model
            ArrayList<String> availableRooms = getAvailableRooms();
            lm.removeAllElements();
            availableRooms.forEach((room) -> lm.addElement(room));
        }    
    }                                             

    private void btnProceedGuestActionPerformed(java.awt.event.ActionEvent evt) {                                                
        if (listAvailableRooms.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(this, "Please select a room before proceeding.");
        } else {
            bookRoomID = listAvailableRooms.getSelectedValue();
            lblRoomID.setText(bookRoomID);
            tabBookRoom.setSelectedIndex(1);
        }
    }                                               

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {                                          
        this.setVisible(false);
        new LoginFrame().setVisible(true);
    }                                         

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void btnUserSearchActionPerformed(java.awt.event.ActionEvent evt) {                                              
        String role = comRole.getSelectedItem().toString().toLowerCase();                                              
        String gender = comGender.getSelectedItem().toString().toLowerCase();
        String name = txtUserFullName.getText().trim().toLowerCase();
        String contact = txtContact.getText().trim();
        String email = txtEmail.getText().trim();
        String ic = txtNric.getText().trim();
        String username = txtUsername.getText().trim().toLowerCase();
        List<User> users = new ArrayList<User>();

        if (role.equals("staff")) {
            for (Staff staff : ResortBooking.getStaffs()) {
                users.add(staff);
            }
        } else { // customers
            users = ResortBooking.getCusts();
        }

        DefaultTableModel tableModel = (DefaultTableModel) tableUsers.getModel();
        tableModel.setRowCount(0); // Delete all previous rows
        
        // Adding all customers who hv the matched description to table
        for (User user : users) {

            if (user.getName().toLowerCase().contains(name) && gender.equals(user.getGender().toLowerCase()) 
                && user.getContact().contains(contact) && user.getEmail().contains(email) &&
                user.getIC().contains(ic)) { // Common details matched

                // matching username for 'staff' role
                if (user.getRole().equals("Customer") || (user.getRole().equals("Staff") 
                    && user.getUsername().toLowerCase().contains(username))) {
                    row[0] = user.getUserID();
                    row[1] = user.getName();
                    row[2] = user.getRole();
                    row[3] = user.getGender();
                    row[4] = user.getContact();
                    row[5] = user.getEmail();
                    row[6] = user.getIC();
                    row[7] = user.getUsername();
                    tableModel.addRow(row);
                }
            }
        }
    }                                             

    private void txtUserFullNameActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void txtNricActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void btnUserAddActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String name = txtUserFullName.getText().trim();
        String contact = txtContact.getText().trim();
        String email = txtEmail.getText().trim();
        String ic = txtNric.getText().trim();
        String gender = comGender.getSelectedItem().toString().toLowerCase();
        String role = comRole.getSelectedItem().toString();
        String username = txtUsername.getText().trim();
        String password = new String(pass.getPassword()).trim();
        
        if (name.isEmpty() || contact.isEmpty() || email.isEmpty() || ic.isEmpty())
            JOptionPane.showMessageDialog(this, "Please fill in all necessary information to add user.");
        else if (role.equals("Staff") && (username.isEmpty() || password.isEmpty()))
            JOptionPane.showMessageDialog(this, "Please fill in username and password to add staff.");
        else { 
            // complete information provided
            ArrayList<String> custInfo = new ArrayList<String>();
            User user = new User();
            
            if (role.equals("Customer")) {
                Collections.addAll(custInfo, "-1", "customer", name, gender, contact, email, ic);
                user = new User(custInfo);
            } else {
                Collections.addAll(custInfo, "-1", "staff", name, gender, contact, email, ic, username, password);
                user = new Staff(custInfo);
            }

            if (!user.isDuplicate()) {
                user.addToFile();
                loadUsers();
                JOptionPane.showMessageDialog(this, "User added successfully");
            } else {
                user = null; // Deleting it (by making it eligible for garbage collection)
                JOptionPane.showMessageDialog(this, "User not added - Duplication detected.");
            }
        }
    }                                          

    private void btnUserEditActionPerformed(java.awt.event.ActionEvent evt) {                                            
        DefaultTableModel tableModel = (DefaultTableModel) tableUsers.getModel();                                            
        int row = tableUsers.getSelectedRow();
        String name = txtUserFullName.getText().trim();
        String contact = txtContact.getText().trim();
        String email = txtEmail.getText().trim();
        String ic = txtNric.getText().trim();
        // String username = txtUsername.getText().trim().toLowerCase();

        if (row < 0)
            JOptionPane.showMessageDialog(this, "Please select a user to edit.");
        else if (name.isEmpty() || contact.isEmpty() || email.isEmpty() || ic.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Incomplete information.");
        } else {
            int userID = (int) tableUsers.getValueAt(row, 0); // UserID col
            List<User> users = new ArrayList<User>();
            
            if (((String) tableModel.getValueAt(row, 2)).equals("Staff")) {
                for (Staff staff : ResortBooking.getStaffs()) {
                    users.add(staff); }
            } else {
                users = ResortBooking.getCusts();
            }

            for (User user : users) {
                if (user.getUserID() == userID) {
                    user.updateInfo(name, contact, email, ic);
                    JOptionPane.showMessageDialog(this, "User updated successfully.");
                    break;
                }
            }
        }
    }                                           

    private void btnUserDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                              
        DefaultTableModel tableModel = (DefaultTableModel) tableUsers.getModel();                                            
        int row = tableUsers.getSelectedRow();

        if (row < 0)
            JOptionPane.showMessageDialog(this, "Please select a user to delete.");
        else {
            int userID = (int) tableUsers.getValueAt(row, 0); // UserID col
            List<User> users = new ArrayList<User>();
            
            if (((String) tableModel.getValueAt(row, 2)).equals("Staff")) {
                for (Staff staff : ResortBooking.getStaffs()) {
                    users.add(staff); }
            } else {
                users = ResortBooking.getCusts();
            }

            for (User user : users) {
                if (user.getUserID() == userID) {
                    if (user.getRole() == "Staff")
                        ResortBooking.getStaffs().remove(user);
                    else
                        ResortBooking.getCusts().remove(user);
                    User.rewriteFile();
                    tableModel.removeRow(row);
                    txtUserFullName.setText("");
                    txtContact.setText("");
                    txtEmail.setText("");
                    txtNric.setText("");
                    txtUsername.setText("");
                    JOptionPane.showMessageDialog(this, "User deleted successfully.");
                    break;
                }
            }
        }
    }                                             

    private void txtGuestNameActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void btnSearchGuestActionPerformed(java.awt.event.ActionEvent evt) {                                               
        String name = txtGuestName.getText().trim().toLowerCase();
        if (name.isEmpty()) {
            loadGuest();
            JOptionPane.showMessageDialog(this, "Please insert guest name to search.");
        } else {
            ArrayList<User> customers = ResortBooking.getCusts();
            DefaultTableModel tableModel = (DefaultTableModel) tableBookRoomGuest.getModel();
            tableModel.setRowCount(0); // Delete all previous rows

            // Adding all customers who hv the matched name to table
            for (User cust : customers) {
                if (cust.getName().toLowerCase().contains(name)) {
                    row[0] = cust.getUserID();
                    row[1] = cust.getName();
                    row[2] = cust.getGender();
                    row[3] = cust.getContact();
                    row[4] = cust.getEmail();
                    row[5] = cust.getIC();
                    tableModel.addRow(row);
                }
            }
        }
    }                                              

    private void btnConfirmBookActionPerformed(java.awt.event.ActionEvent evt) {                                               
        if (chkInDate.isEmpty() || chkOutDate.isEmpty() || guestID == -1 || bookRoomID.isEmpty())
            JOptionPane.showMessageDialog(this, "Please fill in all necessary details before proceeding.");
        else {
            ArrayList<String> bookingInfo = new ArrayList<String>();
            Calendar calendar = Calendar.getInstance();
            String today = datef.format(calendar.getTime());
            Collections.addAll(bookingInfo, "-1", String.valueOf(guestID), bookRoomID, chkInDate, chkOutDate, today);
            Booking booking = new Booking(bookingInfo);
            if (!booking.isDuplicate()) {
                booking.addToFile();
                JOptionPane.showMessageDialog(this, "Booking successful.");
            } else {
                booking = null; // Deleting it (by making it eligible for garbage collection)
                JOptionPane.showMessageDialog(this, "Booking denied - Duplicate booking detected.");
            }
        }  
    }                                              

    private void listAvailableRoomsValueChanged(javax.swing.event.ListSelectionEvent evt) {                                                

    }                                               

    private void btnSelectGuestActionPerformed(java.awt.event.ActionEvent evt) {                                               
        int rowSelected = tableBookRoomGuest.getSelectedRow();
        if (rowSelected < 0)
            JOptionPane.showMessageDialog(this, "Please select a guest first.");
        else {
            guestID = (int) tableBookRoomGuest.getValueAt(rowSelected, 0); // UserID col
            txtGuestName.setText((String) tableBookRoomGuest.getValueAt(rowSelected, 1));
        }
    }                                              

    private void tableBookRoomGuestMouseClicked(java.awt.event.MouseEvent evt) {                                                
        DefaultTableModel tableModel = (DefaultTableModel) tableBookRoomGuest.getModel();
        int row = tableBookRoomGuest.getSelectedRow();
        
        if (row >= 0)
            txtGuestName.setText((String) tableModel.getValueAt(row, 1));
    }                                               

    private void tableUsersMouseClicked(java.awt.event.MouseEvent evt) {                                        
        DefaultTableModel tableModel = (DefaultTableModel) tableUsers.getModel();
        int row = tableUsers.getSelectedRow();
        
        if (row >= 0) {
            txtUserFullName.setText((String) tableModel.getValueAt(row, 1));
            comRole.setSelectedItem((String) tableModel.getValueAt(row, 2));
            comGender.setSelectedItem((String) tableModel.getValueAt(row, 3));
            txtContact.setText((String) tableModel.getValueAt(row, 4));
            txtEmail.setText((String) tableModel.getValueAt(row, 5));
            txtNric.setText((String) tableModel.getValueAt(row, 6));
            
            if (((String) tableModel.getValueAt(row, 7)).equals("staff"))
                txtUsername.setText((String) tableModel.getValueAt(row, 7));
        }
    }                                       

    private void btnBookingsSearchActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        String name = txtBookedGuestName.getText().toLowerCase().trim();      
        String strCheckIn = txtMngCheckIn.getText();
        String strCheckOut = txtMngCheckOut.getText();
        lblMngBookingID.setText("N/A");                                  
        
        if (name.isEmpty() && strCheckIn.isEmpty() && strCheckOut.isEmpty()) {
            loadBookings();
            JOptionPane.showMessageDialog(this, "Please provide some information to search.");
        } else {
            ArrayList<Booking> bookings = ResortBooking.getBookings();
            DefaultTableModel tableModel = (DefaultTableModel) tableBookings.getModel();
            tableModel.setRowCount(0); // Delete all previous row
            Date searchCheckIn = new Date();
            Date searchCheckOut = new Date();
            Date checkIn = new Date();
            Date checkOut = new Date();

            for (Booking booking : bookings) {
                try {
                    if (!strCheckIn.isEmpty() && !strCheckOut.isEmpty()) {
                        searchCheckIn = datef.parse(txtMngCheckIn.getText());
                        searchCheckOut = datef.parse(txtMngCheckOut.getText());
                    }
                    checkIn = datef.parse(booking.getCheckInDate());
                    checkOut = datef.parse(booking.getCheckOutDate());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Invalid date entered.");
                }

                // User only inputs name without giving date
                if (strCheckIn.isEmpty() && strCheckOut.isEmpty() &&  
                    User.getCustName(booking.getUserID()).toLowerCase().contains(name)) {
                    addTableRow(tableModel, booking); // Add to table
                } 
                else if (!strCheckIn.isEmpty() && !strCheckOut.isEmpty() && 
                    (checkIn.compareTo(searchCheckIn) >= 0) && (checkOut.compareTo(searchCheckOut) <= 0)) {
                    // check in and out dates meet condition
                    if (name.isEmpty() || (!name.isEmpty() && 
                        User.getCustName(booking.getUserID()).toLowerCase().contains(name)))
                        addTableRow(tableModel, booking); // Add to table
                }
                else if (strCheckIn.isEmpty() && !strCheckOut.isEmpty() && (checkOut.compareTo(searchCheckOut) <= 0)) {
                    // only check out date is provided
                    if (name.isEmpty() || (!name.isEmpty() && 
                        User.getCustName(booking.getUserID()).toLowerCase().contains(name)))
                        addTableRow(tableModel, booking); // Add to table 
                }
                else if (strCheckOut.isEmpty() && strCheckIn.isEmpty() && (checkIn.compareTo(searchCheckIn) >= 0)) {
                    // only check in date is provided
                    if (name.isEmpty() || (!name.isEmpty() && 
                        User.getCustName(booking.getUserID()).toLowerCase().contains(name)))
                        addTableRow(tableModel, booking); // Add to table
                }
            }
        }
    }                                                 

    private void btnBookingsEditActionPerformed(java.awt.event.ActionEvent evt) {                                                
        DefaultTableModel tableModel = (DefaultTableModel) tableBookings.getModel();
        int row = tableBookings.getSelectedRow();
        
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit.");            
        } else if (chkInDate.isEmpty() || chkOutDate.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in the dates first.");
        } else {
            if (validateBookingDates()) {
                String room = (String) tableModel.getValueAt(row, 1);
                ArrayList<String> availableRooms = getAvailableRooms();
                if (availableRooms.contains(room)) {
                    // passed all validations - save to edit
                    int bookingID = (int) tableModel.getValueAt(row, 0);
                    for (Booking booking : ResortBooking.getBookings()) {
                        if (booking.getBookingID() == bookingID) {
                            booking.updateInfo(chkInDate, chkOutDate);
                            JOptionPane.showMessageDialog(this, "Booking info successfully updated.");
                            break;
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, String.format("Room %s is not available for the given dates.", room));
                }
            }       
        }
    }                                               

    private void btnBookingsDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        DefaultTableModel tableModel = (DefaultTableModel) tableBookings.getModel();                                            
        int row = tableBookings.getSelectedRow();

        if (row < 0)
            JOptionPane.showMessageDialog(this, "Please select a booking to delete.");
        else {
            int bookingID = (int) tableBookings.getValueAt(row, 0); // BookingID col

            for (Booking booking : ResortBooking.getBookings()) {
                if (booking.getBookingID() == bookingID) {
                    ResortBooking.getBookings().remove(booking);
                    Booking.rewriteFile();
                    tableModel.removeRow(row);
                    lblMngBookingID.setText("N/A");
                    txtMngCheckIn.setText("");
                    txtMngCheckOut.setText("");
                    chkInDate = "";
                    chkOutDate = "";
                    JOptionPane.showMessageDialog(this, "Booking record deleted successfully.");
                    break;
                }
            }
        }                                          
    }                                                 

    private void tableBookingsMouseClicked(java.awt.event.MouseEvent evt) {                                           
        DefaultTableModel tableModel = (DefaultTableModel) tableBookings.getModel();
        int row = tableBookings.getSelectedRow();
        
        if (row >= 0) {
            chkInDate = (String) tableModel.getValueAt(row, 4);
            chkOutDate = (String) tableModel.getValueAt(row, 5);
            lblMngBookingID.setText(String.valueOf(tableModel.getValueAt(row, 0)));
            txtBookedGuestName.setText((String) tableModel.getValueAt(row, 3));
            txtMngCheckIn.setText(chkInDate);
            txtMngCheckOut.setText(chkOutDate);   
        }   
    }                                          

    private void btnMngCheckInActionPerformed(java.awt.event.ActionEvent evt) {                                              
        chkInDate = datef.format(jCalendar2.getDate());
        txtMngCheckIn.setText(chkInDate);
    }                                             

    private void txtMngCheckInActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void btnMngCheckOutActionPerformed(java.awt.event.ActionEvent evt) {                                               
        chkOutDate = datef.format(jCalendar2.getDate());
        txtMngCheckOut.setText(chkOutDate);
    }                                              

    private void txtMngCheckOutActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void txtBookedGuestNameActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void txtBookIdReceiptActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void btnNextReceiptActionPerformed(java.awt.event.ActionEvent evt) {
        Booking booking = null;                                               
        
        while (booking == null) {
            receiptID++;
            if (receiptID >= 0 && receiptID <= Booking.getHighestId()) {
                booking = Booking.getBooking(receiptID);
                if (booking != null) {
                    loadReceipt(booking);
                    break;
                }
            } else { // Already at last record
                receiptID--;
                break;
            }
        }
    }                                              

    private void btnPrintReceiptActionPerformed(java.awt.event.ActionEvent evt) {                                                
        try {
            txtAreaReceipt.print();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Could not print, check your printer.");
        }
    }                                               

    private void btnSearchReceiptActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        Booking booking = validateBookingID();
        if (booking == null)                                                
            JOptionPane.showMessageDialog(this, "Invalid Booking ID.");
        else
            loadReceipt(booking); // populate receipt
    }                                                

    private void btnFirstReceiptActionPerformed(java.awt.event.ActionEvent evt) {
        int first = 0;  
        Booking booking = Booking.getBooking(first);
        boolean hasRecord = true;
        
        while (booking == null) {
            first++;
            if (first > ResortBooking.getBookings().size()) {
                JOptionPane.showMessageDialog(this, "No booking receipts to show.");
                hasRecord = false;
                break;
            } else { 
                booking = Booking.getBooking(first);
            }
        }

        if (hasRecord)
            loadReceipt(booking);
    }                                               

    private void btnPreviousReceiptActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        Booking booking = null;                                               
        
        while (booking == null) {
            receiptID--;
            if (receiptID >= 0 && receiptID < ResortBooking.getBookings().size()) {
                booking = Booking.getBooking(receiptID);
                if (booking != null) {
                    loadReceipt(booking);
                    break;
                }
            } else { // Already at first record
                receiptID++;
                break;
            }
        }
    }                                                  

    private void btnLastReceiptActionPerformed(java.awt.event.ActionEvent evt) {
        int last = Booking.getHighestId();  
        Booking booking = Booking.getBooking(last);
        boolean hasRecord = true;
        
        while (booking == null) {
            last--;
            if (last < 0) {
                JOptionPane.showMessageDialog(this, "No booking receipts to show.");
                hasRecord = false;
                break;
            } else {
                booking = Booking.getBooking(last);
            }
        }

        if (hasRecord)
            loadReceipt(booking);
    }                                              

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnBookingsDelete;
    private javax.swing.JButton btnBookingsEdit;
    private javax.swing.JButton btnBookingsSearch;
    private javax.swing.JButton btnChkIn;
    private javax.swing.JButton btnChkOut;
    private javax.swing.JButton btnConfirmBook;
    private javax.swing.JButton btnFirstReceipt;
    private javax.swing.JButton btnLastReceipt;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMngCheckIn;
    private javax.swing.JButton btnMngCheckOut;
    private javax.swing.JButton btnNextReceipt;
    private javax.swing.JButton btnPreviousReceipt;
    private javax.swing.JButton btnPrintReceipt;
    private javax.swing.JButton btnProceedGuest;
    private javax.swing.JButton btnSearchGuest;
    private javax.swing.JButton btnSearchReceipt;
    private javax.swing.JButton btnSearchRoom;
    private javax.swing.JButton btnSelectGuest;
    private javax.swing.JButton btnUserAdd;
    private javax.swing.JButton btnUserDelete;
    private javax.swing.JButton btnUserEdit;
    private javax.swing.JButton btnUserSearch;
    private javax.swing.JComboBox<String> comGender;
    private javax.swing.JComboBox<String> comRole;
    private javax.swing.JPanel formBook;
    private javax.swing.JPanel formBook1;
    private javax.swing.JPanel formBook2;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JCalendar jCalendar2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblChkIn;
    private javax.swing.JLabel lblChkOut;
    private javax.swing.JLabel lblMngBookingID;
    private javax.swing.JLabel lblNights;
    private javax.swing.JLabel lblRoomID;
    private javax.swing.JLabel lblServiceTax;
    private javax.swing.JLabel lblSkyResort;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTourismTax;
    private javax.swing.JList<String> listAvailableRooms;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPanel pnlBookRoom;
    private javax.swing.JPanel pnlBookRoom1;
    private javax.swing.JPanel pnlBookRoom2;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JTabbedPane tabBookRoom;
    private javax.swing.JPanel tabManageBookings;
    private javax.swing.JPanel tabManageUsers;
    private javax.swing.JPanel tabReceipts;
    private javax.swing.JTable tableBookRoomGuest;
    private javax.swing.JTable tableBookings;
    private javax.swing.JTable tableUsers;
    private javax.swing.JTextArea txtAreaReceipt;
    private javax.swing.JTextField txtBookIdReceipt;
    private javax.swing.JTextField txtBookedGuestName;
    private javax.swing.JTextField txtChkIn;
    private javax.swing.JTextField txtChkOut;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGuestName;
    private javax.swing.JTextField txtMngCheckIn;
    private javax.swing.JTextField txtMngCheckOut;
    private javax.swing.JTextField txtNric;
    private javax.swing.JTextField txtUserFullName;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration                   
}
