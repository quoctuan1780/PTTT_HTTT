package GUI;
import BLL.NhanVienBLL;
import DTO.NhanVienDTO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MenuGUI extends javax.swing.JFrame {

    public MenuGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        clock();
    }
    String Username;
    String tennv;
    public MenuGUI(int ma, String tendn)
    {
        initComponents();
        this.setLocationRelativeTo(null);
        clock();
        Username = tendn;
        NhanVienBLL nv_bll = new NhanVienBLL();
        JTextField text = new JTextField(tendn);
        ArrayList<NhanVienDTO> list = nv_bll.search(text);
        lb_tennv.setText(list.get(0).getTennv());
        lb_chucvu.setText(list.get(0).getChucvu());
        tennv = list.get(0).getTennv();
        if(ma == 1)
        {
            bt_thongke.setEnabled(false);
            bt_phong.setEnabled(false);
            bt_dichvu.setEnabled(false);
            bt_nhanvien.setEnabled(false);
        }
        if (ma == 2)
        {
            bt_nhanvien.setEnabled(false);
        }
        if(ma == 3) 
        {
            bt_phong.setEnabled(false);
            bt_dichvu.setEnabled(false);
            bt_nhanvien.setEnabled(false);
            bt_khachhang.setEnabled(false);
            bt_datphong.setEnabled(false);
            bt_phieuthue.setEnabled(false);
            bt_hoadon.setEnabled(false);
        }
    }

    public void clock() {
        Thread clock = new Thread() {
            public void run() {
                try {
                    while (true) {
                        Calendar cal = new GregorianCalendar();
                        int day = cal.get(Calendar.DAY_OF_MONTH);
                        int month = cal.get(Calendar.MONTH) + 1;
                        int year = cal.get(Calendar.YEAR);

                        int second = cal.get(Calendar.SECOND);
                        int minute = cal.get(Calendar.MINUTE);
                        int hour = cal.get(Calendar.HOUR);

                        jlbThoiGian.setText(hour + ":" + minute + ":" + second);
                        jlbNgay.setText(year + "-" + month + "-" + day);

                        sleep(1000);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                }
            }
        };
        clock.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jlbNgay = new javax.swing.JLabel();
        jlbThoiGian = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel2 = new javax.swing.JLabel();
        jdtMenu = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bt_thoat = new javax.swing.JButton();
        bt_nhanvien = new javax.swing.JButton();
        bt_khachhang = new javax.swing.JButton();
        bt_phong = new javax.swing.JButton();
        bt_dichvu = new javax.swing.JButton();
        bt_hoadon = new javax.swing.JButton();
        bt_thongke = new javax.swing.JButton();
        bt_phieuthue = new javax.swing.JButton();
        bt_datphong = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lb_tennv = new javax.swing.JLabel();
        lb_chucvu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(94, 93, 88));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 690));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("KHÁCH SẠN 1X52");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jlbNgay.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlbNgay.setForeground(new java.awt.Color(255, 255, 255));
        jlbNgay.setText("NGÀY");
        jPanel1.add(jlbNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 60, 190, -1));

        jlbThoiGian.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlbThoiGian.setForeground(new java.awt.Color(255, 255, 255));
        jlbThoiGian.setText("THỜI GIAN");
        jPanel1.add(jlbThoiGian, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 60, 190, -1));

        jToolBar1.setRollover(true);
        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        jLabel2.setBackground(new java.awt.Color(0, 255, 204));
        jLabel2.setForeground(new java.awt.Color(94, 93, 88));
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1180, 50));

        jdtMenu.setPreferredSize(new java.awt.Dimension(980, 580));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jdtMenu.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdtMenuLayout = new javax.swing.GroupLayout(jdtMenu);
        jdtMenu.setLayout(jdtMenuLayout);
        jdtMenuLayout.setHorizontalGroup(
            jdtMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
        );
        jdtMenuLayout.setVerticalGroup(
            jdtMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdtMenuLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jdtMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 980, 550));

        jPanel2.setBackground(new java.awt.Color(94, 93, 88));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        bt_thoat.setBackground(new java.awt.Color(244, 123, 2));
        bt_thoat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt_thoat.setForeground(new java.awt.Color(255, 255, 255));
        bt_thoat.setText("THOÁT");
        bt_thoat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        bt_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_thoatActionPerformed(evt);
            }
        });

        bt_nhanvien.setBackground(new java.awt.Color(244, 123, 2));
        bt_nhanvien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt_nhanvien.setForeground(new java.awt.Color(255, 255, 255));
        bt_nhanvien.setText("NHÂN VIÊN");
        bt_nhanvien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        bt_nhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_nhanvienActionPerformed(evt);
            }
        });

        bt_khachhang.setBackground(new java.awt.Color(244, 123, 2));
        bt_khachhang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt_khachhang.setForeground(new java.awt.Color(255, 255, 255));
        bt_khachhang.setText("KHÁCH HÀNG");
        bt_khachhang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        bt_khachhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_khachhangActionPerformed(evt);
            }
        });

        bt_phong.setBackground(new java.awt.Color(244, 123, 2));
        bt_phong.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt_phong.setForeground(new java.awt.Color(255, 255, 255));
        bt_phong.setText("PHÒNG");
        bt_phong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        bt_phong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_phongActionPerformed(evt);
            }
        });

        bt_dichvu.setBackground(new java.awt.Color(244, 123, 2));
        bt_dichvu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt_dichvu.setForeground(new java.awt.Color(255, 255, 255));
        bt_dichvu.setText("DỊCH VỤ");
        bt_dichvu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        bt_dichvu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dichvuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_phong, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_khachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_dichvu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_nhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(bt_phong, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(bt_dichvu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(bt_khachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(bt_nhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(bt_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 190, 560));

        bt_hoadon.setBackground(new java.awt.Color(244, 123, 2));
        bt_hoadon.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt_hoadon.setForeground(new java.awt.Color(255, 255, 255));
        bt_hoadon.setText("HÓA ĐƠN");
        bt_hoadon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        bt_hoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_hoadonActionPerformed(evt);
            }
        });
        jPanel1.add(bt_hoadon, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 170, 38));

        bt_thongke.setBackground(new java.awt.Color(244, 123, 2));
        bt_thongke.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt_thongke.setForeground(new java.awt.Color(255, 255, 255));
        bt_thongke.setText("THỐNG KÊ");
        bt_thongke.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        bt_thongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_thongkeActionPerformed(evt);
            }
        });
        jPanel1.add(bt_thongke, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 170, 38));

        bt_phieuthue.setBackground(new java.awt.Color(244, 123, 2));
        bt_phieuthue.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt_phieuthue.setForeground(new java.awt.Color(255, 255, 255));
        bt_phieuthue.setText("PHIẾU THUÊ PHÒNG");
        bt_phieuthue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        bt_phieuthue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_phieuthueActionPerformed(evt);
            }
        });
        jPanel1.add(bt_phieuthue, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 200, 38));

        bt_datphong.setBackground(new java.awt.Color(244, 123, 2));
        bt_datphong.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bt_datphong.setForeground(new java.awt.Color(255, 255, 255));
        bt_datphong.setText("ĐẶT PHÒNG");
        bt_datphong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 51), 2));
        bt_datphong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_datphongActionPerformed(evt);
            }
        });
        jPanel1.add(bt_datphong, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 38));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tên nhân viên:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 100, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Chức vụ:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, 60, -1));

        lb_tennv.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_tennv.setForeground(new java.awt.Color(255, 255, 255));
        lb_tennv.setText("Tên");
        jPanel1.add(lb_tennv, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 170, -1));

        lb_chucvu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_chucvu.setForeground(new java.awt.Color(255, 255, 255));
        lb_chucvu.setText("Chức vụ");
        jPanel1.add(lb_chucvu, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 30, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_khachhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_khachhangActionPerformed
        jdtMenu.removeAll();
        KhachHangInter khachHang = new KhachHangInter();
        jdtMenu.add(khachHang).setVisible(true);
    }//GEN-LAST:event_bt_khachhangActionPerformed

    private void bt_hoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hoadonActionPerformed
        jdtMenu.removeAll();
        HoaDonInter hoaDon = new HoaDonInter();
        jdtMenu.add(hoaDon).setVisible(true);
    }//GEN-LAST:event_bt_hoadonActionPerformed

    private void bt_phongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_phongActionPerformed
        jdtMenu.removeAll();
        PhongInter phong = new PhongInter();
        jdtMenu.add(phong).setVisible(true);
    }//GEN-LAST:event_bt_phongActionPerformed

    private void bt_datphongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_datphongActionPerformed

        jdtMenu.removeAll();
        DatPhongInter dp = new DatPhongInter();
        jdtMenu.add(dp).setVisible(true);
    }//GEN-LAST:event_bt_datphongActionPerformed

    private void bt_nhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_nhanvienActionPerformed
        jdtMenu.removeAll();
        NhanVienInter nhanVien = new NhanVienInter();
        jdtMenu.add(nhanVien).setVisible(true);
    }//GEN-LAST:event_bt_nhanvienActionPerformed

    private void bt_thongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_thongkeActionPerformed
        jdtMenu.removeAll();
        ThongKeDoanhThuInter tk = new ThongKeDoanhThuInter(tennv);
        jdtMenu.add(tk).setVisible(true);
    }//GEN-LAST:event_bt_thongkeActionPerformed

    private void bt_phieuthueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_phieuthueActionPerformed
        jdtMenu.removeAll();
        PhieuThuePhongInter pt = new PhieuThuePhongInter(Username);
        jdtMenu.add(pt).setVisible(true);

    }//GEN-LAST:event_bt_phieuthueActionPerformed

    private void bt_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_thoatActionPerformed
        int selected = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn đăng xuất ?",
                 "Thông báo", JOptionPane.YES_NO_OPTION);
        if (selected == JOptionPane.YES_NO_OPTION)
        {
            DangNhapGUI dn = new DangNhapGUI();
            dn.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_bt_thoatActionPerformed

    private void bt_dichvuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dichvuActionPerformed
        
        jdtMenu.removeAll();
        DichVuInter dichVu = new DichVuInter();
        jdtMenu.add(dichVu).setVisible(true);
    }//GEN-LAST:event_bt_dichvuActionPerformed

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
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_datphong;
    private javax.swing.JButton bt_dichvu;
    private javax.swing.JButton bt_hoadon;
    private javax.swing.JButton bt_khachhang;
    private javax.swing.JButton bt_nhanvien;
    private javax.swing.JButton bt_phieuthue;
    private javax.swing.JButton bt_phong;
    private javax.swing.JButton bt_thoat;
    private javax.swing.JButton bt_thongke;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JDesktopPane jdtMenu;
    private javax.swing.JLabel jlbNgay;
    private javax.swing.JLabel jlbThoiGian;
    private javax.swing.JLabel lb_chucvu;
    private javax.swing.JLabel lb_tennv;
    // End of variables declaration//GEN-END:variables
}
