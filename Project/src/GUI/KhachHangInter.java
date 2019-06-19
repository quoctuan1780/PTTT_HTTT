package GUI;

import BLL.KhachHangBLL;
import DAL.KhachHangDAL;
import DTO.KhachHangDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class KhachHangInter extends javax.swing.JInternalFrame {

    public KhachHangInter() {
        initComponents();
        txt_tenkh.requestFocus();
        showToTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_makh = new javax.swing.JTextField();
        txt_tenkh = new javax.swing.JTextField();
        txt_cmnd = new javax.swing.JTextField();
        cb_gioitinh = new javax.swing.JComboBox();
        txt_diachi = new javax.swing.JTextField();
        txt_sodt = new javax.swing.JTextField();
        txt_quoctich = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        bt_them = new javax.swing.JButton();
        bt_sua = new javax.swing.JButton();
        bt_xoa = new javax.swing.JButton();
        bt_timkiem = new javax.swing.JButton();
        txt_timkiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_khachhang = new javax.swing.JTable();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(980, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(53, 71, 99));
        jPanel1.setMinimumSize(new java.awt.Dimension(980, 580));
        jPanel1.setPreferredSize(new java.awt.Dimension(980, 580));

        jPanel2.setBackground(new java.awt.Color(239, 148, 28));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("KHÁCH HÀNG");

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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(53, 71, 99));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã khách hàng:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tên khách hàng:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Số CMND:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 70, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Giới tính:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 70, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Địa chỉ:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Số điện thoại: ");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Quốc tịch:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        txt_makh.setEnabled(false);
        txt_makh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_makhActionPerformed(evt);
            }
        });
        jPanel3.add(txt_makh, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 200, 40));

        txt_tenkh.setNextFocusableComponent(txt_diachi);
        jPanel3.add(txt_tenkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 200, 40));

        txt_cmnd.setNextFocusableComponent(txt_quoctich);
        jPanel3.add(txt_cmnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 180, 40));

        cb_gioitinh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Nam", "Nu" }));
        cb_gioitinh.setNextFocusableComponent(txt_sodt);
        jPanel3.add(cb_gioitinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 200, 40));

        txt_diachi.setNextFocusableComponent(cb_gioitinh);
        jPanel3.add(txt_diachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 200, 40));

        txt_sodt.setNextFocusableComponent(txt_cmnd);
        jPanel3.add(txt_sodt, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 180, 40));

        txt_quoctich.setNextFocusableComponent(bt_them);
        jPanel3.add(txt_quoctich, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 180, 40));

        jPanel4.setBackground(new java.awt.Color(53, 71, 99));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_them.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_them.setText("Thêm");
        bt_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_themActionPerformed(evt);
            }
        });
        jPanel4.add(bt_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 20, 250, 40));

        bt_sua.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_sua.setText("Sửa");
        bt_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_suaActionPerformed(evt);
            }
        });
        jPanel4.add(bt_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 120, 250, 40));

        bt_xoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_xoa.setText("Xóa");
        bt_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xoaActionPerformed(evt);
            }
        });
        jPanel4.add(bt_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 70, 250, 40));

        bt_timkiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_timkiem.setText("Tìm kiếm");
        bt_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_timkiemActionPerformed(evt);
            }
        });
        jPanel4.add(bt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 120, 40));

        txt_timkiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel4.add(txt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 120, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 290, 270));

        tbl_khachhang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tbl_khachhang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Tên khách hàng", "Địa chỉ", "Giới tính", "Số điện thoại", "Số CMND", "Quốc tịch"
            }
        ));
        tbl_khachhang.setRowHeight(20);
        tbl_khachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_khachhangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_khachhang);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 962, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_makhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_makhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_makhActionPerformed

    private void bt_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_themActionPerformed
        KhachHangBLL kh_bll = new KhachHangBLL();
        if (kh_bll.insert_kh(txt_tenkh, txt_diachi, cb_gioitinh, txt_sodt, txt_cmnd, txt_quoctich))
        {
            JOptionPane.showMessageDialog(null, "Thêm khách hàng thành công");
            txt_tenkh.setText("");
            txt_diachi.setText("");
            cb_gioitinh.setSelectedIndex(0);
            txt_sodt.setText("");
            txt_cmnd.setText("");
            txt_quoctich.setText("");
            txt_tenkh.requestFocus();
            showToTable();
        }
        else JOptionPane.showMessageDialog(null, "Thêm khách hàng không thành công");
    }//GEN-LAST:event_bt_themActionPerformed

    private void bt_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_timkiemActionPerformed
        KhachHangBLL kh_bll = new KhachHangBLL();
        ArrayList<KhachHangDTO> list_kh = kh_bll.search_ttkh(txt_timkiem);
        if(!list_kh.isEmpty())
        {
            DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
            };
            tbl_khachhang.isCellEditable(0, 0);
            model.addColumn("Mã khách hàng");
            model.addColumn("Tên khách hàng");
            model.addColumn("Giới tính");
            model.addColumn("Địa chỉ");
            model.addColumn("Số điện thoại");
            model.addColumn("Số CMND");
            model.addColumn("Quốc tịch");
            for (KhachHangDTO khdto : list_kh) {
            model.addRow(khdto.toArray());
            }
            tbl_khachhang.setModel(model);
        }
        else JOptionPane.showMessageDialog(null, "Không tồn tại thông tin khách hàng này");
    }//GEN-LAST:event_bt_timkiemActionPerformed

    private void bt_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xoaActionPerformed
        KhachHangBLL kh_bll = new KhachHangBLL();
        int selected = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa khách hàng ?",
                 "Thông báo", JOptionPane.YES_NO_OPTION);
        if (selected == JOptionPane.YES_NO_OPTION)
        {
            if (kh_bll.delete_kh(txt_makh))
            {
                JOptionPane.showMessageDialog(null, "Xóa khách hàng thành công");
                txt_makh.setText("");
                txt_tenkh.setText("");
                txt_diachi.setText("");
                cb_gioitinh.setSelectedIndex(0);
                txt_sodt.setText("");
                txt_cmnd.setText("");
                txt_quoctich.setText("");
                txt_tenkh.requestFocus();
                showToTable();
            }
            else JOptionPane.showMessageDialog(null, "Xóa khách hàng không thành công");
        }
    }//GEN-LAST:event_bt_xoaActionPerformed

    private void bt_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suaActionPerformed
        KhachHangBLL kh_bll = new KhachHangBLL();
        int selected = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn cập nhật khách hàng ?",
                 "Thông báo", JOptionPane.YES_NO_OPTION);
        if (selected == JOptionPane.YES_NO_OPTION)
        {
            if (kh_bll.update_kh(txt_makh, txt_tenkh, txt_diachi, cb_gioitinh, txt_sodt, txt_cmnd, txt_quoctich))
            {
                JOptionPane.showMessageDialog(null, "cập nhật khách hàng thành công");
                txt_makh.setText("");
                txt_tenkh.setText("");
                txt_diachi.setText("");
                cb_gioitinh.setSelectedIndex(0);
                txt_sodt.setText("");
                txt_cmnd.setText("");
                txt_quoctich.setText("");
                txt_tenkh.requestFocus();
                showToTable();
            }
            else JOptionPane.showMessageDialog(null, "Cập nhật khách hàng không thành công");
        }
    }//GEN-LAST:event_bt_suaActionPerformed

    private void tbl_khachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_khachhangMouseClicked
        int i = tbl_khachhang.getSelectedRow();
        TableModel model = tbl_khachhang.getModel();
        txt_makh.setText(model.getValueAt(i, 0).toString());
        txt_tenkh.setText(model.getValueAt(i, 1).toString());
        txt_diachi.setText(model.getValueAt(i, 2).toString());
        cb_gioitinh.setSelectedItem(model.getValueAt(i, 3).toString());
        txt_sodt.setText(model.getValueAt(i, 4).toString());
        txt_cmnd.setText(model.getValueAt(i, 5).toString());
        txt_quoctich.setText(model.getValueAt(i, 6).toString());
    }//GEN-LAST:event_tbl_khachhangMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_sua;
    private javax.swing.JButton bt_them;
    private javax.swing.JButton bt_timkiem;
    private javax.swing.JButton bt_xoa;
    private javax.swing.JComboBox cb_gioitinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_khachhang;
    private javax.swing.JTextField txt_cmnd;
    private javax.swing.JTextField txt_diachi;
    private javax.swing.JTextField txt_makh;
    private javax.swing.JTextField txt_quoctich;
    private javax.swing.JTextField txt_sodt;
    private javax.swing.JTextField txt_tenkh;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables

    private void showToTable() {
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã khách hàng");
        model.addColumn("Tên khách hàng");
        model.addColumn("Giới tính");
        model.addColumn("Địa chỉ");
        model.addColumn("Số điện thoại");
        model.addColumn("Số CMND");
        model.addColumn("Quốc tịch");
        ArrayList<KhachHangDTO> list = KhachHangDAL.getAllKhachHang();
        for (KhachHangDTO giaiDau: list
             ) {
            model.addRow(giaiDau.toArray());
        }
        tbl_khachhang.setModel(model);
        
    }
}
