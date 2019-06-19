package GUI;
import BLL.PhieuThuePhongBLL;
import DTO.PhieuThuePhongDTO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class PhieuThuePhongGUI extends javax.swing.JFrame {

    int luiform;
    public PhieuThuePhongGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        luiform = 0;
        dc_ngaythue.requestFocus();
        showPhieuThue();
    }
    public PhieuThuePhongGUI(int maform, int maphong, int makh, Date ngaythue)
    {
        initComponents();
        this.setLocationRelativeTo(null);
        txt_maphong.setText(Integer.toString(maphong));
        txt_makh.setText(Integer.toString(makh));
        dc_ngaythue.setDate(ngaythue);
        luiform = maform;
        dc_ngaythue.requestFocus();
        showPhieuThue();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lb_exit = new javax.swing.JLabel();
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
        bt_them = new javax.swing.JButton();
        bt_sua = new javax.swing.JButton();
        bt_xoa = new javax.swing.JButton();
        dc_ngaytra = new com.toedter.calendar.JDateChooser();
        jlbMaPhong1 = new javax.swing.JLabel();
        bt_timkiem = new javax.swing.JButton();
        txt_timkiem = new javax.swing.JTextField();
        txt_soluongkhach = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_phieuthuephong = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(239, 148, 28));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PHIẾU THUÊ PHÒNG");

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
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lb_exit))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(53, 71, 99));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbMaPT.setBackground(new java.awt.Color(255, 255, 255));
        jlbMaPT.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlbMaPT.setForeground(new java.awt.Color(255, 255, 255));
        jlbMaPT.setText("Mã phiếu thuê:");
        jPanel3.add(jlbMaPT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

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
        jPanel3.add(jlbMaKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

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
        jPanel3.add(txt_mapt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 190, 31));

        txt_makh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_makh.setEnabled(false);
        jPanel3.add(txt_makh, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 190, 30));

        txt_maphong.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_maphong.setEnabled(false);
        jPanel3.add(txt_maphong, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 190, 30));

        dc_ngaythue.setDateFormatString("dd/MM/yyyy");
        dc_ngaythue.setNextFocusableComponent(dc_ngaytra);
        jPanel3.add(dc_ngaythue, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 190, 30));

        jPanel4.setBackground(new java.awt.Color(53, 71, 99));

        bt_them.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_them.setText("Thêm");
        bt_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_themActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_sua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_xoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(bt_them, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 250, 160));

        dc_ngaytra.setDateFormatString("dd/MM/yyyy");
        dc_ngaytra.setNextFocusableComponent(txt_soluongkhach);
        jPanel3.add(dc_ngaytra, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 190, 30));

        jlbMaPhong1.setBackground(new java.awt.Color(255, 255, 255));
        jlbMaPhong1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlbMaPhong1.setForeground(new java.awt.Color(255, 255, 255));
        jlbMaPhong1.setText("Mã phòng:");
        jPanel3.add(jlbMaPhong1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        bt_timkiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_timkiem.setText("Tìm kiếm");
        bt_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_timkiemActionPerformed(evt);
            }
        });
        jPanel3.add(bt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 100, 32));

        txt_timkiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel3.add(txt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 190, 30));

        txt_soluongkhach.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_soluongkhach.setNextFocusableComponent(bt_them);
        jPanel3.add(txt_soluongkhach, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 190, 30));

        tbl_phieuthuephong.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tbl_phieuthuephong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu thuê", "Mã phòng", "Mã khách hàng", "Ngày thuê", "Ngày dự kiến trả", "Số lượng khách", "Trạng thái phiếu thuê"
            }
        ));
        tbl_phieuthuephong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_phieuthuephongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_phieuthuephong);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_maptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_maptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_maptActionPerformed

    private void bt_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_themActionPerformed
        PhieuThuePhongBLL pt_bll = new PhieuThuePhongBLL();
        if (luiform == 1)
        {
            if(pt_bll.insert_pt_hsdt(txt_maphong, txt_makh, dc_ngaythue, dc_ngaytra, txt_soluongkhach))
            {
                JOptionPane.showMessageDialog(null, "Thêm phiếu thuê phòng thành công");
                txt_mapt.setText("");
                txt_maphong.setText("");
                txt_makh.setText("");
                txt_soluongkhach.setText("");
                dc_ngaythue.setDate(null);
                dc_ngaytra.setDate(null);
                showPhieuThue();
            }
            else JOptionPane.showMessageDialog(null, "Thêm phiếu thuê phòng không thành công");
        }
        if (luiform == 2 || luiform == 0)
        {
            if(pt_bll.insert_pt(txt_maphong, txt_makh, dc_ngaythue, dc_ngaytra, txt_soluongkhach))
            {
                JOptionPane.showMessageDialog(null, "Thêm phiếu thuê phòng thành công");
                txt_mapt.setText("");
                txt_maphong.setText("");
                txt_makh.setText("");
                txt_soluongkhach.setText("");
                dc_ngaythue.setDate(null);
                dc_ngaytra.setDate(null);
                showPhieuThue();
            }
            else JOptionPane.showMessageDialog(null, "Thêm phiếu thuê phòng không thành công");
        }
    }//GEN-LAST:event_bt_themActionPerformed

    private void lb_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_exitMouseClicked
        if (luiform == 0)
        {
            this.dispose();
        }
        if (luiform == 1)
        {
            ThongTinDatPhongTruocGUI ttdpt = new ThongTinDatPhongTruocGUI();
            ttdpt.setVisible(true);
            this.dispose();
        }
        if(luiform == 2)
        {
            KhachHangGUI kh = new KhachHangGUI();
            kh.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lb_exitMouseClicked

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
            Date nt = new SimpleDateFormat("yyyy-MM-dd").parse(ngaythue);
            Date ntt = new SimpleDateFormat("yyyy-MM-dd").parse(ngaytra);
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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhieuThuePhongGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_sua;
    private javax.swing.JButton bt_them;
    private javax.swing.JButton bt_timkiem;
    private javax.swing.JButton bt_xoa;
    private com.toedter.calendar.JDateChooser dc_ngaythue;
    private com.toedter.calendar.JDateChooser dc_ngaytra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbMaKH;
    private javax.swing.JLabel jlbMaPT;
    private javax.swing.JLabel jlbMaPhong1;
    private javax.swing.JLabel jlbNgayThue;
    private javax.swing.JLabel jlbNgayTra;
    private javax.swing.JLabel jlbSoLuong;
    private javax.swing.JLabel lb_exit;
    private javax.swing.JTable tbl_phieuthuephong;
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
