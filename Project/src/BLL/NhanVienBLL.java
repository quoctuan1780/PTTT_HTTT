package BLL;
import DAL.NhanVienDAL;
import DTO.NhanVienDTO;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class NhanVienBLL 
{
    public static ArrayList<NhanVienDTO> get_all() 
    {
        return NhanVienDAL.get_all();
    }
    public boolean insert_nv(JTextField tennv, JTextField diachi, JComboBox gioitinh, JTextField sodt, JComboBox chucvu)
    {
        if(tennv.getText().equals("") || diachi.getText().equals("") || gioitinh.getSelectedItem().equals("") || sodt.getText().equals("") ||
                chucvu.getSelectedItem().equals(""))
        JOptionPane.showMessageDialog(null, "Thông tin nhập chưa đầy đủ");
        else
        {
            if (check_number(sodt.getText()))
            {
                NhanVienDTO nv_dto = new NhanVienDTO();
                NhanVienDAL nv_dal = new NhanVienDAL();
                nv_dto.setTennv(tennv.getText());
                nv_dto.setDiachi(diachi.getText());
                nv_dto.setGioitinh(gioitinh.getSelectedItem().toString());
                nv_dto.setSodt(sodt.getText());
                nv_dto.setChucvu(chucvu.getSelectedItem().toString());
                return nv_dal.insert_nv(nv_dto);
            }
            else JOptionPane.showMessageDialog(null, "Bạn nhập sai định dạng số điện thoại");
        }
        return false;
    }
    public boolean delete_nv(JTextField manv)
    {
        if (manv.getText().equals("")) JOptionPane.showMessageDialog(null, "Mã nhân viên trống");
        else
        {
            NhanVienDAL nv_dal = new NhanVienDAL();
            return  nv_dal.delete_nv(Integer.parseInt(manv.getText()));
        }
        return false;
    }
    public boolean update_nv(JTextField manv, JTextField tennv, JTextField diachi, JComboBox gioitinh, JTextField sodt)
    {
        if( manv.getText().equals("") ||tennv.getText().equals("") || diachi.getText().equals("") || 
                gioitinh.getSelectedItem().equals("") || sodt.getText().equals(""))
        JOptionPane.showMessageDialog(null, "Thông tin nhập chưa đầy đủ");
        else
        {
            if(check_number(sodt.getText()))
            {
                NhanVienDTO nv_dto = new NhanVienDTO();
                NhanVienDAL nv_dal = new NhanVienDAL();
                nv_dto.setManv(Integer.parseInt(manv.getText()));
                nv_dto.setTennv(tennv.getText());
                nv_dto.setDiachi(diachi.getText());
                nv_dto.setGioitinh(gioitinh.getSelectedItem().toString());
                nv_dto.setSodt(sodt.getText());
                return nv_dal.update_nv(nv_dto);
            }
            else JOptionPane.showMessageDialog(null, "Bạn nhập sai định dạng số điện thoại");
        }
        return false;
    }
    public ArrayList<NhanVienDTO> search(JTextField text)
    {
        NhanVienDAL nv_dal = new NhanVienDAL();
        ArrayList<NhanVienDTO> list;
        if (text.getText().equals("")) list = get_all();
        else
            list = nv_dal.search(text.getText());
        return list;
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
