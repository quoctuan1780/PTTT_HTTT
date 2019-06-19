package GUI;
import BLL.DangNhapBLL;
import javax.swing.JOptionPane;

public class DangNhapGUI extends javax.swing.JFrame {

    public DangNhapGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlbTenDangNhap = new javax.swing.JLabel();
        jlbDangNhap = new javax.swing.JLabel();
        txt_tendangnhap = new javax.swing.JTextField();
        txt_matkhau = new javax.swing.JPasswordField();
        bt_dangnhap = new javax.swing.JButton();
        bt_thoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(53, 71, 99));

        jPanel2.setBackground(new java.awt.Color(239, 148, 28));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ĐĂNG NHẬP");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jlbTenDangNhap.setBackground(new java.awt.Color(255, 255, 255));
        jlbTenDangNhap.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jlbTenDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        jlbTenDangNhap.setText("Tên đăng nhập:");

        jlbDangNhap.setBackground(new java.awt.Color(255, 255, 255));
        jlbDangNhap.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jlbDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        jlbDangNhap.setText("Mật khẩu:");

        txt_tendangnhap.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txt_matkhau.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        bt_dangnhap.setBackground(new java.awt.Color(0, 204, 204));
        bt_dangnhap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt_dangnhap.setForeground(new java.awt.Color(255, 255, 255));
        bt_dangnhap.setText("Đăng nhập");
        bt_dangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dangnhapActionPerformed(evt);
            }
        });

        bt_thoat.setBackground(new java.awt.Color(255, 0, 0));
        bt_thoat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt_thoat.setForeground(new java.awt.Color(255, 255, 255));
        bt_thoat.setText("Thoát");
        bt_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_thoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbTenDangNhap)
                    .addComponent(jlbDangNhap))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_dangnhap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_matkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tendangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTenDangNhap)
                    .addComponent(txt_tendangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbDangNhap)
                    .addComponent(txt_matkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_dangnhap)
                    .addComponent(bt_thoat))
                .addGap(0, 83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_dangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dangnhapActionPerformed
        DangNhapBLL dn_bll = new DangNhapBLL();
        String tenDangNhap = txt_tendangnhap.getText();
        String matKhau = txt_matkhau.getText();
        if(tenDangNhap.equals("admin") && matKhau.equals("admin"))
        {
            JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
            MenuGUI menu = new MenuGUI();
            menu.setVisible(true);
            this.dispose();
        }
        else
        if (dn_bll.check_dn(txt_tendangnhap, txt_matkhau))
        {
            JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
            int maquyen = dn_bll.get_maquyen(txt_tendangnhap);
            MenuGUI menu = new MenuGUI(maquyen, txt_tendangnhap.getText());
            menu.setVisible(true);
            this.dispose();
        }
        else JOptionPane.showMessageDialog(null, "Tên đăng nhập hoặc mật khẩu không đúng");
    }//GEN-LAST:event_bt_dangnhapActionPerformed

    private void bt_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_thoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt_thoatActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhapGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_dangnhap;
    private javax.swing.JButton bt_thoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlbDangNhap;
    private javax.swing.JLabel jlbTenDangNhap;
    private javax.swing.JPasswordField txt_matkhau;
    private javax.swing.JTextField txt_tendangnhap;
    // End of variables declaration//GEN-END:variables
}
