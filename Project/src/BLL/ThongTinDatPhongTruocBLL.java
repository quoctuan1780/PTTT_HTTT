package BLL;
import DAL.KhachHangDAL;
import DAL.ThongTinDatPhongTruocDAL;
import DTO.KhachHangDTO;
import DTO.ThongTinDatPhongTruocDTO;
import com.toedter.calendar.JDateChooser;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ThongTinDatPhongTruocBLL 
{
    public static ArrayList<ThongTinDatPhongTruocDTO> get_all()
    {
       return ThongTinDatPhongTruocDAL.get_all();
    }
    public boolean insert_ttdpt(JTextField mp, JTextField tenkh, JTextField dc, JComboBox gt, JTextField sodt, JTextField cmnd, JTextField qt, JDateChooser ngay)
    {
        ThongTinDatPhongTruocDAL ttdptdal = new ThongTinDatPhongTruocDAL();
        if(mp.getText().equals("") || tenkh.getText().equals("") || dc.getText().equals("") || gt.getSelectedItem().toString().equals("") || cmnd.getText().equals("") || qt.getText().equals("")
                || ngay.getDate() == null || sodt.getText().equals("")) JOptionPane.showMessageDialog(null, "Thông tin nhập chưa đầy đủ");
        else
        {
            if(check_number(sodt.getText()))
            {
                if(check_number(cmnd.getText()))
                {
                    ThongTinDatPhongTruocDTO ttdpt = new ThongTinDatPhongTruocDTO();
                    ttdpt.set_maphong(Integer.parseInt(mp.getText()));
                    ttdpt.setTenKH(tenkh.getText());
                    ttdpt.setDiaChi(dc.getText());
                    ttdpt.setGioiTinh(gt.getSelectedItem().toString());
                    ttdpt.setSoDT(sodt.getText());
                    ttdpt.setCMND(cmnd.getText());
                    ttdpt.setQuocTich(qt.getText());
                    Date ngay_o = ngay.getDate();
                    java.sql.Date ng_o = new java.sql.Date(ngay_o.getTime());
                    ttdpt.set_ngay_o(ng_o);
                    if (ttdptdal.insert_ttdpt(ttdpt)) return true;
                    else return false;
                }
                else JOptionPane.showMessageDialog(null, "Bạn nhập sai định dạng số CMND");
            }
            else JOptionPane.showMessageDialog(null, "Bạn nhập sai định dạng số điện thoại");
        }
        return false;
    }
    public boolean delete_ttdpt(JTextField mp, JTextField tenkh, JTextField dc, JComboBox gt, JTextField sodt, JTextField cmnd, JTextField qt, JDateChooser ngay)
    {
        ThongTinDatPhongTruocDAL ttdptdal = new ThongTinDatPhongTruocDAL();
        if(mp.getText().equals("") || tenkh.getText().equals("") || dc.getText().equals("") || gt.getSelectedItem().toString().equals("") || cmnd.getText().equals("") || qt.getText().equals("")
                || ngay.getDate() == null || sodt.getText().equals("")) JOptionPane.showMessageDialog(null, "Thông tin nhập chưa đầy đủ");
        else
        {
            if(check_number(sodt.getText()))
            {
                if(check_number(cmnd.getText()))
                {
                    ThongTinDatPhongTruocDTO ttdpt = new ThongTinDatPhongTruocDTO();
                    ttdpt.set_maphong(Integer.parseInt(mp.getText()));
                    ttdpt.setTenKH(tenkh.getText());
                    ttdpt.setDiaChi(dc.getText());
                    ttdpt.setGioiTinh(gt.getSelectedItem().toString());
                    ttdpt.setSoDT(sodt.getText());
                    ttdpt.setCMND(cmnd.getText());
                    ttdpt.setQuocTich(qt.getText());
                    Date ngay_o = ngay.getDate();
                    java.sql.Date ng_o = new java.sql.Date(ngay_o.getTime());
                    ttdpt.set_ngay_o(ng_o);
                    if (ttdptdal.delete_ttdpt(ttdpt)) return true;
                    else return false;
                }
                else JOptionPane.showMessageDialog(null, "Bạn nhập sai định dạng số CMND");
            }
            else JOptionPane.showMessageDialog(null, "Bạn nhập sai định dạng số điện thoại");
        }
        return false;
    }
    public boolean update_ttdpt(JTextField mp, JTextField tenkh, JTextField dc, JComboBox gt, JTextField sodt, JTextField cmnd, JTextField qt, JDateChooser ngay)
    {
        ThongTinDatPhongTruocDAL ttdptdal = new ThongTinDatPhongTruocDAL();
        if(mp.getText().equals("") || tenkh.getText().equals("") || dc.getText().equals("") || gt.getSelectedItem().toString().equals("") || cmnd.getText().equals("") || qt.getText().equals("")
                || ngay.getDate() == null || sodt.getText().equals("")) JOptionPane.showMessageDialog(null, "Thông tin nhập chưa đầy đủ");
        else
        {
            if(check_number(sodt.getText()))
            {
                if(check_number(cmnd.getText()))
                {
                    ThongTinDatPhongTruocDTO ttdpt = new ThongTinDatPhongTruocDTO();
                    ttdpt.set_maphong(Integer.parseInt(mp.getText()));
                    ttdpt.setTenKH(tenkh.getText());
                    ttdpt.setDiaChi(dc.getText());
                    ttdpt.setGioiTinh(gt.getSelectedItem().toString());
                    ttdpt.setSoDT(sodt.getText());
                    ttdpt.setCMND(cmnd.getText());
                    ttdpt.setQuocTich(qt.getText());
                    Date ngay_o = ngay.getDate();
                    java.sql.Date ng_o = new java.sql.Date(ngay_o.getTime());
                    ttdpt.set_ngay_o(ng_o);
                    if (ttdptdal.update_ttdpt(ttdpt)) return true;
                    else return false;
                }
                else JOptionPane.showMessageDialog(null, "Bạn nhập sai định dạng số CMND");
            }
            else JOptionPane.showMessageDialog(null, "Bạn nhập sai định dạng số điện thoại");
        }
        return false;
    }
    
    public boolean insert_kh(JTextField tenkh, JTextField dc, JComboBox gt, JTextField sodt, JTextField cmnd, JTextField qt)
    {
        ArrayList<KhachHangDTO> list_kh = new ArrayList(); 
        KhachHangDAL kh_dal = new KhachHangDAL();
        ThongTinDatPhongTruocDAL ttdpt_dal = new ThongTinDatPhongTruocDAL();
        
        if (tenkh.getText().equals("") || dc.getText().equals("") || gt.getSelectedItem().toString().equals("") || cmnd.getText().equals("") || 
                    qt.getText().equals("") || sodt.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Thông tin chưa đầy đủ");
        else
        {
            if (check_number(sodt.getText()))
            {
                if (check_number(cmnd.getText()))
                {
                    KhachHangDTO kh_dto = new KhachHangDTO();
                    kh_dto.setTenKH(tenkh.getText());
                    kh_dto.setDiaChi(dc.getText());
                    kh_dto.setGioiTinh(gt.getSelectedItem().toString());
                    kh_dto.setSoDT(sodt.getText());
                    kh_dto.setCMND(cmnd.getText());
                    kh_dto.setQuocTich(qt.getText());
                    String text = "";
                    if (kh_dto.getCMND().equals("") ) text = kh_dto.getSoDT();
                    else text = kh_dto.getCMND();
                    if (text.equals("")) JOptionPane.showMessageDialog(null, "Thông tin nhập thiếu số điện thoại hoặc số CMND");
                    else
                    {
                        list_kh = ttdpt_dal.search_ttkh(kh_dto.getTenKH(), text);

                        if (list_kh.isEmpty()) 
                        {
                            JOptionPane.showMessageDialog(null, "Khách hàng chưa tồn tại trong hệ thống");
                            int selected = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn có muốn thêm khách hàng này ?",
                                "Thông báo", JOptionPane.YES_NO_OPTION);
                            if (selected == JOptionPane.YES_OPTION) 
                            {
                                kh_dal.insert_kh(kh_dto);
                                JOptionPane.showMessageDialog(null, "Thêm khách hàng thành công"); 
                                return true;
                            }
                            else return false;
                        }
                        else return true;
                    }
                }
                else JOptionPane.showMessageDialog(null, "Bạn nhập sai định dạng số CMND");
            } 
            else  JOptionPane.showMessageDialog(null, "Bạn nhập sai định dạng số điện thoại");
        }
        return false;
    }
    public int get_makh(JTextField tenkh, JTextField sodt, JTextField cmnd)
    {
        ThongTinDatPhongTruocDAL ttdpt_dal = new ThongTinDatPhongTruocDAL();
        if(tenkh.getText().equals("") || sodt.getText().equals("") || cmnd.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Thông tin nhập chưa đầy đủ");
        else return ttdpt_dal.get_makh(tenkh.getText(), sodt.getText(), cmnd.getText());
        return ttdpt_dal.get_makh(tenkh.getText(), sodt.getText(), cmnd.getText());
    }
    public ArrayList<ThongTinDatPhongTruocDTO> search_ttdpt(JTextField text)
    {
       ArrayList<ThongTinDatPhongTruocDTO> list_ttdpt = new ArrayList();
       ThongTinDatPhongTruocDAL ttdpt_dal = new ThongTinDatPhongTruocDAL();
       if(text.getText().equals("")) list_ttdpt = get_all();
       else
       {
           return ttdpt_dal.search_tths(text.getText());
       }
       return list_ttdpt;
    }
    public boolean check_number(String sData)
    {
        for (int i = 0; i < sData.length(); i++) 
        { 
            if (sData.charAt(i) < '0' || sData.charAt(i) > '9') return false;
            if (i + 1 == sData.length()) return true;
        }
        return false;
    }
}
