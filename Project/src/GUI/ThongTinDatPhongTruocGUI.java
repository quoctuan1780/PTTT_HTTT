package GUI;
import BLL.ThongTinDatPhongTruocBLL;
import DTO.ThongTinDatPhongTruocDTO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ThongTinDatPhongTruocGUI extends javax.swing.JFrame {

    public ThongTinDatPhongTruocGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        txt_tenkh.requestFocus();
        showToTable();
    }
    int maphong;
    public ThongTinDatPhongTruocGUI(int mp)
    {
        initComponents();
        this.setLocationRelativeTo(null);
        maphong = mp;
        txt_maphong.setText(Integer.toString(maphong));
        txt_tenkh.requestFocus();
        showToTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lb_exit = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_maphong = new javax.swing.JTextField();
        txt_tenkh = new javax.swing.JTextField();
        txt_cmnd = new javax.swing.JTextField();
        cb_gioitinh = new javax.swing.JComboBox();
        txt_diachi = new javax.swing.JTextField();
        txt_sodt = new javax.swing.JTextField();
        txt_quoctich = new javax.swing.JTextField();
        dc_ngaydukieno = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        txt_timkiem = new javax.swing.JTextField();
        bt_them = new javax.swing.JButton();
        bt_thuephong = new javax.swing.JButton();
        bt_sua = new javax.swing.JButton();
        bt_xoa = new javax.swing.JButton();
        bt_timkiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_khachhang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(239, 148, 28));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("THÔNG TIN ĐẶT PHÒNG TRƯỚC");

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
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lb_exit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(53, 71, 99));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã phòng:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tên khách hàng:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ngày dự kiến ở:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 110, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Số CMND:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 70, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Giới tính:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 70, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Địa chỉ:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Số điện thoại: ");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Quốc tịch:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        txt_maphong.setEnabled(false);
        txt_maphong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_maphongActionPerformed(evt);
            }
        });
        jPanel3.add(txt_maphong, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 200, 40));

        txt_tenkh.setNextFocusableComponent(cb_gioitinh);
        jPanel3.add(txt_tenkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 200, 40));

        txt_cmnd.setNextFocusableComponent(txt_quoctich);
        jPanel3.add(txt_cmnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 180, 40));

        cb_gioitinh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Nam", "Nu" }));
        cb_gioitinh.setNextFocusableComponent(txt_diachi);
        jPanel3.add(cb_gioitinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 200, 40));

        txt_diachi.setNextFocusableComponent(txt_sodt);
        jPanel3.add(txt_diachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 200, 40));

        txt_sodt.setNextFocusableComponent(txt_cmnd);
        jPanel3.add(txt_sodt, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 180, 40));

        txt_quoctich.setNextFocusableComponent(dc_ngaydukieno);
        jPanel3.add(txt_quoctich, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 180, 40));

        dc_ngaydukieno.setDateFormatString("dd/MM/yyyy");
        dc_ngaydukieno.setNextFocusableComponent(bt_them);
        jPanel3.add(dc_ngaydukieno, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 180, 40));

        jPanel4.setBackground(new java.awt.Color(53, 71, 99));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_timkiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel4.add(txt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 120, 40));

        bt_them.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_them.setText("Thêm");
        bt_them.setNextFocusableComponent(bt_xoa);
        bt_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_themActionPerformed(evt);
            }
        });
        jPanel4.add(bt_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 250, 40));

        bt_thuephong.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_thuephong.setText("Thuê phòng");
        bt_thuephong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_thuephongActionPerformed(evt);
            }
        });
        jPanel4.add(bt_thuephong, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 250, 40));

        bt_sua.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_sua.setText("Sửa");
        bt_sua.setNextFocusableComponent(bt_thuephong);
        bt_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_suaActionPerformed(evt);
            }
        });
        jPanel4.add(bt_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 250, 40));

        bt_xoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_xoa.setText("Xóa");
        bt_xoa.setNextFocusableComponent(bt_sua);
        bt_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xoaActionPerformed(evt);
            }
        });
        jPanel4.add(bt_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 250, 40));

        bt_timkiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_timkiem.setText("Tìm kiếm");
        bt_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_timkiemActionPerformed(evt);
            }
        });
        jPanel4.add(bt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 120, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 290, 270));

        tbl_khachhang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tbl_khachhang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phòng", "Tên khách hàng", "Địa chỉ", "Giới tính", "Số điện thoại", "Số CMND", "Quốc tịch", "Ngày dự kiến ở"
            }
        ));
        tbl_khachhang.setRowHeight(20);
        tbl_khachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_khachhangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_khachhang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_maphongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_maphongActionPerformed
        
    }//GEN-LAST:event_txt_maphongActionPerformed

    private void bt_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_themActionPerformed
        ThongTinDatPhongTruocBLL ttdpt_bll = new ThongTinDatPhongTruocBLL();
        if (ttdpt_bll.insert_ttdpt(txt_maphong, txt_tenkh, txt_diachi, cb_gioitinh, txt_sodt, txt_cmnd, txt_quoctich, dc_ngaydukieno))
        {
            JOptionPane.showMessageDialog(null, "Thêm hồ sơ thành công");
            txt_maphong.setText("");
            txt_tenkh.setText("");
            txt_diachi.setText("");
            txt_quoctich.setText("");
            txt_sodt.setText("");
            txt_cmnd.setText("");
            dc_ngaydukieno.setDate(null);
            cb_gioitinh.setSelectedIndex(0);
            txt_tenkh.requestFocus();
            showToTable();
        }
        else JOptionPane.showMessageDialog(null, "Thêm hồ sơ không thành công");

    }//GEN-LAST:event_bt_themActionPerformed

    private void bt_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xoaActionPerformed
        ThongTinDatPhongTruocBLL ttdpt_bll = new ThongTinDatPhongTruocBLL();
        int selected = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa hồ sơ này ?",
                 "Thông báo", JOptionPane.YES_NO_OPTION);
        if (selected == JOptionPane.YES_NO_OPTION)
        {
            if (ttdpt_bll.delete_ttdpt(txt_maphong, txt_tenkh, txt_diachi, cb_gioitinh, txt_sodt, txt_cmnd, txt_quoctich, dc_ngaydukieno))
            {
                JOptionPane.showMessageDialog(null, "Xóa hồ sơ thành công");
                txt_maphong.setText("");
                txt_tenkh.setText("");
                txt_diachi.setText("");
                txt_quoctich.setText("");
                txt_sodt.setText("");
                txt_cmnd.setText("");
                dc_ngaydukieno.setDate(null);
                cb_gioitinh.setSelectedIndex(0);
                txt_tenkh.requestFocus();
                showToTable();
            }
            else JOptionPane.showMessageDialog(null, "Xóa hồ sơ không thành công");
        }
    }//GEN-LAST:event_bt_xoaActionPerformed

    private void tbl_khachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_khachhangMouseClicked

        try {
            int i = tbl_khachhang.getSelectedRow();
            TableModel model = tbl_khachhang.getModel();
            txt_maphong.setText(model.getValueAt(i, 0).toString());
            txt_tenkh.setText(model.getValueAt(i, 1).toString());
            cb_gioitinh.setSelectedItem(model.getValueAt(i, 3).toString());
            txt_diachi.setText(model.getValueAt(i, 2).toString());
            txt_sodt.setText(model.getValueAt(i, 4).toString());
            txt_cmnd.setText(model.getValueAt(i, 5).toString());
            txt_quoctich.setText(model.getValueAt(i, 6).toString());
            String ngay_o = model.getValueAt(i, 7).toString();
            Date ng_o = new SimpleDateFormat("yyyy-MM-dd").parse(ngay_o);
            dc_ngaydukieno.setDate(ng_o);
        } catch (ParseException ex) {
            Logger.getLogger(ThongTinDatPhongTruocGUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_tbl_khachhangMouseClicked

    private void lb_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_exitMouseClicked
        this.dispose();
    }//GEN-LAST:event_lb_exitMouseClicked

    private void bt_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suaActionPerformed
        ThongTinDatPhongTruocBLL ttdpt_bll = new ThongTinDatPhongTruocBLL();
        int selected = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn Cập nhật lại hồ sơ này ?",
                 "Thông báo", JOptionPane.YES_NO_OPTION);
        if (selected == JOptionPane.YES_NO_OPTION)
        {
            if (ttdpt_bll.update_ttdpt(txt_maphong, txt_tenkh, txt_diachi, cb_gioitinh, txt_sodt, txt_cmnd, txt_quoctich, dc_ngaydukieno))
            {
                JOptionPane.showMessageDialog(null, "Cập nhật hồ sơ thành công");
                txt_maphong.setText("");
                txt_tenkh.setText("");
                txt_diachi.setText("");
                txt_quoctich.setText("");
                txt_sodt.setText("");
                txt_cmnd.setText("");
                dc_ngaydukieno.setDate(null);
                cb_gioitinh.setSelectedIndex(0);
                txt_tenkh.requestFocus();
                showToTable();
            }
            else JOptionPane.showMessageDialog(null, "Cập nhật hồ sơ không thành công");
        }
    }//GEN-LAST:event_bt_suaActionPerformed

    private void bt_thuephongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_thuephongActionPerformed
        ThongTinDatPhongTruocBLL ttdpt_bll = new ThongTinDatPhongTruocBLL();
        int selected = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xác nhận thuê phòng này ?",
                            "Thông báo", JOptionPane.YES_NO_OPTION);
        if (selected == JOptionPane.YES_NO_OPTION) 
        {
            if(ttdpt_bll.insert_kh(txt_tenkh, txt_diachi, cb_gioitinh, txt_sodt, txt_cmnd, txt_quoctich) == true);
            {
                int mp = Integer.parseInt(txt_maphong.getText());
                int makh = ttdpt_bll.get_makh(txt_tenkh, txt_sodt, txt_cmnd);
                Date ngaythue = dc_ngaydukieno.getDate();
                int luiform = 1;
                PhieuThuePhongGUI ptt = new PhieuThuePhongGUI(luiform, mp, makh, ngaythue);
                ptt.setVisible(true);
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_bt_thuephongActionPerformed

    private void bt_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_timkiemActionPerformed
       ThongTinDatPhongTruocBLL ttdpt_bll = new ThongTinDatPhongTruocBLL();
       ArrayList<ThongTinDatPhongTruocDTO> list_ttdpt = ttdpt_bll.search_ttdpt(txt_timkiem);
       if (list_ttdpt.isEmpty()) JOptionPane.showMessageDialog(null, "Không tồn tại thông tin đặt phòng trước này");
       else
       {
           DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
            };
            tbl_khachhang.isCellEditable(0, 0);
            model.addColumn("Mã phòng");
            model.addColumn("Tên khách hàng");
            model.addColumn("Địa chỉ");
            model.addColumn("Giới tính");
            model.addColumn("Số điện thoại");
            model.addColumn("Số CMND");
            model.addColumn("Quốc tịch");
            model.addColumn("Ngày dự kiến ở");
            for(ThongTinDatPhongTruocDTO ttdpt_dto : list_ttdpt)
            {
                model.addRow(ttdpt_dto.toArray());
            }
            tbl_khachhang.setModel(model);
       }
    }//GEN-LAST:event_bt_timkiemActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongTinDatPhongTruocGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_sua;
    private javax.swing.JButton bt_them;
    private javax.swing.JButton bt_thuephong;
    private javax.swing.JButton bt_timkiem;
    private javax.swing.JButton bt_xoa;
    private javax.swing.JComboBox cb_gioitinh;
    private com.toedter.calendar.JDateChooser dc_ngaydukieno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_exit;
    private javax.swing.JTable tbl_khachhang;
    private javax.swing.JTextField txt_cmnd;
    private javax.swing.JTextField txt_diachi;
    private javax.swing.JTextField txt_maphong;
    private javax.swing.JTextField txt_quoctich;
    private javax.swing.JTextField txt_sodt;
    private javax.swing.JTextField txt_tenkh;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables
    private void showToTable() 
    {
        DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
            };
        tbl_khachhang.isCellEditable(0, 0);
        model.addColumn("Mã phòng");
        model.addColumn("Tên khách hàng");
        model.addColumn("Địa chỉ");
        model.addColumn("Giới tính");
        model.addColumn("Số điện thoại");
        model.addColumn("Số CMND");
        model.addColumn("Quốc tịch");
        model.addColumn("Ngày dự kiến ở");
        ArrayList<ThongTinDatPhongTruocDTO> list = ThongTinDatPhongTruocBLL.get_all();
        for (ThongTinDatPhongTruocDTO ttdpt : list) {
            model.addRow(ttdpt.toArray());
        }
        tbl_khachhang.setModel(model);
    }
}
