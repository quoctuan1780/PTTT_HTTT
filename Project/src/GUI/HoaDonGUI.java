package GUI;
import BLL.HoaDonBLL;
import DTO.HoaDonDTO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class HoaDonGUI extends javax.swing.JFrame {
    int mapt, manv;
    public HoaDonGUI() {
        initComponents();
        dc_ngayhd.requestFocus();
        this.setLocationRelativeTo(null);
        showHoadon();
    }
    public HoaDonGUI(int ma_pt, int ma_nv, Date ngaylap)
    {
        initComponents();
        mapt = ma_pt; manv = ma_nv;
        txt_mapt.setText(Integer.toString(ma_pt));
        txt_manv.setText(Integer.toString(ma_nv));
        dc_ngayhd.setDate(ngaylap);
        dc_ngayhd.requestFocus();
        this.setLocationRelativeTo(null);
        showHoadon();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lb_exit = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jlbMaHD = new javax.swing.JLabel();
        jlbMaNV = new javax.swing.JLabel();
        jlbNgayHD = new javax.swing.JLabel();
        jlbThanhTien = new javax.swing.JLabel();
        jlbGhiChu = new javax.swing.JLabel();
        jlbMaPT = new javax.swing.JLabel();
        txt_mahd = new javax.swing.JTextField();
        txt_manv = new javax.swing.JTextField();
        txt_thanhtien = new javax.swing.JTextField();
        txt_mapt = new javax.swing.JTextField();
        txt_ghichu = new javax.swing.JTextField();
        dc_ngayhd = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        bt_them = new javax.swing.JButton();
        bt_xoa = new javax.swing.JButton();
        bt_inhoadon = new javax.swing.JButton();
        bt_timkiem = new javax.swing.JButton();
        txt_timkiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_hoadon = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(239, 148, 28));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HÓA ĐƠN");

        lb_exit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_exit.setForeground(new java.awt.Color(255, 255, 255));
        lb_exit.setText("X");
        lb_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_exit)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_exit)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(53, 71, 99));

        jlbMaHD.setBackground(new java.awt.Color(255, 255, 255));
        jlbMaHD.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlbMaHD.setForeground(new java.awt.Color(255, 255, 255));
        jlbMaHD.setText("Mã hóa đơn:");

        jlbMaNV.setBackground(new java.awt.Color(255, 255, 255));
        jlbMaNV.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlbMaNV.setForeground(new java.awt.Color(255, 255, 255));
        jlbMaNV.setText("Mã nhân viên:");

        jlbNgayHD.setBackground(new java.awt.Color(255, 255, 255));
        jlbNgayHD.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlbNgayHD.setForeground(new java.awt.Color(255, 255, 255));
        jlbNgayHD.setText("Ngày hóa đơn:");

        jlbThanhTien.setBackground(new java.awt.Color(255, 255, 255));
        jlbThanhTien.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlbThanhTien.setForeground(new java.awt.Color(255, 255, 255));
        jlbThanhTien.setText("Thành tiền:");

        jlbGhiChu.setBackground(new java.awt.Color(255, 255, 255));
        jlbGhiChu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlbGhiChu.setForeground(new java.awt.Color(255, 255, 255));
        jlbGhiChu.setText("Ghi chú:");

        jlbMaPT.setBackground(new java.awt.Color(255, 255, 255));
        jlbMaPT.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlbMaPT.setForeground(new java.awt.Color(255, 255, 255));
        jlbMaPT.setText("Mã phiếu thuê:");

        txt_mahd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_mahd.setEnabled(false);
        txt_mahd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mahdActionPerformed(evt);
            }
        });

        txt_manv.setEditable(false);
        txt_manv.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txt_thanhtien.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_thanhtien.setEnabled(false);

        txt_mapt.setEditable(false);
        txt_mapt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txt_ghichu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_ghichu.setNextFocusableComponent(bt_them);

        dc_ngayhd.setDateFormatString("dd/MM/yyyy");
        dc_ngayhd.setNextFocusableComponent(txt_ghichu);

        jPanel4.setBackground(new java.awt.Color(53, 71, 99));

        bt_them.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_them.setText("Thêm");
        bt_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_themActionPerformed(evt);
            }
        });

        bt_xoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_xoa.setText("Xóa");
        bt_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xoaActionPerformed(evt);
            }
        });

        bt_inhoadon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_inhoadon.setText("In hóa đơn");
        bt_inhoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_inhoadonActionPerformed(evt);
            }
        });

        bt_timkiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_timkiem.setText("Tìm kiếm");
        bt_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_timkiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_them, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(bt_inhoadon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(bt_timkiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_them, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(bt_inhoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(bt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbMaNV)
                    .addComponent(jlbMaHD)
                    .addComponent(jlbMaPT))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_manv, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mahd, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mapt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jlbThanhTien)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbNgayHD)
                            .addComponent(jlbGhiChu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_timkiem, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(txt_ghichu, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dc_ngayhd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(txt_thanhtien))
                .addGap(45, 45, 45)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jlbMaNV)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dc_ngayhd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_mahd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlbMaHD)
                        .addComponent(jlbNgayHD)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_manv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbThanhTien)
                    .addComponent(txt_thanhtien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbMaPT)
                    .addComponent(txt_mapt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbGhiChu)
                    .addComponent(txt_ghichu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tbl_hoadon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tbl_hoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Mã phiếu thuê", "Mã nhân viên", "Ngày lập hóa đơn", "Thành tiền", "Ghi chú"
            }
        ));
        tbl_hoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_hoadonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_hoadon);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_mahdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mahdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mahdActionPerformed

    private void bt_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_themActionPerformed
        HoaDonBLL hd_bll = new HoaDonBLL();
        if(hd_bll.insert_hd(txt_mapt, txt_manv, dc_ngayhd, txt_ghichu))
        {
            JOptionPane.showMessageDialog(null, "Thêm hóa đơn thành công");
            txt_mapt.setText("");
            txt_manv.setText("");
            txt_thanhtien.setText("");
            txt_ghichu.setText("");
            dc_ngayhd.setDate(null);
            showHoadon();
        }
        else JOptionPane.showMessageDialog(null, "Thêm hóa đơn không thành công");
    }//GEN-LAST:event_bt_themActionPerformed

    private void bt_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_timkiemActionPerformed
        HoaDonBLL hd_bll = new HoaDonBLL();
        DefaultTableModel model = new DefaultTableModel(){
        @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
        };
        tbl_hoadon.isCellEditable(0, 0);
        model.addColumn("Mã hóa đơn");
        model.addColumn("Mã phiếu thuê");
        model.addColumn("Mã nhân viên");
        model.addColumn("Ngày lập hóa đơn");
        model.addColumn("Thành tiền");
        model.addColumn("Ghi chú");
        ArrayList<HoaDonDTO> list = hd_bll.search(txt_timkiem);
        for(HoaDonDTO hd_dto : list)
        {
            model.addRow(hd_dto.toArray());
        }
        tbl_hoadon.setModel(model);
    }//GEN-LAST:event_bt_timkiemActionPerformed

    private void bt_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xoaActionPerformed
        HoaDonBLL hd_bll = new HoaDonBLL();
        int selected = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa hóa đơn này ?",
                            "Thông báo", JOptionPane.YES_NO_OPTION);
        if (selected == JOptionPane.YES_NO_OPTION)
        {
            if (hd_bll.delete_hd(txt_mahd))
            {
                JOptionPane.showMessageDialog(null, "Xóa hóa đơn thành công");
                txt_mahd.setText("");
                txt_mapt.setText("");
                txt_manv.setText("");
                txt_thanhtien.setText("");
                txt_ghichu.setText("");
                dc_ngayhd.setDate(null);
                showHoadon();
            }
            else JOptionPane.showMessageDialog(null, "Xóa hóa đơn không thành công");
        }
    }//GEN-LAST:event_bt_xoaActionPerformed

    private void lb_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_exitMouseClicked
        this.dispose();
    }//GEN-LAST:event_lb_exitMouseClicked

    private void bt_inhoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_inhoadonActionPerformed
        HoaDonBLL hd_bll = new HoaDonBLL();
        hd_bll.Report(txt_mahd);
    }//GEN-LAST:event_bt_inhoadonActionPerformed

    private void tbl_hoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_hoadonMouseClicked
       try {
            int i = tbl_hoadon.getSelectedRow();
            TableModel model = tbl_hoadon.getModel();
            txt_mahd.setText(model.getValueAt(i, 0).toString());
            txt_mapt.setText(model.getValueAt(i, 1).toString());
            txt_manv.setText(model.getValueAt(i, 2).toString());
            String ngaylap = model.getValueAt(i, 3).toString();
            java.util.Date nghd = new SimpleDateFormat("yyyy-MM-dd").parse(ngaylap);
            dc_ngayhd.setDate(nghd);
            txt_thanhtien.setText(model.getValueAt(i, 4).toString());
            txt_ghichu.setText(model.getValueAt(i, 5).toString());
        } catch (ParseException ex) {
            Logger.getLogger(HoaDonInter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbl_hoadonMouseClicked

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
            java.util.logging.Logger.getLogger(HoaDonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoaDonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoaDonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoaDonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoaDonGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_inhoadon;
    private javax.swing.JButton bt_them;
    private javax.swing.JButton bt_timkiem;
    private javax.swing.JButton bt_xoa;
    private com.toedter.calendar.JDateChooser dc_ngayhd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbGhiChu;
    private javax.swing.JLabel jlbMaHD;
    private javax.swing.JLabel jlbMaNV;
    private javax.swing.JLabel jlbMaPT;
    private javax.swing.JLabel jlbNgayHD;
    private javax.swing.JLabel jlbThanhTien;
    private javax.swing.JLabel lb_exit;
    private javax.swing.JTable tbl_hoadon;
    private javax.swing.JTextField txt_ghichu;
    private javax.swing.JTextField txt_mahd;
    private javax.swing.JTextField txt_manv;
    private javax.swing.JTextField txt_mapt;
    private javax.swing.JTextField txt_thanhtien;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables
    private void showHoadon()
    {
        DefaultTableModel model = new DefaultTableModel(){
        @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
        };
        tbl_hoadon.isCellEditable(0, 0);
        model.addColumn("Mã hóa đơn");
        model.addColumn("Mã phiếu thuê");
        model.addColumn("Mã nhân viên");
        model.addColumn("Ngày lập hóa đơn");
        model.addColumn("Thành tiền");
        model.addColumn("Ghi chú");
        ArrayList<HoaDonDTO> list = HoaDonBLL.get_all();
        for(HoaDonDTO hd_dto : list)
        {
            model.addRow(hd_dto.toArray());
        }
        tbl_hoadon.setModel(model);
    }
}
