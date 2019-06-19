package GUI;
import BLL.NhanVienBLL;
import BLL.PhieuThuePhongBLL;
import DTO.NhanVienDTO;
import DTO.PhieuThuePhongDTO;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class PhieuThuePhongInter extends javax.swing.JInternalFrame {

    public PhieuThuePhongInter() {
        initComponents();
        dc_ngaythue.requestFocus();
        showPhieuThue();
    }
    String Username;
    public PhieuThuePhongInter(String tendn) {
        initComponents();
        Username = tendn;
        dc_ngaythue.requestFocus();
        showPhieuThue();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jlbMaPT = new javax.swing.JLabel();
        jlbNgayThue = new javax.swing.JLabel();
        jlbNgayTra = new javax.swing.JLabel();
        jlbMaKH = new javax.swing.JLabel();
        jlbSoLuong = new javax.swing.JLabel();
        txt_mapt = new javax.swing.JTextField();
        txt_makh = new javax.swing.JTextField();
        txt_maphong = new javax.swing.JTextField();
        dc_ngaythue = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        bt_sua = new javax.swing.JButton();
        bt_xoa = new javax.swing.JButton();
        bt_thanhtoan = new javax.swing.JButton();
        bt_timkiem = new javax.swing.JButton();
        bt_dichvu = new javax.swing.JButton();
        dc_ngaytra = new com.toedter.calendar.JDateChooser();
        jlbMaPhong1 = new javax.swing.JLabel();
        txt_soluongkhach = new javax.swing.JTextField();
        txt_timkiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_phieuthuephong = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_phieuthuephong_qh = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        bt_hienthi = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(980, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(53, 71, 99));
        jPanel1.setMinimumSize(new java.awt.Dimension(980, 580));

        jPanel2.setBackground(new java.awt.Color(239, 148, 28));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PHIẾU THUÊ PHÒNG");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(1009, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(53, 71, 99));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbMaPT.setBackground(new java.awt.Color(255, 255, 255));
        jlbMaPT.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlbMaPT.setForeground(new java.awt.Color(255, 255, 255));
        jlbMaPT.setText("Mã phiếu thuê:");
        jPanel3.add(jlbMaPT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jlbNgayThue.setBackground(new java.awt.Color(255, 255, 255));
        jlbNgayThue.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlbNgayThue.setForeground(new java.awt.Color(255, 255, 255));
        jlbNgayThue.setText("Ngày thuê:");
        jPanel3.add(jlbNgayThue, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        jlbNgayTra.setBackground(new java.awt.Color(255, 255, 255));
        jlbNgayTra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlbNgayTra.setForeground(new java.awt.Color(255, 255, 255));
        jlbNgayTra.setText("Ngày trả:");
        jPanel3.add(jlbNgayTra, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        jlbMaKH.setBackground(new java.awt.Color(255, 255, 255));
        jlbMaKH.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlbMaKH.setForeground(new java.awt.Color(255, 255, 255));
        jlbMaKH.setText("Mã khách hàng:");
        jPanel3.add(jlbMaKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jlbSoLuong.setBackground(new java.awt.Color(255, 255, 255));
        jlbSoLuong.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlbSoLuong.setForeground(new java.awt.Color(255, 255, 255));
        jlbSoLuong.setText("Số lượng khách:");
        jPanel3.add(jlbSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        txt_mapt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_mapt.setEnabled(false);
        txt_mapt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_maptActionPerformed(evt);
            }
        });
        jPanel3.add(txt_mapt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 190, 31));

        txt_makh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_makh.setEnabled(false);
        jPanel3.add(txt_makh, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 190, 30));

        txt_maphong.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_maphong.setEnabled(false);
        jPanel3.add(txt_maphong, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 190, 30));

        dc_ngaythue.setDateFormatString("dd/MM/yyyy");
        dc_ngaythue.setNextFocusableComponent(dc_ngaytra);
        jPanel3.add(dc_ngaythue, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 190, 30));

        jPanel4.setBackground(new java.awt.Color(53, 71, 99));

        bt_sua.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_sua.setText("Sửa");
        bt_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_suaActionPerformed(evt);
            }
        });

        bt_xoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_xoa.setText("Xóa");
        bt_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xoaActionPerformed(evt);
            }
        });

        bt_thanhtoan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_thanhtoan.setText("Thanh toán");
        bt_thanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_thanhtoanActionPerformed(evt);
            }
        });

        bt_timkiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_timkiem.setText("Tìm kiếm");
        bt_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_timkiemActionPerformed(evt);
            }
        });

        bt_dichvu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_dichvu.setText("Dịch vụ");
        bt_dichvu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dichvuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_sua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_thanhtoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_timkiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_xoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_dichvu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_dichvu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(bt_thanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 250, 240));

        dc_ngaytra.setDateFormatString("dd/MM/yyyy");
        dc_ngaytra.setNextFocusableComponent(txt_soluongkhach);
        jPanel3.add(dc_ngaytra, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 190, 30));

        jlbMaPhong1.setBackground(new java.awt.Color(255, 255, 255));
        jlbMaPhong1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlbMaPhong1.setForeground(new java.awt.Color(255, 255, 255));
        jlbMaPhong1.setText("Mã phòng:");
        jPanel3.add(jlbMaPhong1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        txt_soluongkhach.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_soluongkhach.setNextFocusableComponent(bt_xoa);
        jPanel3.add(txt_soluongkhach, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 190, 30));

        txt_timkiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel3.add(txt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 190, 30));

        tbl_phieuthuephong.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tbl_phieuthuephong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu thuê", "Mã phòng", "Mã khách hàng", "Ngày thuê", "Ngày dự kiến trả", "Số lượng khách"
            }
        ));
        tbl_phieuthuephong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_phieuthuephongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_phieuthuephong);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 960, 140));

        jTabbedPane1.addTab("Phiếu thuê phòng", jPanel3);

        tbl_phieuthuephong_qh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tbl_phieuthuephong_qh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu thuê", "Mã phòng", "Mã khách hàng", "Ngày thuê", "Ngày dự kiến trả", "Số lượng khách"
            }
        ));
        tbl_phieuthuephong_qh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_phieuthuephong_qhMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_phieuthuephong_qh);

        jPanel6.setBackground(new java.awt.Color(53, 71, 99));

        bt_hienthi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_hienthi.setText("Hiển thị thông tin");
        bt_hienthi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_hienthiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(bt_hienthi, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(498, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(bt_hienthi, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Phiếu thuê quá hạn", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 983, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addGap(42, 42, 42))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, 0, 1390, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_maptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_maptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_maptActionPerformed

    private void bt_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_timkiemActionPerformed
        PhieuThuePhongBLL pt_bll = new PhieuThuePhongBLL();
        DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
            };
        tbl_phieuthuephong.isCellEditable(0, 0);
        model.addColumn("Mã phiếu thuê");
        model.addColumn("Mã phòng");
        model.addColumn("Mã khách hàng");
        model.addColumn("Ngày thuê");
        model.addColumn("Ngày dự kiến trả");
        model.addColumn("Số lượng khách");
        model.addColumn("Trạng thái phiếu thuê");
        ArrayList<PhieuThuePhongDTO> list = pt_bll.search(txt_timkiem);
        for (PhieuThuePhongDTO pt : list) {
            model.addRow(pt.toArray());
        }
        tbl_phieuthuephong.setModel(model);
    }//GEN-LAST:event_bt_timkiemActionPerformed

    private void bt_thanhtoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_thanhtoanActionPerformed
        PhieuThuePhongBLL pt_bll = new PhieuThuePhongBLL();
        NhanVienBLL nv_bll = new NhanVienBLL();
        ArrayList<NhanVienDTO> list = new ArrayList<>();
        JTextField text = new JTextField(Username);
        list = nv_bll.search(text);
        int manv = list.get(0).getManv();
        int selected = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thanh toán phiếu thuê này ?",
                 "Thông báo", JOptionPane.YES_NO_OPTION);
        if (selected == JOptionPane.YES_NO_OPTION)
        {
            int mapt = 0;
            mapt = Integer.parseInt(txt_mapt.getText());
            Date ngayhd = null;
            ngayhd = dc_ngaytra.getDate(); 
            java.sql.Date ngayl = new java.sql.Date(ngayhd.getTime());
            String nghd = ngayl.toString();
            String ngayht = java.time.LocalDate.now().toString();
            if (mapt == 0 || ngayhd == null) JOptionPane.showMessageDialog(null, "Mã phiếu thuê hoặc ngày trả trống");
            else 
                if(pt_bll.get_trangthai(txt_mapt, txt_maphong, txt_makh).equals("NO"))
                { 
                    if (nghd.equals(ngayht))
                    {
                        HoaDonGUI hd = new HoaDonGUI(mapt, manv, ngayhd);
                        hd.setVisible(true);
                    }
                    else JOptionPane.showMessageDialog(null, "Chưa đến ngày thanh toán, bạn hãy cập nhật lại ngày trả phòng");
                }
                else JOptionPane.showMessageDialog(null, "Phiếu thuê này đã thanh toán");
        }
    }//GEN-LAST:event_bt_thanhtoanActionPerformed

    private void tbl_phieuthuephongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_phieuthuephongMouseClicked
        try {
            int i = tbl_phieuthuephong.getSelectedRow();
            TableModel model = tbl_phieuthuephong.getModel();
            txt_mapt.setText(model.getValueAt(i, 0).toString());
            txt_maphong.setText(model.getValueAt(i, 1).toString());
            txt_makh.setText(model.getValueAt(i, 2).toString());
            String ngaythue = model.getValueAt(i, 3).toString();
            String ngaytra = model.getValueAt(i, 4).toString();
            txt_soluongkhach.setText(model.getValueAt(i, 5).toString());
            java.util.Date nt = new SimpleDateFormat("yyyy-MM-dd").parse(ngaythue);
            java.util.Date ntt = new SimpleDateFormat("yyyy-MM-dd").parse(ngaytra);
            dc_ngaythue.setDate(nt);
            dc_ngaytra.setDate(ntt);
        } catch (ParseException ex) {
            Logger.getLogger(ThongTinDatPhongTruocGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbl_phieuthuephongMouseClicked

    private void bt_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xoaActionPerformed
        PhieuThuePhongBLL pt_bll = new PhieuThuePhongBLL();
        int selected = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa phiếu thuê này ?",
                 "Thông báo", JOptionPane.YES_NO_OPTION);
        if (selected == JOptionPane.YES_NO_OPTION)
        {
            if (pt_bll.delete_pt(txt_mapt))
            {
                JOptionPane.showMessageDialog(null, "Xóa phiếu thuê thành công");
                txt_mapt.setText("");
                txt_maphong.setText("");
                txt_makh.setText("");
                txt_soluongkhach.setText("");
                dc_ngaythue.setDate(null);
                dc_ngaytra.setDate(null);
                dc_ngaythue.requestFocus();
                showPhieuThue();
            }
            else JOptionPane.showMessageDialog(null, "Xóa phiếu thuê không thành công"); 
        }
    }//GEN-LAST:event_bt_xoaActionPerformed

    private void bt_dichvuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dichvuActionPerformed
        PhieuThuePhongBLL pt_bll = new PhieuThuePhongBLL();
        if (pt_bll.get_trangthai(txt_mapt, txt_maphong, txt_makh).equals("NO"))
        {
            if(txt_mapt.getText().equals("") || dc_ngaythue.getDate() == null) JOptionPane.showMessageDialog(null, "Mã phiếu thuê hoặc ngày thuê trống");
            else
            {
                Date ngaythue = dc_ngaythue.getDate();
                Date ngaytra = dc_ngaytra.getDate();
                int mapt = Integer.parseInt(txt_mapt.getText());
                ChiTietSuDungDVGUI sddv = new ChiTietSuDungDVGUI(mapt, ngaythue, ngaytra);
                sddv.setVisible(true);
            }
        }
        else JOptionPane.showMessageDialog(null, "Phiếu thuê này đã thanh toán không thể thêm dịch vụ");
    }//GEN-LAST:event_bt_dichvuActionPerformed

    private void bt_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suaActionPerformed
        PhieuThuePhongBLL pt_bll = new PhieuThuePhongBLL();
        int selected = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn cập nhật lại phiếu thuê này ?",
                 "Thông báo", JOptionPane.YES_NO_OPTION);
        if (selected == JOptionPane.YES_NO_OPTION)
        {
            if (pt_bll.update_pt(txt_mapt, txt_maphong, txt_makh, dc_ngaythue, dc_ngaytra, txt_soluongkhach))
            {
                JOptionPane.showMessageDialog(null, "Cập nhật phiếu thuê thành công");
                txt_mapt.setText("");
                txt_maphong.setText("");
                txt_makh.setText("");
                txt_soluongkhach.setText("");
                dc_ngaythue.setDate(null);
                dc_ngaytra.setDate(null);
                dc_ngaythue.requestFocus();
                showPhieuThue();
            }
            else JOptionPane.showMessageDialog(null, "Cập nhật phiếu thuê không thành công"); 
        }
    }//GEN-LAST:event_bt_suaActionPerformed

    private void tbl_phieuthuephong_qhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_phieuthuephong_qhMouseClicked
        try {
            int i = tbl_phieuthuephong_qh.getSelectedRow();
            TableModel model = tbl_phieuthuephong_qh.getModel();
            txt_mapt.setText(model.getValueAt(i, 0).toString());
            txt_maphong.setText(model.getValueAt(i, 1).toString());
            txt_makh.setText(model.getValueAt(i, 2).toString());
            String ngaythue = model.getValueAt(i, 3).toString();
            String ngaytra = model.getValueAt(i, 4).toString();
            txt_soluongkhach.setText(model.getValueAt(i, 5).toString());
            java.util.Date nt = new SimpleDateFormat("yyyy-MM-dd").parse(ngaythue);
            java.util.Date ntt = new SimpleDateFormat("yyyy-MM-dd").parse(ngaytra);
            dc_ngaythue.setDate(nt);
            dc_ngaytra.setDate(ntt);
        } catch (ParseException ex) {
            Logger.getLogger(ThongTinDatPhongTruocGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbl_phieuthuephong_qhMouseClicked

    private void bt_hienthiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hienthiActionPerformed
        DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
            };
        tbl_phieuthuephong_qh.isCellEditable(0, 0);
        model.addColumn("Mã phiếu thuê");
        model.addColumn("Mã phòng");
        model.addColumn("Mã khách hàng");
        model.addColumn("Ngày thuê");
        model.addColumn("Ngày dự kiến trả");
        model.addColumn("Số lượng khách");
        model.addColumn("Trạng thái phiếu thuê");
        ArrayList<PhieuThuePhongDTO> list = PhieuThuePhongBLL.get_all_ptqh();
        for (PhieuThuePhongDTO pt : list) {
            model.addRow(pt.toArray());
        }
        tbl_phieuthuephong_qh.setModel(model);
    }//GEN-LAST:event_bt_hienthiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_dichvu;
    private javax.swing.JButton bt_hienthi;
    private javax.swing.JButton bt_sua;
    private javax.swing.JButton bt_thanhtoan;
    private javax.swing.JButton bt_timkiem;
    private javax.swing.JButton bt_xoa;
    private com.toedter.calendar.JDateChooser dc_ngaythue;
    private com.toedter.calendar.JDateChooser dc_ngaytra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jlbMaKH;
    private javax.swing.JLabel jlbMaPT;
    private javax.swing.JLabel jlbMaPhong1;
    private javax.swing.JLabel jlbNgayThue;
    private javax.swing.JLabel jlbNgayTra;
    private javax.swing.JLabel jlbSoLuong;
    private javax.swing.JTable tbl_phieuthuephong;
    private javax.swing.JTable tbl_phieuthuephong_qh;
    private javax.swing.JTextField txt_makh;
    private javax.swing.JTextField txt_maphong;
    private javax.swing.JTextField txt_mapt;
    private javax.swing.JTextField txt_soluongkhach;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables
    public void showPhieuThue()
    {
        DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
            };
        tbl_phieuthuephong.isCellEditable(0, 0);
        model.addColumn("Mã phiếu thuê");
        model.addColumn("Mã phòng");
        model.addColumn("Mã khách hàng");
        model.addColumn("Ngày thuê");
        model.addColumn("Ngày dự kiến trả");
        model.addColumn("Số lượng khách");
        model.addColumn("Trạng thái phiếu thuê");
        ArrayList<PhieuThuePhongDTO> list = PhieuThuePhongBLL.get_all();
        for (PhieuThuePhongDTO pt : list) {
            model.addRow(pt.toArray());
        }
        tbl_phieuthuephong.setModel(model);
    }
}
