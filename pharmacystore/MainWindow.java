
package pharmacystore;

import DB.DBConnection;
import java.text.MessageFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

 
public class MainWindow extends javax.swing.JFrame {

    String user;
    public MainWindow()
    {
        initComponents();
        setResizable(false);
        setLocation(200,10);
        setTitle("Main Window");
    }  
    public MainWindow(String uname)
    {
    initComponents();
    user=uname;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        RegisterEmployee = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        EmployeeList = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        UpdateEmployee = new javax.swing.JInternalFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        AddMedicine = new javax.swing.JInternalFrame();
        jPanel6 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        AddStock = new javax.swing.JInternalFrame();
        jPanel7 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        ReorderList = new javax.swing.JInternalFrame();
        jPanel8 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        StockDetail = new javax.swing.JInternalFrame();
        jPanel9 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        Gen_Invoice = new javax.swing.JInternalFrame();
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
        GenerateInvoice = new javax.swing.JInternalFrame();
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
        SaleDetail = new javax.swing.JInternalFrame();
        jPanel15 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel79 = new javax.swing.JLabel();
        view_Invoice = new javax.swing.JInternalFrame();
        jPanel18 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jTextField43 = new javax.swing.JTextField();
        jButton32 = new javax.swing.JButton();
        jLabel81 = new javax.swing.JLabel();
        View_Invoice = new javax.swing.JInternalFrame();
        jPanel19 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jButton33 = new javax.swing.JButton();
        jLabel84 = new javax.swing.JLabel();
        Change_Password = new javax.swing.JInternalFrame();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jPasswordField4 = new javax.swing.JPasswordField();
        jSeparator7 = new javax.swing.JSeparator();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jLabel86 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);
        jToolBar1.setToolTipText("");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/add.png"))); // NOI18N
        jButton1.setToolTipText("Register Employee");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(25);
        jButton1.setMaximumSize(new java.awt.Dimension(35, 35));
        jButton1.setMinimumSize(new java.awt.Dimension(35, 35));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/tag-sale-16.png"))); // NOI18N
        jButton2.setToolTipText("Employee List");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(25);
        jButton2.setMaximumSize(new java.awt.Dimension(40, 40));
        jButton2.setMinimumSize(new java.awt.Dimension(35, 35));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/Search.png"))); // NOI18N
        jButton3.setToolTipText("Update employee");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton3.setMinimumSize(new java.awt.Dimension(35, 35));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/Info2.png"))); // NOI18N
        jButton4.setToolTipText("Add Medicine");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton4.setMinimumSize(new java.awt.Dimension(35, 35));
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/application_view_detail.png"))); // NOI18N
        jButton5.setToolTipText("Add Stock");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton5.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/tag-sale-16.png"))); // NOI18N
        jButton6.setToolTipText("Generate Invoice");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton6.setMinimumSize(new java.awt.Dimension(35, 35));
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/UI Details.png"))); // NOI18N
        jButton7.setToolTipText("Reorder List");
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton7);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/gnome_stock_data_next_16.png"))); // NOI18N
        jButton8.setToolTipText("Stock Detail");
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton8.setMinimumSize(new java.awt.Dimension(35, 35));
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton8);

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/application_view_detail.png"))); // NOI18N
        jButton9.setToolTipText("Sale Detail");
        jButton9.setFocusable(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton9.setMinimumSize(new java.awt.Dimension(35, 35));
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton9);

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/030.png"))); // NOI18N
        jButton10.setToolTipText("View Invoice By Bill Number");
        jButton10.setFocusable(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton10.setMinimumSize(new java.awt.Dimension(35, 35));
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton10);

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/tag-sale-16.png"))); // NOI18N
        jButton11.setToolTipText("View all Invoice");
        jButton11.setFocusable(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton11.setMinimumSize(new java.awt.Dimension(35, 35));
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton11);

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/icon_info.png"))); // NOI18N
        jButton12.setToolTipText("Change Password");
        jButton12.setFocusable(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton12.setMinimumSize(new java.awt.Dimension(35, 35));
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton12);

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/tag-sale-16.png"))); // NOI18N
        jButton13.setToolTipText("Sign Out");
        jButton13.setFocusable(false);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setIconTextGap(50);
        jButton13.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton13.setMinimumSize(new java.awt.Dimension(35, 35));
        jButton13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton13);

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegisterEmployee.setBackground(new java.awt.Color(102, 102, 255));
        RegisterEmployee.setClosable(true);
        RegisterEmployee.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        RegisterEmployee.setResizable(true);
        RegisterEmployee.setTitle("Employee Registrations");
        RegisterEmployee.setToolTipText("");
        RegisterEmployee.setVisible(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee Registration");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 480, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Employee Code");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 190, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Employee Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 200, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Post");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 70, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Date Of Birth");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 160, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Qualification");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 160, 60));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Gender");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 110, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Address");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 110, 60));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Contact");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, 110, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Email");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, 90, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("Password");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 120, 40));

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton1.setText("Male");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 580, -1, -1));

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setToolTipText("");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 360, 40));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.setToolTipText("");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 360, 40));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3.setToolTipText("");
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 360, 40));

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField4.setToolTipText("");
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 360, 40));

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField5.setToolTipText("");
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 360, 50));

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField6.setToolTipText("");
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, 400, 40));

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField7.setToolTipText("");
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, 400, 40));

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField8.setToolTipText("");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 320, 400, 40));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 412, 400, 40));

        jButton14.setBackground(new java.awt.Color(153, 255, 204));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton14.setText("Submit");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 510, 140, 50));

        jButton15.setBackground(new java.awt.Color(204, 255, 255));
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton15.setText("Reset");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 510, 140, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/Pharmacy_Banner-4-VARIETY-OF-VITAMINS-HOMEOPATHIC.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 770));

        javax.swing.GroupLayout RegisterEmployeeLayout = new javax.swing.GroupLayout(RegisterEmployee.getContentPane());
        RegisterEmployee.getContentPane().setLayout(RegisterEmployeeLayout);
        RegisterEmployeeLayout.setHorizontalGroup(
            RegisterEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        RegisterEmployeeLayout.setVerticalGroup(
            RegisterEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
        );

        jDesktopPane1.add(RegisterEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 1400, 810));

        EmployeeList.setClosable(true);
        EmployeeList.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        EmployeeList.setResizable(true);
        EmployeeList.setTitle("Employee List");
        EmployeeList.setVisible(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 51));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Employee List");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(553, 553, 553)
                .addComponent(jLabel13)
                .addContainerGap(525, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 110));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
        jTable1.setName(""); // NOI18N
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1370, 670));

        javax.swing.GroupLayout EmployeeListLayout = new javax.swing.GroupLayout(EmployeeList.getContentPane());
        EmployeeList.getContentPane().setLayout(EmployeeListLayout);
        EmployeeListLayout.setHorizontalGroup(
            EmployeeListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeListLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        EmployeeListLayout.setVerticalGroup(
            EmployeeListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane1.add(EmployeeList, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 1380, 810));

        UpdateEmployee.setClosable(true);
        UpdateEmployee.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        UpdateEmployee.setResizable(true);
        UpdateEmployee.setTitle("Update Employee");
        UpdateEmployee.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UpdateEmployee.setVisible(false);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel15.setText("Update Employee");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("Employee code");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("Emp. Name");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setText("Post");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setText("Date of Birdth");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setText("Qualification");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21.setText("Gender");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel22.setText("Address");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel23.setText("Contact");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel24.setText("E Mail");

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField10.setToolTipText("");

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField11.setToolTipText("");

        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField12.setToolTipText("");
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField13.setToolTipText("");

        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField14.setToolTipText("");

        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField15.setToolTipText("");
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField16.setToolTipText("");

        jTextField17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField17.setToolTipText("");
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton17.setText("UPDATE");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton18.setText("RESET");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(255, 0, 51));
        jButton19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton19.setText("Block Account");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(102, 255, 102));
        jButton20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton20.setText("UnBlockAccount");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(89, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton20)
                        .addGap(86, 86, 86))))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton17, jButton18, jButton19, jButton20});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton19)
                    .addComponent(jButton20))
                .addGap(25, 25, 25))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton17, jButton18, jButton19, jButton20});

        jButton16.setBackground(new java.awt.Color(255, 255, 102));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton16.setText("Search");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel19))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(238, 238, 238)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                                    .addComponent(jTextField11)
                                    .addComponent(jTextField10)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                                    .addComponent(jTextField14))
                                .addGap(173, 173, 173)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField16)
                                    .addComponent(jTextField17)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE))
                                .addContainerGap(116, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(696, 696, 696)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jSeparator1)
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField10, jTextField11, jTextField12, jTextField13, jTextField14, jTextField15, jTextField16, jTextField17});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(61, 61, 61)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(74, 74, 74)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextField10, jTextField11, jTextField12, jTextField13, jTextField14, jTextField15, jTextField16, jTextField17});

        javax.swing.GroupLayout UpdateEmployeeLayout = new javax.swing.GroupLayout(UpdateEmployee.getContentPane());
        UpdateEmployee.getContentPane().setLayout(UpdateEmployeeLayout);
        UpdateEmployeeLayout.setHorizontalGroup(
            UpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateEmployeeLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        UpdateEmployeeLayout.setVerticalGroup(
            UpdateEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane1.add(UpdateEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1520, 890));

        AddMedicine.setClosable(true);
        AddMedicine.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        AddMedicine.setResizable(true);
        AddMedicine.setTitle("Add Medicine");
        AddMedicine.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AddMedicine.setVisible(false);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setBackground(new java.awt.Color(204, 204, 204));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/99bad10a43b8dd84a785762f9f9b1d40.jpg"))); // NOI18N
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 170, 111));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 55)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 51, 0));
        jLabel27.setText("Add Medicine");
        jPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 27, 400, 110));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel28.setText("Medicine Name");
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 200, 40));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel29.setText("Company Name");
        jPanel6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 200, 40));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel30.setText("Medicine Formula");
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 220, 40));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel31.setText("Supplier");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 110, 40));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel32.setText("Contact(Company)");
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, 230, 50));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel33.setText("Contact(Supplier)");
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 650, 220, 50));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel34.setText("Medicine Purpose");
        jPanel6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 720, 220, 40));

        jTextField18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField18.setToolTipText("");
        jTextField18.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        jPanel6.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 192, 550, 40));

        jTextField19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField19.setToolTipText("");
        jTextField19.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        jPanel6.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 292, 550, 40));

        jTextField20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField20.setToolTipText("");
        jTextField20.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        jPanel6.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 382, 550, 40));

        jTextField21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField21.setToolTipText("");
        jTextField21.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 550, 40));

        jTextField22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField22.setToolTipText("");
        jTextField22.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        jPanel6.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, 550, 40));

        jTextField23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField23.setToolTipText("");
        jTextField23.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        jPanel6.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 642, 550, 40));

        jTextField24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField24.setToolTipText("");
        jTextField24.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        jPanel6.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 712, 550, 40));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel6.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 200, -1, 570));

        jButton21.setBackground(new java.awt.Color(102, 255, 102));
        jButton21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton21.setText("SUBMIT");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 320, 130, 50));

        jButton22.setBackground(new java.awt.Color(255, 51, 51));
        jButton22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton22.setText("RESET");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 460, 130, 50));

        javax.swing.GroupLayout AddMedicineLayout = new javax.swing.GroupLayout(AddMedicine.getContentPane());
        AddMedicine.getContentPane().setLayout(AddMedicineLayout);
        AddMedicineLayout.setHorizontalGroup(
            AddMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddMedicineLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        AddMedicineLayout.setVerticalGroup(
            AddMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane1.add(AddMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 1360, 800));

        AddStock.setClosable(true);
        AddStock.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        AddStock.setResizable(true);
        AddStock.setTitle("Add Stock");
        AddStock.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AddStock.setVisible(true);

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 70)); // NOI18N
        jLabel35.setText("Add Stock");

        jLabel36.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel36.setText("Medicine Name");

        jLabel37.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel37.setText("Cost Price");

        jLabel38.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel38.setText("Selling Price");

        jLabel39.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel39.setText("Mfd Date");

        jLabel40.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel40.setText("Exp Date");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setToolTipText("");
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel41.setText("Reorder Quantity");

        jLabel42.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel42.setText("Purchase Quantity");

        jTextField25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField25.setToolTipText("");
        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });

        jTextField26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField26.setToolTipText("");
        jTextField26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField26ActionPerformed(evt);
            }
        });

        jTextField27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField27.setToolTipText("");

        jTextField28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField28.setToolTipText("");

        jTextField29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField29.setToolTipText("");

        jTextField30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField30.setToolTipText("");
        jTextField30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField30ActionPerformed(evt);
            }
        });

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton23.setBackground(new java.awt.Color(102, 255, 102));
        jButton23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton23.setText("Add Stock");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(255, 102, 102));
        jButton24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton24.setText("Reset");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel40)
                                            .addComponent(jLabel38))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField27)
                                            .addComponent(jTextField28))))
                                .addGap(23, 23, 23)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(94, 94, 94)
                                        .addComponent(jButton23)
                                        .addGap(28, 28, 28)
                                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel42))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(592, 592, 592)
                        .addComponent(jLabel35))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField26, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel7Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel36, jLabel37, jLabel38, jLabel39, jLabel40, jLabel41, jLabel42});

        jPanel7Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField26, jTextField27, jTextField28});

        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel35)
                .addGap(60, 60, 60)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel42)
                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40))
                        .addGap(86, 86, 86))))
        );

        jPanel7Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel36, jLabel37, jLabel38, jLabel39, jLabel40, jLabel41, jLabel42});

        jPanel7Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextField25, jTextField26, jTextField27, jTextField28});

        javax.swing.GroupLayout AddStockLayout = new javax.swing.GroupLayout(AddStock.getContentPane());
        AddStock.getContentPane().setLayout(AddStockLayout);
        AddStockLayout.setHorizontalGroup(
            AddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AddStockLayout.setVerticalGroup(
            AddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane1.add(AddStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1490, 810));

        ReorderList.setClosable(true);
        ReorderList.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        ReorderList.setResizable(true);
        ReorderList.setTitle("Reorder List");
        ReorderList.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ReorderList.setVisible(false);

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setBackground(new java.awt.Color(255, 153, 153));
        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 0, 51));
        jLabel44.setText("Reorder List");
        jPanel8.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 330, -1));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Medicine Name");
        jPanel8.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, 50));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Cost Price");
        jPanel8.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, 50));

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Sale Price");
        jPanel8.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 100, 40));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Manufacturing Date");
        jPanel8.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, 60));

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Expiry Date");
        jPanel8.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 170, 50));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Current Quantity");
        jPanel8.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 670, -1, 50));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 102, 102));
        jLabel51.setText("Reorder List :");
        jPanel8.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 40, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "item1", "item2", "item3", "item4" }));
        jComboBox2.setToolTipText("");
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel8.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 830, 40));

        jTextField31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField31.setToolTipText("");
        jPanel8.add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 830, 40));

        jTextField32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField32.setToolTipText("");
        jTextField32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField32ActionPerformed(evt);
            }
        });
        jPanel8.add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 830, 40));

        jTextField33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField33.setToolTipText("");
        jPanel8.add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 830, 40));

        jTextField34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField34.setToolTipText("");
        jPanel8.add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, 830, 40));

        jTextField35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField35.setToolTipText("");
        jPanel8.add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 680, 830, 40));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/6739425-Digital-illustration-of-medical-symbol-and-medicine-in-color-background-Stock-Illustration.jpg"))); // NOI18N
        jPanel8.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 780));

        javax.swing.GroupLayout ReorderListLayout = new javax.swing.GroupLayout(ReorderList.getContentPane());
        ReorderList.getContentPane().setLayout(ReorderListLayout);
        ReorderListLayout.setHorizontalGroup(
            ReorderListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ReorderListLayout.setVerticalGroup(
            ReorderListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane1.add(ReorderList, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 1320, 820));

        StockDetail.setClosable(true);
        StockDetail.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        StockDetail.setResizable(true);
        StockDetail.setTitle("View Stock");
        StockDetail.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        StockDetail.setVisible(false);

        jPanel9.setBackground(new java.awt.Color(255, 102, 102));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 75)); // NOI18N
        jLabel52.setText("View Stock");
        jPanel9.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        jPanel10.setBackground(new java.awt.Color(255, 51, 51));

        jScrollPane2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jButton25.setBackground(new java.awt.Color(153, 255, 153));
        jButton25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton25.setText("VIEW");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setBackground(new java.awt.Color(255, 255, 102));
        jButton26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton26.setText("REFRESH");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(530, 530, 530)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jButton26)
                .addContainerGap(512, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout StockDetailLayout = new javax.swing.GroupLayout(StockDetail.getContentPane());
        StockDetail.getContentPane().setLayout(StockDetailLayout);
        StockDetailLayout.setHorizontalGroup(
            StockDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        StockDetailLayout.setVerticalGroup(
            StockDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StockDetailLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jDesktopPane1.add(StockDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 1370, 780));

        Gen_Invoice.setClosable(true);
        Gen_Invoice.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        Gen_Invoice.setResizable(true);
        Gen_Invoice.setTitle("Genrate Invoice");
        Gen_Invoice.setToolTipText("");
        Gen_Invoice.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Gen_Invoice.setVisible(false);

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
        jPanel11.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 790));

        javax.swing.GroupLayout Gen_InvoiceLayout = new javax.swing.GroupLayout(Gen_Invoice.getContentPane());
        Gen_Invoice.getContentPane().setLayout(Gen_InvoiceLayout);
        Gen_InvoiceLayout.setHorizontalGroup(
            Gen_InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Gen_InvoiceLayout.setVerticalGroup(
            Gen_InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane1.add(Gen_Invoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 1360, 830));

        GenerateInvoice.setClosable(true);
        GenerateInvoice.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        GenerateInvoice.setResizable(true);
        GenerateInvoice.setTitle("Invoice:SHDC Pharma");
        GenerateInvoice.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        GenerateInvoice.setVisible(false);

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        jLabel64.setText("Invoice");
        jPanel13.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel65.setText("SHDC Pharma");
        jPanel13.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(1034, 40, 290, -1));

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel66.setText("Super Market,8755622053");
        jPanel13.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 90, -1, 40));

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
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 550, 290));

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
        jPanel13.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 790));

        jButton31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton31.setText("Print");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GenerateInvoiceLayout = new javax.swing.GroupLayout(GenerateInvoice.getContentPane());
        GenerateInvoice.getContentPane().setLayout(GenerateInvoiceLayout);
        GenerateInvoiceLayout.setHorizontalGroup(
            GenerateInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GenerateInvoiceLayout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 1344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GenerateInvoiceLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        GenerateInvoiceLayout.setVerticalGroup(
            GenerateInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GenerateInvoiceLayout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton31)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jDesktopPane1.add(GenerateInvoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 1350, 870));

        SaleDetail.setClosable(true);
        SaleDetail.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        SaleDetail.setIconifiable(true);
        SaleDetail.setMaximizable(true);
        SaleDetail.setResizable(true);
        SaleDetail.setTitle("Sale Detail");
        SaleDetail.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        SaleDetail.setVisible(false);

        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 70)); // NOI18N
        jLabel80.setText("Sale Detail");
        jPanel15.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, -1));

        jPanel16.setBackground(new java.awt.Color(255, 0, 0));

        jScrollPane4.setBackground(new java.awt.Color(102, 102, 102));
        jScrollPane4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTable4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 1360, 240));

        jButton29.setBackground(new java.awt.Color(153, 255, 204));
        jButton29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton29.setText("VIEW");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 680, 130, 40));

        jButton30.setBackground(new java.awt.Color(102, 255, 204));
        jButton30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton30.setText("Max(amt)");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 680, 130, 40));

        jScrollPane7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTable5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(jTable5);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 840, 170));

        jLabel79.setIcon(new javax.swing.ImageIcon("E:\\medical\\pexels-anna-shvets-3683089.jpg")); // NOI18N
        jPanel15.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 750));

        javax.swing.GroupLayout SaleDetailLayout = new javax.swing.GroupLayout(SaleDetail.getContentPane());
        SaleDetail.getContentPane().setLayout(SaleDetailLayout);
        SaleDetailLayout.setHorizontalGroup(
            SaleDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SaleDetailLayout.setVerticalGroup(
            SaleDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane1.add(SaleDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 1380, 780));

        view_Invoice.setClosable(true);
        view_Invoice.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        view_Invoice.setIconifiable(true);
        view_Invoice.setMaximizable(true);
        view_Invoice.setResizable(true);
        view_Invoice.setTitle("View_Invoice_Bill_Detail");
        view_Invoice.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        view_Invoice.setVisible(false);

        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 153, 153));
        jLabel82.setText("Search Invoice Detail");
        jPanel18.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel83.setText("Enter Bill Number");
        jPanel18.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 60));
        jPanel18.add(jTextField43, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 490, 40));

        jButton32.setBackground(new java.awt.Color(204, 204, 255));
        jButton32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton32.setText("Search");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 180, 120, 40));

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/1-3_low.jpg"))); // NOI18N
        jPanel18.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 390));

        javax.swing.GroupLayout view_InvoiceLayout = new javax.swing.GroupLayout(view_Invoice.getContentPane());
        view_Invoice.getContentPane().setLayout(view_InvoiceLayout);
        view_InvoiceLayout.setHorizontalGroup(
            view_InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_InvoiceLayout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        view_InvoiceLayout.setVerticalGroup(
            view_InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane1.add(view_Invoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 1300, 430));

        View_Invoice.setClosable(true);
        View_Invoice.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        View_Invoice.setIconifiable(true);
        View_Invoice.setMaximizable(true);
        View_Invoice.setResizable(true);
        View_Invoice.setTitle("View_all_Invoioce");
        View_Invoice.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        View_Invoice.setVisible(false);

        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 70)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 102));
        jLabel85.setText("View All Invoice");
        jPanel19.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 490, 100));

        jScrollPane5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTable6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable6.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jTable6.setDropMode(javax.swing.DropMode.ON);
        jTable6.setRowHeight(35);
        jTable6.setRowMargin(10);
        jScrollPane5.setViewportView(jTable6);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        jPanel19.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 1300, 440));

        jButton33.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton33.setForeground(new java.awt.Color(255, 51, 51));
        jButton33.setText("VIEW");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 690, 110, 40));

        jLabel84.setIcon(new javax.swing.ImageIcon("E:\\medical\\12.PNG")); // NOI18N
        jPanel19.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 1310, 780));

        javax.swing.GroupLayout View_InvoiceLayout = new javax.swing.GroupLayout(View_Invoice.getContentPane());
        View_Invoice.getContentPane().setLayout(View_InvoiceLayout);
        View_InvoiceLayout.setHorizontalGroup(
            View_InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(View_InvoiceLayout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        View_InvoiceLayout.setVerticalGroup(
            View_InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(View_InvoiceLayout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jDesktopPane1.add(View_Invoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 1360, 820));

        Change_Password.setClosable(true);
        Change_Password.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        Change_Password.setIconifiable(true);
        Change_Password.setMaximizable(true);
        Change_Password.setResizable(true);
        Change_Password.setTitle("Change_Password");
        Change_Password.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Change_Password.setVisible(false);

        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setBackground(new java.awt.Color(255, 153, 102));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel87.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel87.setText("Old Password");
        jPanel22.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 240, 50));

        jLabel88.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel88.setText("New Password");
        jPanel22.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 260, 80));

        jLabel89.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel89.setText("Confirm Password");
        jPanel22.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));
        jPanel22.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 310, 50));
        jPanel22.add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 142, 310, 50));

        jPasswordField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField4ActionPerformed(evt);
            }
        });
        jPanel22.add(jPasswordField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 310, 50));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel22.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 10, 250));

        jButton34.setBackground(new java.awt.Color(153, 255, 153));
        jButton34.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jButton34.setText("Update Password");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, 170, 50));

        jButton35.setBackground(new java.awt.Color(153, 255, 153));
        jButton35.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jButton35.setText("Reset");
        jPanel22.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 180, 50));

        jPanel21.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 960, 340));

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/l_142.png"))); // NOI18N
        jPanel21.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1350, 820));

        javax.swing.GroupLayout Change_PasswordLayout = new javax.swing.GroupLayout(Change_Password.getContentPane());
        Change_Password.getContentPane().setLayout(Change_PasswordLayout);
        Change_PasswordLayout.setHorizontalGroup(
            Change_PasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Change_PasswordLayout.setVerticalGroup(
            Change_PasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane1.add(Change_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 1350, 850));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/medical_desktop_1366x768_hd-wallpaper-809731.jpg"))); // NOI18N
        jLabel14.setToolTipText("");
        jDesktopPane1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 1340, 790));

        jMenu1.setText("Employee");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(255, 51, 51));
        jMenuItem1.setText("Register Employee");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(255, 51, 51));
        jMenuItem2.setText("Employee List");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(255, 51, 51));
        jMenuItem3.setText("Update Employee");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Stock");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(255, 51, 51));
        jMenuItem4.setText("Add Medicine");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(255, 51, 51));
        jMenuItem5.setText("Add Stock");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Inovice");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem6.setForeground(new java.awt.Color(255, 51, 51));
        jMenuItem6.setText("Generate Invoice");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Reports");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem7.setForeground(new java.awt.Color(255, 51, 51));
        jMenuItem7.setText("Reorder List");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem8.setForeground(new java.awt.Color(255, 51, 51));
        jMenuItem8.setText("Stock Detail");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem9.setForeground(new java.awt.Color(255, 51, 51));
        jMenuItem9.setText("Sale Detail");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Invoice Report");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jMenuItem10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem10.setForeground(new java.awt.Color(255, 51, 51));
        jMenuItem10.setText("View Invoice By Bill Number");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuItem11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem11.setForeground(new java.awt.Color(255, 51, 51));
        jMenuItem11.setText("View all Invoice");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Account");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jMenuItem12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem12.setForeground(new java.awt.Color(255, 51, 51));
        jMenuItem12.setText("Change Password");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem12);

        jMenuItem13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuItem13.setForeground(new java.awt.Color(255, 51, 51));
        jMenuItem13.setText("Sign Out");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem13);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1082, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        SaleDetail.setVisible(true);
        try
        {
            Vector<String> header=new Vector<String>();
                    header.add("invc_id");
                    header.add("Date");
                    header.add("Customer Name");
                    header.add("customer Contact");
                    header.add("Bill Amount");
                     Vector<Vector<String>> data=new Vector<Vector<String>>();
                    DBConnection db=new DBConnection();
                    db.pstmt=db.con.prepareStatement("select * from bill_detail");
                    db.rst=db.pstmt.executeQuery();
                    while(db.rst.next())
                    {
                        Vector<String> temp=new Vector<String>();
                        temp.add(db.rst.getString(1));
                        temp.add(db.rst.getString(2));
                        temp.add(db.rst.getString(3));
                        temp.add(db.rst.getString(4));
                        temp.add(db.rst.getString(5));
                        data.add(temp);
                    }
                    jTable4.setModel(new DefaultTableModel(data,header));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        View_Invoice.setVisible(true);
        try
        {
            Vector<String> header=new Vector<String>();
                    header.add("invc_id");
                    header.add("Date");
                    header.add("Customer Name");
                    header.add("customer Contact");
                    header.add("Bill Amount");
                     Vector<Vector<String>> data=new Vector<Vector<String>>();
                    DBConnection db=new DBConnection();
                    db.pstmt=db.con.prepareStatement("select * from bill_detail");
                    db.rst=db.pstmt.executeQuery();
                    while(db.rst.next())
                    {
                        Vector<String> temp=new Vector<String>();
                        temp.add(db.rst.getString(1));
                        temp.add(db.rst.getString(2));
                        temp.add(db.rst.getString(3));
                        temp.add(db.rst.getString(4));
                        temp.add(db.rst.getString(5));
                        data.add(temp);
                    }
                    jTable6.setModel(new DefaultTableModel(data,header));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        AddMedicine.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try
        {
            DBConnection db=new DBConnection();
            db.pstmt=db.con.prepareStatement("select med_name from product_mstr");
            db.rst=db.pstmt.executeQuery();
            jComboBox1.removeAllItems();
            while(db.rst.next())
            {
            jComboBox1.addItem(db.rst.getString(1));
            }
            AddStock.setVisible(true);
        }
        catch(Exception e)
        {
        e.printStackTrace();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        RegisterEmployee.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        RegisterEmployee.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jPasswordField1.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        try{
            String code=jTextField1.getText();
            String name=jTextField2.getText();
            String post=jTextField3.getText();
            String dob=jTextField4.getText();
            String qua=jTextField5.getText();
            String gen="";
            if(jRadioButton1.isSelected())
            gen="Male";
            else
            gen="Femal";
            String addr=jTextField6.getText();
            String cont=jTextField7.getText();
            String email=jTextField8.getText();
            String pswd=jPasswordField1.getText();
            DBConnection db=new DBConnection();
            db.pstmt=db.con.prepareStatement("insert into emp_mstr values(?,?,?,?,?,?,?,?,?,?)");
            db.pstmt.setString(1, code);
            db.pstmt.setString(2, name);
            db.pstmt.setString(3, post);
            db.pstmt.setString(4, dob);
            db.pstmt.setString(5, qua);
            db.pstmt.setString(6, gen);
            db.pstmt.setString(7, addr);
            db.pstmt.setString(8, cont);
            db.pstmt.setString(9, email);
            db.pstmt.setString(10, pswd);
            int i=db.pstmt.executeUpdate();
            if(i>0)
            {
                JOptionPane.showMessageDialog(this,"Employee Registration Successfully");
            }
            else{
                JOptionPane.showMessageDialog(this,"Error in Employee Registration...");
            }             
        }
        catch(Exception e){
            e.printStackTrace();
        }
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        EmployeeList.setVisible(true);
        try{
            Vector<String> header=new Vector<String>();
            header.add("Employee Code");
            header.add("Employee Name");
            header.add("Post");
            header.add("DOB");
            header.add("Qualification");
            header.add("Gender");
            header.add("Address");
            header.add("Contact Name");
            header.add("E Mail");
            
            Vector<Vector<String>> data=new Vector<Vector<String>>();
            DBConnection db=new DBConnection();
            db.pstmt=db.con.prepareStatement("Select * from emp_mstr");
            db.rst=db.pstmt.executeQuery();
            while(db.rst.next()){
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
                data.add(temp);
            }
            jTable1.setModel(new DefaultTableModel(data,header));
            }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        UpdateEmployee.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        try{
            String code=jTextField9.getText();
            DBConnection db=new DBConnection();
            db.pstmt=db.con.prepareStatement("select * from emp_mstr where ecode=?");
            db.pstmt.setString(1, code);
            db.rst=db.pstmt.executeQuery();
            if(db.rst.next())
            {
                jTextField10.setText(db.rst.getString(2));
                jTextField11.setText(db.rst.getString(3));
                jTextField12.setText(db.rst.getString(4));
                jTextField13.setText(db.rst.getString(5));
                jTextField14.setText(db.rst.getString(6));
                jTextField15.setText(db.rst.getString(7));
                jTextField16.setText(db.rst.getString(8));
                jTextField17.setText(db.rst.getString(9));
               // jLabel25.setText(db.rst.getString(11));
            }
            else{
                JOptionPane.showMessageDialog(this,"Employee code Does not match");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
       try
        {
            String code=jTextField9.getText();
            String name=jTextField10.getText();
            String post=jTextField11.getText();
            String dob=jTextField12.getText();
            String qua=jTextField13.getText();
            String gen=jTextField14.getText();
            String addr=jTextField15.getText();
            String cont=jTextField16.getText();
            String email=jTextField17.getText();
            DBConnection db =new DBConnection();
            db.pstmt=db.con.prepareStatement("update emp_mstr set ename=?,epost=?,edob=?,equa=?,egender=?,eaddr=?,econtact=?,email=? where ecode=?");
            db.pstmt.setString(1,name);
            db.pstmt.setString(2,post);
            db.pstmt.setString(3,dob);
            db.pstmt.setString(4,qua);
            db.pstmt.setString(5,gen);
            db.pstmt.setString(6,addr);
            db.pstmt.setString(7,cont);
            db.pstmt.setString(8,email);
            db.pstmt.setString(9,code);
            int i=db.pstmt.executeUpdate();
            if(i>0)
                JOptionPane.showMessageDialog(this,"Employee Updated Successful");
       else
       JOptionPane.showMessageDialog(this,"Error in Updated");
    }
        catch(Exception e){
            e.printStackTrace();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jTextField15.setText("");
        jTextField16.setText("");
        jTextField17.setText("");     
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        EmployeeList.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        UpdateEmployee.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
      //RESET Coding
        jTextField18.setText("");
        jTextField19.setText("");
        jTextField20.setText("");
        jTextField21.setText("");
        jTextField22.setText("");
        jTextField23.setText("");
        jTextField24.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        try{
             String m_name=jTextField18.getText();
             String m_cmp=jTextField19.getText();
             String m_fr=jTextField20.getText();
             String m_sp=jTextField21.getText();
             String cmp_cnt=jTextField22.getText();
             String sp_cnt=jTextField23.getText();
             String m_prp=jTextField24.getText();
             DBConnection db=new DBConnection();
             db.pstmt=db.con.prepareStatement("insert into product_mstr values(?,?,?,?,?,?,?)");
             db.pstmt.setString(1,m_name);
             db.pstmt.setString(2,m_cmp);
             db.pstmt.setString(3,m_fr);
             db.pstmt.setString(4,m_sp);
             db.pstmt.setString(5,cmp_cnt);
             db.pstmt.setString(6,sp_cnt);
             db.pstmt.setString(7,m_prp);
             int i=db.pstmt.executeUpdate();
             if(i>0){
                 JOptionPane.showMessageDialog(this,"AddMedicine Stock is Successful added");
             }
             else{
                 JOptionPane.showMessageDialog(this,"ERROR in Medicine Stock");
             }        
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AddMedicine.setVisible(true);       
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField30ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged

         try{
            String md_name=jComboBox1.getSelectedItem().toString();
            DBConnection db=new DBConnection();
            db.pstmt=db.con.prepareStatement("select * from stock_detail where med_name=?");
            db.pstmt.setString(1, md_name);
            db.rst=db.pstmt.executeQuery();
            if(db.rst.next())
            {
                jTextField25.setText(db.rst.getString(2));
                jTextField26.setText(db.rst.getString(3));
                jTextField27.setText(db.rst.getString(4));
                jTextField28.setText(db.rst.getString(5));
                jTextField29.setText(db.rst.getString(6));
                jTextField30.setText(db.rst.getString(7));
            }
            else{
                jTextField25.setText("");
                jTextField26.setText("");
                jTextField27.setText("");
                jTextField28.setText("");
                jTextField29.setText("");
                jTextField30.setText("");
            }
        }
         catch(Exception e){
                JOptionPane.showMessageDialog(this,"This is Stock is Already Added");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25ActionPerformed

    private void jTextField26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField26ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      AddStock.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        try
        {
            String med_name=jComboBox1.getSelectedItem().toString();
            String mfd=jTextField25.getText();
            String cp=jTextField26.getText();
            String sp=jTextField27.getText();
            String exp=jTextField28.getText();
            String reorder=jTextField29.getText();
            String qty=jTextField30.getText();
            DBConnection db=new DBConnection();
            db.pstmt=db.con.prepareStatement("insert into stock_detail values(?,?,?,?,?,?,?)");
            db.pstmt.setString(1,med_name);
            db.pstmt.setString(2,cp);
            db.pstmt.setString(3,sp);
            db.pstmt.setString(4,mfd);
            db.pstmt.setString(5,exp);
            db.pstmt.setString(6,reorder);
            db.pstmt.setString(7,qty);
            int i=db.pstmt.executeUpdate();
            if(i>0)
            {
                JOptionPane.showMessageDialog(this,"Stock Added Successful");
            }
            else{
                  JOptionPane.showMessageDialog(this,"ERROR.......");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        jTextField25.setText("");
        jTextField26.setText("");
        jTextField27.setText("");
        jTextField28.setText("");
        jTextField29.setText("");
        jTextField30.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField32ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
         
        try{
            if(jComboBox2.getSelectedItem()!=null){
            String md_name=jComboBox2.getSelectedItem().toString();
            DBConnection db=new DBConnection();
            db.pstmt=db.con.prepareStatement("select * from stock_detail where med_name=?");
            db.pstmt.setString(1, md_name);
            db.rst=db.pstmt.executeQuery();
            if(db.rst.next())
            {
                jTextField31.setText(db.rst.getString(2));
                jTextField32.setText(db.rst.getString(3));
                jTextField33.setText(db.rst.getString(4));
                jTextField34.setText(db.rst.getString(5));
                jTextField35.setText(db.rst.getString(7));
                jLabel51.setText("Recorder List: "+db.rst.getString(6));
            }
            }
    }//GEN-LAST:event_jComboBox2ActionPerformed
catch(Exception e){
        e.printStackTrace();
        }
        
         }
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        try{
            DBConnection db=new DBConnection();
            db.pstmt=db.con.prepareStatement("select * from stock_detail where med_qty<=reorder_level");
            db.rst=db.pstmt.executeQuery();
            jComboBox2.removeAllItems();
            while(db.rst.next()){
            jComboBox2.addItem(db.rst.getString(1));
            }
            ReorderList.setVisible(true);
        }
        catch(Exception e){
            e.printStackTrace();      
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    }
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        StockDetail.setVisible(true);
        try{
            Vector<String> header=new Vector<String>();
            header.add("Medicine Name");
            header.add("Cost Price");
            header.add("Sale Price");
            header.add("Manufaturing");
            header.add("Expiry Date");
            header.add("Recorder Level");
            header.add("Medicine Quantity"); 
            Vector<Vector<String>> data=new Vector<Vector<String>>();
            DBConnection db=new DBConnection();
            db.pstmt=db.con.prepareStatement("select * from stock_detail");
            db.rst=db.pstmt.executeQuery();
            while(db.rst.next()){
                Vector<String> temp=new Vector<String>();
                temp.add(db.rst.getString(1));
                temp.add(db.rst.getString(2));
                temp.add(db.rst.getString(3));
                temp.add(db.rst.getString(4));
                temp.add(db.rst.getString(5));
                temp.add(db.rst.getString(6));
                temp.add(db.rst.getString(7));            
                data.add(temp);
            }
            jTable2.setModel(new DefaultTableModel(data,header));
            }
        catch(Exception e){
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try{
            DBConnection db=new DBConnection();
            db.pstmt=db.con.prepareStatement("select * from stock_detail where med_qty<=reorder_level");
            db.rst=db.pstmt.executeQuery();
            jComboBox2.removeAllItems();
            while(db.rst.next()){
            jComboBox2.addItem(db.rst.getString(1));
            }
            ReorderList.setVisible(true);
        }
        catch(Exception e){
            e.printStackTrace();      
    }                     
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        try{
            Vector<String> header=new Vector<String>();
            header.add("Medicine Name");
            header.add("Cost Price");
            header.add("Sale Price");
            header.add("Manufaturing");
            header.add("Expiry Date");
            header.add("Recorder Level");
            header.add("Medicine Quantity"); 
            Vector<Vector<String>> data=new Vector<Vector<String>>();
            DBConnection db=new DBConnection();
            db.pstmt=db.con.prepareStatement("Select * from stock_detail");
            db.rst=db.pstmt.executeQuery();
            while(db.rst.next()){
                Vector<String> temp=new Vector<String>();
                temp.add(db.rst.getString(1));
                temp.add(db.rst.getString(2));
                temp.add(db.rst.getString(3));
                temp.add(db.rst.getString(4));
                temp.add(db.rst.getString(5));
                temp.add(db.rst.getString(6));
                temp.add(db.rst.getString(7));            
                data.add(temp);
            }
            jTable2.setModel(new DefaultTableModel(data,header));
            }
        catch(Exception e){
            e.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
         String header[]={"","","","","","",""};
         String data[][]={{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""}};
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        StockDetail.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField36ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        try{
            int amt=0,price,qty;
            DBConnection db=new DBConnection();
            db.pstmt=db.con.prepareStatement("select med_price,med_qty from invoice  where invoice_id=?");
            db.pstmt.setInt(1,invc);
            db.rst=db.pstmt.executeQuery();
            while(db.rst.next())
            {
                price=db.rst.getInt(1);
                qty=db.rst.getInt(2);
                amt+=(price*qty);
            }
            String custName=jTextField41.getText();
            String custmob=jTextField42.getText();
            db.pstmt=db.con.prepareStatement("insert into bill_detail(invc_no,date,cust_name,cust_cont,bill_amt)value(?,?,?,?,?)");
            db.pstmt.setInt(1,invc);
            db.pstmt.setString(2,new Date().toString());
            db.pstmt.setString(3, custName);
            db.pstmt.setString(4, custmob);
            db.pstmt.setInt(5,amt);
            int i1=db.pstmt.executeUpdate();
            Vector<String> header=new Vector<String>();
            Vector<Vector<String>> data=new Vector<Vector<String>>();
            header.add("Medicine Name");
            header.add("Mfd. Date");
            header.add("Exp Date");
            header.add("Price");
            header.add("Quantity");
            header.add("Amount"); 
            db.pstmt=db.con.prepareStatement("Select invoice.med_name,stock_detail.med_mfd,stock_detail.med_exd,invoice.med_price,invoice.med_qty from invoice, stock_detail where invoice.med_name=stock_detail.med_name and invoice.invoice_id=?");
            db.pstmt.setInt(1,invc);
            db.rst=db.pstmt.executeQuery();
            while(db.rst.next())
            {
                Vector<String> temp=new Vector<String>();
                temp.add(db.rst.getString(1));
                temp.add(db.rst.getString(2));
                temp.add(db.rst.getString(3));
                temp.add(db.rst.getString(4));
                temp.add(db.rst.getString(5));
                int amt1=Integer.parseInt(db.rst.getString(4))*Integer.parseInt(db.rst.getString(5));
                temp.add(""+amt1);
                data.add(temp);
            }
            jTable3.setModel(new DefaultTableModel(data,header));
           db.pstmt=db.con.prepareStatement("select date,cust_name,cust_cont,bill_amt from bill_detail where invc_no=?");
           db.pstmt.setInt(1,invc);
           db.rst=db.pstmt.executeQuery();
           if(db.rst.next())
           {
               
               jLabel71.setText(""+invc);
               jLabel72.setText(db.rst.getString(1));
               jLabel73.setText(db.rst.getString(2));
               jLabel74.setText(db.rst.getString(3));
               jLabel77.setText(db.rst.getString(4));          
           }
           Gen_Invoice.setVisible(false);
           GenerateInvoice.setVisible(true);
            
            
        }
        catch(Exception e){
         e.printStackTrace();   
        }
    }//GEN-LAST:event_jButton28ActionPerformed
    int invc;
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        try{
            DBConnection db=new DBConnection();
            db.pstmt=db.con.prepareStatement("select med_name from product_mstr");
            db.rst=db.pstmt.executeQuery();
            jComboBox3.removeAllItems();
            while(db.rst.next()){
            jComboBox3.addItem(db.rst.getString(1));
            }
            Gen_Invoice.setVisible(true);
            db.pstmt=db.con.prepareStatement("select max(invc_no) from bill_detail");
            db.rst=db.pstmt.executeQuery();
            if(db.rst.next())
            {
                invc=db.rst.getInt(1);
                invc++;
                
            }
        }
        catch(Exception e){
            e.printStackTrace();      
    }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        try{
            String med_name=""+jComboBox3.getSelectedItem();
            DBConnection db=new DBConnection();
            db.pstmt=db.con.prepareStatement("select med_sp,med_mfd,med_exd,med_qty from stock_detail where med_qty>0 and med_name=?");
            db.pstmt.setString(1, med_name);
            db.rst=db.pstmt.executeQuery();
            if(db.rst.next())
            {
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
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        int avl_qty=Integer.parseInt(jTextField39.getText());
        int qty=Integer.parseInt(jTextField40.getText());
        if(avl_qty>=qty)
        {
            try
            {
            String med_name=""+jComboBox3.getSelectedItem().toString();
            String med_price=jTextField36.getText();
            String med_qty=jTextField40.getText();
            String custName=jTextField41.getText();
            String custmobile=jTextField42.getText();
            String emp_id="Admin";
            DBConnection db=new DBConnection();
            db.pstmt=db.con.prepareStatement("insert into invoice(invoice_id,med_name,med_price,med_qty,invc_date_time,cust_name,cust_contact,emp_id)values(?,?,?,?,?,?,?,?)");
            db.pstmt.setInt(1,invc);
            db.pstmt.setString(2,med_name);
            db.pstmt.setString(3,med_price);
            db.pstmt.setString(4,med_qty);
            db.pstmt.setString(5,new Date().toString());
            db.pstmt.setString(6,custName);
            db.pstmt.setString(7,custmobile);
            db.pstmt.setString(8,emp_id);
            int i1=db.pstmt.executeUpdate();
            db.pstmt=db.con.prepareStatement("update stock_detail set med_qty=? where med_name=?");
            db.pstmt.setInt(1,(avl_qty-qty));
            db.pstmt.setString(2,med_name);
            int i2=db.pstmt.executeUpdate();
            if(i1>0&&i2>0)
            {
                JOptionPane.showMessageDialog(this,"Add Cart in Successfully");
                jTextField36.setText("");
                jTextField37.setText("");
                jTextField38.setText("");
                jTextField40.setText("");
                jTextField39.setText("");
            }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"Invalid Quantity");
            jTextField39.setText("");
        }
        
        
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        try{
            
            Vector<String> header=new Vector<String>();
                    header.add("invoice_id");
                    header.add("medicine Name");
                    header.add("medicine Price");
                    header.add("medicine Quantity");
                    header.add("Date_Time");
                    header.add("Customer Name");
                    header.add("customer Contact");
                    header.add("Employee_Id");
                     Vector<Vector<String>> data=new Vector<Vector<String>>();
                    DBConnection db=new DBConnection();
                    db.pstmt=db.con.prepareStatement("select * from invoice");
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
                        data.add(temp);
                    }
                    db.pstmt=db.con.prepareStatement("SELECT * FROM bill_detail WHERE bill_amt=(SELECT MAX(bill_amt) FROM bill_detail);");
                    db.rst=db.pstmt.executeQuery();  
                    jTable4.setModel(new DefaultTableModel(data,header));
                    
        }
        catch(Exception e){
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        MessageFormat header =new MessageFormat("Bill Report");
        MessageFormat Footer =new MessageFormat("page(0,number,integer)");
        try{
            jTable3.print(JTable.PrintMode.NORMAL, header,Footer);
        }
        catch(Exception e){
            e.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
            try{
                String bill_no=jTextField43.getText();
                DBConnection db= new DBConnection();
                db.pstmt=db.con.prepareStatement("select * from bill_detail where invc_no=?");
                db.pstmt.setString(1,bill_no);
                db.rst=db.pstmt.executeQuery();
                if(db.rst.next()){
                    invc=Integer.parseInt(bill_no);
                    int amt=0,price,qty;
                    
                    Vector<String> header=new Vector<String>();
            Vector<Vector<String>> data=new Vector<Vector<String>>();
            header.add("Medicine Name");
            header.add("Mfd. Date");
            header.add("Exp Date");
            header.add("Price");
            header.add("Quantity");
            header.add("Amount"); 
            db.pstmt=db.con.prepareStatement("Select invoice.med_name,stock_detail.med_mfd,stock_detail.med_exd,invoice.med_price,invoice.med_qty from invoice, stock_detail where invoice.med_name=stock_detail.med_name and invoice.invoice_id=?");
            db.pstmt.setInt(1,invc);
            db.rst=db.pstmt.executeQuery();
            while(db.rst.next())
            {
                Vector<String> temp=new Vector<String>();
                temp.add(db.rst.getString(1));
                temp.add(db.rst.getString(2));
                temp.add(db.rst.getString(3));
                temp.add(db.rst.getString(4));
                temp.add(db.rst.getString(5));
                int amt1=Integer.parseInt(db.rst.getString(4))*Integer.parseInt(db.rst.getString(5));
                temp.add(""+amt1);
                data.add(temp);
            }
            jTable3.setModel(new DefaultTableModel(data,header));
           db.pstmt=db.con.prepareStatement("select date,cust_name,cust_cont,bill_amt from bill_detail where invc_no=?");
           db.pstmt.setInt(1,invc);
           db.rst=db.pstmt.executeQuery();
           if(db.rst.next())
           {
               
               jLabel71.setText(""+invc);
               jLabel72.setText(db.rst.getString(1));
               jLabel73.setText(db.rst.getString(2));
               jLabel74.setText(db.rst.getString(3));
               jLabel77.setText(db.rst.getString(4));          
           }
           GenerateInvoice.setVisible(true);
           view_Invoice.setVisible(false);
                    
                }
                else{
                    JOptionPane.showMessageDialog(this,"Invalid Bill_Number");
                    jTextField43.setText("");
                }
                
            }
            catch(Exception e){
                e.printStackTrace();
            }


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        view_Invoice.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
            try{
                Vector<String> header=new Vector<String>();
                    header.add("invc_id");
                    header.add("Date");
                    header.add("Customer Name");
                    header.add("customer Contact");
                    header.add("Bill Amount");
                     Vector<Vector<String>> data=new Vector<Vector<String>>();
                    DBConnection db=new DBConnection();
                    db.pstmt=db.con.prepareStatement("select * from bill_detail");
                    db.rst=db.pstmt.executeQuery();
                    while(db.rst.next())
                    {
                        Vector<String> temp=new Vector<String>();
                        temp.add(db.rst.getString(1));
                        temp.add(db.rst.getString(2));
                        temp.add(db.rst.getString(3));
                        temp.add(db.rst.getString(4));
                        temp.add(db.rst.getString(5));
                        data.add(temp);
                    }
                    jTable6.setModel(new DefaultTableModel(data,header));
                
                
                
            }
            catch(Exception e){
                
            }





        // TODO add your handling code here:
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        this.setVisible(false);
        new LoginWindow().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jPasswordField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField4ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        try{
            int a=JOptionPane.showConfirmDialog(this,"Do You Want To Update Password");
            if(a==0)
            {
      String old_pswd=jPasswordField2.getText();
      String new_pswd=jPasswordField3.getText();
      String conf_pswd=jPasswordField4.getText();
      DBConnection db=new DBConnection();
      db.pstmt=db.con.prepareStatement("select * from admin where password=?");
      db.pstmt.setString(1,old_pswd);
      db.rst=db.pstmt.executeQuery();
      if(db.rst.next())
      {
         if(new_pswd.equals(conf_pswd))
         {
             db.pstmt=db.con.prepareStatement("update admin set password=?");
             db.pstmt.setString(1,conf_pswd);
             int x=db.pstmt.executeUpdate();
             if(x>0)
             {
                 JOptionPane.showMessageDialog(this,"Password Update Successfully");
                 Change_Password.setVisible(false);
             }
         }
             else{
                 JOptionPane.showMessageDialog(this,"New Password Does Not Match");
             }
      }
         else{
             JOptionPane.showMessageDialog(this,"Old Password Incorrect");
         }
            }
      else{
              jPasswordField2.setText("");
               jPasswordField3.setText("");
               jPasswordField4.setText("");
              }
        }
        catch(Exception e){
            e.printStackTrace();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        Change_Password.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
     try{
         
     
         Vector<String> header=new Vector<String>();
                    header.add("invc_id");
                    header.add("Date");
                    header.add("Customer Name");
                    header.add("customer Contact");
                    header.add("Bill Amount");
                     Vector<Vector<String>> data1=new Vector<Vector<String>>();
                    DBConnection db=new DBConnection();
                    db.pstmt=db.con.prepareStatement("SELECT * FROM bill_detail WHERE bill_amt=(SELECT MAX(bill_amt) FROM bill_detail)");
                    db.rst=db.pstmt.executeQuery();
                    while(db.rst.next())
                    {
                        Vector<String> temp=new Vector<String>();
                        temp.add(db.rst.getString(1));
                        temp.add(db.rst.getString(2));
                        temp.add(db.rst.getString(3));
                        temp.add(db.rst.getString(4));
                        temp.add(db.rst.getString(5));
                        data1.add(temp);
                    }
                    jTable5.setModel(new DefaultTableModel(data1,header));
     }
     catch(Exception e){
         e.printStackTrace();

}
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        SaleDetail.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    Gen_Invoice.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
    view_Invoice.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
    View_Invoice.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Change_Password.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
         this.setVisible(false);
        new LoginWindow().setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame AddMedicine;
    private javax.swing.JInternalFrame AddStock;
    private javax.swing.JInternalFrame Change_Password;
    private javax.swing.JInternalFrame EmployeeList;
    private javax.swing.JInternalFrame Gen_Invoice;
    private javax.swing.JInternalFrame GenerateInvoice;
    private javax.swing.JInternalFrame RegisterEmployee;
    private javax.swing.JInternalFrame ReorderList;
    private javax.swing.JInternalFrame SaleDetail;
    private javax.swing.JInternalFrame StockDetail;
    private javax.swing.JInternalFrame UpdateEmployee;
    private javax.swing.JInternalFrame View_Invoice;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
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
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JInternalFrame view_Invoice;
    // End of variables declaration//GEN-END:variables

    static class setVisible {

        public setVisible(boolean b) {
        }
    }
}
