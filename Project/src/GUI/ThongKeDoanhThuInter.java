package GUI;

import BLL.ThongKeDoanhThuBLL;
import DTO.HoaDonDTO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ThongKeDoanhThuInter extends javax.swing.JInternalFrame {

    public ThongKeDoanhThuInter() {
        initComponents();
        showThongKe();
    }
    ArrayList<String> list = ThongKeDoanhThuBLL.get_nam();
    String tennv;
    public ThongKeDoanhThuInter(String ten)
    {
        initComponents();
        tennv = ten;
        for(int i = 0; i < list.size(); i++)
        {
            cb_nambatdau.addItem(list.get(i));
            cb_namketthuc.addItem(list.get(i));
            cb_namloaiphong.addItem(list.get(i));
        }
        showThongKe();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group_thongke = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rb_thang = new javax.swing.JRadioButton();
        rb_nam = new javax.swing.JRadioButton();
        rb_loaiphong = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_thongke = new javax.swing.JTable();
        bt_thongke = new javax.swing.JButton();
        dc_thangdau = new com.toedter.calendar.JDateChooser();
        dc_thangden = new com.toedter.calendar.JDateChooser();
        cb_nambatdau = new javax.swing.JComboBox<>();
        cb_namketthuc = new javax.swing.JComboBox<>();
        cb_namloaiphong = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(53, 71, 99));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(239, 148, 28));
        jPanel2.setPreferredSize(new java.awt.Dimension(980, 60));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("THỐNG KÊ DOANH THU");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, -1));

        group_thongke.add(rb_thang);
        rb_thang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rb_thang.setForeground(new java.awt.Color(51, 51, 51));
        rb_thang.setText("Tháng");
        jPanel1.add(rb_thang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 120, 30));

        group_thongke.add(rb_nam);
        rb_nam.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rb_nam.setForeground(new java.awt.Color(51, 51, 51));
        rb_nam.setText("Năm");
        jPanel1.add(rb_nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 79, 120, -1));

        group_thongke.add(rb_loaiphong);
        rb_loaiphong.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rb_loaiphong.setForeground(new java.awt.Color(51, 51, 51));
        rb_loaiphong.setText("Loại phòng");
        rb_loaiphong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_loaiphongActionPerformed(evt);
            }
        });
        jPanel1.add(rb_loaiphong, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 120, 30));

        tbl_thongke.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tbl_thongke.setForeground(new java.awt.Color(51, 51, 51));
        tbl_thongke.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Mã phiếu thuê", "Mã nhân viên", "Ngày lập", "Thành tiền", "Ghi chú"
            }
        ));
        tbl_thongke.setRowHeight(20);
        jScrollPane1.setViewportView(tbl_thongke);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 590, 440));

        bt_thongke.setBackground(new java.awt.Color(0, 255, 0));
        bt_thongke.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bt_thongke.setForeground(new java.awt.Color(51, 51, 51));
        bt_thongke.setText("Thống kê");
        bt_thongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_thongkeActionPerformed(evt);
            }
        });
        jPanel1.add(bt_thongke, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 300, 60));

        dc_thangdau.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(dc_thangdau, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 110, 20));

        dc_thangden.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(dc_thangden, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 110, 20));

        jPanel1.add(cb_nambatdau, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 100, 30));

        jPanel1.add(cb_namketthuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 100, 30));

        jPanel1.add(cb_namloaiphong, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 100, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Năm");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tháng bắt đầu");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tháng kết thúc");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Năm bắt đầu");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Năm kết thúc");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb_loaiphongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_loaiphongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_loaiphongActionPerformed

    private void bt_thongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_thongkeActionPerformed
        ThongKeDoanhThuBLL tk_bll = new ThongKeDoanhThuBLL();
        if(rb_nam.isSelected()) tk_bll.Report_Nam(cb_nambatdau, cb_namketthuc, tennv);
        if (rb_thang.isSelected()) tk_bll.Report_Thang(dc_thangdau, dc_thangden, tennv);
        if(rb_loaiphong.isSelected()) tk_bll.Report_LoaiPhong(cb_namloaiphong, tennv);
    }//GEN-LAST:event_bt_thongkeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_thongke;
    private javax.swing.JComboBox<String> cb_nambatdau;
    private javax.swing.JComboBox<String> cb_namketthuc;
    private javax.swing.JComboBox<String> cb_namloaiphong;
    private com.toedter.calendar.JDateChooser dc_thangdau;
    private com.toedter.calendar.JDateChooser dc_thangden;
    private javax.swing.ButtonGroup group_thongke;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rb_loaiphong;
    private javax.swing.JRadioButton rb_nam;
    private javax.swing.JRadioButton rb_thang;
    private javax.swing.JTable tbl_thongke;
    // End of variables declaration//GEN-END:variables
    public void showThongKe()
    {
        DefaultTableModel model = new DefaultTableModel(){
        @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
        };
        tbl_thongke.isCellEditable(0, 0);
        model.addColumn("Mã hóa đơn");
        model.addColumn("Mã phiếu thuê");
        model.addColumn("Mã nhân viên");
        model.addColumn("Ngày lập hóa đơn");
        model.addColumn("Thành tiền");
        model.addColumn("Ghi chú");
        ArrayList<HoaDonDTO> list = ThongKeDoanhThuBLL.get_all();
        for(HoaDonDTO hd_dto : list)
        {
            model.addRow(hd_dto.toArray());
        }
        tbl_thongke.setModel(model);
    }
}
