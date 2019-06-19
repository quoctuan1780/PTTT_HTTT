package GUI;
import BLL.ChiTietSuDungDVBLL;
import DTO.ChiTietSuDungDVDTO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ChiTietSuDungDVGUI extends javax.swing.JFrame {
    
    int mapt;
    Date ngaysd, ngayt;
    ArrayList<String> index = new ArrayList();
    ArrayList<String> name = new ArrayList();  
    public ChiTietSuDungDVGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        ChiTietSuDungDVBLL sddv_bll = new ChiTietSuDungDVBLL();
        sddv_bll.get_dv(index, name);
        for(int i = 0; i < name.size(); i++)
            cb_dichvu.addItem(name.get(i));
    }
    
    public ChiTietSuDungDVGUI(int ma_pt, Date ngay, Date ngaytra) 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        ChiTietSuDungDVBLL sddv_bll = new ChiTietSuDungDVBLL();
        sddv_bll.get_dv(index, name);
        for(int i = 0; i < name.size(); i++)
            cb_dichvu.addItem(name.get(i));
        mapt = ma_pt;
        ngaysd = ngay;
        ngayt = ngaytra;
        txt_mapt.setText(Integer.toString(mapt));   
        dc_ngaysudung.setDate(ngay);
        showSdDV(txt_mapt);
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
        txt_soluong = new javax.swing.JTextField();
        dc_ngaysudung = new com.toedter.calendar.JDateChooser();
        bt_sua = new javax.swing.JButton();
        bt_xoa = new javax.swing.JButton();
        bt_them = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_chitietdichvu = new javax.swing.JTable();
        cb_dichvu = new javax.swing.JComboBox<>();
        txt_mapt = new javax.swing.JTextField();
        bt_timkiem = new javax.swing.JButton();
        txt_timkiem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(239, 148, 28));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CHI TIẾT DỊCH VỤ");

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
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lb_exit))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(53, 71, 99));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã phiếu thuê:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dịch vụ:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ngày sử dụng:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Số lượng:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        txt_soluong.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_soluong.setNextFocusableComponent(bt_them);
        jPanel3.add(txt_soluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 190, 30));

        dc_ngaysudung.setDateFormatString("dd/MM/yyyy");
        dc_ngaysudung.setNextFocusableComponent(txt_soluong);
        jPanel3.add(dc_ngaysudung, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 190, 30));

        bt_sua.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_sua.setText("Sửa");
        bt_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_suaActionPerformed(evt);
            }
        });
        jPanel3.add(bt_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 191, 32));

        bt_xoa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_xoa.setText("Xóa");
        bt_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xoaActionPerformed(evt);
            }
        });
        jPanel3.add(bt_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 191, 32));

        bt_them.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_them.setText("Thêm");
        bt_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_themActionPerformed(evt);
            }
        });
        jPanel3.add(bt_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 191, 32));

        tbl_chitietdichvu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tbl_chitietdichvu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu thuê", "Mã dịch vụ", "Ngày sử dụng", "Số lượng"
            }
        ));
        tbl_chitietdichvu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_chitietdichvuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_chitietdichvu);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 640, 370));

        cb_dichvu.setNextFocusableComponent(dc_ngaysudung);
        jPanel3.add(cb_dichvu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 92, 190, 30));

        txt_mapt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel3.add(txt_mapt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 190, 30));

        bt_timkiem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bt_timkiem.setText("Tìm kiếm mã");
        bt_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_timkiemActionPerformed(evt);
            }
        });
        jPanel3.add(bt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 130, 30));
        jPanel3.add(txt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_themActionPerformed
        ChiTietSuDungDVBLL sddv_bll = new ChiTietSuDungDVBLL();
        int chiso = cb_dichvu.getSelectedIndex();
        int madv = 0;
        madv = Integer.parseInt(index.get(chiso));
        if (sddv_bll.check_date_nt(dc_ngaysudung.getDate(), ngaysd))
        {
            if (sddv_bll.check_date_ntt(dc_ngaysudung.getDate(), ngayt))
            {
                if (sddv_bll.insert_sddv(txt_mapt, madv, dc_ngaysudung, txt_soluong))
                {
                    JOptionPane.showMessageDialog(null, "Thêm sử dụng dịch vụ thành công");
                    txt_soluong.setText("");
                    txt_soluong.requestFocus();
                    showSdDV(txt_mapt);
                }
                else JOptionPane.showMessageDialog(null, "Thêm sử dụng dịch vụ không thành công do dịch vụ này đã được sử dụng, mã của dịch vụ này là: " + madv);
            } else JOptionPane.showMessageDialog(null, "Ngày sử dụng lớn hơn ngày trả");
        } else JOptionPane.showMessageDialog(null, "Ngày sử dụng nhỏ hơn ngày thuê");
    }//GEN-LAST:event_bt_themActionPerformed

    private void lb_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_exitMouseClicked
        this.dispose();
    }//GEN-LAST:event_lb_exitMouseClicked

    private void tbl_chitietdichvuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_chitietdichvuMouseClicked
        try {
            int i = tbl_chitietdichvu.getSelectedRow();
            TableModel model = tbl_chitietdichvu.getModel();
            txt_mapt.setText(model.getValueAt(i, 0).toString());
            String madv = model.getValueAt(i, 1).toString();
            int chiso = -1;
            for(int j = 0; j < index.size(); j++) 
                if (Integer.parseInt(index.get(j)) == Integer.parseInt(madv)) chiso = j;
            String tendv = name.get(chiso);
            cb_dichvu.setSelectedItem(tendv);
            String ngay = model.getValueAt(i, 2).toString();
            Date ngsd = new SimpleDateFormat("yyyy-MM-dd").parse(ngay);
            dc_ngaysudung.setDate(ngsd);
            txt_soluong.setText(model.getValueAt(i, 3).toString());
        } catch (ParseException ex) {
            Logger.getLogger(ChiTietSuDungDVGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_tbl_chitietdichvuMouseClicked

    private void bt_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_timkiemActionPerformed
        ChiTietSuDungDVBLL sddv_bll = new ChiTietSuDungDVBLL();
        DefaultTableModel model = new DefaultTableModel(){
        @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
        };
        tbl_chitietdichvu.isCellEditable(0, 0);
        model.addColumn("Mã dịch vụ");
        model.addColumn("Tên dịch vụ");
        model.addColumn("Ngày sử dụng");
        model.addColumn("Giá");
        ArrayList<ChiTietSuDungDVDTO> list = sddv_bll.search_sddv(txt_mapt, txt_timkiem);
        for (ChiTietSuDungDVDTO sddv_dto : list) 
        {
            model.addRow(sddv_dto.toArray());
        }
        tbl_chitietdichvu.setModel(model);
    }//GEN-LAST:event_bt_timkiemActionPerformed

    private void bt_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xoaActionPerformed
        ChiTietSuDungDVBLL sddv_bll = new ChiTietSuDungDVBLL();
        int selected = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa dịch vụ này ?",
                            "Thông báo", JOptionPane.YES_NO_OPTION);
        if (selected == JOptionPane.YES_NO_OPTION)
        {
            int chiso = cb_dichvu.getSelectedIndex();
            int madv = 0;
            madv = Integer.parseInt(index.get(chiso));
            if (sddv_bll.delete_sddv(txt_mapt, madv))
            {
                JOptionPane.showMessageDialog(null, "Xóa dịch vụ thành công");
                txt_soluong.setText("");
                txt_soluong.requestFocus();
                showSdDV(txt_mapt);
            }
            else JOptionPane.showMessageDialog(null, "Xóa dịch vụ không thành công"); 
        }
    }//GEN-LAST:event_bt_xoaActionPerformed

    private void bt_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suaActionPerformed
        ChiTietSuDungDVBLL sddv_bll = new ChiTietSuDungDVBLL();
        int selected = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn cập nhật dịch vụ này ?",
                            "Thông báo", JOptionPane.YES_NO_OPTION);
        if (selected == JOptionPane.YES_NO_OPTION)
        {
            int chiso = cb_dichvu.getSelectedIndex();
            int madv = 0;
            madv = Integer.parseInt(index.get(chiso));
            if (sddv_bll.check_date_nt(dc_ngaysudung.getDate(), ngaysd))
            {
            if (sddv_bll.check_date_ntt(dc_ngaysudung.getDate(), ngayt))
                {
                    if (sddv_bll.update_sddv(txt_mapt, madv, dc_ngaysudung, txt_soluong))
                    {
                        JOptionPane.showMessageDialog(null, "Cập nhật dịch vụ thành công");
                        txt_soluong.setText("");
                        txt_soluong.requestFocus();
                        showSdDV(txt_mapt);
                    }
                    else JOptionPane.showMessageDialog(null, "Cập nhật dịch vụ không thành công"); 
                } else JOptionPane.showMessageDialog(null, "Ngày sử dụng lớn hơn ngày trả");
            } else JOptionPane.showMessageDialog(null, "Ngày sử dụng nhỏ hơn ngày thuê");
        }
    }//GEN-LAST:event_bt_suaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChiTietSuDungDVGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_sua;
    private javax.swing.JButton bt_them;
    private javax.swing.JButton bt_timkiem;
    private javax.swing.JButton bt_xoa;
    private javax.swing.JComboBox<String> cb_dichvu;
    private com.toedter.calendar.JDateChooser dc_ngaysudung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_exit;
    private javax.swing.JTable tbl_chitietdichvu;
    private javax.swing.JTextField txt_mapt;
    private javax.swing.JTextField txt_soluong;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables
    private void showSdDV(JTextField mapt)
    {
        ChiTietSuDungDVBLL sddv_bll = new ChiTietSuDungDVBLL();
        DefaultTableModel model = new DefaultTableModel(){
        @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
        };
        tbl_chitietdichvu.isCellEditable(0, 0);
        model.addColumn("Mã dịch vụ");
        model.addColumn("Tên dịch vụ");
        model.addColumn("Ngày sử dụng");
        model.addColumn("Giá");
        ArrayList<ChiTietSuDungDVDTO> list = sddv_bll.get_mapt(mapt);
        for (ChiTietSuDungDVDTO sddv_dto : list) 
        {
            model.addRow(sddv_dto.toArray());
        }
        tbl_chitietdichvu.setModel(model);
    }
}
