package GUI;
import DAL.DichVuDAL;
import BLL.DichVuBLL;
import DTO.DichVuDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class DichVuInter extends javax.swing.JInternalFrame {

    public DichVuInter() {
        initComponents();
        txt_tendv.requestFocus();
        showDichvu();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jlfMaDV = new javax.swing.JLabel();
        jlbTenDV = new javax.swing.JLabel();
        jlbGia = new javax.swing.JLabel();
        txt_tendv = new javax.swing.JTextField();
        txt_gia = new javax.swing.JTextField();
        bt_them = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_dichvu = new javax.swing.JTable();
        bt_xoa = new javax.swing.JButton();
        bt_timkiem = new javax.swing.JButton();
        bt_sua = new javax.swing.JButton();
        txt_timkiem = new javax.swing.JTextField();
        txt_madv = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(980, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(53, 71, 99));
        jPanel1.setMinimumSize(new java.awt.Dimension(980, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(980, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(239, 148, 28));
        jPanel2.setPreferredSize(new java.awt.Dimension(980, 60));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DỊCH VỤ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(806, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 60));

        jPanel3.setBackground(new java.awt.Color(53, 71, 99));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlfMaDV.setBackground(new java.awt.Color(255, 255, 255));
        jlfMaDV.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlfMaDV.setForeground(new java.awt.Color(255, 255, 255));
        jlfMaDV.setText("Mã dịch vụ:");
        jPanel3.add(jlfMaDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 40));

        jlbTenDV.setBackground(new java.awt.Color(255, 255, 255));
        jlbTenDV.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlbTenDV.setForeground(new java.awt.Color(255, 255, 255));
        jlbTenDV.setText("Tên dịch vụ:");
        jPanel3.add(jlbTenDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 40));

        jlbGia.setBackground(new java.awt.Color(255, 255, 255));
        jlbGia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlbGia.setForeground(new java.awt.Color(255, 255, 255));
        jlbGia.setText("Giá:");
        jPanel3.add(jlbGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 40));

        txt_tendv.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_tendv.setNextFocusableComponent(txt_gia);
        jPanel3.add(txt_tendv, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 191, 40));

        txt_gia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_gia.setNextFocusableComponent(bt_them);
        jPanel3.add(txt_gia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 190, 40));

        bt_them.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_them.setText("Thêm");
        bt_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_themActionPerformed(evt);
            }
        });
        jPanel3.add(bt_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 270, 40));

        tbl_dichvu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tbl_dichvu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã dịch vụ", "Tên dịch vụ", "Giá"
            }
        ));
        tbl_dichvu.setName(""); // NOI18N
        tbl_dichvu.setRowHeight(20);
        tbl_dichvu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dichvuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_dichvu);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 23, 620, 430));

        bt_xoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_xoa.setText("Xóa");
        bt_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xoaActionPerformed(evt);
            }
        });
        jPanel3.add(bt_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 270, 40));

        bt_timkiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_timkiem.setText("Tìm kiếm");
        bt_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_timkiemActionPerformed(evt);
            }
        });
        jPanel3.add(bt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, -1, 40));

        bt_sua.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_sua.setText("Sửa");
        bt_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_suaActionPerformed(evt);
            }
        });
        jPanel3.add(bt_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 270, 40));

        txt_timkiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel3.add(txt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 170, 40));

        txt_madv.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_madv.setEnabled(false);
        jPanel3.add(txt_madv, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 191, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 970, 470));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Sửa");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 118, 32));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_themActionPerformed
        DichVuBLL dv_bll = new DichVuBLL();
        if(dv_bll.insert_dv(txt_tendv, txt_gia))
        {
            JOptionPane.showMessageDialog(null, "Thêm dịch vụ thành công");
            txt_tendv.setText("");
            txt_gia.setText("");
            txt_tendv.requestFocus();
            showDichvu();
        }
        else JOptionPane.showMessageDialog(null, "Thêm dịch vụ không thành công");
    }//GEN-LAST:event_bt_themActionPerformed

    private void bt_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xoaActionPerformed
        DichVuBLL dv_bll = new DichVuBLL();
        int selected = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa dịch vụ này ?",
                            "Thông báo", JOptionPane.YES_NO_OPTION);
        if (selected == JOptionPane.YES_NO_OPTION)
        {
            if (dv_bll.delete_dv(txt_madv))
            {
                JOptionPane.showMessageDialog(null, "Xóa dịch vụ thành công");
                txt_madv.setText("");
                txt_tendv.setText("");
                txt_gia.setText("");
                txt_tendv.requestFocus();
                showDichvu();
            }   
            else JOptionPane.showMessageDialog(null, "Dịch vụ này đang được sử dụng, không thể xóa");
        }
    }//GEN-LAST:event_bt_xoaActionPerformed

    private void tbl_dichvuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dichvuMouseClicked
        int i = tbl_dichvu.getSelectedRow();
        TableModel model = tbl_dichvu.getModel();
        txt_madv.setText(model.getValueAt(i, 0).toString());
        txt_tendv.setText(model.getValueAt(i, 1).toString());
        txt_gia.setText(model.getValueAt(i, 2).toString());

    }//GEN-LAST:event_tbl_dichvuMouseClicked

    private void bt_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suaActionPerformed
        DichVuBLL dv_bll = new DichVuBLL();
        int selected = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn cập nhật lại dịch vụ này ?",
                            "Thông báo", JOptionPane.YES_NO_OPTION);
        if (selected == JOptionPane.YES_NO_OPTION)
        {
            if(dv_bll.update_dv(txt_madv, txt_tendv, txt_gia))
            {
                JOptionPane.showMessageDialog(null, "Cập nhật dịch vụ thành công");
                txt_madv.setText("");
                txt_tendv.setText("");
                txt_gia.setText("");
                txt_tendv.requestFocus();
                showDichvu();
            }
            else JOptionPane.showMessageDialog(null, "Cập nhật dịch vụ không thành công");
        }
    }//GEN-LAST:event_bt_suaActionPerformed

    private void bt_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_timkiemActionPerformed
        DichVuBLL dv_bll = new DichVuBLL();
        ArrayList<DichVuDTO> list_server = dv_bll.search_dv(txt_timkiem);
        DefaultTableModel model = new DefaultTableModel(){
        @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
        };
        tbl_dichvu.isCellEditable(0, 0);
        model.addColumn("Mã dịch vụ");
        model.addColumn("Tên dịch vụ");
        model.addColumn("Giá");
        for (DichVuDTO dv_dto : list_server) 
        {
            model.addRow(dv_dto.toArray());
        }
        tbl_dichvu.setModel(model);
    }//GEN-LAST:event_bt_timkiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_sua;
    private javax.swing.JButton bt_them;
    private javax.swing.JButton bt_timkiem;
    private javax.swing.JButton bt_xoa;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbGia;
    private javax.swing.JLabel jlbTenDV;
    private javax.swing.JLabel jlfMaDV;
    private javax.swing.JTable tbl_dichvu;
    private javax.swing.JTextField txt_gia;
    private javax.swing.JTextField txt_madv;
    private javax.swing.JTextField txt_tendv;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables

    private void showDichvu() 
    {
        DefaultTableModel model = new DefaultTableModel(){
        @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
        };
        tbl_dichvu.isCellEditable(0, 0);
        model.addColumn("Mã dịch vụ");
        model.addColumn("Tên dịch vụ");
        model.addColumn("Giá");
        ArrayList<DichVuDTO> list = DichVuDAL.get_all();
        for (DichVuDTO dv_dto : list) 
        {
            model.addRow(dv_dto.toArray());
        }
        tbl_dichvu.setModel(model);
    }
}
