package BLL;
import DTO.HoaDonDTO;
import DAL.HoaDonDAL;
import com.toedter.calendar.JDateChooser;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class HoaDonBLL 
{
    public static ArrayList<HoaDonDTO> get_all()
    {
        return HoaDonDAL.get_all();
    }
    public boolean insert_hd(JTextField mapt, JTextField manv, JDateChooser ngaylap, JTextField ghichu)
    {
        if (mapt.getText().equals("") || manv.getText().equals("") || ngaylap.getDate() == null)
            JOptionPane.showMessageDialog(null, "Thông tin nhập chưa đầy đủ");
        else
        {
            HoaDonDAL hd_dal = new HoaDonDAL();
            HoaDonDTO hd_dto = new HoaDonDTO();
            hd_dto.setMapt(Integer.parseInt(mapt.getText()));
            hd_dto.setManv(Integer.parseInt(manv.getText()));
            java.sql.Date nglap = new java.sql.Date(ngaylap.getDate().getTime());
            hd_dto.setNgaylap(nglap);
            hd_dto.setGhichu(ghichu.getText());
            return hd_dal.insert_hd(hd_dto);
        }
        return false;
    }
    public boolean delete_hd(JTextField mahd)
    {
        if (mahd.getText().equals("")) JOptionPane.showMessageDialog(null, "Mã hóa đơn trống");
        else
        {
            HoaDonDAL hd_dal = new HoaDonDAL();
            return hd_dal.delete_hd(Integer.parseInt(mahd.getText()));
        }
        return false;
    }
    public void Report(JTextField mahd)
    {
        HoaDonDAL hd_dal = new HoaDonDAL();
        if (mahd.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Mã hóa đơn trống");
        else hd_dal.Report(Integer.parseInt(mahd.getText()));
    }
    public ArrayList<HoaDonDTO> search(JTextField text)
    {
        HoaDonDAL hd_dal = new HoaDonDAL();
        ArrayList<HoaDonDTO> list = new ArrayList();
        if (text.getText().equals("")) list = get_all();
        else list = hd_dal.search(text.getText());
        return list;
    }
}
