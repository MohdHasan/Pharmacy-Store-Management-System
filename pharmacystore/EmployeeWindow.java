package pharmacystore;

import DB.DBConnection;
import java.text.MessageFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EmployeeWindow extends javax.swing.JFrame {

    String user;

    public EmployeeWindow() {
        initComponents();
        setResizable(false);
        setLocation(60, 50);
        setTitle("EMPLOYEE WINDOW");
    }

    public EmployeeWindow(String uname) {
        initComponents();
        user = uname;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        GenerateInvoice = new javax.swing.JInternalFrame();
        jPanel11 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        Invoice = new javax.swing.JInternalFrame();
        jPanel13 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jButton31 = new javax.swing.JButton();
        Change_password = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        View_Profile = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButton1.setFont(new java.awt.Font("Sylfaen", 0, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/UI Details.png"))); // NOI18N
        jButton1.setToolTipText("View Profile");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(65, 65));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setFont(new java.awt.Font("Sylfaen", 0, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/application_view_detail.png"))); // NOI18N
        jButton2.setToolTipText("Generate Invoice");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setMaximumSize(new java.awt.Dimension(65, 65));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setFont(new java.awt.Font("Sylfaen", 0, 16)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/icon_info.png"))); // NOI18N
        jButton3.setToolTipText("Change Password");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMaximumSize(new java.awt.Dimension(65, 65));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setFont(new java.awt.Font("Sylfaen", 0, 16)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/gnome_stock_data_next_16.png"))); // NOI18N
        jButton4.setToolTipText("Log Out");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jDesktopPane1.setBackground(new java.awt.Color(255, 204, 204));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GenerateInvoice.setClosable(true);
        GenerateInvoice.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        GenerateInvoice.setIconifiable(true);
        GenerateInvoice.setMaximizable(true);
        GenerateInvoice.setResizable(true);
        GenerateInvoice.setTitle("Generate Invoice");
        GenerateInvoice.setFont(new java.awt.Font("Sylfaen", 0, 48)); // NOI18N
        GenerateInvoice.setVisible(true);

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 70)); // NOI18N
        jLabel54.setText("Genrate Invoice");
        jLabel54.setToolTipText("");
        jPanel11.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel55.setText("Medicine Name");
        jPanel11.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 40));

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel56.setText("Price");
        jPanel11.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 130, 30));

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel57.setText("Mfd Date");
        jPanel11.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 120, 30));

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel58.setText("Exp. Date");
        jPanel11.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 130, 30));

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel59.setText("Avl.Quantity");
        jPanel11.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 160, 40));

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel60.setText("Quantity");
        jPanel11.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 140, 30));

        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel11.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 890, 40));

        jTextField36.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField36.setToolTipText("");
        jTextField36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField36ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField36, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 260, 460, 40));

        jTextField37.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField37.setToolTipText("");
        jPanel11.add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 350, 460, 40));

        jTextField38.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField38.setToolTipText("");
        jPanel11.add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 440, 460, 40));

        jTextField39.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField39.setToolTipText("");
        jPanel11.add(jTextField39, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 450, 40));

        jTextField40.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField40.setToolTipText("");
        jPanel11.add(jTextField40, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 660, 460, 40));

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)), "Customer Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 26))); // NOI18N

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel61.setText("Customer Name");

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel62.setText("Mobile Number");

        jTextField41.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField41.setToolTipText("");

        jTextField42.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField42.setToolTipText("");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField41, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(jTextField42))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 310, 510, 330));

        jButton27.setBackground(new java.awt.Color(153, 255, 255));
        jButton27.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton27.setText("Buy Now");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 680, 150, 40));

        jButton28.setBackground(new java.awt.Color(153, 255, 153));
        jButton28.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton28.setText("Bill");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 680, 130, 40));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/banner_img.png"))); // NOI18N
        jPanel11.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 760));

        javax.swing.GroupLayout GenerateInvoiceLayout = new javax.swing.GroupLayout(GenerateInvoice.getContentPane());
        GenerateInvoice.getContentPane().setLayout(GenerateInvoiceLayout);
        GenerateInvoiceLayout.setHorizontalGroup(
            GenerateInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        GenerateInvoiceLayout.setVerticalGroup(
            GenerateInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
        );

        jDesktopPane1.add(GenerateInvoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 1340, 800));

        Invoice.setClosable(true);
        Invoice.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        Invoice.setIconifiable(true);
        Invoice.setMaximizable(true);
        Invoice.setResizable(true);
        Invoice.setTitle("Invoice");
        Invoice.setFont(new java.awt.Font("Sylfaen", 0, 48)); // NOI18N
        Invoice.setVisible(false);

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        jLabel64.setText("Invoice");
        jPanel13.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel65.setText("SHDC Pharma");
        jPanel13.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 40, 290, -1));

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel66.setText("Super Market,8755622053");
        jPanel13.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 90, -1, 40));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel13.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 98, 260, -1));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel13.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 140, 400, -1));

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel67.setText("Invoice Number");
        jPanel13.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 202, -1, 40));

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel68.setText("Customer Name");
        jPanel13.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 302, -1, 50));

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel69.setText("Invoice Date");
        jPanel13.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, 180, 50));

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel70.setText("Contact Number");
        jPanel13.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, -1, 40));

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setToolTipText("");
        jLabel71.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        jPanel13.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 260, 40));

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setToolTipText("");
        jLabel72.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        jPanel13.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 316, 380, 30));

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setToolTipText("");
        jLabel73.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        jPanel13.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 220, 380, 40));

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setToolTipText("");
        jLabel74.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        jPanel13.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 320, 360, 40));

        jScrollPane3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jTable3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 550, 320));

        jLabel75.setBackground(new java.awt.Color(102, 102, 255));
        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(0, 51, 51));
        jLabel75.setText("Paybale Amount");
        jPanel13.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 720, 200, 60));

        jLabel76.setBackground(new java.awt.Color(102, 102, 255));
        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel76.setText("Due Amount");
        jPanel13.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 730, 160, 30));

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setToolTipText("");
        jLabel77.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        jPanel13.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 730, 330, 40));

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setToolTipText("");
        jLabel78.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0))));
        jPanel13.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 730, 280, 30));

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel63.setIcon(new javax.swing.ImageIcon("E:\\medical\\istockphoto-943974286-1024x1024.jpg")); // NOI18N
        jPanel13.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 800));

        jButton31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton31.setText("Print");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InvoiceLayout = new javax.swing.GroupLayout(Invoice.getContentPane());
        Invoice.getContentPane().setLayout(InvoiceLayout);
        InvoiceLayout.setHorizontalGroup(
            InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InvoiceLayout.createSequentialGroup()
                .addContainerGap(1083, Short.MAX_VALUE)
                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(InvoiceLayout.createSequentialGroup()
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 1321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        InvoiceLayout.setVerticalGroup(
            InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InvoiceLayout.createSequentialGroup()
                .addGap(0, 800, Short.MAX_VALUE)
                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(InvoiceLayout.createSequentialGroup()
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jDesktopPane1.add(Invoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 1330, 880));

        Change_password.setClosable(true);
        Change_password.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        Change_password.setIconifiable(true);
        Change_password.setMaximizable(true);
        Change_password.setResizable(true);
        Change_password.setTitle("Change Password");
        Change_password.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Change_password.setVisible(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Sylfaen", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Change Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 350, 80));

        jPanel2.setBackground(new java.awt.Color(0, 204, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel4.setText("Old Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 240, 50));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel5.setText("New Password");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 50));

        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel6.setText("Confirm Password");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 320, 50));
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 250, 40));
        jPanel2.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 250, 40));
        jPanel2.add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 250, 40));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 40, -1, 200));

        jButton5.setBackground(new java.awt.Color(255, 204, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 140, 40));

        jButton6.setBackground(new java.awt.Color(204, 255, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton6.setText("Reset");
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 140, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 850, 290));

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\medical\\pexels-anna-shvets-3683098.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 670));

        javax.swing.GroupLayout Change_passwordLayout = new javax.swing.GroupLayout(Change_password.getContentPane());
        Change_password.getContentPane().setLayout(Change_passwordLayout);
        Change_passwordLayout.setHorizontalGroup(
            Change_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Change_passwordLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Change_passwordLayout.setVerticalGroup(
            Change_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane1.add(Change_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 1150, 710));

        View_Profile.setClosable(true);
        View_Profile.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        View_Profile.setIconifiable(true);
        View_Profile.setMaximizable(true);
        View_Profile.setResizable(true);
        View_Profile.setTitle("View Profile");
        View_Profile.setVisible(false);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Sylfaen", 0, 60)); // NOI18N
        jLabel8.setText("View Profile");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 360, 80));

        jButton7.setBackground(new java.awt.Color(255, 153, 153));
        jButton7.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jButton7.setText("VIEW");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 340, 160, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/Pharmacy_Banner-4-VARIETY-OF-VITAMINS-HOMEOPATHIC.jpg"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1660, 450));

        jTable1.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1600, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 1600, 330));

        javax.swing.GroupLayout View_ProfileLayout = new javax.swing.GroupLayout(View_Profile.getContentPane());
        View_Profile.getContentPane().setLayout(View_ProfileLayout);
        View_ProfileLayout.setHorizontalGroup(
            View_ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        View_ProfileLayout.setVerticalGroup(
            View_ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane1.add(View_Profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 1610, 810));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/Capture.PNG"))); // NOI18N
        jLabel1.setText("jLabel1");
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 1150, 710));

        jMenu1.setText("Profile");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(255, 102, 102));
        jMenuItem1.setText("View Profile");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Invoice");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(255, 102, 102));
        jMenuItem2.setText("Generate Invoice");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Account");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(255, 102, 102));
        jMenuItem3.setText("Change Password");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(255, 102, 102));
        jMenuItem4.setText("Log Out");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1727, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        if (jComboBox3.getSelectedItem() != null) {
            try {
                String med_name = "" + jComboBox3.getSelectedItem();
                DBConnection db = new DBConnection();
                db.pstmt = db.con.prepareStatement("select med_sp,med_mfd,med_exd,med_qty from stock_detail where med_qty>0 and med_name=?");
                db.pstmt.setString(1, med_name);
                db.rst = db.pstmt.executeQuery();
                if (db.rst.next()) {
                    jTextField36.setText(db.rst.getString(1));
                    jTextField37.setText(db.rst.getString(2));
                    jTextField38.setText(db.rst.getString(3));
                    jTextField39.setText(db.rst.getString(4));
                    jTextField36.setEditable(false);
                    jTextField37.setEditable(false);
                    jTextField38.setEditable(false);
                    jTextField39.setEditable(false);
                }
                /*/
            else
            {
                JOptionPane.showMessageDialog(this,"Not in Stock");
                jTextField36.setText("");
                jTextField37.setText("");
                jTextField38.setText("");
                jTextField39.setText("");
                jTextField40.setText("");
            }
                 */
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField36ActionPerformed
    int invc;
    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        int avl_qty = Integer.parseInt(jTextField39.getText());
        int qty = Integer.parseInt(jTextField40.getText());
        if (avl_qty >= qty) {
            try {
                String med_name = "" + jComboBox3.getSelectedItem().toString();
                String med_price = jTextField36.getText();
                String med_qty = jTextField40.getText();
                String custName = jTextField41.getText();
                String custmobile = jTextField42.getText();
                //String emp_id="employee";
                DBConnection db = new DBConnection();
                db.pstmt = db.con.prepareStatement("insert into invoice(invoice_id,med_name,med_price,med_qty,invc_date_time,cust_name,cust_contact,emp_id)values(?,?,?,?,?,?,?,?)");
                db.pstmt.setInt(1, invc);
                db.pstmt.setString(2, med_name);
                db.pstmt.setString(3, med_price);
                db.pstmt.setString(4, med_qty);
                db.pstmt.setString(5, new Date().toString());
                db.pstmt.setString(6, custName);
                db.pstmt.setString(7, custmobile);
                db.pstmt.setString(8, user);
                int i1 = db.pstmt.executeUpdate();
                db.pstmt = db.con.prepareStatement("update stock_detail set med_qty=? where med_name=?");
                db.pstmt.setInt(1, (avl_qty - qty));
                db.pstmt.setString(2, med_name);
                int i2 = db.pstmt.executeUpdate();
                if (i1 > 0 && i2 > 0) {
                    JOptionPane.showMessageDialog(this, "Add Cart in Successfully");
                    jTextField36.setText("");
                    jTextField37.setText("");
                    jTextField38.setText("");
                    jTextField40.setText("");
                    jTextField39.setText("");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Quantity");
            jTextField39.setText("");
        }

    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        try {
            int amt = 0, price, qty;
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select med_price,med_qty from invoice  where invoice_id=?");
            db.pstmt.setInt(1, invc);
            db.rst = db.pstmt.executeQuery();
            while (db.rst.next()) {
                price = db.rst.getInt(1);
                qty = db.rst.getInt(2);
                amt += (price * qty);
            }
            String custName = jTextField41.getText();
            String custmob = jTextField42.getText();
            db.pstmt = db.con.prepareStatement("insert into bill_detail(invc_no,date,cust_name,cust_cont,bill_amt)value(?,?,?,?,?)");
            db.pstmt.setInt(1, invc);
            db.pstmt.setString(2, new Date().toString());
            db.pstmt.setString(3, custName);
            db.pstmt.setString(4, custmob);
            db.pstmt.setInt(5, amt);
            int i1 = db.pstmt.executeUpdate();
            Vector<String> header = new Vector<String>();
            Vector<Vector<String>> data = new Vector<Vector<String>>();
            header.add("Medicine Name");
            header.add("Mfd. Date");
            header.add("Exp Date");
            header.add("Price");
            header.add("Quantity");
            header.add("Amount");
            db.pstmt = db.con.prepareStatement("Select invoice.med_name,stock_detail.med_mfd,stock_detail.med_exd,invoice.med_price,invoice.med_qty from invoice, stock_detail where invoice.med_name=stock_detail.med_name and invoice.invoice_id=?");
            db.pstmt.setInt(1, invc);
            db.rst = db.pstmt.executeQuery();
            while (db.rst.next()) {
                Vector<String> temp = new Vector<String>();
                temp.add(db.rst.getString(1));
                temp.add(db.rst.getString(2));
                temp.add(db.rst.getString(3));
                temp.add(db.rst.getString(4));
                temp.add(db.rst.getString(5));
                int amt1 = Integer.parseInt(db.rst.getString(4)) * Integer.parseInt(db.rst.getString(5));
                temp.add("" + amt1);
                data.add(temp);
            }
            jTable3.setModel(new DefaultTableModel(data, header));
            db.pstmt = db.con.prepareStatement("select date,cust_name,cust_cont,bill_amt from bill_detail where invc_no=?");
            db.pstmt.setInt(1, invc);
            db.rst = db.pstmt.executeQuery();
            if (db.rst.next()) {

                jLabel71.setText("" + invc);
                jLabel72.setText(db.rst.getString(1));
                jLabel73.setText(db.rst.getString(2));
                jLabel74.setText(db.rst.getString(3));
                jLabel77.setText(db.rst.getString(4));
            }
            Invoice.setVisible(true);
            GenerateInvoice.setVisible(false);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        MessageFormat header = new MessageFormat("Bill Report");
        MessageFormat Footer = new MessageFormat("page(0,number,integer)");
        try {
            jTable3.print(JTable.PrintMode.NORMAL, header, Footer);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select med_name from product_mstr");
            db.rst = db.pstmt.executeQuery();
            jComboBox3.removeAllItems();
            while (db.rst.next()) {
                jComboBox3.addItem(db.rst.getString(1));
            }
            GenerateInvoice.setVisible(true);
            db.pstmt = db.con.prepareStatement("select max(invc_no) from bill_detail");
            db.rst = db.pstmt.executeQuery();
            if (db.rst.next()) {
                invc = db.rst.getInt(1);
                invc++;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.setVisible(false);
        new LoginWindow().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        GenerateInvoice.setVisible(true);
        try {
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select med_name from product_mstr");
            db.rst = db.pstmt.executeQuery();
            jComboBox3.removeAllItems();
            while (db.rst.next()) {
                jComboBox3.addItem(db.rst.getString(1));
            }
            GenerateInvoice.setVisible(true);
            db.pstmt = db.con.prepareStatement("select max(invc_no) from bill_detail");
            db.rst = db.pstmt.executeQuery();
            if (db.rst.next()) {
                invc = db.rst.getInt(1);
                invc++;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            int a=JOptionPane.showConfirmDialog(this,"Do You Want To Update Password");
            if(a==0){
            String old_pswd = jPasswordField1.getText();
            String new_pswd = jPasswordField2.getText();
            String confm_pswd = jPasswordField3.getText();
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select * from emp_mstr  where password=?");
            db.pstmt.setString(1, old_pswd);
            db.rst = db.pstmt.executeQuery();
            if (db.rst.next()) 
            {
                if (confm_pswd.equals(new_pswd))
                {
                    db.pstmt = db.con.prepareStatement("UPDATE emp_mstr SET PASSWORD=?  WHERE email=?");
                    db.pstmt.setString(1,new_pswd);
                    db.pstmt.setString(2,user);
                    int i = db.pstmt.executeUpdate();
                    if(i>0) 
                    {
                        JOptionPane.showMessageDialog(this, "Password Update Successfully");
                        Change_password.setVisible(false);
                    }
                }
                else
                {
                        JOptionPane.showMessageDialog(this,"New And Confirm Password Does Not Match");
             }
            } 
            else 
            {
                JOptionPane.showMessageDialog(this, "old Password Does Not Match");
            }
            }
            else{
                    jPasswordField1.setText("");
                    jPasswordField2.setText("");
                    jPasswordField3.setText("");
                    }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
    this.setVisible(false);
    new LoginWindow().setVisible(true);
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      Change_password.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        new LoginWindow().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Change_password.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try{
            Vector<String> header =new Vector<String>();
            header.add("CODE");
            header.add("NAME");
            header.add("POST");
            header.add("DOB");
            header.add("QUALIFICATION");
            header.add("GENDER");
            header.add("ADDRESS");
            header.add("CONTACT");
            header.add("EMAIL");
            header.add("PASSWORD");
            Vector<Vector<String>> data=new Vector<Vector<String>>();
            DBConnection db=new DBConnection();
            db.pstmt=db.con.prepareStatement("Select * from emp_mstr where email=?");
            db.pstmt.setString(1,user);
            db.rst=db.pstmt.executeQuery();
            while(db.rst.next())
            {
                Vector<String> temp=new Vector<String>();
                temp.add(db.rst.getString(1));
                temp.add(db.rst.getString(2));
                temp.add(db.rst.getString(3));
                temp.add(db.rst.getString(4));
                temp.add(db.rst.getString(5));
                temp.add(db.rst.getString(6));
                temp.add(db.rst.getString(7));
                temp.add(db.rst.getString(8));
                temp.add(db.rst.getString(9));
                temp.add(db.rst.getString(10));
                data.add(temp);
            }
            jTable1.setModel(new DefaultTableModel(data,header));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        View_Profile.setVisible(true);
        try{
            Vector<String> header =new Vector<String>();
            header.add("CODE");
            header.add("NAME");
            header.add("POST");
            header.add("DOB");
            header.add("QUALIFICATION");
            header.add("GENDER");
            header.add("ADDRESS");
            header.add("CONTACT");
            header.add("EMAIL");
            header.add("PASSWORD");
            Vector<Vector<String>> data=new Vector<Vector<String>>();
            DBConnection db=new DBConnection();
            db.pstmt=db.con.prepareStatement("Select * from emp_mstr where email=?");
            db.pstmt.setString(1,user);
            db.rst=db.pstmt.executeQuery();
            while(db.rst.next())
            {
                Vector<String> temp=new Vector<String>();
                temp.add(db.rst.getString(1));
                temp.add(db.rst.getString(2));
                temp.add(db.rst.getString(3));
                temp.add(db.rst.getString(4));
                temp.add(db.rst.getString(5));
                temp.add(db.rst.getString(6));
                temp.add(db.rst.getString(7));
                temp.add(db.rst.getString(8));
                temp.add(db.rst.getString(9));
                temp.add(db.rst.getString(10));
                data.add(temp);
            }
            jTable1.setModel(new DefaultTableModel(data,header));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        View_Profile.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

   

    static class setVisible {

        public setVisible(boolean b) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame Change_password;
    private javax.swing.JInternalFrame GenerateInvoice;
    private javax.swing.JInternalFrame Invoice;
    private javax.swing.JInternalFrame View_Profile;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
