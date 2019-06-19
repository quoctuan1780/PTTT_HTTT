package GUI;
import BLL.NhanVienBLL;
import DTO.NhanVienDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class NhanVienInter extends javax.swing.JInternalFrame {

    public NhanVienInter() {
        initComponents();
        txt_tennv.requestFocus();
        ShowNhanVien();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlbNgaySinh = new javax.swing.JPanel();
        jlbMaNV = new javax.swing.JLabel();
        jlbTenNV = new javax.swing.JLabel();
        jlbGioiTinh = new javax.swing.JLabel();
        jlbDiaChi = new javax.swing.JLabel();
        jlbSoDT = new javax.swing.JLabel();
        jlbChucVu = new javax.swing.JLabel();
        txt_manv = new javax.swing.JTextField();
        txt_tennv = new javax.swing.JTextField();
        cb_gioitinh = new javax.swing.JComboBox();
        txt_diachi = new javax.swing.JTextField();
        txt_sodt = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        bt_them = new javax.swing.JButton();
        bt_sua = new javax.swing.JButton();
        bt_xoa = new javax.swing.JButton();
        bt_timkiem = new javax.swing.JButton();
        txt_timkiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbNhanVien = new javax.swing.JTable();
        cb_chucvu = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_nhanvien = new javax.swing.JTable();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(980, 550));

        jPanel1.setBackground(new java.awt.Color(53, 71, 99));
        jPanel1.setMinimumSize(new java.awt.Dimension(980, 580));
        jPanel1.setPreferredSize(new java.awt.Dimension(980, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(239, 148, 28));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NHÂN VIÊN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(767, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 60));

        jlbNgaySinh.setBackground(new java.awt.Color(53, 71, 99));
        jlbNgaySinh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbMaNV.setBackground(new java.awt.Color(255, 255, 255));
        jlbMaNV.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlbMaNV.setForeground(new java.awt.Color(255, 255, 255));
        jlbMaNV.setText("Mã nhân viên:");
        jlbNgaySinh.add(jlbMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jlbTenNV.setBackground(new java.awt.Color(255, 255, 255));
        jlbTenNV.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlbTenNV.setForeground(new java.awt.Color(255, 255, 255));
        jlbTenNV.setText("Tên nhân viên:");
        jlbNgaySinh.add(jlbTenNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jlbGioiTinh.setBackground(new java.awt.Color(255, 255, 255));
        jlbGioiTinh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlbGioiTinh.setForeground(new java.awt.Color(255, 255, 255));
        jlbGioiTinh.setText("Giới tính:");
        jlbNgaySinh.add(jlbGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        jlbDiaChi.setBackground(new java.awt.Color(255, 255, 255));
        jlbDiaChi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlbDiaChi.setForeground(new java.awt.Color(255, 255, 255));
        jlbDiaChi.setText("Địa chỉ:");
        jlbNgaySinh.add(jlbDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jlbSoDT.setBackground(new java.awt.Color(255, 255, 255));
        jlbSoDT.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlbSoDT.setForeground(new java.awt.Color(255, 255, 255));
        jlbSoDT.setText("Số điện thoại:");
        jlbNgaySinh.add(jlbSoDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        jlbChucVu.setBackground(new java.awt.Color(255, 255, 255));
        jlbChucVu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlbChucVu.setForeground(new java.awt.Color(255, 255, 255));
        jlbChucVu.setText("Chức vụ:");
        jlbNgaySinh.add(jlbChucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        txt_manv.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_manv.setEnabled(false);
        txt_manv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_manvActionPerformed(evt);
            }
        });
        jlbNgaySinh.add(txt_manv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 190, 40));

        txt_tennv.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_tennv.setNextFocusableComponent(txt_diachi);
        jlbNgaySinh.add(txt_tennv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 190, 40));

        cb_gioitinh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Nam", "Nu" }));
        cb_gioitinh.setNextFocusableComponent(txt_sodt);
        jlbNgaySinh.add(cb_gioitinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 180, 40));

        txt_diachi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_diachi.setNextFocusableComponent(cb_gioitinh);
        jlbNgaySinh.add(txt_diachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 190, 40));

        txt_sodt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_sodt.setNextFocusableComponent(cb_chucvu);
        jlbNgaySinh.add(txt_sodt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 180, 40));

        jPanel4.setBackground(new java.awt.Color(53, 71, 99));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_them.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_them.setText("Thêm");
        bt_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_themActionPerformed(evt);
            }
        });
        jPanel4.add(bt_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 40));

        bt_sua.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_sua.setText("Sửa");
        bt_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_suaActionPerformed(evt);
            }
        });
        jPanel4.add(bt_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 109, 250, 40));

        bt_xoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_xoa.setText("Xóa");
        bt_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xoaActionPerformed(evt);
            }
        });
        jPanel4.add(bt_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 59, 250, 40));

        bt_timkiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_timkiem.setText("Tìm kiếm");
        bt_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_timkiemActionPerformed(evt);
            }
        });
        jPanel4.add(bt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 110, 40));
        jPanel4.add(txt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 110, 40));

        jlbNgaySinh.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 260, 200));

        jtbNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane1.setViewportView(jtbNhanVien);

        jlbNgaySinh.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 930, 180));

        cb_chucvu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Le tan", "Ke toan", "Quan ly", "Quan tri", "Bao ve" }));
        cb_chucvu.setNextFocusableComponent(bt_them);
        jlbNgaySinh.add(cb_chucvu, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 180, 40));

        jPanel1.add(jlbNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 980, 220));

        tbl_nhanvien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tbl_nhanvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Địa chỉ", "Giới tính", "Số điện thoại", "Chức vụ", "Tên đăng nhập", "Mã quyền"
            }
        ));
        tbl_nhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_nhanvienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_nhanvien);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 980, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_manvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_manvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_manvActionPerformed

    private void bt_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_themActionPerformed
        NhanVienBLL nv_bll = new NhanVienBLL();
        if (nv_bll.insert_nv(txt_tennv, txt_diachi, cb_gioitinh, txt_sodt, cb_chucvu))
        {
            JOptionPane.showMessageDialog(null, "Thêm nhân viên thành công");
            txt_tennv.setText("");
            txt_diachi.setText("");
            cb_gioitinh.setSelectedIndex(0);
            txt_sodt.setText("");
            cb_chucvu.setSelectedIndex(0);
            txt_tennv.requestFocus();
            ShowNhanVien();
        }
        else JOptionPane.showMessageDialog(null, "Thêm nhân viên không thành công");
    }//GEN-LAST:event_bt_themActionPerformed

    private void bt_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_timkiemActionPerformed
        NhanVienBLL nv_bll = new NhanVienBLL();
        DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
            };
        tbl_nhanvien.isCellEditable(0, 0);
        model.addColumn("Mã nhân viên");
        model.addColumn("Tên nhân viên");
        model.addColumn("Dịa chỉ");
        model.addColumn("Giới tính");
        model.addColumn("Số điện thoại");
        model.addColumn("Chức vụ");
        model.addColumn("Tên đăng nhập");
        model.addColumn("Mã quyền");
        ArrayList<NhanVienDTO> list = nv_bll.search(txt_timkiem);
        for (NhanVienDTO nv_dto : list) {
            model.addRow(nv_dto.toArray());
        }
        tbl_nhanvien.setModel(model);
        
    }//GEN-LAST:event_bt_timkiemActionPerformed

    private void tbl_nhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_nhanvienMouseClicked
        int i = tbl_nhanvien.getSelectedRow();
        TableModel model = tbl_nhanvien.getModel();
        txt_manv.setText(model.getValueAt(i, 0).toString());
        txt_tennv.setText(model.getValueAt(i, 1).toString());
        txt_diachi.setText(model.getValueAt(i, 2).toString());
        cb_gioitinh.setSelectedItem(model.getValueAt(i, 3).toString());
        txt_sodt.setText(model.getValueAt(i, 4).toString());
        cb_chucvu.setSelectedItem(model.getValueAt(i, 5).toString());
    }//GEN-LAST:event_tbl_nhanvienMouseClicked

    private void bt_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xoaActionPerformed
        NhanVienBLL nv_bll = new NhanVienBLL();
        int selected = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa nhân viên này ?",
                 "Thông báo", JOptionPane.YES_NO_OPTION);
        if (selected == JOptionPane.YES_NO_OPTION)
        {
            if (nv_bll.delete_nv(txt_manv))
            {
                JOptionPane.showMessageDialog(null, "Xóa nhân viên thành công");
                txt_manv.setText("");
                txt_tennv.setText("");
                txt_diachi.setText("");
                cb_gioitinh.setSelectedIndex(0);
                txt_sodt.setText("");
                cb_chucvu.setSelectedIndex(0);
                txt_tennv.requestFocus();
                ShowNhanVien();
            }
            else JOptionPane.showMessageDialog(null, "Xóa nhân viên không thành công");
        }
    }//GEN-LAST:event_bt_xoaActionPerformed

    private void bt_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suaActionPerformed
        NhanVienBLL nv_bll = new NhanVienBLL();
        int selected = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn cập nhật lại nhân viên này ?",
                 "Thông báo", JOptionPane.YES_NO_OPTION);
        if (selected == JOptionPane.YES_NO_OPTION)
        {
            if (nv_bll.update_nv(txt_manv, txt_tennv, txt_diachi, cb_gioitinh, txt_sodt))
            {
                JOptionPane.showMessageDialog(null, "Cập nhật nhân viên thành công");
                txt_manv.setText("");
                txt_tennv.setText("");
                txt_diachi.setText("");
                cb_gioitinh.setSelectedIndex(0);
                txt_sodt.setText("");
                cb_chucvu.setSelectedIndex(0);
                txt_tennv.requestFocus();
                ShowNhanVien();
            }
            else JOptionPane.showMessageDialog(null, "Cập nhật nhân viên không thành công");
        }
    }//GEN-LAST:event_bt_suaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_sua;
    private javax.swing.JButton bt_them;
    private javax.swing.JButton bt_timkiem;
    private javax.swing.JButton bt_xoa;
    private javax.swing.JComboBox<String> cb_chucvu;
    private javax.swing.JComboBox cb_gioitinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlbChucVu;
    private javax.swing.JLabel jlbDiaChi;
    private javax.swing.JLabel jlbGioiTinh;
    private javax.swing.JLabel jlbMaNV;
    private javax.swing.JPanel jlbNgaySinh;
    private javax.swing.JLabel jlbSoDT;
    private javax.swing.JLabel jlbTenNV;
    private javax.swing.JTable jtbNhanVien;
    private javax.swing.JTable tbl_nhanvien;
    private javax.swing.JTextField txt_diachi;
    private javax.swing.JTextField txt_manv;
    private javax.swing.JTextField txt_sodt;
    private javax.swing.JTextField txt_tennv;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables
    private void ShowNhanVien()
    {
        DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
            };
        tbl_nhanvien.isCellEditable(0, 0);
        model.addColumn("Mã nhân viên");
        model.addColumn("Tên nhân viên");
        model.addColumn("Dịa chỉ");
        model.addColumn("Giới tính");
        model.addColumn("Số điện thoại");
        model.addColumn("Chức vụ");
        model.addColumn("Tên đăng nhập");
        model.addColumn("Mã quyền");
        ArrayList<NhanVienDTO> list = NhanVienBLL.get_all();
        for (NhanVienDTO nv_dto : list) {
            model.addRow(nv_dto.toArray());
        }
        tbl_nhanvien.setModel(model);
    }
}
