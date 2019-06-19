package BLL;
import DAL.ThongKeDoanhThuDAL;
import DTO.HoaDonDTO;
import com.toedter.calendar.JDateChooser;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
public class ThongKeDoanhThuBLL 
{
    public static ArrayList<HoaDonDTO> get_all()
    {
        return ThongKeDoanhThuDAL.get_all();
    }
    public static ArrayList<String> get_nam()
    {
        return ThongKeDoanhThuDAL.get_nam();
    }
    public void Report_LoaiPhong(JComboBox nam, String nguoilap)
    {
        ThongKeDoanhThuDAL tk_dal = new ThongKeDoanhThuDAL();
        tk_dal.Report_LoaiPhong(Integer.parseInt(nam.getSelectedItem().toString()), nguoilap);
    }
    public void Report_Thang(JDateChooser bddt, JDateChooser ktdt, String nguoilap)
    {
        ThongKeDoanhThuDAL tk_dal = new ThongKeDoanhThuDAL();
        if (bddt.getDate().compareTo(ktdt.getDate()) <= 0)
        {
            tk_dal.Report_Thang(bddt.getDate(),ktdt.getDate(),nguoilap);
        }
        else JOptionPane.showMessageDialog(null, "Tháng bắt đầu nhỏ hơn tháng kết thúc");
    }
    public void Report_Nam(JComboBox bddt, JComboBox ktdt, String nguoilap)
    {
        ThongKeDoanhThuDAL tk_dal = new ThongKeDoanhThuDAL();
        int bd = Integer.parseInt(bddt.getSelectedItem().toString());
        int kt = Integer.parseInt(ktdt.getSelectedItem().toString());
        if (bd < kt) JOptionPane.showMessageDialog(null, "Năm bắt đầu lớn hơn năm kết thúc");
        else tk_dal.Report_Nam(bd, kt, nguoilap);
    }
}
