package BLL;
import DAL.ChiTietSuDungDVDAL;
import DTO.ChiTietSuDungDVDTO;
import com.toedter.calendar.JDateChooser;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class ChiTietSuDungDVBLL 
{
    public ArrayList<ChiTietSuDungDVDTO> get_mapt(JTextField mapt)
    {
        ArrayList<ChiTietSuDungDVDTO> list_sddv = new ArrayList();
        if (mapt.getText().equals("")) JOptionPane.showMessageDialog(null, "Mã phiếu thuê trống");
        else
        {
            ChiTietSuDungDVDAL ctdv_dal = new ChiTietSuDungDVDAL();
            list_sddv = ctdv_dal.get_mapt(Integer.parseInt(mapt.getText()));
        }
        return list_sddv;
    }
    public void get_dv(ArrayList<String> list_index, ArrayList<String> list_name)
    {
        ChiTietSuDungDVDAL sddv_dal = new ChiTietSuDungDVDAL();
        sddv_dal.get_dv(list_index, list_name);
    }
    public boolean insert_sddv(JTextField mapt, int madv, JDateChooser ngaysd, JTextField sl)
    {
        if (mapt.getText().equals("") || madv == 0 || ngaysd.getDate() == null || sl.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Bạn nhập thiếu thông tin");
        else
        {
            if (check_number(sl.getText())) 
            {
                ChiTietSuDungDVDTO sddv_dto = new ChiTietSuDungDVDTO();
                ChiTietSuDungDVDAL sddv_dal = new ChiTietSuDungDVDAL();
                sddv_dto.setMapt(Integer.parseInt(mapt.getText()));
                sddv_dto.setMadv(madv);
                java.sql.Date ngsd = new java.sql.Date(ngaysd.getDate().getTime());
                sddv_dto.setNgaysd(ngsd);
                sddv_dto.setSoluong(Integer.parseInt(sl.getText()));
                return sddv_dal.insert_sddv(sddv_dto);
            }
        }
        return false;
    }
    public boolean delete_sddv(JTextField mapt, int madv)
    {
        if (mapt.getText().equals("") || madv == 0) JOptionPane.showMessageDialog(null, "Mã phiếu thuê hoặc dịch vụ trống");
        else
        {
            ChiTietSuDungDVDAL sddv_dal = new ChiTietSuDungDVDAL();
            return sddv_dal.delete_sddv(Integer.parseInt(mapt.getText()), madv);
        }
        return false;
    }
    public boolean update_sddv(JTextField mapt, int madv, JDateChooser ngaysd, JTextField sl)
    {
        if (mapt.getText().equals("") || madv == 0 || ngaysd.getDate() == null || sl.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Bạn nhập thiếu thông tin");
        else
        {
            if(check_number(sl.getText()))
            {
                ChiTietSuDungDVDTO sddv_dto = new ChiTietSuDungDVDTO();
                ChiTietSuDungDVDAL sddv_dal = new ChiTietSuDungDVDAL();
                sddv_dto.setMapt(Integer.parseInt(mapt.getText()));
                sddv_dto.setMadv(madv);
                java.sql.Date ngsd = new java.sql.Date(ngaysd.getDate().getTime());
                sddv_dto.setNgaysd(ngsd);
                sddv_dto.setSoluong(Integer.parseInt(sl.getText()));
                return sddv_dal.update_sddv(sddv_dto);
                
            }
            else JOptionPane.showMessageDialog(null, "Bạn nhập sai định dạng ô số lượng");
        }
        return false;
    }
    public ArrayList<ChiTietSuDungDVDTO> search_sddv(JTextField mapt, JTextField madv)
    {
        ArrayList<ChiTietSuDungDVDTO> list = new ArrayList<>();
        ChiTietSuDungDVDAL sddv_dal = new ChiTietSuDungDVDAL();
        if (mapt.getText().equals("") || madv.getText().equals("")) JOptionPane.showMessageDialog(null, "Thông tin nhập thiếu mã phiếu thuê hoặc mã dịch vụ");
        else
        {
            if (check_number(madv.getText()))
                list = sddv_dal.search_sddv(Integer.parseInt(mapt.getText()), Integer.parseInt(madv.getText()));
            else JOptionPane.showMessageDialog(null, "Bạn nhập sai định dạng mã dịch vụ trong ô tìm kiếm");
        }
        return list;
    }
    public boolean check_date_nt(Date ngaysd, Date ngay)
    {
        if(ngaysd.compareTo(ngay) >= 0) return true;
        return false;
    }
    public boolean check_date_ntt(Date ngaysd, Date ngay)
    {
        if(ngaysd.compareTo(ngay) <= 0) return true;
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
