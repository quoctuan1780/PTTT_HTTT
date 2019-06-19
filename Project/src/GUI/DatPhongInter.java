package GUI;
import BLL.DatPhongBLL;
import DTO.PhongDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class DatPhongInter extends javax.swing.JInternalFrame {

    public DatPhongInter() {
        initComponents();
        showDatPhong();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jlbMaPhong = new javax.swing.JLabel();
        txt_maphong = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        bt_timkiem = new javax.swing.JButton();
        txt_timkiem = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_datphong = new javax.swing.JTable();
        bt_dattruoc = new javax.swing.JButton();
        bt_dattructiep = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(980, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(53, 71, 99));
        jPanel1.setMinimumSize(new java.awt.Dimension(980, 580));

        jPanel2.setBackground(new java.awt.Color(239, 148, 28));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ĐẶT PHÒNG");

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

        txt_maphong.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_maphong.setEnabled(false);
        txt_maphong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_maphongActionPerformed(evt);
            }
        });
        jPanel3.add(txt_maphong, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 160, 40));

        jPanel4.setBackground(new java.awt.Color(53, 71, 99));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_timkiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_timkiem.setText("Tìm kiếm");
        bt_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_timkiemActionPerformed(evt);
            }
        });
        jPanel4.add(bt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 100, 40));

        txt_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_timkiemActionPerformed(evt);
            }
        });
        jPanel4.add(txt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 170, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 300, 200));

        tbl_datphong.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tbl_datphong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phòng", "Loại phòng", "Giá", "Số lượng", "Tình trạng phòng"
            }
        ));
        tbl_datphong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_datphongMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_datphong);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 640, 440));

        bt_dattruoc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_dattruoc.setText("Đặt trước");
        bt_dattruoc.setPreferredSize(new java.awt.Dimension(67, 23));
        bt_dattruoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dattruocActionPerformed(evt);
            }
        });
        jPanel3.add(bt_dattruoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 280, 40));

        bt_dattructiep.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_dattructiep.setText("Đặt tại chỗ");
        bt_dattructiep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dattructiepActionPerformed(evt);
            }
        });
        jPanel3.add(bt_dattructiep, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 280, 40));

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
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_maphongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_maphongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_maphongActionPerformed

    private void bt_dattruocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dattruocActionPerformed
        DatPhongBLL dp_bll = new DatPhongBLL();
        if(!txt_maphong.getText().equals(""))
            if(dp_bll.check_tinhtrang(Integer.parseInt(txt_maphong.getText())))
            {
                int maphong = Integer.parseInt(txt_maphong.getText());
                ThongTinDatPhongTruocGUI ttdpt = new ThongTinDatPhongTruocGUI(maphong);
                ttdpt.setVisible(true);
            }
            else JOptionPane.showMessageDialog(null, "Phòng này đã có người đặt");
        else
        {
            ThongTinDatPhongTruocGUI ttdpt = new ThongTinDatPhongTruocGUI();
            ttdpt.setVisible(true);
        }
    }//GEN-LAST:event_bt_dattruocActionPerformed

    private void bt_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_timkiemActionPerformed
        DatPhongBLL dpbll = new DatPhongBLL();
        if(txt_timkiem.equals("")) showDatPhong();
        else
        {
            DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
            };
            tbl_datphong.isCellEditable(0, 0);
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
                tbl_datphong.setModel(model);
            }
            else JOptionPane.showMessageDialog(null, "Không tồn tại thông tin phòng");
        }
    }//GEN-LAST:event_bt_timkiemActionPerformed

    private void txt_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_timkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_timkiemActionPerformed

    private void tbl_datphongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_datphongMouseClicked
        int i = tbl_datphong.getSelectedRow();
        TableModel model = tbl_datphong.getModel();
        txt_maphong.setText(model.getValueAt(i, 0).toString());
    }//GEN-LAST:event_tbl_datphongMouseClicked

    private void bt_dattructiepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dattructiepActionPerformed
        DatPhongBLL dp_bll = new DatPhongBLL();
        if(!txt_maphong.getText().equals(""))
            if(dp_bll.check_tinhtrang(Integer.parseInt(txt_maphong.getText())))
            {
                int maphong = Integer.parseInt(txt_maphong.getText());
                KhachHangGUI kh = new KhachHangGUI(maphong);
                kh.setVisible(true);
            }
            else JOptionPane.showMessageDialog(null, "Phòng này đã có người đặt");
        else JOptionPane.showMessageDialog(null, "Mã phòng trống");
    }//GEN-LAST:event_bt_dattructiepActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_dattructiep;
    private javax.swing.JButton bt_dattruoc;
    private javax.swing.JButton bt_timkiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlbMaPhong;
    private javax.swing.JTable tbl_datphong;
    private javax.swing.JTextField txt_maphong;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables
    
    private void showDatPhong()
    {
        DefaultTableModel model = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column)
        {
            return false;
        }
        };
        tbl_datphong.isCellEditable(0, 0);
        model.addColumn("Mã phòng");
        model.addColumn("Loại phòng");
        model.addColumn("Giá phòng");
        model.addColumn("Số lượng khách tối đa");
        model.addColumn("Tình trạng phòng");
        ArrayList<PhongDTO> list_room = DatPhongBLL.getAllPhong();
        for(PhongDTO DatPhong : list_room)
        {
            model.addRow(DatPhong.toArray());
        }
        tbl_datphong.setModel(model);
    }
}
