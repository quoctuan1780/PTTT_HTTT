package BLL;
import DAL.KhachHangDAL;
import DTO.KhachHangDTO;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class KhachHangBLL 
{
    public static ArrayList<KhachHangDTO> getAllKhachHang()
    {
        return KhachHangDAL.getAllKhachHang();
    }
    public boolean insert_kh(JTextField tenkh, JTextField diachi, JComboBox gioitinh, JTextField sodt, JTextField cmnd, JTextField quoctich)
    {
        if(tenkh.getText().equals("") || diachi.getText().equals("") || gioitinh.getSelectedItem().toString().equals("")
                || sodt.getText().equals("") || cmnd.getText().equals("") || quoctich.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Thông tin nhập chưa đầy đủ");
        else
        {
            if(check_number(sodt.getText()))
            {
                if (check_number(cmnd.getText()))
                {
                    KhachHangDTO kh_dto = new KhachHangDTO();
                    KhachHangDAL kh_dal = new KhachHangDAL();
                    kh_dto.setTenKH(tenkh.getText());
                    kh_dto.setDiaChi(diachi.getText());
                    kh_dto.setGioiTinh(gioitinh.getSelectedItem().toString());
                    kh_dto.setSoDT(sodt.getText());
                    kh_dto.setCMND(cmnd.getText());
                    kh_dto.setQuocTich(quoctich.getText());
                    return kh_dal.insert_kh(kh_dto);
                }
                else JOptionPane.showMessageDialog(null, "Bạn nhập sai định dạng số CMND");
            }
            else JOptionPane.showMessageDialog(null, "Bạn nhập sai định dạng số điện thoại");
        }
        return false;
    }
    public boolean delete_kh(JTextField makh)
    {
        KhachHangDAL kh_dal = new KhachHangDAL();
        if (makh.getText().equals("")) JOptionPane.showMessageDialog(null, "Thông tin nhập chưa đầy đủ");
        else
            return kh_dal.delete_kh(Integer.parseInt(makh.getText()));
        return false;
    }
    public ArrayList<KhachHangDTO> search_ttkh(JTextField search)
    {
        KhachHangDAL kh_dal = new KhachHangDAL();
        ArrayList<KhachHangDTO> list_kh = kh_dal.search_ttkh(search.getText());
        return list_kh;
    }
    public boolean update_kh(JTextField makh, JTextField tenkh, JTextField diachi, JComboBox gioitinh, JTextField sodt, JTextField cmnd, JTextField quoctich)
    {
        if(makh.getText().equals("") || tenkh.getText().equals("") || diachi.getText().equals("") || gioitinh.getSelectedItem().toString().equals("")
                || sodt.getText().equals("") || cmnd.getText().equals("") || quoctich.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Thông tin nhập chưa đầy đủ");
        else
        {
            if(check_number(sodt.getText()))
            {
                if (check_number(cmnd.getText()))
                {
                    KhachHangDTO kh_dto = new KhachHangDTO();
                    KhachHangDAL kh_dal = new KhachHangDAL();
                    kh_dto.setMaKH(Integer.parseInt(makh.getText()));
                    kh_dto.setTenKH(tenkh.getText());
                    kh_dto.setDiaChi(diachi.getText());
                    kh_dto.setGioiTinh(gioitinh.getSelectedItem().toString());
                    kh_dto.setSoDT(sodt.getText());
                    kh_dto.setCMND(cmnd.getText());
                    kh_dto.setQuocTich(quoctich.getText());
                    return kh_dal.update_kh(kh_dto);
                }
                else JOptionPane.showMessageDialog(null, "Bạn nhập sai định dạng số CMND");
            }
            else JOptionPane.showMessageDialog(null, "Bạn nhập sai định dạng số điện thoại");
        }
        return false;
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
