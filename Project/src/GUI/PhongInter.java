package GUI;
import BLL.PhongBLL;
import DTO.PhongDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class PhongInter extends javax.swing.JInternalFrame {

    public PhongInter() {
        initComponents();
        cb_loaiphong.requestFocus();
        showPhong();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jlbMaPhong = new javax.swing.JLabel();
        jlbLoaiPhong = new javax.swing.JLabel();
        jlbGia = new javax.swing.JLabel();
        jlbSLKhach = new javax.swing.JLabel();
        txt_gia = new javax.swing.JTextField();
        cb_loaiphong = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        bt_them = new javax.swing.JButton();
        bt_sua = new javax.swing.JButton();
        bt_xoa = new javax.swing.JButton();
        bt_timkiem = new javax.swing.JButton();
        txt_timkiem = new javax.swing.JTextField();
        txt_slkhach = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_phong = new javax.swing.JTable();
        txt_maphong = new javax.swing.JTextField();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(980, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(53, 71, 99));
        jPanel1.setMinimumSize(new java.awt.Dimension(980, 580));

        jPanel2.setBackground(new java.awt.Color(239, 148, 28));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PHÒNG");

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
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(53, 71, 99));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbMaPhong.setBackground(new java.awt.Color(255, 255, 255));
        jlbMaPhong.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jlbMaPhong.setForeground(new java.awt.Color(255, 255, 255));
        jlbMaPhong.setText("Mã phòng:");
        jPanel3.add(jlbMaPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jlbLoaiPhong.setBackground(new java.awt.Color(255, 255, 255));
        jlbLoaiPhong.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jlbLoaiPhong.setForeground(new java.awt.Color(255, 255, 255));
        jlbLoaiPhong.setText("Loại phòng:");
        jPanel3.add(jlbLoaiPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jlbGia.setBackground(new java.awt.Color(255, 255, 255));
        jlbGia.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jlbGia.setForeground(new java.awt.Color(255, 255, 255));
        jlbGia.setText("Giá:");
        jPanel3.add(jlbGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jlbSLKhach.setBackground(new java.awt.Color(255, 255, 255));
        jlbSLKhach.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jlbSLKhach.setForeground(new java.awt.Color(255, 255, 255));
        jlbSLKhach.setText("Số lượng khách:");
        jPanel3.add(jlbSLKhach, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        txt_gia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_gia.setEnabled(false);
        jPanel3.add(txt_gia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 160, 40));

        cb_loaiphong.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Vip", "Thuong", "Don", "Doi" }));
        cb_loaiphong.setNextFocusableComponent(txt_slkhach);
        cb_loaiphong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_loaiphongActionPerformed(evt);
            }
        });
        jPanel3.add(cb_loaiphong, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 62, 160, 40));

        jPanel4.setBackground(new java.awt.Color(53, 71, 99));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_them.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_them.setText("Thêm");
        bt_them.setPreferredSize(new java.awt.Dimension(67, 23));
        bt_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_themActionPerformed(evt);
            }
        });
        jPanel4.add(bt_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 40));

        bt_sua.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_sua.setText("Sửa");
        bt_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_suaActionPerformed(evt);
            }
        });
        jPanel4.add(bt_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 280, 40));

        bt_xoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_xoa.setText("Xóa");
        bt_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xoaActionPerformed(evt);
            }
        });
        jPanel4.add(bt_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 280, 40));

        bt_timkiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_timkiem.setText("Tìm kiếm");
        bt_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_timkiemActionPerformed(evt);
            }
        });
        jPanel4.add(bt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 100, 40));

        txt_timkiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel4.add(txt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 160, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 300, 200));

        txt_slkhach.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_slkhach.setNextFocusableComponent(bt_them);
        jPanel3.add(txt_slkhach, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 160, 40));

        tbl_phong.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tbl_phong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phòng", "Loại phòng", "Giá", "Số lượng khách tối đa", "Tình trạng phòng"
            }
        ));
        tbl_phong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_phongMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_phong);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 640, 440));

        txt_maphong.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_maphong.setEnabled(false);
        jPanel3.add(txt_maphong, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 160, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_themActionPerformed
        PhongBLL ph_bll = new PhongBLL();
        if(ph_bll.insert_phong(cb_loaiphong, txt_gia, txt_slkhach))
        {
            JOptionPane.showMessageDialog(null, "Thêm phòng thành công");
            cb_loaiphong.setSelectedIndex(0);
            txt_gia.setText("");
            txt_slkhach.setText("");
            cb_loaiphong.requestFocus();
            showPhong();
        }
        else JOptionPane.showMessageDialog(null, "Thêm phòng không thành công");
    }//GEN-LAST:event_bt_themActionPerformed

    private void bt_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_timkiemActionPerformed
        PhongBLL dpbll = new PhongBLL();
        if(txt_timkiem.equals("")) showPhong();
        else
        {
            DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
            };
            tbl_phong.isCellEditable(0, 0);
            model.addColumn("Mã phòng");
            model.addColumn("Loại phòng");
            model.addColumn("Giá phòng");
            model.addColumn("Số lượng khách tối đa");
            model.addColumn("Tình trạng phòng");
            ArrayList<PhongDTO> list_room = dpbll.search_room(txt_timkiem.getText());
            if(!list_room.isEmpty())
            {
                for(PhongDTO DatPhong : list_room)
                {
                    model.addRow(DatPhong.toArray());
                }
                tbl_phong.setModel(model);
            }
            else JOptionPane.showMessageDialog(null, "Không tồn tại thông tin phòng");
        }
    }//GEN-LAST:event_bt_timkiemActionPerformed

    private void bt_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xoaActionPerformed
        PhongBLL ph_bll = new PhongBLL();
        int selected = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa phòng này ?",
                 "Thông báo", JOptionPane.YES_NO_OPTION);
        if (selected == JOptionPane.YES_NO_OPTION)
        {
            if (ph_bll.delete_phong(txt_maphong))
            {
                JOptionPane.showMessageDialog(null, "Xóa phòng thành công");
                txt_maphong.setText("");
                cb_loaiphong.setSelectedIndex(0);
                txt_gia.setText("");
                txt_slkhach.setText("");
                cb_loaiphong.requestFocus();
                showPhong();
            }
            else JOptionPane.showMessageDialog(null, "Xóa phòng không thành công");
        }
    }//GEN-LAST:event_bt_xoaActionPerformed

    private void bt_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suaActionPerformed
        PhongBLL ph_bll = new PhongBLL();
        int selected = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn cập nhật lại phòng này ?",
                 "Thông báo", JOptionPane.YES_NO_OPTION);
        if (selected == JOptionPane.YES_NO_OPTION)
        {
            if (ph_bll.update_phong(txt_maphong, cb_loaiphong, txt_gia, txt_slkhach))
            {
                JOptionPane.showMessageDialog(null, "Cập nhật phòng thành công");
                txt_maphong.setText("");
                cb_loaiphong.setSelectedIndex(0);
                txt_gia.setText("");
                txt_slkhach.setText("");
                cb_loaiphong.requestFocus();
                showPhong();
            }
            else JOptionPane.showMessageDialog(null, "Cập nhật phòng không thành công");
        }
    }//GEN-LAST:event_bt_suaActionPerformed

    private void tbl_phongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_phongMouseClicked
        int i = tbl_phong.getSelectedRow();
        TableModel model = tbl_phong.getModel();
        txt_maphong.setText(model.getValueAt(i, 0).toString());
        cb_loaiphong.setSelectedItem(model.getValueAt(i, 1).toString());
        txt_gia.setText(model.getValueAt(i, 2).toString());
        txt_slkhach.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_tbl_phongMouseClicked

    private void cb_loaiphongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_loaiphongActionPerformed
        String lp = cb_loaiphong.getSelectedItem().toString();
        if (lp.equals("Vip"))
            txt_gia.setText("300000");
        if (lp.equals("Thuong"))
            txt_gia.setText("200000");
        if (lp.equals("Don"))
            txt_gia.setText("100000");
        if (lp.equals("Doi"))
            txt_gia.setText("150000");
    }//GEN-LAST:event_cb_loaiphongActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_sua;
    private javax.swing.JButton bt_them;
    private javax.swing.JButton bt_timkiem;
    private javax.swing.JButton bt_xoa;
    private javax.swing.JComboBox cb_loaiphong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlbGia;
    private javax.swing.JLabel jlbLoaiPhong;
    private javax.swing.JLabel jlbMaPhong;
    private javax.swing.JLabel jlbSLKhach;
    private javax.swing.JTable tbl_phong;
    private javax.swing.JTextField txt_gia;
    private javax.swing.JTextField txt_maphong;
    private javax.swing.JTextField txt_slkhach;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables
    private void showPhong()
    {
        DefaultTableModel model = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column)
        {
            return false;
        }
        };
        tbl_phong.isCellEditable(0, 0);
        model.addColumn("Mã phòng");
        model.addColumn("Loại phòng");
        model.addColumn("Giá phòng");
        model.addColumn("Số lượng khách tối đa");
        model.addColumn("Tình trạng phòng");
        ArrayList<PhongDTO> list_room = PhongBLL.getAllPhong();
        for(PhongDTO Phong : list_room)
        {
            model.addRow(Phong.toArray());
        }
        tbl_phong.setModel(model);
    }
}
