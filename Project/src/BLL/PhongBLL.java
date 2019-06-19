package BLL;
import DAL.PhongDAL;
import DTO.PhongDTO;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class PhongBLL 
{
    public static ArrayList<PhongDTO> getAllPhong()
    {
        return PhongDAL.getAllPhong();
    }
    
    public ArrayList<PhongDTO> search_room(String text)
    {
        PhongDAL phong_dal = new PhongDAL();
        return phong_dal.search_room(text);
    }
    public boolean insert_phong(JComboBox loaiphong, JTextField gia, JTextField slkhach)
    {
        if(loaiphong.getSelectedItem().toString().equals("") || gia.getText().equals("") || slkhach.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Thông tin nhập chưa đầy đủ");
        else
        {
            if(check_number(gia.getText()))
            {
                if(check_number(slkhach.getText()))
                {
                    PhongDAL ph_dal = new PhongDAL();
                    PhongDTO  ph_dto = new PhongDTO();
                    ph_dto.setLoaiPhong(loaiphong.getSelectedItem().toString());
                    ph_dto.setGia(Long.parseLong(gia.getText()));
                    ph_dto.setSoLuong(Integer.parseInt(slkhach.getText()));
                    return ph_dal.insert_phong(ph_dto);
                }
                else JOptionPane.showMessageDialog(null, "Bạn nhập sai định dạng số lượng khách");
            }
            else JOptionPane.showMessageDialog(null, "Bạn nhập sai định dạng giá tiền");
            
        }
        return false;
    }
    public boolean delete_phong(JTextField maphong)
    {
        if (maphong.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Mã phòng không được trống");
        else
        {
            PhongDAL ph_dal = new PhongDAL();
            return ph_dal.delete_phong(Integer.parseInt(maphong.getText()));
        }
        return false;
    }
    public boolean update_phong(JTextField maphong, JComboBox loaiphong, JTextField gia, JTextField slkhach)
    {
        if(maphong.getText().equals("") || loaiphong.getSelectedItem().toString().equals("") || gia.getText().equals("") || slkhach.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Thông tin nhập chưa đầy đủ");
        else
        {
            if(check_number(gia.getText()))
            {
                if(check_number(slkhach.getText()))
                {
                    PhongDAL ph_dal = new PhongDAL();
                    PhongDTO  ph_dto = new PhongDTO();
                    ph_dto.setMaPhong(Integer.parseInt(maphong.getText()));
                    ph_dto.setLoaiPhong(loaiphong.getSelectedItem().toString());
                    ph_dto.setGia(Long.parseLong(gia.getText()));
                    ph_dto.setSoLuong(Integer.parseInt(slkhach.getText()));
                    return ph_dal.update_phong(ph_dto);
                }
                else JOptionPane.showMessageDialog(null, "Bạn nhập sai định dạng số lượng khách");
            }
            else JOptionPane.showMessageDialog(null, "Bạn nhập sai định dạng giá tiền");
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
